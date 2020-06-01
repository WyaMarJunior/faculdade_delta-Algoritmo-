1 - O que é um Algoritmo Recursivo?    
A recursividade é um mecanismo útil e poderoso que permite a uma função chamar a si mesma direta ou indiretamente, ou seja, uma função é dita recursiva se ela contém pelo menos uma chamada explícita ou implícita a si própria. 

2 - Descreva o algoritmo de Algoritmo de Euclides       
O Algoritmo de Euclides para a obtenção do máximo divisor comum entre dois números naturais
Divida X por Y e obtenha o resto R1. Se R1 for zero, o mdc entre X e Y é Y.

2) Se R1 não for zero, divida Y por R1 e obtenha o resto R2. Se R2 for zero, o mdc entre X e Y é R1.

3) R2 não for zero, divida R1 por R2 e obtenha o resto R3. Se R3 for zero, o mdc entre X e Y é R2.


Se Rn ão for zero, divida Rn−1 por Rn e obtenha o resto Rn+1. Se Rn+1 for zero, o mdc entre X e Y é Rn

3 - Explique o que é a Sequência de Fibonacci       
Sequência de Fibonacci é a sequência numérica proposta pelo matemático Leonardo Pisa, mais conhecido como Fibonacci:
1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
baseado nisso foi crado a segunte formula (Fn = Fn - 1 + Fn - 2). 
com essa formula ouve um padrão descoberto chamado de proporção auria ou número de deus, pois ele representa a paisagem ou a beleza de um objeto ou ser criado naturalmete.

4 - Descreva o Algoritmo do BubbleSort      
Bubble Sort é um algoritmo de ordenação, Se o objetivo é ordenar os valores em forma decrescente, então, a posição atual é comparada com a próxima posição e, se a posição atual for maior que a posição posterior, é realizada a troca dos valores nessa posição. Caso contrário, não é realizada a troca, apenas passa-se para o próximo par de comparações.

5 - Problema do Palíndromo - Um palíndromo é uma string que é lida da mesma forma do início para o fim e do fim para o início, por exemplo, radar, toot e madam são palídromos.  

6 - Problema do Caixeiro Viajante - O Problema do Caixeiro Viajante (PCV) é um problema que tenta determinar a menor rota para percorrer uma série de cidades (visitando uma única vez cada uma delas), retornando à cidade de origem.    

7 - Problema da Mochila - Metaforicamente podemos entendê-lo como o desafio de encher uma mochila sem ultrapassar um determinado limite de peso, otimizando o valor do produto carregado.    

8 - Triângulo de Pascal - Triângulo de Pascal é um triângulo aritmético infinito onde são dispostos os coeficientes das expansões binominais. Os números que compõem o triângulo apresentam diversas propriedades e relações. Na antiguidade, esse triângulo era usado para o cálculo de algumas raízes. Mais recentemente, ele é utilizado no cálculo de probabilidades.    

9 - Binômio de Newton -  O binômio de Newton é um método simples que permite determinar a enésima potência de um binômio. O desenvolvimento do binômio de Newton em alguns casos é bastante simples. Podendo ser feita multiplicando-se diretamente todos os termos. Contudo, nem sempre é conveniente utilizar esse método, pois de acordo com o expoente, os cálculos ficarão extremamente trabalhosos.

10 - Descreva o Algoritmo que calcule o MMC:
O MMC entre dois números naturais (vou me limitar ao conjunto dos números naturais) é o menor número natural que é múltiplo de ambos os números. Exemplos:
1.	o MMC de 24 e 12 é igual a 24;
2.	o MMC de 36 e 14 é igual a 252;
3.	o MMC de 11 e 9 é igual a 99.
Uma das maneiras de calcular o MMC envolve a fatoração dos números em fatores primos, conforme o exemplo da imagem a seguir, que emprega um dispositivo prático, geralmente ensinado no ensino fundamental, para computar o MMC de 60 e 100 (cujo resultado é 300). Não irei detalhar como funciona o dispositivo, pois não é o objetivo da postagem.
 Dispositivo prático para calcular o MMC
Outro método seria fatorando os números em potências inteiras de números primos e multiplicando apenas as maiores potências de cada primo:
•	60=22×3×560=22×3×5
•	100=22×52100=22×52
A maior potência de 22 é 2222. A maior potência de 33 é 33. A maior potência de 55 é 5252, logo
MMC(60,100)=22×3×52=300MMC⁡(60,100)=22×3×52=300
O problema dos métodos anteriores é que a fatoração de números inteiros é um problema NP, não existindo um algoritmo que possa fazer isso de maneira eficiente.

11 - Descreva o Algoritmo que calcule o MDC:
O algoritmo de Euclides é [1][2]
mdc(a,b)={a,seb=0mdc(b,a%b),caso contráriomdc⁡(a,b)={a,seb=0mdc⁡(b,a%b),caso contrário
onde a>0a>0 e b≥0b≥0 e a,b∈Za,b∈Z.
O primeiro caso é o caso base, isto é, se bb é zero, então o MDC será aa. Isso faz sentido, pois zero é divisível por qualquer número inteiro (exceto zero).
O segundo caso é a solução recursiva: o MDC entre aa e bb é igual ao MDC entre bb e o resto da divisão de aa por bb.

12 - Descreva o Algoritmo de números perfeitos:
um número perfeito é um número inteiro para o qual a soma de todos os seus divisores positivos próprios (excluindo ele mesmo) é igual ao próprio número.
Por exemplo 6 é um número perfeito, pois 1 + 2 + 3 = 6
O número 28 também é um número perfeito pois temos que seus divisores : 1 + 2 + 4 + 7 + 14 = 28
O número 496 é outro número perfeito visto que: 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248 = 496


13 - Descreva o Algoritmo de números primos e o crivo desenvolvido por Eratóstenes
Eratóstenes foi um matemático grego que viveu entre os anos 276 a.C. até 194 a.C.
Ele desenvolveu uma tabela, chamada de “Crivo de Eratóstenes”, onde ele conseguiu determinar, não com uma fórmula, mas com uma tabela os números naturais primos, no nosso exemplo do 0 até o 100; mas que na teoria pode ser feito para todos os números primos; porém, o inconveniente é que quanto maior for o nº primo, mais difícil de aplicar o Crivo de Eratóstenes,

14 - Descreva o Algoritmo de número decimal para binário
Para realizar a conversão de decimal para binário, realiza-se a divisão sucessiva por 2 (base do sistema binário). O resultado da conversão será dado pelo último quociente (MSB) e o agrupamento dos restos de divisão será o número binário.A leitura do resultado é feita do último quociente para o primeiro resto. Sendo assim, o resultado da conversão do número 45 para binário é: 1011012.

15 - Qual é o algoritmo para se calcular a probabilidade de algo acontecer

MAX (A,n)

1 max √ 0

2 para i √1 até n faça

3 se A[i] > max

4 então max √A[i]

5 devolva max

16 - Descreve o que são Grafos e o Algoritmo de Dijkstra
Um grafo é um animal formado por dois conjuntos:  um conjunto de coisas chamadas vértices e um conjunto de coisas chamadas arcos;  cada arco está associado a dois vértices:  o primeiro é a ponta inicial do arco e o segundo é a ponta final.  Você pode imaginar que um grafo é um mapa rodoviário idealizado:  os vértices são cidades e os arcos são estradas de mão única. O Algoritmo de Dijkstra é um dos algoritmos que calcula o caminho de custo mínimo entre vértices de um grafo. Escolhido um vértice como raiz da busca, este algoritmo calcula o custo mínimo deste vértice para todos os demais vértices do grafo.Ele é bastante simples e com um bom nível de performance. Ele não garante, contudo, a exatidão da solução caso haja a presença de arcos com valores negativos.Este algoritmo parte de uma estimativa inicial para o custo mínimo e vai sucessivamente ajustando esta estimativa. Ele considera que um vértice estará fechado quando já tiver sido obtido um caminho de custo mínimo do vértice tomado como raiz da busca até ele. Caso contrário ele dito estar aberto.

17 - Descreva o Número de Armstrong: 
é um número de n dígitos que é igual a soma de cada um dos seus dígitos elevado a n-ésima potência .
Por exemplo, 153 (n = três dígitos) é igual a 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

18 - Descreva o Algoritmo do PageRank do Google:
A métrica PageRank de uma página representa a probabilidade de uma pessoa chegar a essa página, clicando aleatoriamente em hiperligações. O cálculo de PageRank é escalável, ou seja, é executável em tempo útil se aumentarmos consideravelmente o número de páginas da rede. O cálculo de PageRank é iterativo, ou seja, exige várias passagens, chamadas de "iterações", os valores obtidos em cada iteração convergem para os valores desejados de PageRank. Na primeira iteração é atribuído um valor de PageRank inicial   igual para todas as páginas (N é o número total de páginas).

19 - Descreva o que é um Algoritmo determinístico e probabilístico (Conceitue, também, o que é um algoritmo que tenha seu pior caso e o melhor caso):
um algoritmo determinístico é um algoritmo em que, dada uma certa entrada, ela produzirá sempre a mesma saída, com a máquina responsável sempre passando pela mesma seqüência de estados. Algoritmos determinísticos são, de longe, o tipo mais estudado e conhecido de algoritmo, assim como um dos mais práticos, uma vez que podem ser executados em máquinas reais de forma eficiente.

Um algoritmo probabilístico é um algoritmo que utiliza a probabilidade como parte de sua lógica. Na prática, isso significa que a máquina que implementa o algoritmo deve acessar um gerador de números pseudo-aleatórios. O algoritmo utiliza bits aleatórios como um guia para o seu comportamento. Diferente dos algoritmos convencionais, um algoritmo probabilístico, dada uma mesma sequência de entrada, não necessariamente leva a um mesmo estado final.

pior caso: e a função que relaciona o tamanho da entrada n ao maior tempo de execução possível para tratar uma entrada de tamanho n.
 
melhor caso é a função que relaciona o tamanho da entrada n ao menor tempo de execução possível para tratar uma entrada de tamanho n.

20 - O que é um Algoritmo genético?:
Portanto, uma definição de algoritmos genéticos poderia ser : um conjunto predeterminado e bem definido de regras e processos com operações finitas, destinados à busca estocástica polarizada da solução de um problema, com um número finito de etapas.

21 - Descreva a Cadeia de Markov:
A Cadeia de Markov é um caso particular de processo estocástico ( Um Processo Estocástico é definido como uma coleção de variáveis randômicas.Processos Estocásticos servem para descrever o procedimento de um sistema operando sobre algum período de tempo.) com estados discretos. A definição dessa propriedade, também chamada de memória markoviana, é que os estados anteriores são irrelevantes para a predição dos estados seguintes, desde que o estado atual seja conhecido. Cadeias de Markov têm muitas aplicações como modelos estatísticos de processos do mundo real, normalmente lidam com a evolução de sistemas dinâmicos.

22 - O que significa dizer que um algoritmo ou uma teoria é o estado da arte em seu contexto?    
um algoritimo ou uma teoria que é estado da arte, significa algo de ultima hora, novo ou uma obra prima.


