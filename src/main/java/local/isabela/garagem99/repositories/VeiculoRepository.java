
package local.isabela.garagem99.repositories;




import java.util.List;
import local.isabela.garagem99.entities.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ppjata
 */
public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{
    //List<Veiculo> findAll();
    List<Veiculo> findById(long id);
    List<Veiculo> findByCor(String cor);
    List<Veiculo> findByAno(long ano); 
}
