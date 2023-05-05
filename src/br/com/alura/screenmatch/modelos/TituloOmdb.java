package br.com.alura.screenmatch.modelos;

// criada para fazer a ligação entre a API do site https://www.omdbapi.com/ com a aplicação

public record TituloOmdb(String title, String year, String runtime) {
    // o tipo record ja vem com construtores get e set mesmo sem precisar declara-los
}
