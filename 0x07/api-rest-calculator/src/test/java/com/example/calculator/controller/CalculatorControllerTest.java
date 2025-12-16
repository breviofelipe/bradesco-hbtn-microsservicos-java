package com.example.calculator.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
@ExtendWith(SpringExtension.class)
@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {

    @Autowired
    private MockMvc mvc;

        @Test
    void messageWelcome() throws Exception {
        mvc.perform(get("/calculator/welcome"))
               .andExpect(status().isOk())
               .andExpect(content().string("Bem vindo à CALCULATOR API REST."));
    }

    @Test
    void addNumbers() throws Exception {
        mvc.perform(get("/calculator/addNumbers")
                .param("number1", "2")
                .param("number2", "3"))
               .andExpect(status().isOk())
               .andExpect(content().string("Resultado: 5.0"));
    }

    @Test
    void subtractNumbers() throws Exception {
        mvc.perform(get("/calculator/subNumbers")
                .param("number1", "10")
                .param("number2", "4"))
               .andExpect(status().isOk())
               .andExpect(content().string("Resultado: 6.0"));
    }

    @Test
    void divideNumbers() throws Exception {
        mvc.perform(get("/calculator/divideNumbers")
                .param("number1", "12")
                .param("number2", "3"))
               .andExpect(status().isOk())
               .andExpect(content().string("Resultado: 4.0"));
    }

    @Test
    void calculateFactorial() throws Exception {
        mvc.perform(get("/calculator/factorial")
                .param("factorial", "5"))
               .andExpect(status().isOk())
               .andExpect(content().string("Resultado: 120"));
    }

    @Test
    void calculateDaysBetweenDates() throws Exception {
        mvc.perform(get("/calculator/calculeDayBetweenDate")
                .param("localDate1", "2024-01-01")
                .param("localDate2", "2024-01-10"))
               .andExpect(status().isOk())
               .andExpect(content().string("Resultado: 9"));
    }

    @Test
    void convertIntegerToBinary() throws Exception {
        mvc.perform(get("/calculator/integerToBinary")
                .param("number1", "10"))
               .andExpect(status().isOk())
               .andExpect(content().string("Resultado: 1010"));
    }

    @Test
    void convertIntegerToHexadecimal() throws Exception {
        mvc.perform(get("/calculator/integerToHexadecimal")
                .param("number1", "255"))
               .andExpect(status().isOk())
               .andExpect(content().string("Resultado: FF"));
    }
}
