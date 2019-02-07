package com.vocumsineratio.calibration.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Danil Suits (danil@vast.com)
 */
class JunitCalibrationTest {
    enum Result { PASS, FAIL }
    @Test
    public void the_tests_should_run () {
        assertEquals(
                Result.PASS,
                JunitCalibration.calibrate(
                        Result.PASS,
                        Result.FAIL
                )
        );
    }
}