package escola.secretaria.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import escola.secretaria.Model.Aluno;
import escola.secretaria.Model.DisciplinasModel;
import escola.secretaria.Model.Resultados;
import escola.secretaria.Repository.AlunoRepository;
import escola.secretaria.Repository.DisciplinaRepository;
import escola.secretaria.Repository.ResultadosRepository;




@RestController
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @Autowired
    private ResultadosRepository resultadosRepository;

    @GetMapping("/lista")
    public List<Aluno> lista() {
       return alunoRepository.findAll();
    }
    

    @GetMapping("/teste")
    public String teste() {
        return "Ta pampa";
    }
    
    @PostMapping("/inserir")
    public Aluno inserir(@RequestBody Aluno aluno) { 
        return alunoRepository.save(aluno);
    }

    @PostMapping("/inserirdisciplina")
    public DisciplinasModel inserirDisciplina(@RequestBody DisciplinasModel disciplinas) {
        return disciplinaRepository.save(disciplinas);

    }
    
    @PostMapping("/lancarnotas")
    public Resultados inserirNotas(@RequestBody Resultados resultados){
        //resultados.resultado(resultados.getPriNota(), resultados.getSegNota(), resultados.getTerNota(), resultados.getQuaNota());
        return resultadosRepository.save(resultados);
    }
    

    @GetMapping("/mostrardisciplina")
    public List<DisciplinasModel> listaDisciplina() {
        return disciplinaRepository.findAll();
    }




}
