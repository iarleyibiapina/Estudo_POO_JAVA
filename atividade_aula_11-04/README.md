Exercício 01
[Exercício 01 - Conta Bancária - Elabore uma classe ContaBancaria com os seguintes
atributos:
• nomeCliente
• numConta
• saldo
e os seguintes métodos:
• sacar(o saldo não pode ficar negativo)
• depositar
Crie também duas subclasse chamadas ContaPoupanca e ContaEspecial, com as
seguintes características:
ContaPoupança
• atributo diaRendimento
• método calcularNovoSaldo, recebe taxa de rendimento da poupança e
atualiza o saldo.
ContaEspecial
• atributo limite
• sobreescreva o método sacar com a nova lógica necessária.
Crie uma classe Teste que contenha a seguinte lógica:
• Criar contas
• Sacar um valor das contas
• Depositar
• Mostrar um novo salvo a partir de um rendimento
• Mostrar os dados Conta do Cliente
Exercício 02
[Exercício 02 - Imposto de Renda - A receita Federal possui um cadastro dos
contrinuintes. Cada contribuinte possui nome. Escreva um programa para calcular o
imposto a ser pago para 5 contribuintes. Os contribunintes podem ser:
• Pessoa jurídica
• O imposto corresponde a 10% da renda bruta da empresa.
• Pessoa Física
Renda Bruta Alíquota Parcela a deduzir
0 a 1400 0% R$ 0
1400,01 a 2100 10% R$ 100
2100,01 a 2800 15% R$ 270
2800,01 a 3600 25% R$ 500
3600,01 ou mais 30% R$ 700
Escreva um programa para calcular e imprimir na tela o imposto a ser pago de 6
contribuintes, sendo 3 PJ e 3 PF. ]
Exercício 03
• Um Animal contém nome,comprimento,número de patas(patrão é
4),cor,ambiente e velocidade(em m/s).
Um peixe é um animal, tem 0 patas, seu ambiente é o mar(padrão), cor
cinzenta(padrão). Além disso tem como características barbatanas e cauda.
Um mamífero é um animal e seu ambiente padrão é terra.
Um urso é um mamífero, cor castanho e seu alimento preferido é o mel
Crie as classes Animal,Peixe e Mamífero.
Para a classe Animal, coloque os atributos:
o Nome,comprimento,patas,cor,ambiente,velocidade
Para a classe Peixe,codifique o atributo características
Por último, crie uma classe teste de forma a ter um jardim zoológico com os
seguintes animais: camelo,tubarão, urso-do-canadá.
Exemplo da execução:
Zoo:
Animal Comprimento Patas Cor Ambiente Velocidade Característica
Camelo 150 cm 4 Amarelo Terra 2.0 m/s
Tubarão 300 cm 0 Cinzento Mar 1.5 m/s Barbatanas e
cauda
UrsodoCanadá
180 cm 4 Vermelho Terra 0.5 m/s