package rc.unesp.br.cgen;


import javax.persistence.*;
@Entity // This tells Hibernate to make a table out of this class]
@Table(name= "codigo")
public class Codigo {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String texto;

    public Integer getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}