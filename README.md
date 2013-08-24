maven-examples
==============

A sample maven project with submodules.

This project confirms some nice features of submodules:

1) The incorporate system properties from the super module. 

2) They inherit dependencies and build directives from the super module.

3) They package up Envionrmental Variables nicely for you as both "env.X" via System.getProperties() and "X" via System.getenv().

It can also be used as a template project to roll your own maven submodule based build.  
