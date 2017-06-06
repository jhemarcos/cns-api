# API CNS (Cartão Nacional de Saúde)

[![Build Status](https://travis-ci.org/jhemarcos/cns-api.svg?branch=master)](https://travis-ci.org/jhemarcos/cns-api)

Esse software tem como objetivo definir uma api comum como interface para o acesso ao recursos do barramento DATASUS.

Mais informações acerca do projeto e a documentação completa podem ser encontrados na [Wiki](https://github.com/jhemarcos/cns/wiki) da implementação oficial dessa interface.

## Dependências
* JDK >= 6

## Instalação
Download via Maven.

Adicionar no seu pom.xml:

```xml
<dependency>
    <groupId>br.com.jhemarcos</groupId>
    <artifactId>cns-api</artifactId>
    <version>0.0.1</version>
</dependency>

```

## Uso básico
- Adicione a dependência em seu projeto

- Extenda a interface [CNS](https://github.com/jhemarcos/cns-api/blob/master/src/main/java/br/com/jhemarcos/Cns.java) na classe que irá implementar o acesso ao barramento

- Extenda a interface [DadosDemograficos](https://github.com/jhemarcos/cns-api/blob/master/src/main/java/br/com/jhemarcos/DadosDemograficos.java) na classe que representará a resposta do barramento

- Implemente os métodos requeridos
