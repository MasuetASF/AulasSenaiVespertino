package escola.secretaria.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import escola.secretaria.Model.Resultados;

public interface ResultadosRepository extends JpaRepository<Resultados, Integer> {


    @SuppressWarnings("null")
    public List<Resultados> findAll();


    public List<Resultados> findByResultadoFinal(String resultadoFinal);
}
