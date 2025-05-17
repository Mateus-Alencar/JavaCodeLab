# 🔌 Interface em Java

## ✨ O que é uma Interface?

Uma **interface** em Java é como um **contrato**: ela define **o que uma classe deve fazer**, mas **não como**.  
Ela **declara métodos**, e as classes que a **implementam** são obrigadas a fornecer as **implementações desses métodos**.

> Pense em uma interface como um **controle remoto**: ele tem botões (métodos), mas não te mostra os fios e circuitos por trás (implementação).

---

## 🛠️ Estrutura Básica

```java
public interface Animal {
    void emitirSom();
}
```

Uma classe que **implementa** a interface:

```java
public class Cachorro implements Animal {
    public void emitirSom() {
        System.out.println("Au au!");
    }
}
```

---

## 🧠 Por que usar interfaces?

- **Desacoplar** código (baixo acoplamento)
- Permitir **flexibilidade** (mudar comportamentos facilmente)
- Usar **polimorfismo** (tratar objetos por suas interfaces)
- Simular **herança múltipla** (uma classe pode implementar várias interfaces)

---

## 🆚 Interface vs Classe Abstrata

| Característica            | Interface                            | Classe Abstrata                      |
|---------------------------|---------------------------------------|--------------------------------------|
| Palavra-chave             | `interface`                           | `abstract class`                     |
| Implementação de métodos  | Não (até Java 7) / `default` desde Java 8 | Sim                                 |
| Atributos                 | `public static final` por padrão      | Atributos normais                    |
| Herança múltipla          | ✅ Sim (várias interfaces)            | ❌ Não (apenas uma classe)           |
| Construtores              | ❌ Não                                | ✅ Sim                               |

---

## 🧪 Exemplo Prático

```java
public interface Pagavel {
    void pagar();
}

public class Boleto implements Pagavel {
    public void pagar() {
        System.out.println("Pagando com boleto.");
    }
}

public class CartaoCredito implements Pagavel {
    public void pagar() {
        System.out.println("Pagando com cartão de crédito.");
    }
}

public class Caixa {
    public void processarPagamento(Pagavel formaPagamento) {
        formaPagamento.pagar();
    }
}
```

### Uso:

```java
Caixa caixa = new Caixa();
caixa.processarPagamento(new Boleto());
caixa.processarPagamento(new CartaoCredito());
```

---

## 🧩 Interface com `default` (desde Java 8)

Interfaces podem ter métodos com corpo, usando `default`:

```java
public interface Saudavel {
    default void beberAgua() {
        System.out.println("Beba água!");
    }
}
```

---

## 📌 Dicas e Boas Práticas

- Programe para **interfaces**, não para implementações.
- Use interfaces para definir **papéis** ou **capacidades** (ex: `Serializable`, `Runnable`, `Comparable`).
- Prefira interfaces quando precisar de **flexibilidade** e **herança múltipla de comportamento**.

---

## 📚 Conclusão

Interfaces são poderosas para tornar seu código mais **organizado, flexível e desacoplado**.  
São fundamentais na **Programação Orientada a Objetos** e na construção de sistemas robustos.

