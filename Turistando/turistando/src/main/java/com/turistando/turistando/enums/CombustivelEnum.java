package com.turistando.turistando.enums;

public enum CombustivelEnum {
    GASOLINA("Gasolina"),
    ALCOOL("Alcool"),
    DIESEL("Diesel"),
    GNV("GNV"),
    FLEX("Flex");
    
    private String combustivel;

    private CombustivelEnum(String combustivel) {
        this.combustivel = combustivel;
    } 

}
