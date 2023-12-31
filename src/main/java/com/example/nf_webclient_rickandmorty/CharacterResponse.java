package com.example.nf_webclient_rickandmorty;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
@Repository
public class CharacterResponse {
    private List<Character> results = new ArrayList<>();
}
