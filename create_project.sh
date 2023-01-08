echo artifactId:
read artifactId
echo basePath:
read basePath

echo 'Generating project...'
mvn archetype:generate -Dfilter=br.com.paulojof:ms -DarchetypeGroupId=br.com.paulojof -DarchetypeArtifactId=archetype -DarchetypeVersion=1.0.0 -DgroupId=br.com.paulojof -DartifactId=$artifactId -Dversion=1.0.0 -B

echo 'Setting configuration files...'
sed -i "s|{base-path}|$basePath|g" $artifactId/src/main/resources/application.yaml
sed -i "s|ms-name|$artifactId|g" $artifactId/src/main/resources/application.yaml
sed -i "s|ms-name|$artifactId|g" $artifactId/Dockerfile

echo 'Creating .gitignore file...'
echo 'HELP.md
target/
.mvn/
*.log*
!**/src/main/**
!**/src/test/**
*example*
*Example*

### STS ###
.apt_generated
.classpath
.factorypath
.project
.settings
.springBeans
.sts4-cache

### IntelliJ IDEA ###
.idea
*.iws
*.iml
*.ipr

### NetBeans ###
/nbproject/private/
/nbbuild/
/dist/
/nbdist/
/.nb-gradle/
build/

### VS Code ###
.vscode/' > $artifactId/.gitignore

echo 'Project finished!'