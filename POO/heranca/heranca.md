# Herança em Java

A **herança** é um dos pilares da Programação Orientada a Objetos (POO). Ela permite que uma classe herde atributos e métodos de outra, promovendo **reutilização de código** e **organização hierárquica**.

---

## 🧠 O que é herança?

Herança é o mecanismo pelo qual uma classe (chamada **subclasse** ou **classe filha**) **herda** características (atributos e métodos) de outra classe (chamada **superclasse** ou **classe pai**).

---

## 🛠️ Como aplicar herança em Java?

Para aplicar herança em Java, usamos a palavra-chave `extends`.

---

## 📌 Exemplo:

```java
// Superclasse
class Pessoa {
    String nome;

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}

// Subclasse
class Aluno extends Pessoa {
    String curso;

    void estudar() {
        System.out.println("Estudando " + curso);
    }
}
```

## Testando

```java
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Maria";
        aluno.curso = "Ciência da Computação";

        aluno.apresentar(); // Saída: Olá, meu nome é Maria
        aluno.estudar();    // Saída: Estudando Ciência da Computação
    }
}
```

## 🔐 Herança e modificadores de acesso

- Atributos e métodos `private` **não são herdados diretamente**, mas podem ser acessados via métodos públicos da superclasse.
- Atributos e métodos `protected` **podem ser herdados e acessados** dentro da subclasse.

---

## 🚫 Herança em Java é simples, não múltipla

Em Java, uma classe **só pode herdar de uma única classe** (herança simples), pois **herança múltipla de classes não é permitida**.  
Para simular herança múltipla, usa-se **interfaces**.

---

## 🧾 Resumo

| Conceito                | Explicação                                                             |
|-------------------------|------------------------------------------------------------------------|
| Palavra-chave           | `extends`                                                              |
| Herança múltipla        | Não permitida com classes                                              |
| Pode herdar atributos?  | Sim (exceto os `private`)                                              |
| Pode herdar métodos?    | Sim (exceto os `private`)                                              |
| Substituição de métodos | Sim (com `@Override`)                                                  |
| Construtor é herdado?   | Não diretamente, mas pode ser chamado com `super()`                   |
| Classe base             | Chamada de **superclasse** ou **classe pai**                           |
| Classe derivada         | Chamada de **subclasse** ou **classe filha**                           |

---

