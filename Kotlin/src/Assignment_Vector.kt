/*
Objetivo: Este exercício consiste em criar uma lista de quantidade de produtos e preço do produto
Feito isso, o sistema o total do produtos vendidos, qual produto e o total de vendas.

Ao final é calculado o valor de comissão de 5% e mostrado o tatal de vendas e valor da comissão.


Programador: Alan Gustavo
Data: 08/05/2020
 */

import java.util.Scanner

fun main() {

    //Declaração das variáveis
    val amount = mutableListOf<Int>()
    val price = mutableListOf<Float>()
    var grand_total: Float = 0f
    val commission: Float
    var sales_total: Float
    val quantity = Scanner(System.`in`) //Instanciando Scanner à variável quantity

    //Laço de repetição para obtenção dos valores
    for (index in 0..4) {

        print("Insira a quantidade vendida do ${index + 1}º produto: ")
        amount.add(quantity.nextInt()) //Lista recebendo o valor inserido acima, quantidade de produtos. Com a função add, é possível inserir o Scanner e obter o valor

        print("Insira o preço do ${index + 1}º produto: ")
        price.add(quantity.nextFloat()) //Lista recebendo o valor inserido acima, preço do produto.

    }
    //Laço de repetição que irá calcular as vendas de acordo com a quantidade de produtos e valor
    for (index in 0..4) {
        sales_total = amount[index] * price[index] //variável que receberá o total de vendas
        print(
                "Quantidade vendida do ${index + 1}º produto: ${amount[index]}  Valor do ${index + 1}º produto: ${price[index]} \n " +
                        "Total geral das vendas: R$ %.2f \n".format(sales_total)
        )
        grand_total += sales_total //variável que receberá o total de vendas
    }
    commission = grand_total * 0.05f // Calculando o calor da comissão

    //Mensagem final mostrando o Total de Vendas e Valor da Comissão
    print(
            "Valor total de vendas R$ %.2f: ".format(grand_total) + "\n Valor total da comissão: R$ %.2f".format(
                    commission
            )
    )

}







