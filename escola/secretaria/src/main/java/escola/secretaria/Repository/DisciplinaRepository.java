package escola.secretaria.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import escola.secretaria.Model.DisciplinasModel;

@SuppressWarnings("rawtypes")
public interface DisciplinaRepository extends JpaRepository<DisciplinasModel, Integer> {

    @SuppressWarnings("null")
    public List<DisciplinasModel> findAll();

    
}
