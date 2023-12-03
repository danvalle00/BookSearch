package usuario;
import livro.GeneroLivro;

public class Usuario {
    String nomeLeitor;
    int idadeLeitor;
    TipoDeLeitor tipoLeitor;

    public String getNomeLeitor() {
        return nomeLeitor;
    }

    public void setNomeLeitor(String nomeLeitor) {
        this.nomeLeitor = nomeLeitor;
    }

    public int getIdadeLeitor() {
        return idadeLeitor;
    }

    public void setIdadeLeitor(int idadeLeitor) {
        this.idadeLeitor = idadeLeitor;
    }

    public TipoDeLeitor getTipoLeitor() {
        return tipoLeitor;
    }

    public void setTipoLeitor(TipoDeLeitor tipoLeitor) {
        this.tipoLeitor = tipoLeitor;
    }

    public GeneroLivro getGeneroLeitor() {
        return generoLeitor;
    }

    public void setGeneroLeitor(GeneroLivro generoLeitor) {
        this.generoLeitor = generoLeitor;
    }

    @Override 
    public String toString() {
        return "Nome: " + nomeLeitor + ", Genero Escolhido: " + generoLeitor + ", Tipo de Pesquisa: " + tipoLeitor;
    }
    GeneroLivro generoLeitor;

}
    
