# API CNS (Cartão Nacional de Saúde)

[![Build Status](https://travis-ci.org/jhemarcos/cns-api.svg?branch=master)](https://travis-ci.org/jhemarcos/cns-api)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/br.com.jhemarcos/cns-api/badge.svg)](https://maven-badges.herokuapp.com/maven-central/br.com.jhemarcos/cns-api/)
<a href="http://www.methodscount.com/?lib=br.com.jhemarcos%3Acns-api%3A0.0.1"><img src="https://img.shields.io/badge/Methods and size-7 | 4 KB-e91e63.svg"/></a>
[![Github All Releases](https://img.shields.io/github/downloads/jhemarcos/cns-api/total.svg)]()
[![Join the chat at https://gitter.im/jhemarcos/cns-api](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/jhemarcos/cns-api?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![License: GPL v3](https://img.shields.io/badge/License-GPL%20v3-blue.svg)](http://www.gnu.org/licenses/gpl-3.0)


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
    <version>1.0.0</version>
</dependency>

```

## Uso básico
- Adicione a dependência em seu projeto

- Extenda a interface [CNS](https://github.com/jhemarcos/cns-api/blob/master/src/main/java/br/com/jhemarcos/Cns.java) na classe que irá implementar o acesso ao barramento

- Extenda a interface [DadosDemograficos](https://github.com/jhemarcos/cns-api/blob/master/src/main/java/br/com/jhemarcos/DadosDemograficos.java) na classe que representará a resposta do barramento

- Implemente os métodos requeridos
