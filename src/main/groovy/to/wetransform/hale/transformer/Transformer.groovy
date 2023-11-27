package to.wetransform.hale.transformer

import groovy.transform.CompileStatic

import org.slf4j.Logger
import org.slf4j.LoggerFactory

@CompileStatic
public class Transformer {

    private static final Logger LOG = LoggerFactory.getLogger(Transformer)

    void transform() {
        LOG.info( 'Transforming...' )
    }
}
