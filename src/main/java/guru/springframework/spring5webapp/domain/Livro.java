package guru.springframework.spring5webapp.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String titulo;
    private String isbn;
    @ManyToMany
    @JoinTable(name = "autor_livro", joinColumns = @JoinColumn(name = "livro_id"),
    inverseJoinColumns = @JoinColumn(name = "autor_id"))
    private Set<Autor> autores;

    public Livro(String titulo, String isbn, Set<Autor> autores) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autores = autores;
    }

    public Livro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Set<Autor> getAutores() {
        return autores;
    }

    public void setAutores(Set<Autor> autores) {
        this.autores = autores;
    }
}
