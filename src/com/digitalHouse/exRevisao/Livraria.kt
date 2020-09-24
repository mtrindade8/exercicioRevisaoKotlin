package com.digitalHouse.exRevisao

class Livraria() {
    var listaProdutos = mutableListOf<Produto>()

    fun cadastrarLivro(livro: Livro) = listaProdutos.add(livro)

    fun cadastrarColecao(colecao: Colecao) = listaProdutos.add(colecao)

    fun consultarProduto(codigo: Int) {
        listaProdutos.forEach {
            when(it.codigo == codigo) {
                true -> {
                    println(it.toString())
                    return
                }
            }
        }
        println("Livro não encontrado")
    }

    fun efetuarVenda(codigo: Int){
        listaProdutos.forEach {
            when(it.codigo == codigo){
                true -> {
                    when(it.qtdEstoque == 0){
                        true -> println("Estoque esgotado")
                        false -> {
                            it.qtdEstoque--
                            println("Venda efetuada do produto de código $codigo no valor de R$${it.preco}")
                            return
                        }
                    }
                }
            }
        }
    }

}