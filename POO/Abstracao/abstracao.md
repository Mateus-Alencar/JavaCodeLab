# Abstração em Java

A **abstração** é um dos pilares da Programação Orientada a Objetos (POO). Ela permite esconder os detalhes de implementação e mostrar apenas a funcionalidade essencial de uma classe ou objeto.

---

## 🧠 O que é abstração?

Em termos simples, abstração significa focar **no que o objeto faz** em vez de **como ele faz**. Por exemplo, quando usamos um carro, não precisamos saber como o motor funciona para dirigi-lo — só precisamos saber como usar os pedais e o volante.

---

## 🛠️ Como aplicar abstração em Java?

Em Java, a abstração é implementada principalmente usando:

- **Classes abstratas**
- **Interfaces**

---

## ✅ Usando uma classe abstrata

Uma classe abstrata é uma classe que **não pode ser instanciada** e pode conter métodos **abstratos** (sem corpo) e métodos **concretos** (com corpo).

### 📌 Exemplo:

```java
abstract class Animal {
    // Método abstrato (sem implementação)
    abstract void emitirSom();

    // Método concreto
    void dormir() {
        System.out.println("Dormindo...");
    }
}

class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Latindo...");
    }
}
```
### Testando
```java
public class Main {
    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro();
        meuCachorro.emitirSom(); // Saída: Latindo...
        meuCachorro.dormir();    // Saída: Dormindo...
    }
}
```

## Usando Interfaces

Uma interface define um contrato que outras classes devem seguir. Todos os métodos de uma interface são abstratos por padrão (até o Java 7). A partir do Java 8, interfaces podem ter métodos default e static.

```Java
interface Forma {
    double calcularArea();
}

class Circulo implements Forma {
    double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

```
### Testando
``` Java
public class Main {
    public static void main(String[] args) {
        Forma f = new Circulo(3);
        System.out.println("Área: " + f.calcularArea()); // Saída: Área: 28.27...
    }
}

```

## Resumo

| Abordagem         | Pode ter implementação?        | Pode ter construtor? | Pode ter atributos?       | Pode instanciar? |
|-------------------|-------------------------------|----------------------|---------------------------|------------------|
| Classe abstrata   | Sim                           | Sim                  | Sim                       | Não              |
| Interface         | A partir do Java 8 (default e static) | Não                 | Apenas constantes (`public static final`) | Não              |
