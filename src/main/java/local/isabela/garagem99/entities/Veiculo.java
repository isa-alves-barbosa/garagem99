
package local.isabela.garagem99.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.logging.Logger;

/**
 *
 * @author ppjata
 */

@Entity
@Table(name = "veiculos")
public class Veiculo {

    
    
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 private String marca;
 private String modelo;
 private String cor;
 private long ano;
 private long km;

 @Column(name = "linkimagem")
 private String linkimagem;

@Column(name = "descricaocompleta")
 private String descricaocompleta;
private String avarias;

    public long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public long getAno() {
        return ano;
    }

    public long getKm() {
        return km;
    }

    public String getLinkimagem() {
        return linkimagem;
    }

    public String getDescricaocompleta() {
        return descricaocompleta;
    }

    public String getAvarias() {
        return avarias;
    }

    public Veiculo() {
    }


    public Veiculo(long id, String marca, String modelo, String cor, long ano, long km, String linkimagem, String descricaocompleta, String avarias) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.km = km;
        this.linkimagem = linkimagem;
        this.descricaocompleta = descricaocompleta;
        this.avarias = avarias;
    }
}