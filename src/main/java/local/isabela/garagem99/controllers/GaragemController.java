package local.isabela.garagem99.controllers;

import java.util.List;
import local.isabela.garagem99.DTO.VeiculoDTO;
import local.isabela.garagem99.entities.Veiculo;
import local.isabela.garagem99.services.GaragemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ppjata
 */
@RestController
public class GaragemController {

    @Autowired
    private GaragemService garagemService;

    /**
     * Endpoint / garagem/garagem Retorna todos os veiculos
     *
     * @return
     */
    @GetMapping("/garagem")
    public List<Veiculo> findAll() {
        List<Veiculo> result = garagemService.findAll();
        return result;

    }

    @GetMapping("/garagem/forsale/{id}")
    public List<VeiculoDTO> findById(@PathVariable long id) {
        List<VeiculoDTO> result = garagemService.findById(id);
        return result;
    }

    @GetMapping("/garagem/color/{cor}")
    public List<Veiculo> findByCor(@PathVariable String cor) {
        List<Veiculo> result = garagemService.findByCor(cor);
        return result;

    }

    @GetMapping("/garagem/year/{ano}")
    public List<Veiculo> findByAno(@PathVariable long ano) {
        List<Veiculo> result = garagemService.findByAno(ano);
        return result;
    }

}
