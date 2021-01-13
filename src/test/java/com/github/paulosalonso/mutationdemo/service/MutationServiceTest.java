package com.github.paulosalonso.mutationdemo.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MutationServiceTest {

    private MutationService service = new MutationService();

    @Test
    public void givenALessValueWhenCallReturnResult() {
        var result = service.intReturn(3);
        assertThat(result).isEqualTo(15);
//        assertThat(result).isGreaterThan(0); // Mutation fails
    }

    @Test
    public void givenAGreaterValueWhenCallReturnResult() {
        var result = service.intReturn(11);
        assertThat(result).isEqualTo(33);
//        assertThat(result).isGreaterThan(0); // Mutation fails
    }

    @Test
    public void givenSameValueWhenCallReturnResult() {
        var result = service.intReturn(10);
        assertThat(result).isEqualTo(100);
//        assertThat(result).isGreaterThan(0); // Mutation fails
    }
}
