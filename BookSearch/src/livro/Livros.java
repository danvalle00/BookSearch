package livro;

public class Livros {
    String tituloLivro;
    GeneroLivro generoLivro;
    int classifIndicLivro;
    int qntPaginas;
    float avaliacaoLivro;
    
    @Override
    public String toString() 
    {
        return "Titulo: " + tituloLivro + " - Avaliacao: " + avaliacaoLivro + "/5" + " - " + "Paginas: " + qntPaginas;
                
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public void setGeneroLivro(GeneroLivro generoLivro) {
        this.generoLivro = generoLivro;
    }

    public void setClassifIndicLivro(int classifIndicLivro) {
        this.classifIndicLivro = classifIndicLivro;
    }

    public void setQntPaginas(int qntPaginas) {
        this.qntPaginas = qntPaginas;
    }

    public void setAvaliacaoLivro(float avaliacaoLivro) {
        this.avaliacaoLivro = avaliacaoLivro;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public GeneroLivro getGeneroLivro() {
        return generoLivro;
    }

    public int getClassifIndicLivro() {
        return classifIndicLivro;
    }

    public int getQntPaginas() {
        return qntPaginas;
    }

    public float getAvaliacaoLivro() {
        return avaliacaoLivro;
    }
}

