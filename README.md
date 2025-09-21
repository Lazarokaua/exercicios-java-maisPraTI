# Exercícios de Orientação a Objetos em Java

Este repositório contém uma série de exercícios práticos de programação orientada a objetos utilizando a linguagem Java. O objetivo é abordar conceitos fundamentais e avançados de POO, desde encapsulamento até padrões de projeto.

## Estrutura do Projeto

O projeto está organizado em pacotes, onde cada pacote representa um exercício ou um conjunto de conceitos relacionados.

- `src/main/java/br/com/lazarokaua/exercicios/`: Contém o código-fonte dos exercícios.

## Exercícios

Aqui está uma breve descrição de cada exercício:

### ex1_encapsulamento
Aborda o conceito de encapsulamento, um dos pilares da programação orientada a objetos, escondendo os detalhes de implementação de um objeto e expondo apenas o que é necessário.

### ex1_encapsulamentoComValidacao
Uma extensão do exercício anterior, adicionando validações nos métodos de acesso para garantir a integridade dos dados do objeto.

### ex3_heranca
Demonstra o uso de herança, permitindo que uma classe (subclasse) herde atributos e métodos de outra classe (superclasse).

### ex4_interfaces
Explora o conceito de interfaces, que definem um contrato de comportamento que as classes devem implementar.

### ex5_sistemaDePagamento
Simula um sistema de pagamento simples, aplicando conceitos de polimorfismo e abstração com diferentes formas de pagamento.

### ex6_imutabilidade
Apresenta o conceito de objetos imutáveis, cujos estados não podem ser modificados após a sua criação, o que é crucial para a segurança em ambientes com múltiplas threads.

### ex7_repository
Implementa o padrão de projeto Repository com Generics. O exercício consiste em criar um repositório genérico em memória (`InMemoryRepository`) que pode ser usado para diferentes entidades (`Produto`, `Funcionario`) que implementam a interface `Identificavel`. O repositório deve permitir salvar, buscar por ID, listar todos e remover entidades, lançando uma exceção (`EntidadeNaoEncontradaException`) ao tentar remover um ID inexistente.

### ex8_strategy
Aplica o padrão de projeto Strategy para o cálculo de frete. O exercício consiste em modelar uma `CalculadoraFrete` que calcula o valor do frete de um `Pedido` com base em diferentes estratégias (`Sedex`, `Pac`, `RetiradaNaLoja`). O exercício também explora o uso de lambdas para criar uma estratégia promocional e a validação de CEP com exceções (`CepInvalidoException`).

## Como Executar os Exercícios

Cada exercício possui uma classe `Main` (ou similar) que pode ser executada para ver o código em ação. Para compilar e executar um exercício específico, você pode usar os seguintes comandos a partir da raiz do projeto:

```bash
# Exemplo para o ex8_strategy
javac -d out/production/exercicioMaisPraTIOrientacaoAObjetos src/main/java/br/com/lazarokaua/exercicios/ex8_strategy/*.java
java -cp out/production/exercicioMaisPraTIOrientacaoAObjetos br.com.lazarokaua.exercicios.ex8_strategy.Main
```

Lembre-se de que você precisa ter o JDK (Java Development Kit) instalado e configurado em seu ambiente.
