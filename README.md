Desafio para entregar
TAREFA: MovieFlix casos de uso

Implemente as funcionalidades necessárias para que os testes do projeto abaixo passem:
https://github.com/devsuperior/bds06

Collection do Postman:
https://www.getpostman.com/collections/72a46c64473b7611a021

ATENÇÃO (1): basta entregar a tarefa no banco H2. Não precisa configurar o Postgres no projeto, ok?

ATENÇÃO (2): se você tiver meio perdido pra começar, dê uma olhada na aula tira dúvidas que a gente fez com a turma 5: https://youtu.be/mulD7EShAGg
Visão geral do sistema MovieFlix
O sistema MovieFlix consiste em um banco de filmes, os quais podem ser listados e avaliados pelos usuários. Usuários podem ser visitantes (VISITOR) e membros (MEMBER). Apenas usuários membros podem inserir avaliações no sistema.

Ao acessar o sistema, o usuário deve fazer seu login. Apenas usuários logados podem navegar nos filmes. Logo após fazer o login, o usuário vai para a listagem de filmes, que mostra os filmes de forma paginada, ordenados alfabeticamente por título. O usuário pode filtrar os filmes por gênero.

Ao selecionar um filme da listagem, é mostrada uma página de detalhes, onde é possível ver todas informações do filme, e também suas avaliações. Se o usuário for MEMBER, ele pode ainda registrar uma avaliação nessa tela.

Um usuário possui nome, email e senha, sendo que o email é seu nome de usuário. Cada filme possui um título, subtítulo, uma imagem, ano de lançamento, sinopse, e um gênero. Os usuários membros podem registrar avaliações para os filmes. Um mesmo usuário membro pode deixar mais de uma avaliação para o mesmo filme.

Protótipos de tela
https://www.figma.com/file/6JQVnxKgKtVHLleSBBgRin/MovieFlix-front-listagem

Modelo conceitual

![image](https://github.com/Paulojoserc/bds06/assets/26390158/d5597eab-3ee9-4d96-b517-2fdc1df953a7)


Casos de uso
Efetuar login
[IN] O usuário anônimo informa seu email e senha
[OUT] O sistema informa um token válido
Listar filmes
[OUT] O sistema apresenta uma listagem dos nomes de todos gêneros, bem como uma listagem paginada com título, subtítulo, ano e imagem dos filmes, ordenada alfabeticamente por título.
[IN] O usuário visitante ou membro seleciona, opcionalmente, um gênero.
[OUT] O sistema apresenta a listagem atualizada, restringindo somente ao gênero selecionado.
Visualizar detalhes do filme
[IN] O usuário visitante ou membro seleciona um filme
[OUT] O sistema informa título, subtítulo, ano, imagem e sinopse do filme, e também uma listagem dos textos das avaliações daquele filme juntamente com nome do usuário que fez cada avaliação.
[IN] O usuário membro informa, opcionalmente, um texto para avaliação do filme.
[OUT] O sistema apresenta os dados atualizados, já aparecendo também a avaliação feita pelo usuário.

Exceção 3.1 - Texto vazio
3.1.1. O sistema apresenta uma mensagem de que não é permitido texto vazio na avaliação 

Mínimo para aprovação*: 12/15
* Os testes de entidade foram mantidos no projeto para assegurar a correta estrutura do modelo de domínio, mas não entram na pontuação desta avaliação.

