# Desafio de Projeto: Criando um Banco Digital com Java e Orientação a Objetos

Este projeto é uma aplicação bancária simples em Java, utilizando conceitos de Orientação a Objetos. O projeto inclui operações básicas de contas bancárias, como criação de contas, depósitos, saques e transferências.


## Pré-requisitos

- [Java Development Kit (JDK) 8+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Visual Studio Code](https://code.visualstudio.com/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
- [Eclipse IDE](https://www.eclipse.org/downloads/)
- [Lombok](https://projectlombok.org/download)

## Configuração do Ambiente

### Passo 1: Baixar e Configurar o Lombok

1. Baixe o arquivo JAR do Lombok a partir do [site oficial do Lombok](https://projectlombok.org/download).
2. Coloque o arquivo `lombok.jar` no diretório `lib` do projeto.

### Configurar o Lombok no Visual Studio Code

1. Crie um arquivo `settings.json` na pasta `.vscode` do seu projeto (crie a pasta `.vscode` se não existir).
2. Adicione a configuração do classpath no `settings.json`:

```json
{
    "java.project.referencedLibraries": [
        "lib/**/*.jar"
    ]
}
```
3. Instale a extensão "Lombok Annotations Support for VS Code":

 - Vá para a aba de Extensões (ícone de quadrado no lado esquerdo).
 - Pesquise por "Lombok" e instale a extensão.

4. Abra um terminal no Visual Studio Code, navegue até a pasta raiz do projeto, compile e execute:
```shell
javac -cp "lib/*;src" -d bin src/com/seu_nome_projeto/Main.java
java -cp "lib/*;bin" com.seu_nome_projeto.Main
```
### Configurar o Lombok no IntelliJ IDEA
1. Vá para File > Settings > Plugins e pesquise por "Lombok". Instale o plugin e reinicie o IntelliJ.
2. Vá para File > Project Structure > Libraries e adicione o lombok.jar.
3. Vá para File > Settings > Build, Execution, Deployment > Compiler > Annotation Processors e marque a opção "Enable annotation processing".

### Configurar o Lombok no Eclipse
1. Vá para Help > Eclipse Marketplace, pesquise por "Lombok" e instale o plugin.
2. Após a instalação, reinicie o Eclipse.
3. Vá para Window > Preferences > Java > Compiler > Annotation Processing > Factory Path e adicione o lombok.jar.

### Compilar e Executar o Projeto

#### No Visual Studio Code
1. Abra um terminal no Visual Studio Code.
2. Navegue até a pasta raiz do projeto.
3. Compile o projeto com o comando:
```shell
javac -cp "lib/*;src" -d bin src/com/seu_nome_projeto/Main.java
```
4. Execute o projeto com o comando:

```shell
java -cp "lib/*;bin" com.seu_nome_projeto.Main

```

#### No IntelliJ IDEA
1. Clique com o botão direito do mouse na classe Main e selecione Run 'Main.main()'.

#### No Eclipse
1. Clique com o botão direito do mouse na classe Main e selecione Run As > Java Application.

### Uso
- Criar Conta: A classe Main cria instâncias de ContaCorrente e ContaPoupanca para um cliente.
- Depósito: Através do método depositar da classe Conta.
- Saque: Através do método sacar da classe Conta.
- Transferência: Através do método transferir da classe Conta.

## Contribuições
Sinta-se à vontade para abrir issues e pull requests para melhorias.