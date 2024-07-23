package escola.secretaria.Model;

import escola.secretaria.Enum.Sexo;
import escola.secretaria.Enum.Turma;
import escola.secretaria.Enum.Turnos;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "Alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Matricula")
    @NotNull
    private long matricula;

    @Column (name = "Nome")
    @NotBlank(message = "O nome não pode ser vazio")
    @NotNull
    private String nome;

    @Column(name = "Turno")
    @Enumerated(EnumType.STRING)
    @NotNull
    private Turnos turno;

    @Column(name = "Turma")
    @Enumerated(EnumType.STRING)
    @NotNull
    private Turma turma;

    @Column(name = "Sexo")
    @Enumerated(EnumType.STRING)
    @NotNull
    private Sexo sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public Turnos getTurno() {
        return turno;
    }

    public void setTurno(Turnos turno) {
        this.turno = turno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

}
