package com.digitalHouse.exRevisao

class Colecao(
        var listaLivros: MutableList<Livro>,
        var descricao: String,
        override var codigo: Int,
        override var qtdEstoque: Int,
        override var preco: Double
) : Produto {

    override fun toString(): String {
        var string = "Código: $codigo || Descrição: $descricao || Preço: $preco || Estoque: $qtdEstoque \n"
        listaLivros.forEach(){string += it.toString() + "\n"}
        return string
    }
}
