# cp-protocol-dist

This project to deal with protocol cp. 
For example you can access file in your jar with this URI : cp:/dir/file.properties.
For java 11 or later, need to add this protocol to **java.protocol.handler.pkgs**

```

-Djava.protocol.handler.pkgs=sun.net.www.protocol

```

