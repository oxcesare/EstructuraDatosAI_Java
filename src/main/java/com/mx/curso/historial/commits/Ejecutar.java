package com.mx.curso.historial.commits;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.*;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ejecutar {

    public static void main(String[] args) {
        List<LocalDate> fechas = List.of(
                LocalDate.of(2025, 10, 21),
                LocalDate.of(2025, 10, 23),
                LocalDate.of(2025, 10, 24)
        );

        Map<LocalDate, List<String>> resultados = fetchCommitsByDates("3milioAz", "Estructura_de_Datos_2", fechas);

        resultados.forEach((fecha, mensajes) -> {
            System.out.println(" " + fecha + ":");
            mensajes.forEach(m -> System.out.println("  " + m));
            System.out.println();
        });
    }

    public static Map<LocalDate, List<String>> fetchCommitsByDates(String owner, String repo, List<LocalDate> fechas) {
        Map<LocalDate, List<String>> resultado = new LinkedHashMap<>();

        try {
            // Traemos hasta 100 commits
            String apiUrl = String.format("https://api.github.com/repos/%s/%s/commits?per_page=100", owner, repo);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                ObjectMapper mapper = new ObjectMapper();
                JsonNode root = mapper.readTree(response.body());

                List<CommitInfo> commits = new ArrayList<>();

                for (JsonNode commitNode : root) {
                    String message = commitNode.get("commit").get("message").asText();
                    String dateStr = commitNode.get("commit").get("author").get("date").asText();

                    OffsetDateTime odt = OffsetDateTime.parse(dateStr);
                    LocalDate dateUTC = odt.atZoneSameInstant(ZoneOffset.UTC).toLocalDate();

                    commits.add(new CommitInfo(dateUTC, message));
                }

                // Para cada fecha, buscar commits dentro del mismo día
                for (LocalDate fecha : fechas) {
                    List<String> mensajes = commits.stream()
                            .filter(c -> c.date.equals(fecha))
                            .map(c -> c.message)
                            .collect(Collectors.toList());

                    if (mensajes.isEmpty()) {
                        resultado.put(fecha, List.of("No hay commit"));
                    } else {
                        resultado.put(fecha, mensajes);
                    }
                }

            } else {
                System.out.println("Error al acceder a la API: " + response.statusCode());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultado;
    }

    static class CommitInfo {
        LocalDate date;
        String message;

        CommitInfo(LocalDate date, String message) {
            this.date = date;
            this.message = message;
        }
    }
}

