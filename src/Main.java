public class Main {
    public static void main(String[] args) {
        Documento documento = new Documento("Relatório", "Conteúdo inicial do documento.", "Carlos", "Versão 1");
        HistoricoDocumento historico = new HistoricoDocumento();
        System.out.println("----------------------------------------");
        System.out.println("ESTADO INICIAL:");
        documento.exibirDocumento();
        historico.adicionarMemento(documento.salvar());
        documento.alterarConteudo("Conteúdo alterado pela primeira vez.", "Versão 2");
        historico.adicionarMemento(documento.salvar());
        documento.alterarConteudo("Conteúdo alterado pela segunda vez.", "Versão 3");
        System.out.println("ESTADO ATUAL:");
        documento.exibirDocumento();
        System.out.println("RESTAURANDO PARA VERSÃO 2...");
        documento.restaurar(historico.obterMemento(1));
        documento.exibirDocumento();
        System.out.println("RESTAURANDO PARA VERSÃO 1...");
        documento.restaurar(historico.obterMemento(0));
        documento.exibirDocumento();
    }
}