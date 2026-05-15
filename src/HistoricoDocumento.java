import java.util.ArrayList;
import java.util.List;

public class HistoricoDocumento {
    private List<MementoDocumento> historico = new ArrayList<>();

    public void adicionarMemento(MementoDocumento memento) {
        historico.add(memento);
    }

    public MementoDocumento obterMemento(int indice) {
        if (indice >= 0 && indice < historico.size()) {
            return historico.get(indice);
        }
        return null;
    }

    public int quantidadeVersoes() {
        return historico.size();
    }
}