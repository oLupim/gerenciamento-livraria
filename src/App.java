public class App {
    public static void main(String[] args) {
        Livraria livraria = new Livraria();
        Livro livro = new Livro("Java Básico", "Tiago", 256, false);
        Livro livro2 = new Livro("Java 2", "Gustavo", 135, false);
        
        livro.reservar("Java Básico");

        // Devolvendo o livro
        livro2.devolver("Java 2", false); 



        //teste 2

        livraria.inserirLivro(livro);
        livraria.inserirLivro(livro2);

        livraria.listarLivros();
        livraria.listarDisponiveis();
        

    }
}
