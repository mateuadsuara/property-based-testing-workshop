# property-based-testing-workshop

This is a workshop for introducing property based testing with Clojure

## Introduction to test.check

https://clojure.github.io/test.check/intro.html

## Installation

### Option A: on your machine

Clojure: https://clojure.org/guides/getting_started
Leiningen: https://leiningen.org/

### Option B: on Docker

Docker Desktop: https://docs.docker.com/v17.09/engine/installation/

## Build and run

### Option A: on your machine

`lein run 123`

### Option B: on Docker

`docker/build`

`docker/run 123`

## Run the tests

### Option A: on your machine

`lein test`

### Option B: on Docker

`docker/run-tests`

## REPL

### Option A: on your machine

`lein repl`

### Option B: on Docker

`docker/repl`

## Run a bash shell inside Docker

`docker/bash`

### Inside the bash shell, the following commands are available:

`run 123`
`run-tests`
`repl`
