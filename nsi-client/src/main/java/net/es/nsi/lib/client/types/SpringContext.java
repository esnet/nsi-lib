package net.es.nsi.lib.client.types;

import org.springframework.context.ApplicationContext;

public interface SpringContext {

    public ApplicationContext getContext() ;

    public ApplicationContext initContext(String filename);

}
