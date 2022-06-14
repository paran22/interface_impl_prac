package com.example.interfaceimplprac;

import org.springframework.stereotype.Service;

@Service
public class TestBImpl implements TestInterface {
    Type type;
    public Type getType() {
        return Type.B;
    }

    @Override
    public void save() {
        System.out.println("save B");
    }
}
