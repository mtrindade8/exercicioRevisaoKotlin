package com.digitalHouse.exRevisao

interface Produto {

    abstract var codigo: Int
    abstract var qtdEstoque: Int
    abstract var preco: Double

    override fun toString(): String

}