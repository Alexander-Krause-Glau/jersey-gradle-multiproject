# Gradle-Modularized Jersey Dummy Project

This dummy project shows how to use 
[Gradle's Multi-project support](https://docs.gradle.org/current/userguide/multi_project_builds.html) 
to modularize the codebase of a Jersey-based web application into single Git repositories.

## Usage

Clone this repo with `git clone --recursive git@github.com:Alexander-Krause/jersey-gradle-multiproject.git` and run `gradlew appStart` or `gradlew appRun` inside the folder.
Open your browser and navigate to [http://localhost:8081/core/dummy/show](http://localhost:8081/core/dummy/show) 
or [http://localhost:8081/extension/loremipsum/show](http://localhost:8081/extension/loremipsum/show).

Build .war file with `gradle build` and deploy on your own web server.

## Development
1. `git clone git@github.com:Alexander-Krause/jersey-gradle-multiproject.git`
2. `cd jersey-gradle-multiproject`
3. `git submodule update --init --recursive`
4. `git submodule foreach --recursive git checkout master`
5. Use `gradle appStart` or `gradle appRun`

* For [Eclipse](https://www.eclipse.org): Import as gradle project.
* The embedded core subproject can be outsourced as well.
