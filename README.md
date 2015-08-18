# leon-intellij-plugin

This repo offers the minimal files needed to integrate [Leon](https://github.com/epfl-lara/leon) into your IntelliJ Scala project.


## Setup IntelliJ IDEA 14.0 on Windows  

1. Go to _File > Import. Select module_ Select _Create Module from Existing Sources_ to import the `library` directory in this repo to your project. Suppose we name the new module as `Leon`.

2. Go to _File > Project Structure > Modules > YourAppName_. Add the `Leon` module to the module dependency list. This step enables IntelliJ to recognize the `Leon` packages in your code and link them in compilation.

3. Go to the dependency list of the `Leon` module. Add a Scala SDK as an external library. Also, add the `library` directory as _Sources_ dependency. This step enables IntelliJ to make the `Leon` module. 

4. Make the `Leon` module.

5. If everything went right, now you should be able to compile code that uses the Leon packages.

### Remarks

If you simply add the `library` directory to the dependency list of your project, IntelliJ can still recognize the Leon packages in your source code. However, it would report "package not found" errors if you try to compile the code.  

## Command-line Execution

To run Leon in command line, you need to make z3 or cvc4 accessible in PATH. The easiest way to obtain a Z3 executable for your OS is to download it from [here](https://github.com/Z3Prover/bin). The `leon` script in this repo helps you run Leon in the default settings. For example, try `./leon example/FlatMap.scala`. The script can take options in addition to a filename. See [here](http://leon.epfl.ch/doc/options.html) for details of available options. 