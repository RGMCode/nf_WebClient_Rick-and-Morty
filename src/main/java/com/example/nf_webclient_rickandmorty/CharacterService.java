package com.example.nf_webclient_rickandmorty;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Objects;

@Service
public class CharacterService {

    private final WebClient webClient = WebClient.create("https://rickandmortyapi.com/api");
    private ResponseEntity<CharacterRepo> responseEntity;

    CharacterRepo getAllCharacter() {
        responseEntity = webClient
                .get()                          // get request auf die api uri
                .uri("/character")          // uri endpunkt
                .retrieve()                     // ausführen des request (send button im Postman)
                .toEntity(CharacterRepo.class)      // Packt die Informationen aus der json in d
                .block();                       // warten auf die anderen operationen

        return Objects.requireNonNull(responseEntity).getBody();    //holt die Daten aus dem großen Object
    }

    CharacterRepo getCharacterAllAllive() {
        responseEntity = webClient
                .get()                                  // get request auf die api uri
                .uri("/character/?status=alive")    // uri endpunkt      https://rickandmortyapi.com/api/character/?status=allive
                .retrieve()                             // ausführen des request (send button im Postman)
                .toEntity(CharacterRepo.class)              // Packt die Informationen aus der json in d
                .block();                               // warten auf die anderen operationen

        return Objects.requireNonNull(responseEntity).getBody();    //holt die Daten aus dem großen Object
    }

}
