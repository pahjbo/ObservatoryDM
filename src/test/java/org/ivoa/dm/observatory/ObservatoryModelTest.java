package org.ivoa.dm.observatory;
/*
 * Created on 10/05/2023 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */

import org.ivoa.vodml.testing.AutoRoundTripWithValidationTest;

/**
 * This will run a XML and JSON round trip test on the model inst
 */
public class ObservatoryModelTest extends AutoRoundTripWithValidationTest<ObservatoryModel> {
    @Override
    public ObservatoryModel createModel() {
        // create the model instance here.
        ObservatoryModel retval = new ObservatoryModel();

        Another another = new Another("test");
        retval.addContent(another);
        return retval;
    }

    @Override
    public void testModel(ObservatoryModel observatoryModel) {
        //this could do specialized testing on the model instance
    }
}
