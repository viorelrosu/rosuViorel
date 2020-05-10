package org.rosuViorel.tema8.runalltests;

import org.junit.runner.RunWith;
import org.rosuViorel.tema8.ej01.CadenaTest;
import org.rosuViorel.tema8.ej02.UtilidadesTest;
import org.rosuViorel.tema8.ej03.UtilsTest;
import org.rosuViorel.tema8.ej04.VectorTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;

@RunWith(JUnitPlatform.class)
@SelectClasses({ CadenaTest.class, UtilidadesTest.class, UtilsTest.class, VectorTest.class})
public class RunAllTests {

}
