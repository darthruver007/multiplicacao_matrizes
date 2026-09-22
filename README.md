# multiplicacao_matrizes_java

Aplicação Console desenvolvida em Java para realizar a leitura, o cálculo da multiplicação e a exibição de duas matrizes dinâmicas via terminal.

---

## Sobre o Projeto

- O projeto é uma aplicação Java CLI (Interface de Linha de Comando).
- Permite a leitura dinâmica das dimensões de duas matrizes: $A (m \times p)$ e $B (p \times n)$.
- Realiza a validação matemática implicitamente exigindo que o número de colunas de A seja igual ao número de linhas de B.
- Processa a entrada de dados via `Scanner` no terminal para preencher as matrizes com valores do tipo `double`.
- Implementa o algoritmo clássico de multiplicação de matrizes através de laços de repetição triplos.
- Exibe no terminal a matriz resultante $C (m \times n)$.

---

## Tecnologias Utilizadas

- Java 8 (ou superior)
- Scanner API (Java Util)

---

## Estrutura do Projeto

<pre>
multiplicacao_matrizes_java/
├── Principal.java
├── .gitignore
├── LICENSE
└── README.md
</pre>

---

## Execução da Aplicação

### Compilação e Execução via Terminal

1. Navegue até à pasta onde o ficheiro `Principal.java` está localizado.
2. Compile o ficheiro Java:

```bash
javac Principal.java