# Emporia
### Sistema para comercialização de imóveis - Projeto para  disciplina de estrutura de dados I

### Pré-Requisitos:
- Java 11 JDK
- Apache Maven

### Instalando e Configurando o Apache Maven no Windows

1. Faça o [Download do Apache Maven](https://maven.apache.org/download.cgi).

   *Escolha a opção **Binary zip archive***.
2. Extraia o arquivo no seu local de preferência.
3. Na pesquisa do windows, procure por Variáveis de Ambiente e abra a primeira opção.
4. Selecione Variáveis de Ambiente

    [*Demonstração*](https://user-images.githubusercontent.com/55800652/117026455-32c7da00-acd2-11eb-8055-530f8a1cfe2e.png)

5. Abaixo de Variáveis de Ambiente, clique em Novo. Em Nome da Variável digite **M2_HOME** e em Valor da variável coloque o caminho para o diretório onde foi instalado o Apache Maven

    [*Demonstração*](https://user-images.githubusercontent.com/55800652/117027547-2f811e00-acd3-11eb-9664-3e64b3741ae1.png)

6. Novamente, abaixo de Variáveis de Ambiente, procure pela variável Path e clique em editar. Clique em novo para adicionar um novo diretório e coloque o diretório da pasta bin do Apache Maven.

    [*Demonstração*](https://user-images.githubusercontent.com/55800652/117028647-4aa05d80-acd4-11eb-8b95-416f2db53b9a.png)

7. Para confirmar se o Maven está funcionando, abra o Prompt de Comando e digite *mvn -version* e veja se aparece a versão do Apache Maven.

### Configurando Banco de Dados Postgre para o projeto
1. Na pasta do projeto, vá em *Emporia-main\src\main\resources* e abra o *application.properties* como o bloco de notas para edita-lo.
2. Em *spring.datasource.username* coloque o seu usuário do postgre (*postgre* é o usuário padrão).
3. Em *spring.datasource.password* coloque a sua senha do postgre.
4. **Salve** as alterações e feche o bloco de notas.
5. Abra o **pgAdmin**.
6. Crie um banco de dados chamado **emporia** e conecte-se.

### Abrindo o projeto no Eclipse

1. Abra o Eclipse.
2. Vá em *File -> Import*.
3. Selecione *Maven -> Existing Maven Project* e clique em **Next**.
4. Clique em Browse e selecione o repositório do projeto. 
5. Tenha certeza que, após selecionar o repositório, o */pom.xml* está selecionado e clique em **Finish**.
6. No Package Explorer, clique com o botão direito no projeto, vá em Run as -> Maven clean.
7. No Package Explorer, clique com o botão direito no projeto, vá em Run as -> Maven Install para iniciar a aplicação.
8. Para acessar a documentação da API, apos iniciar aplicação, acesse: [Emporia](http://localhost:8080/swagger-ui.html)
