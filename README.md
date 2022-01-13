# plugin-utils
Utils for MC plugins

# How to use:
build the jar using Maven:
`mvn install`
this will add the jar to your local maven repo on your computer `~/.m2`

import the jar into your plugin using Maven:
```
        <dependency>
            <groupId>com.minecraftheads</groupId>
            <artifactId>plugin-utils</artifactId>
            <version>$version</version>
            <scope>compile</scope>
        </dependency>
```

# Methods:
### Logger:
Read more [here](./docs/logger.md) how it works!
### HeadCreator:
Read more [here](./docs/heads.md) how it works!