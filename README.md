#JAVA 
#####mac-os
```sh
brew install maven
```

####Directory structure

<pre>
.
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   └── resources
│   └── test
│       └── java
│           └── com
</pre>

##### build
```sh
mvn install 
or with skip-test
mvn install -Dmaven.test.skip=true
```
 












