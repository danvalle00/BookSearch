package pesquisaLivro;

import usuario.*;
import livro.*;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class PesquisaLivro {
    Usuario usuarioEscolhas;
    ArrayList<Livros> livrosTodos;
    ArrayList<Livros> livrosRecomendados;      
    
    public PesquisaLivro(Usuario usuario)
    {
        usuarioEscolhas = usuario;
        livrosTodos = new ArrayList<>();
        livrosRecomendados = new ArrayList<>();
        
    }
    
    public ArrayList<Livros> recomendarLivro()
    {
        return livrosRecomendados;
    }
    public void lerCsv() throws FileNotFoundException
    {
        
        Scanner scanner = new Scanner(new File("src\\BookSearch\\dbLivros.csv"));
        scanner.useDelimiter(",");
        scanner.nextLine();
        while (scanner.hasNextLine())
        {
            String linhaAtual = scanner.nextLine();
            if (linhaAtual != null)
            {
                converterCsv(linhaAtual);
            }                
        }
        filtrarLivro();
        scanner.close();
     }
    public void converterCsv(String databaseLivro)
    {
        Livros livroConvertido = new Livros();
        String[] termosSeparados = databaseLivro.split(","); // {"titulo", "genero", "classificacaoIndicativa", "quantidadePag", "avaliacao"}
        
        String tituloData = termosSeparados[0];
        String generoData = termosSeparados[1];
        String classificacaoData = termosSeparados[2];
        int qntdPagData = Integer.parseInt(termosSeparados[3]);
        float avaliacaoLivroData = Float.parseFloat(termosSeparados[4]);
        
        livroConvertido.setTituloLivro(tituloData);
        livroConvertido.setGeneroLivro(GeneroLivro.valueOf(generoData));  // "Romance" "Terror"
        livroConvertido.setAvaliacaoLivro(avaliacaoLivroData);
        livroConvertido.setQntPaginas(qntdPagData);
        switch (classificacaoData)
        {
            case "Livre":
                livroConvertido.setClassifIndicLivro(0); 
                break;
            case "10":
                livroConvertido.setClassifIndicLivro(10);
                break;
            case "12":
                livroConvertido.setClassifIndicLivro(12);
                break;
            case "14":
                livroConvertido.setClassifIndicLivro(14);
                break;
            case "16":
                livroConvertido.setClassifIndicLivro(16);
                break;
            case "18":
                livroConvertido.setClassifIndicLivro(18);
                break;
        } 
        this.livrosTodos.add(livroConvertido);
        
    }
    
    public void filtrarLivro() 
    {      
        // System.out.println(usuarioEscolhas.toString());
        
        for (Livros livros : livrosTodos)
        {
            
            if (usuarioEscolhas.getGeneroLeitor() != livros.getGeneroLivro()) // genero do livro diferente da escolha do usuario
            {
                continue;   
            }
                

            if (usuarioEscolhas.getIdadeLeitor() < livros.getClassifIndicLivro()) // Se a idade do leitor for menor que a classificacao ignora o livro
            {
                continue;
            }
                
            
            if (usuarioEscolhas.getTipoLeitor() == TipoDeLeitor.Simples && livros.getQntPaginas() < 250)
            {
                this.livrosRecomendados.add(livros);
            }
            else if (usuarioEscolhas.getTipoLeitor() == TipoDeLeitor.Avancado && livros.getQntPaginas() >= 250)
            {
                this.livrosRecomendados.add(livros);
            }
            else
            {
                continue;
            }
        }
        System.out.println(livrosRecomendados.toString());
    }
            
             
}
    
  


