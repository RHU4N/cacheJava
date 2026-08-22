# cacheJava

Exemplo didático em Java que simula o funcionamento de um cache de pessoas. O programa mantém uma lista principal, que representa o banco de dados, e uma lista limitada para representar o cache em memória.

## Como funciona

1. O programa inicia com 15 pessoas cadastradas em memória.
2. O usuário informa o ID de uma pessoa.
3. O programa procura primeiro no cache.
4. Se encontrar, informa que o registro veio do cache.
5. Caso contrário, procura no banco simulado e adiciona a pessoa ao cache.
6. Quando o cache atinge 10 itens, o primeiro item inserido é removido antes da nova inclusão.

Esse comportamento usa a estratégia FIFO (_First In, First Out_): o item mais antigo é o primeiro a sair.

## Opções do terminal

- IDs de `1` a `15`: consulta uma pessoa;
- `16`: exibe todos os registros presentes no cache;
- `0`: encerra o programa;
- qualquer outro número: exibe a mensagem de usuário inválido.

Exemplo de interação:

```text
Digite o id de 1 a 15 ou 0 para sair ou 16 para ver o cache:
1
Encontrado no Banco e adicionado no cache: Pessoa{id=1, nome='Rhuan', idade=20}
```

Ao consultar o ID `1` novamente, o resultado será obtido do cache:

```text
Encontrado no cache: Pessoa{id=1, nome='Rhuan', idade=20}
```

## Estrutura do projeto

```text
cacheJava/
├── README.md
├── desafioCache.iml
├── .idea/
└── src/
	├── Main.java       # Simulação do banco, cache e menu
	└── Pessoa.java     # Modelo de pessoa
```

## Modelo `Pessoa`

A classe `Pessoa` possui os atributos:

| Atributo | Tipo     | Descrição               |
| -------- | -------- | ----------------------- |
| `id`     | `int`    | Identificador da pessoa |
| `nome`   | `String` | Nome da pessoa          |
| `idade`  | `int`    | Idade da pessoa         |

A classe também fornece construtor, getters, setters e uma implementação de `toString()` para exibir os registros no terminal.

## Tecnologias

- Java;
- IntelliJ IDEA;
- JDK Temurin 25;
- `ArrayList` para representar o banco e o cache;
- `Scanner` para entrada de dados.

Não há banco de dados real nem dependências externas. Os dados são perdidos quando o programa é encerrado.

## Requisitos

- JDK 25 ou versão compatível com os recursos utilizados;
- IntelliJ IDEA ou outro ambiente Java;
- terminal, caso prefira executar por linha de comando.

## Como executar pela IDE

1. Abra a pasta `cacheJava` no IntelliJ IDEA.
2. Configure o projeto com o JDK Temurin 25.
3. Abra `src/Main.java`.
4. Execute o método `main` pelo botão **Run**.

## Como compilar pelo terminal

Na raiz do projeto, compile os arquivos:

```bash
javac -d out src/Pessoa.java src/Main.java
```

Execute a classe principal:

```bash
java -cp out Main
```

## Observações

- O cache é uma `ArrayList<Pessoa>` e tem limite fixo de 10 registros.
- A busca no banco simulado percorre a lista de pessoas até encontrar o ID solicitado.
- O cache não verifica se o registro já existe antes de adicioná-lo quando a busca no banco é realizada; a verificação anterior normalmente evita duplicidades nas consultas comuns.
- O código atual depende de `IO.println`, recurso disponível nas versões recentes do Java.
- Os imports de `Scanner`, `List` e `ArrayList` devem estar disponíveis no arquivo `Main.java` para a compilação por terminal em um ambiente Java convencional.

## Objetivo

Praticar conceitos de cache, busca em listas, política FIFO, coleções Java e interação com o usuário pelo terminal.
