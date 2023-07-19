package com.example.nf_webclient_rickandmorty;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CharacterController {

    private final CharacterService characterService;

    @GetMapping("/all")
    CharacterRepo getAllCharacters(){
        return characterService.getAllCharacter();
    }

    @GetMapping("/alive")
    CharacterRepo getAllCharactersAlive(){
        return characterService.getCharacterAllAllive();
    }

}
