
# Plano de Teste

** Site web “ Matematica da Agua” **

*versão 0.2x*

link:  https://programacaogabriel.github.io/Site---matematica_da_agua/

## Histórico das alterações

   Data	| Versão |	Descrição   | Autor(a)
-----------|--------|----------------|-----------------
27/10/2023 |  0.2   | Release 2 | Gabriel Martins da Silva


## 1 - Análise Inicial

O Projeto é uma forma de auxiliar pessoas de ambas as idades a realizar a sua checagem de níveis de água a tomar durate o dia.

* Verificar se o site está no ar.
* Verificar se o campo de preenchimento está habilitado
* Verificar se o botão está funcional
* Verificar o resultado esperado é apresentado

Modelo de escrita de teste será a metodologia gherkin e modelo da Normas : 29119-3

O site precisará estar com a sua responsibilidade total para ambas plataformas e o modelo resultante é apresentar em ml e litros a quantidade de água que a pessoa deverá ingerir.


## 2 - Requisitos a Testar

Requisitos de portabilidade : o sistema deverá executar em qualquer plataforma.

## 3 - Tipos de teste

Teste de Aceitação : A plataforma precisa estar ativa e em execução.

### 3.1 - Métodos da Classe
<br/>
<table>
	<tr>
    	<th>
        	Objetivo
    	</th>
    	<th colspan="4">
        	O site precisará estar com a sua responsibilidade total para ambas plataformas e o modelo resultante é apresentar em ml e litros a quantidade de água que a pessoa deverá ingerir.
    	</th>
	</tr>
	<tr>
    	<th>
        	Técnica:
    	</th>
    	<th colspan="2">
        	(x) manual
    	</th>
    	<th colspan="2">
        	( ) automática
    	</th>
	</tr>
	<tr>
    	<th>
        	Estágio do teste
    	</th>
    	<th>
        	Integração ( )
    	</th>
    	<th>
        	Sistema ( )
    	</th>
    	<th>
        	Unidade ( )
    	</th>
    	<th>
        	Aceitação (x)
    	</th>
	</tr>
	<tr>
    	<th>
        	Abordagem do teste
    	</th>
    	<th colspan="2">
        	Caixa branca ( )
    	</th>
    	<th colspan="2">
        	Caixa preta (x)
    	</th>
	</tr>
	<tr>
    	<th>
        	Responsável(is)
    	</th>
    	<th colspan="4">
        	Gabriel Martins da Silva
    	</th>
	</tr>
</table>
<br/>

## 4 - Recursos

Um Testador


### 4.1 - Ambiente de teste - Software e Hardware

Ambiente : Web, Firefox 116.0 64bits, Desktop
Windows 10 Pro


### 4.2 - Teste Automatizado

O Teste será feito com a linguagem Java


### 4.3 - Ferramentas de teste

As ferramentas são :
* Maven  - https://maven.apache.org/download.cgi
* TestNG - https://testng.org/doc/download.html
* Selenium WebDriver - https://www.selenium.dev/documentation/webdriver/getting_started/install_library/
* Spring Boot - https://spring.io/tools
* mvn repository - https://mvnrepository.com/

Para rodar a aplicação você tera que ter o Maven instalado e o Java


## 5 - Cronograma

Tipo de teste  	| Duração | data de início | data de término
-------------------|---------|----------------|-----------------
Regras de negócio |		| 04/08/2023	| 04/08/2023
planejar teste 	|     	| 05/08/2020    | 07/08/2023
projetar teste 	|     	| 07/08/2023	| 07/08/2023
implementar teste |     | 08/08/2023	| 08/08/2023 	
executar teste 	|     	| 09/08/2023 	| 09/08/2023
Implantar automação|		| 27/10/2023	| 30/10/2023
