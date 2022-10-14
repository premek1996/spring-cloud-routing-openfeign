package com.example.feignclient.server.model;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
@Builder
public class Employee {

    private final String name;
    private final int age;

}
