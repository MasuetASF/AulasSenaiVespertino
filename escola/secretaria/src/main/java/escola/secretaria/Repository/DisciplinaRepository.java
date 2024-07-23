package escola.secretaria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import escola.secretaria.Enum.Disciplinas;

public interface DisciplinaRepository extends JpaRepository<Disciplinas, Integer> {

}
