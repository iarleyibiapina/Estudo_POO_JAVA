Revisão para a prova

ATIVIDADE
Você está trabalhando em uma startup que está desenvolvendo uma nova plataforma de streaming de música. A empresa precisa de um sistema para gerenciar diferentes tipos de conteúdo musical e perfis de usuário. Sua tarefa é criar uma estrutura de classes para representar essas entidades, utilizando herança e uma classe abstrata para representar atributos e comportamentos comuns.

1.Crie uma classe abstrata chamada ConteudoMusical. Esta classe deve conter os seguintes atributos:
titulo (String): Representa o título da música ou álbum.
artista (String): Representa o artista responsável pelo conteúdo.
duracao (double): Representa a duração do conteúdo em minutos.
2.Crie métodos getters e setters para todos os atributos da classe ConteudoMusical.
3.Crie um construtor na classe ConteudoMusical que inicialize todos os atributos da classe.
4.Crie duas classes derivadas de ConteudoMusical: Musica e Album.
5.Para a classe Musica, adicione um atributo adicional genero (String) que representa o gênero da música. Crie os métodos getters e setters para este atributo.
6.Para a classe Album, adicione um atributo adicional anoLancamento (int) que representa o ano de lançamento do álbum. Crie os métodos getters e setters para este atributo.
7.Crie um construtor em cada classe derivada (Musica e Album) que chame o construtor da classe base (ConteudoMusical) e inicialize os atributos adicionais.
8.Escreva um programa de teste para demonstrar a criação de objetos das classes Musica e Album, atribuindo valores aos atributos e exibindo as informações do conteúdo musical criado.