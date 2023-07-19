package com.example.nf_webclient_rickandmorty;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CharacterService {

    private final WebClient webClient = WebClient.create("https://rickandmortyapi.com/api");
    private ResponseEntity<CharacterResponse> responseEntity;

    public List<Character> getAllChar(){
        WebClient webClient1 = WebClient.create("https://rickandmortyapi.com/api");
        CharacterResponse response = webClient1
                .get()
                .uri("/character")
                .retrieve()
                .toEntity(CharacterResponse.class)
                .block()
                .getBody();
        return response.getResults();
    }


    public List<Character> getAllCharAlive(){
        WebClient webClient1 = WebClient.create("https://rickandmortyapi.com/api");
        CharacterResponse response = webClient1
                .get()
                .uri("/character/?status=alive")
                .retrieve()
                .toEntity(CharacterResponse.class)
                .block()
                .getBody();
        return response.getResults();
    }


}
