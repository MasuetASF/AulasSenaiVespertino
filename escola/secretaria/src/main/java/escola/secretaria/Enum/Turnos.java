package escola.secretaria.Enum;

public enum Turnos {
    MATUTINO("Matutino"),
    VESPERTINO("Vespertino"),

    NORTURNO("Noturno"),

    NOTURNO("Noturno"),

    INTEGRAL("Integral");

    private String turnos;


    private Turnos(String turnos) {
        this.turnos = turnos;
        
    }

    

    private Turnos(String turnos){
        this.turnos = turnos;
    }

}
