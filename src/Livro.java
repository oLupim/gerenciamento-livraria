public class Livro {
    public String titulo;
    public String autor;
    public int numeroPagina;
    public boolean disponibilidade;

    public Livro(String titulo, String autor, int numeroPagina, boolean disponibilidade){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;
        this.disponibilidade = disponibilidade;
    }

    public void exibirDetalhes(){
        System.out.println("Título: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("O livro tem " +numeroPagina+ " páginas.");
        System.out.println("Disponibilidade: "+disponibilidade);
    }

    public void reservar(String titulo){
        if (disponibilidade == true ){
            System.out.println("\nLivro disponível para locar!\n");
        } else{
            System.out.println(titulo+" está locado!\n");
        }
    }

    public void devolver(String titulo, boolean disponibilidade){
        System.out.println(titulo+" está disponível para locar novamente!");
        this.disponibilidade = true;
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Disponível: " + (disponibilidade ? "Sim" : "Não");
    }

}
