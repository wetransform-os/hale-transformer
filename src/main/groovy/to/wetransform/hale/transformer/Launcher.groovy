package to.wetransform.hale.transformer

import groovy.transform.CompileStatic

import eu.esdihumboldt.hale.common.core.HalePlatform
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import to.wetransform.halecli.internal.Init

@CompileStatic
public class Launcher {

    private static final Logger LOG = LoggerFactory.getLogger(Launcher)

    static void main(String[] args) throws Exception {
        Init.init()

        LOG.info("Launching hale-transformer ${HalePlatform.coreVersion}...")

        Transformer tx = new Transformer()
        tx.transform()
    }
}
