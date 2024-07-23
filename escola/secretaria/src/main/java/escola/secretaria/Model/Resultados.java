package escola.secretaria.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Resultados")
public class Resultados {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "Id RES")
    private long id;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="Matricula", referencedColumnName="Matricula")  
    private Aluno matricula;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="id Disciplina", referencedColumnName="id")  
    private DisciplinasModel disciplina;

    @Column(name= "PRINota")
    @NotBlank
    @NotNull
    private double priNota;

    @Column(name= "SEGNota")
    @NotBlank
    @NotNull
    private double segNota;

    @Column(name= "TERNota")
    @NotBlank
    @NotNull
    private double terNota;

    @Column(name= "QUANota")
    @NotBlank
    @NotNull
    private double quaNota;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Aluno getMatricula() {
        return matricula;
    }

    public void setMatricula(Aluno matricula) {
        this.matricula = matricula;
    }

    public DisciplinasModel getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(DisciplinasModel disciplina) {
        this.disciplina = disciplina;
    }

    public double getPriNota() {
        return priNota;
    }

    public void setPriNota(double priNota) {
        this.priNota = priNota;
    }

    public double getSegNota() {
        return segNota;
    }

    public void setSegNota(double segNota) {
        this.segNota = segNota;
    }

    public double getTerNota() {
        return terNota;
    }

    public void setTerNota(double terNota) {
        this.terNota = terNota;
    }

    public double getQuaNota() {
        return quaNota;
    }

    public void setQuaNota(double quaNota) {
        this.quaNota = quaNota;
    }

    

    


}
