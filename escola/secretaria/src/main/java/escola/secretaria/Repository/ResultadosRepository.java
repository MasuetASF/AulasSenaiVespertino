package escola.secretaria.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import escola.secretaria.Model.Resultados;
import jakarta.transaction.Transactional;

public interface ResultadosRepository extends JpaRepository<Resultados, Integer> {

    @Modifying
    @Transactional
    @Query("update Resultados r set r.resultadoFinal = 'BRABO' where r.media > 6")
    int updateResultadosAprovado();

    @SuppressWarnings("null")
    public List<Resultados> findAll();


    public List<Resultados> findByResultadoFinal(String resultadoFinal);
}
