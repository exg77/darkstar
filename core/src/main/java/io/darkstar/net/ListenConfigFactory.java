package io.darkstar.net;

import java.util.Map;

public interface ListenConfigFactory {

    Connector createListenConfig(String compactDefinition);

    Connector createListenConfig(Map<String,Object> fullDefinition);
}
