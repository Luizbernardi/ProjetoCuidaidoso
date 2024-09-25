package br.com.cuidaidoso.cuidaidososb.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import br.com.cuidaidoso.cuidaidososb.entity.Cuidador;
import br.com.cuidaidoso.cuidaidososb.enumCuidaidoso.Genero;
import br.com.cuidaidoso.cuidaidososb.enumCuidaidoso.Perfil;
import br.com.cuidaidoso.cuidaidososb.repository.CuidadorRepository;
import br.com.cuidaidoso.cuidaidososb.util.UploadUtil;

@Controller
@RequestMapping("/cuidador")
public class CuidadorControler {

    @Autowired
    private CuidadorRepository cuidadorRepository;

    @GetMapping("/cadastro")
    public ModelAndView cadastro(Cuidador cuidador) {
        ModelAndView mv = new ModelAndView("cuidador/cadastro");
        mv.addObject("usuario", new Cuidador());
        Genero[] generoList = { Genero.MASCULINO, Genero.FEMININO, Genero.OUTRO };
        mv.addObject("generoList", generoList);
        Perfil[] perfilList = { Perfil.ADMIN, Perfil.CUIDADOR };
        mv.addObject("perfilList", perfilList);

        return mv;
    }

    @PostMapping("/cadastro-cuidador")
    public ModelAndView cadastro(@ModelAttribute Cuidador cuidador, @RequestParam("file") MultipartFile imagem) {
        ModelAndView mv = new ModelAndView("cuidador/cadastro");
        mv.addObject("usuario", cuidador);

        try {
            if (!imagem.isEmpty()) {
                if (UploadUtil.fazerUploadImagem(imagem)) {
                    cuidador.setImagem(imagem.getOriginalFilename());
                } else {
                    throw new Exception("Falha ao fazer upload da imagem");
                }
            }

            cuidadorRepository.save(cuidador);
            System.out.println("Cuidador salvo com sucesso: " + cuidador.getNome() + " " + cuidador.getImagem());
            return home();
        } catch (Exception e) {
            mv.addObject("msgErro", e.getMessage());
            System.out.println("Erro ao salvar o cuidador: " + e.getMessage());
            return mv;
        }
    }

    @GetMapping("/inicio")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("home/index");
        return mv;
    }

}