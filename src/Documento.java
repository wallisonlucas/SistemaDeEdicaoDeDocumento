public class Documento {
    private String titulo;
    private String conteudo;
    private String autor;
    private String versao;

    public Documento(String titulo, String conteudo, String autor, String versao) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.autor = autor;
        this.versao = versao;
    }

    public void alterarConteudo(String novoConteudo, String novaVersao) {
        this.conteudo = novoConteudo;
        this.versao = novaVersao;
    }

    public void exibirDocumento() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Versão: " + versao);
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("----------------------------------------");
    }

    public MementoDocumento salvar() {
        return new MementoDocumento(titulo, conteudo, autor, versao);
    }

    public void restaurar(MementoDocumento memento) {
        this.titulo = memento.getTitulo();
        this.conteudo = memento.getConteudo();
        this.autor = memento.getAutor();
        this.versao = memento.getVersao();
    }
}