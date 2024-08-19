package br.com.cuidaidoso.cuidaidososb.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.cuidaidoso.cuidaidososb.entity.Cuidador;
import br.com.cuidaidoso.cuidaidososb.enumCuidaidoso.Estado;
import br.com.cuidaidoso.cuidaidososb.repository.CuidadorRepository;

@RestController
@RequestMapping("/api/cuidaidoso/v1")
public class CuidadorControler {

    @Autowired
    private CuidadorRepository cuidadorRepository;

    @GetMapping("/cuidadores")
    public List<Cuidador> getAll() {
        return cuidadorRepository.findAll();
    }

    @PostMapping("/cuidadores")
    public Cuidador create(@RequestBody Cuidador cuidador) {
        return cuidadorRepository.save(cuidador);
    }

    @PatchMapping("/cuidadores/{id}")
    public void updatePatch(@PathVariable(value = "id") Long cuidadorId, @RequestBody Cuidador cuidadorDetails) {
        Cuidador cuidador = cuidadorRepository.findById(cuidadorId).get();

        cuidador.setUserName(cuidadorDetails.getUserName());
        cuidador.setNome(cuidadorDetails.getNome());
        cuidador.setSobrenome(cuidadorDetails.getSobrenome());
        cuidador.setSenha(cuidadorDetails.getSenha());
        cuidador.setGenero(cuidadorDetails.getGenero());
        cuidador.setCpf(cuidadorDetails.getCpf());
        cuidador.setDataNascimento(cuidadorDetails.getDataNascimento());
        cuidador.setEmail(cuidadorDetails.getEmail());
        cuidador.setEstado(cuidadorDetails.getEstado());
        cuidador.setFormacao(cuidadorDetails.getFormacao());

        cuidadorRepository.save(cuidador);
    }

    @PutMapping("/cuidadores/{id}")
    public void updatePut(@PathVariable(value = "id") Long cuidadorId, @RequestBody Cuidador cuidadorDetails) {
        cuidadorRepository.save(cuidadorDetails);
    }

    @GetMapping("/cuidadores/{id}")
    public Cuidador getById(@PathVariable(value = "id") Long cuidadorId) {
        return cuidadorRepository.findById(cuidadorId).get();
    }

    @DeleteMapping("/cuidadores/{id}")
    public void delete(@PathVariable(value = "id") Long cuidadorId) {
        cuidadorRepository.deleteById(cuidadorId);
    }

    @GetMapping("/cuidadores/sigla/{estado}")
    public List<Cuidador> getBySiglaEstado(@PathVariable(value = "estado") String estadoSigla) {
        Estado estado = Estado.fromSigla(estadoSigla);
        return cuidadorRepository.findByEstado(estado);
    }

}