package com.digitalHouse.exRevisao

fun Main(){

    val livraria = Livraria()

    val livro1 = Livro("O Primo Basilio", "Eça de Queiroz", "1878", 1, 3, 32.80 )
    val livro2 = Livro("O Poder do Agora", "Eckhart Tolle", "2001", 2, 5, 25.70)
    val livro3 = Livro("Refatoração", "Kent Beck", "1999", 3, 1, 199.90)
    val livro4 = Livro("Introdução Java", "Rafael Santos", "2003", 4, 3, 127.90)
    val livro5 = Livro("Código Limpo", "Robert Cecil Martin", "2008", 5, 2, 135.78 )

    val lista1 = mutableListOf(livro1, livro2)
    val lista2 = mutableListOf(livro3, livro4, livro5)

    val colecao1 = Colecao(lista1, "Livros de Bolso", 6, 2, 58.50)
    val colecao2 = Colecao(lista2, "Livros Computação", 7, 1, 463.58)

    livraria.consultarProduto(2)
    livraria.consultarProduto(4)
    livraria.consultarProduto(8)

    livraria.efetuarVenda(1)
    livraria.efetuarVenda(7)
    livraria.efetuarVenda(7)
}