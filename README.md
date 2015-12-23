# tiniest
Tiniest clojure apps

These apps in folders are intended to show the minimal way of doing a thing successfully in Clojure.

All extraneous stuff (tests, folders) is prohibited, and ruthlessly pruned away so that there is no distraction from the core concept.

### Distraction rule exception
...But it needs to work from lein (lein run for example) and use lein to automatically fetch dependencies. Hence there is a project.clj file. That's because half the complexity of a thing (making it worthwhile to have these examples), is in how to get and use dependencies. So we have: an app to show a core concept, and its leiningen wrapper.

### Another exception
Well, also you could argue that printing a line to screen is also unnecessary. But we need to be able to see that it works, so we'll normally get the app to print a line, or return something similar that can be see by the user when they do "lein run".

### And another exception
Ok, they have a README file as well.

### Revised definition
So, reworking the definition, these little apps are: the smallest lein-based demonstration of a thing that will return a result to your screen. And a readme.


