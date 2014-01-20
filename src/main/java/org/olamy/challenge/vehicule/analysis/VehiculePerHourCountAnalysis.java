package org.olamy.challenge.vehicule.analysis;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Olivier Lamy
 */
public class VehiculePerHourCountAnalysis
    extends AbstractCountPerTimeAnalysis
    implements VehiculeRecordAnalysis
{


    @Override
    public String getTitle()
    {
        return "Per hour/Per direction for all days";
    }

    @Override
    public int getOrder()
    {
        return 1;
    }


    @Override
    protected long getIncrement()
    {
        return AnalysisConstants.MILLIS_PER_HOUR;
    }

}
