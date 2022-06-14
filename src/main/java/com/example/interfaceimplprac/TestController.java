package com.example.interfaceimplprac;

import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final List<TestInterface> testInterfaces;

    @GetMapping("/api/test/{type}")
    public void test(@PathVariable Type type) {
        TestInterface testInterface = findTestInterface(type);
        testInterface.save();
    }

    private TestInterface findTestInterface(Type type) {
        return this.testInterfaces.stream()
                .filter(testInterface -> type.equals(testInterface.getType()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 타입입니다."));
    }
}
