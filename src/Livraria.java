import java.util.ArrayList;
import java.util.List;

public class Livraria {
    public List<Livro> livros;

    public Livraria(){
        this.livros = new ArrayList<>();
    }

    public void inserirLivro(Livro livro){
        livros.add(livro);
    }


    public void listarLivros(){
        System.out.println("Lista de livros:\n");
        for (Livro livro : livros){
            System.out.println(livro);
        }
    }


    public void listarDisponiveis(){
        boolean livrosDisp = false;

        System.out.println("Livros disponíveis");
        for (Livro livro : livros){
            if (livro.isDisponivel()){
                System.out.println(livro);
                livrosDisp = true;
            }
        }
        if (!livrosDisp){
            System.out.println("Nenhum livro disponível para locar.");
        }
    }

}

