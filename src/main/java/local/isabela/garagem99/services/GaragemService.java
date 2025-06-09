
package local.isabela.garagem99.services;

import java.util.List;
import local.isabela.garagem99.DTO.VeiculoDTO;
import local.isabela.garagem99.entities.Veiculo;
import local.isabela.garagem99.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author ppjata
 */
 @Service
public class GaragemService {

     @Autowired
     private VeiculoRepository veiculoRepository;
     
     public List <Veiculo> findAll(){
         
         List<Veiculo> result = veiculoRepository.findAll();
         return result;
     }

      
     public List<VeiculoDTO> findById(long id){
     List<Veiculo>resultVeiculo = veiculoRepository.findById(id);
     List<VeiculoDTO> resultDTO = resultVeiculo.stream()
    .map(x -> new VeiculoDTO(x)).toList();
      
     return resultDTO;
  }
      
      public List<Veiculo> findByCor(String cor) {
      List<Veiculo> result = veiculoRepository.findByCor(cor);
      return result;
   
  }
      public List<Veiculo> findByAno(long ano ) {
      List<Veiculo> result = veiculoRepository.findByAno(ano);
      return result;
 }
 }