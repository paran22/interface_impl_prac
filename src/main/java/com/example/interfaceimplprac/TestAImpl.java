package com.example.interfaceimplprac;

import org.springframework.stereotype.Service;

@Service
public class TestAImpl implements TestInterface {

    Type type;
    public Type getType() {
        return Type.A;
    }
    @Override
    public void save() {
        System.out.println("save A");
    }
}
