package com.wikicoding.webfluxasyncdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AddContactRequest {
    private final String name;
    private final String email;
}
