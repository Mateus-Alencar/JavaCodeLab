# Termos Técnicos em Programação Orientada a Objetos (POO)

A **Programação Orientada a Objetos (POO)** é um paradigma de programação que organiza o código em torno de objetos e classes. Abaixo estão alguns dos principais termos e conceitos usados em POO:

### 1. **Classe**
Uma **classe** é uma estrutura que define o comportamento e as propriedades de um tipo de dado. Ela serve como um molde para criar objetos. Dentro da classe, podemos definir atributos (dados) e métodos (funções).

### 2. **Objeto**
Um **objeto** é uma instância de uma classe. Ele possui valores concretos para os atributos e pode executar os métodos definidos pela classe.

### 3. **Encapsulamento**
O **encapsulamento** é o conceito de esconder os detalhes internos de um objeto e expor apenas o que é necessário para o mundo exterior. Ele é alcançado através da definição de **modificadores de acesso** (como `private`, `public`, `protected` em Java) e métodos para manipulação dos dados internos.

**Exemplo**:
```java
class ContaBancaria {
    private double saldo;  // Atributo privado

    // Método público para acessar o saldo
    public double getSaldo() {
        return saldo;
    }

    // Método público para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
}
```

## 4. Herança
A **herança** é um mecanismo que permite que uma classe herde atributos e métodos de outra classe. Isso promove o reuso de código e facilita a extensão de funcionalidades.

**Exemplo**:

```java
class Animal {
    public void fazerSom() {
        System.out.println("Som genérico de animal");
    }
}

class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Au au");
    }
}
```

## 5. Polimorfismo
O **polimorfismo** permite que um objeto se comporte de diferentes formas, dependendo do contexto. Ele pode ser de dois tipos:

- **Polimorfismo de sobrecarga**: Quando métodos com o mesmo nome, mas parâmetros diferentes, são definidos.
- **Polimorfismo de sobrescrita**: Quando um método da classe pai é sobrescrito por um método na classe filha.

**Exemplo**:

```java
class Animal {
    public void fazerSom() {
        System.out.println("Som de animal");
    }
}

class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Gato();  // Polimorfismo
        animal.fazerSom();  // Saída: Miau
    }
}
```

## 6. Abstração
A **abstração** é o processo de ocultar os detalhes de implementação e mostrar apenas os aspectos essenciais de um objeto. Ela permite que o programador trabalhe com o que é relevante e não se preocupe com detalhes desnecessários.

**Exemplo**:

```java
abstract class Forma {
    abstract void desenhar();
}

class Circulo extends Forma {
    @Override
    void desenhar() {
        System.out.println("Desenhando um círculo");
    }
}
```

## 7. Escopo
O **escopo** define a área onde uma variável ou método pode ser acessado dentro do código. Existem diferentes tipos de escopo, como:

- **Escopo local**: Variáveis definidas dentro de um método ou bloco de código.
- **Escopo de instância**: Variáveis definidas em uma classe, mas fora de qualquer método (atributos de objetos).
- **Escopo global**: Variáveis que estão acessíveis em todo o código, normalmente definidas fora de qualquer função ou classe.

## 8. Composição
A **composição** é um tipo de relação entre classes onde um objeto é composto por outros objetos. Ao contrário da herança, onde uma classe herda de outra, a composição envolve o uso de objetos dentro de uma classe para construir funcionalidades mais complexas.

**Exemplo**:

```java
class Motor {
    void ligar() {
        System.out.println("Motor ligado");
    }
}

class Carro {
    private Motor motor;  // Composição, um carro tem um motor

    public Carro() {
        this.motor = new Motor();  // Criação do motor dentro do carro
    }

    void ligarCarro() {
        motor.ligar();
    }
}
```

## 9. Construtores
Os **construtores** são métodos especiais usados para inicializar objetos quando são criados. Eles têm o mesmo nome da classe e não possuem tipo de retorno. Em Java, podem ser sobrecarregados para fornecer diferentes formas de inicializar objetos.

**Exemplo**:

```java
class Pessoa {
    String nome;
    int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
```


# Diferença entre Classe e Objeto

A diferença entre **classe** e **objeto** é um conceito fundamental em **programação orientada a objetos (POO)**. Vamos entender melhor cada um desses conceitos:

### Classe

- **Classe**: Pode ser vista como um **molde** ou **modelo** para a criação de objetos. Ela define as propriedades (atributos) e os comportamentos (métodos) que os objetos dessa classe terão. Em outras palavras, a classe é a descrição de um tipo de dado, mas por si só não consome memória; ela serve apenas como uma definição.

  **Exemplo em Java**:

  ```java
  class Carro {
      String cor;
      String modelo;

      // Construtor da classe
      public Carro(String cor, String modelo) {
          this.cor = cor;
          this.modelo = modelo;
      }

      // Método da classe
      public void ligar() {
          System.out.println("O " + modelo + " está ligado!");
      }
  }
  ```
  
### Objeto

**Objeto**: Um objeto é uma **instância de uma classe**. Quando você cria um objeto, você está basicamente "instanciando" a classe, ou seja, criando uma versão específica dela, com valores concretos para seus atributos e a capacidade de executar os métodos definidos na classe.

### Características de um Objeto:

- **Instância de uma classe**: Cada objeto é uma instância de uma classe, representando uma entidade real e com dados próprios.
- **Atributos e Métodos**: Um objeto possui os atributos e métodos definidos pela classe, mas com valores específicos. Ou seja, você pode ter múltiplos objetos de uma mesma classe, mas com características diferentes.

### Exemplo de Criação e Uso de Objetos:

```java
public class Main {
    public static void main(String[] args) {
        // Criando objetos (instâncias) da classe Carro
        Carro carro1 = new Carro("vermelho", "Fusca");
        Carro carro2 = new Carro("azul", "Civic");

        // Chamando métodos dos objetos
        carro1.ligar();  // O Fusca está ligado!
        carro2.ligar();  // O Civic está ligado!
    }
}
```
