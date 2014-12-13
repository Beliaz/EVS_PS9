Continuous Integration
======================

When more people work on different modules of a project its easy to introduce bugs
concerning the interaction between these modules. Continuous integration addresses this 
problem by enforcing developers to at least commit once a day and then automatically run 
build and test scenarios. This won't prevent bugs but it makes it far easier to locate and 
fix them as the amount of new code is tiny compared to traditional (read rare) integrations
of big pieces of new code. This approach minimizes the time needed to repair broken code and
therefore allows you to concentrate on adding new features instead. 

Requirements
------------
In order to take advantage
of CI there are some requirements for the work flow of the team and the tools used. Firstly you
need a continuous integration platform which allows you to automatically build and test your 
code base. Additionally there are some rules for the team to follow like not to check in code
and going home without waiting for the result of the integration test or avoiding to check in when 
current build is broken. I guess this needs some time till this works flawlessly. Furthermore I don't
don't think that is always possible to decompose a module into such small pieces so you can commit one a day.
Then you again need a more substantial integration which is much more error prone.

Conclusion
----------
I think continuous integration is a powerful concept to enhance software quality while reducing
development time



