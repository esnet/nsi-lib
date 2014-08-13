package net.es.nsi.lib.soap.util.output;

import net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QueryRecursiveResultType;
import net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QuerySummaryResultType;
import net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.types.ServiceExceptionType;

import java.util.List;

/**
 * Interface for outputting query results
 *
 */
public interface QueryOutputter {
    
    public void outputSummary(List<QuerySummaryResultType> results);
    
    public void outputRecursive(List<QueryRecursiveResultType> results);
    
    public void outputFailed(ServiceExceptionType serviceException);

}
