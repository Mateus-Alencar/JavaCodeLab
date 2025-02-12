# Diferença entre Classe e Objeto

A diferença entre **classe** e **objeto** é um conceito fundamental em **programação orientada a objetos (POO)**. Vamos entender melhor cada um desses conceitos:

### Classe

- **Classe**: Pode ser vista como um **molde** ou **modelo** para a criação de objetos. Ela define as propriedades (atributos) e os comportamentos (métodos) que os objetos dessa classe terão. Em outras palavras, a classe é a descrição de um tipo de dado, mas por si só não consome memória; ela serve apenas como uma definição.

  **Exemplo em Python**:

  ```python
  class Carro:
      def __init__(self, cor, modelo):
          self.cor = cor
          self.modelo = modelo
      
      def ligar(self):
          print(f'O {self.modelo} está ligado!')

### Objeto

**Objeto**: Um objeto é uma **instância de uma classe**. Quando você cria um objeto, você está basicamente "instanciando" a classe, ou seja, criando uma versão específica dela, com valores concretos para seus atributos e a capacidade de executar os métodos definidos na classe.

### Características de um Objeto:

- **Instância de uma classe**: Cada objeto é uma instância de uma classe, representando uma entidade real e com dados próprios.
- **Atributos e Métodos**: Um objeto possui os atributos e métodos definidos pela classe, mas com valores específicos. Ou seja, você pode ter múltiplos objetos de uma mesma classe, mas com características diferentes.

## Exemplo de Criação e Uso de Objetos:

```python
# Criando objetos (instâncias) da classe Carro
carro1 = Carro('vermelho', 'Fusca')
carro2 = Carro('azul', 'Civic')

# Chamando métodos dos objetos
carro1.ligar()  # O Fusca está ligado!
carro2.ligar()  # O Civic está ligado!
