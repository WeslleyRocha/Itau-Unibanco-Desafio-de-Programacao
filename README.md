<h2><b> Introdução </b></h2>

Desafio: Fazer uma API que receba Transações e retorna Estatísticas sob essas transações.<br>
API deve ser criada utilizando Java Kotlin ou Spring Boot. 

<h2><b>Documentação:</b></h2>

<li>Swagger</li>A documentação Swagger é uma documentação de API, utilizada para verificação de Endpoints, Métodos e Classes.

  <br><b><i>Métodos utilizados:</i></b>  
  <b>Get</b> / estatistica
  

~~~
Retorno esperado:

{
    "count": 2,
    "sum": 246.9,
    "min": 123.45,
    "max": 123.45,
    "average": 123.45
}
Status: 200 OK
~~~

  <b>Delete</b> / transacao<br>
  
~~~
Retorno esperado:

{
    
}
Status: 200 OK
~~~

  <b>Post</b> / transacao


~~~
Metodo encaminhado:

{
  "valor": 123.45    
}
Status: 201 Created
~~~
 
![alt text](https://i.imgur.com/vd5KrwQ.png)
  
Com a aplicação executando em back-end, acessar a documentação completa através da url: http://localhost:8080/swagger-ui.html

<li>Javadoc</li>Javadoc é um gerador de documentação criado para documentar a API dos programas em Java.


![alt text](https://imgur.com/sxEgAj8.png)<br>
Clique [aqui](https://weslleyrocha.github.io/Itau-Unibanco-Desafio-de-Programacao/index.html) para visualização completa da documentação. 



<h2><b>Versionamento de código:</b></h2>
  
| Branches                  | Versão | Conteúdo                                                          |
|---------------------------|--------|-------------------------------------------------------------------|
| Main                      | -      | Arquivo Readme                                                    |
| Transação                 | vs0.1  | Camadas: Controller, Model, Service                               |
| Estatística               | vs0.1  | Camadas: Controller, Model, Service                               |
| Relacionamento de Tabelas | vs0.1  | Relacionamento entre tabelas, Transacao & Estatistica             |
| Documentação Swagger      | vs0.1  | Documentação API em Swagger                                       |
| Arquivo .Jar              | vs0.1  | Disponível em .../target/DocuItauUnibancoDesafioDeProgramacao.jar |
| Javadoc      | vs0.1  | Documentação API em Javadoc / Comentários                                      |
