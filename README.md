# 📝 Edição de Documento com Histórico — Padrão de Projeto Memento

> Atividade prática da disciplina de **Padrões de Projeto** do curso de **Análise e Desenvolvimento de Sistemas (ADS) - IFPB**, aplicando o padrão **Memento** para salvar e restaurar estados anteriores de um documento sem expor diretamente seus detalhes internos.

---

## 📌 Sobre o projeto

Este projeto simula um sistema de edição de documentos com histórico de versões. O usuário pode alterar o conteúdo de um documento, salvar versões em momentos importantes e restaurar estados anteriores caso deseje desfazer alguma mudança. Utilizando o **padrão Memento**, o `HistoricoDocumento` armazena os estados sem precisar acessar diretamente os atributos internos do `Documento`.

---

## 🎯 Objetivo

Aplicar o padrão **Memento** para:

- Salvar e restaurar estados anteriores de um objeto sem expor sua estrutura interna
- Separar a responsabilidade de armazenamento do histórico da lógica do documento
- Permitir múltiplos pontos de restauração ao longo da edição

---

## 🧠 O Padrão Memento

O **Memento** é um padrão comportamental que permite capturar e externalizar o estado interno de um objeto sem violar o encapsulamento, de forma que o objeto possa ser restaurado para esse estado posteriormente.

---

## 🗂️ Estrutura do Projeto

```
SistemaDeEdicaoDeDocumento/
  └── src/
        ├── Documento          → originator (cria e restaura seus próprios estados)
        ├── HistoricoDocumento → caretaker (armazena e devolve estados salvos)
        ├── Main
        └── MementoDocumento   → memento (representa uma versão salva do documento)
```

---

## 💡 Responsabilidades das Classes

| Classe | Papel no Memento | Descrição |
|---|---|---|
| `Documento` | **Originator** | Mantém o estado atual, cria mementos e se restaura a partir deles |
| `MementoDocumento` | **Memento** | Representa uma versão salva do documento (título, conteúdo, autor, versão) |
| `HistoricoDocumento` | **Caretaker** | Armazena os mementos e os devolve quando uma restauração é solicitada |

---

## 👨‍💻 Autor

Desenvolvido como atividade prática da disciplina de **Padrões de Projeto** - ADS IFPB.
