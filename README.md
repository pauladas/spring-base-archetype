# Nome do projeto

## 💻 Pré-requisitos

Antes de começar, verifique se você atendeu aos seguintes requisitos:
* Instalar `Java 17`
> Recomendo utilizar SDKMAN, para facilitar na troca de versões do java

## 🚀 Instalando spring-base-archetype

Para instalar o spring-base-archetype, siga estas etapas:

```
mvn clean install
```

## ☕ Usando spring-base-archetype

Para usar spring-base-archetype, deve-se modificar o que deseja na aplicação. Após isso, na pasta raiz do projeto, executar:

```
mvn archetype:create-from-project
```

Após ter executado o comando, a pasta *target* terá sido criada. Navegar para *target/generated-sources/archetype/target* e execute
```
mvn clean install
```

Após isso, esse projeto poderá ser utilizado como base utilizando o seguinte comando:
```
mvn archetype:generate -DarchetypeGroupId=com.example
-DarchetypeArtifactId=demo-custom-archetype
-DarchetypeVersion=1.0-SNAPSHOT
-DgroupId=com.example
-DartifactId=demo-dummy
-Dversion=1.0-SNAPSHOT
``` 

## 📝 Licença

Esse projeto está sob licença. Veja o arquivo [LICENÇA](LICENSE.md) para mais detalhes.

[⬆ Voltar ao topo](#nome-do-projeto)<br>
