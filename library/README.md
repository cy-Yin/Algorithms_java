**[Algorithms 4th edition](https://algs4.cs.princeton.edu/home/)** needs the libraries as follows:

- [algs4.jar](https://algs4.cs.princeton.edu/code/algs4.jar)

which can be downloaded from [here](https://algs4.cs.princeton.edu/code/).

I have downloaded the jar file and put it in the `library` folder.

The unzipped folder can also be found.

Or one can unzip the jar file using 

```shell
unzip -x -q algs4.jar -d algs4
```

Warning: the algs4.jar includes some .java files which contain some methods deprecated since version jdk-20.

### Using the algs4.jar in VSCode in MacOS 10.15.7 Catalina

1. Download the **algs4.jar** from [here](https://algs4.cs.princeton.edu/code/).

2. Put the algs4.jar in the `/Library/Java/JavaVirtualMachines/jdk-20.jdk/Contents/Home/lib/` folder.

3. Add the **environment variables** `CLASSPATH` in the `~/.zsh` file.

    ```shell
    export CLASSPATH=/Library/Java/JavaVirtualMachines/jdk-20.jdk/Contents/Home/lib/algs4.jar:.
    ```

    or 

    ```shell
    export CLASSPATH=$JAVAHOME/lib/algs4.jar
    ```

    where the environment variable `JAVAHOME` is defined in the `~/.zshrc` file as follows:

    ```shell
    export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-20.jdk/Contents/Home
    ```

4. Add the path of the algs4.jar to the `java.home` in the `settings.json` file of VSCode.

    ```json
    "java.project.referencedLibraries": [
        "/Library/Java/JavaVirtualMachines/jdk-20.jdk/Contents/Home/lib/algs4.jar"
    ]
    ```