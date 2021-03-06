package org.wildfly.deptreediff.core;

/**
 * @author <a href="mailto:kabir.khan@jboss.com">Kabir Khan</a>
 */
public class VersionChange {
    private final String gavString;
    private final String toVersion;

    VersionChange(Dependency original, Dependency changed) {
        this.gavString = original.getGavString();
        this.toVersion = changed.getVersion().getVersion();
    }

    public String getOriginalGavString() {
        return gavString;
    }

    public String getNewVersion() {
        return toVersion;
    }
}
