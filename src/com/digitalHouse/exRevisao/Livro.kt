package com.digitalHouse.exRevisao

class Livro(
        var titulo: String,
        var autor: String,
        var anoLancamento: String,
        override var codigo: Int,
        override var qtdEstoque: Int,
        override var preco: Double
) : Produto {

    override fun toString(): String{
        return "Código: $codigo || Titulo: $titulo || Autor: $autor || Lançamento: $anoLancamento || Preço: $preco || Estoque: $qtdEstoque"
    }
}