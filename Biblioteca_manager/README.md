# 📚 BiblioManager

**BiblioManager** é um sistema simples de gestão de biblioteca desenvolvido em Java com foco em conceitos de lógica, programação orientada a objetos (POO), vetores (listas) e herança.

O sistema permite o cadastro de livros e usuários, controle de empréstimos e devoluções de livros, além de listagens completas. Ideal para fins didáticos e aprendizado de Java.

---

## 🚀 Funcionalidades

- ✅ Cadastrar livros com título, autor e ISBN
- ✅ Cadastrar usuários com nome e ID
- ✅ Listar todos os livros cadastrados
- ✅ Listar todos os usuários cadastrados
- ✅ Emprestar livros a usuários
- ✅ Registrar devoluções de livros
- ✅ Verificar disponibilidade dos livros

---

## 🛠️ Tecnologias Utilizadas

- Java (console)
- Orientação a Objetos
- Listas com `ArrayList`
- Estrutura de controle com `switch` e `loops`
- `Scanner` para entrada de dados

---

## 📁 Estrutura do Projeto

```plaintext
📁 BiblioManager
├── Main.java         # Classe principal com menu e interações
├── Livro.java        # Classe que representa um livro
├── Pessoa.java       # Classe base para herança
├── Usuario.java      # Subclasse de Pessoa
└── Biblioteca.java   # Classe que gerencia a lógica do sistema
