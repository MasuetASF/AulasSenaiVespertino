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

@Entity
@Table(name = "Resultados")
public class Resultados {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id RES")
    private long idRes;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Matricula", referencedColumnName = "Matricula")
    private Aluno matricula;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id Disciplina", referencedColumnName = "Id Disciplina")
    private DisciplinasModel idDis;

    @Column(name  = "PriNota")
    private double priNota;

    @Column(name  = "SegNota")
    private double segNota;

    @Column(name  = "TerNota")
    private double terNota;

    @Column(name  = "QuaNota")
    private double quaNota;
    
    @Column(name  = "Media")
    private double media;

    @Column(name = "ResultadoFinal")
    private String resultadoFinal;

    public long getIdRes() {
        return idRes;
    }

    public void setIdRes(long idRes) {
        this.idRes = idRes;
    }

    public Aluno getMatricula() {
        return matricula;
    }

    public void setMatricula(Aluno matricula) {
        this.matricula = matricula;
    }

    public DisciplinasModel getIdDis() {
        return idDis;
    }

    public void setIdDis(DisciplinasModel idDis) {
        this.idDis = idDis;
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

    public double getMedia() {
        return media;
    }
    
    public void resultado(double priNota, double segNota, double terNota, double quaNota){
        double media= 0.0;
        media = (priNota + segNota + terNota + quaNota)/4;
        setMedia(media);
    }


    public void setMedia(double media) {
        this.media = media;
    }

    public String getResultadoFinal() {
        return resultadoFinal;
    }

    public void setResultadoFinal(String resultadoFinal) {
        this.resultadoFinal = resultadoFinal;
    }

    public void resultadoFinal(double media){
        if(media >= 6) {
            setResultadoFinal("APROVADO");
        }else if(media >= 5 && media <= 5.9 ){
            setResultadoFinal("RECUPERACAO");
        }
        else{
            setResultadoFinal("REPROVADO");
        }
    }

       
}