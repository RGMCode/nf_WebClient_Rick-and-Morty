package com.example.nf_webclient_rickandmorty;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CharacterService {

    public List<Character> getAllChar(){
        WebClient webClient1 = WebClient.create("https://rickandmortyapi.com/api");
        CharacterResponse response = webClient1
                .get()
                .uri("/character")
                .retrieve()
                .toEntity(CharacterResponse.class)
                .block()
                .getBody();
        assert response != null;
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
        assert response != null;
        return response.getResults();
    }


}
