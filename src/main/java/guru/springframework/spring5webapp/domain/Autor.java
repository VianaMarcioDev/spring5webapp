package guru.springframework.spring5webapp.domain;

import javax.persistence.*;
import java.util.Set;

@Entity

public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String primeiroNome;
    private String sobrenome;
    @ManyToMany(mappedBy = "autores")
    private Set<Livro> livros;

    public Autor(String primeiroNome, String sobrenome, Set<Livro> livros) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.livros = livros;
    }

    public Autor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Set<Livro> getLivros() {
        return livros;
    }

    public void setLivros(Set<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", primeiroNome='" + primeiroNome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", livros=" + livros +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Autor autor = (Autor) o;

        return id == autor.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
