package com.example.nf_webclient_rickandmorty;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CharacterController {

    private final CharacterService characterService;

    @GetMapping("/all")
    List<Character> getAllChar(){
        return characterService.getAllChar();
    }

    @GetMapping("/alive")
    List<Character> getAllCharAlive(){
        return characterService.getAllCharAlive();
    }

}
