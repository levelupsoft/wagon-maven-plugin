package org.codehaus.mojo.wagon.shared;

import java.util.List;

import org.apache.maven.plugin.logging.Log;
import org.apache.maven.wagon.Wagon;
import org.apache.maven.wagon.WagonException;

/**
 * 
 */
public interface WagonDownload
{
    String ROLE = WagonDownload.class.getName();

    /**
     * @param wagon - a Wagon instance
     * @param fileSet - Criteria to build the list
     * @param logger
     * @return a list of files at the remote host relative to RemoteFileSet's directory
     * @throws WagonException
     */
    List getFileList( Wagon wagon, WagonFileSet fileSet, Log logger )
        throws WagonException;

    /**
     * 
     * @param wagon - a Wagon instance
     * @param remoteFileSet - 
     * @param logger
     * @throws WagonException
     */
    public void download( Wagon wagon, WagonFileSet remoteFileSet, Log logger )
        throws WagonException;

}
