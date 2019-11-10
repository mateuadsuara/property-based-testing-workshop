FROM clojure

RUN echo "#!/bin/bash\njava -jar /usr/src/app/app-standalone.jar" > /usr/bin/run
RUN echo "#!/bin/bash\nlein test" > /usr/bin/run-tests
RUN echo "#!/bin/bash\nlein repl" > /usr/bin/repl
RUN chmod +x /usr/bin/*

RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app

COPY project.clj /usr/src/app/
RUN lein deps

COPY ./src /usr/src/app/src
COPY ./test /usr/src/app/test
RUN mv "$(lein uberjar | sed -n 's/^Created \(.*standalone\.jar\)/\1/p')" app-standalone.jar

CMD ["run"]
