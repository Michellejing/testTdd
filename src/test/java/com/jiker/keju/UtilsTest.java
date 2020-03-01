package com.jiker.keju;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UtilsTest {
    Utils utils = new Utils();
    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test
    public void test_get_file_from_resources_not_exist() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("file is not found!");
        utils.getFileFromResources("test");
    }

    @Test
    public void test_get_file_from_resources() {
        assertNotNull(utils.getFileFromResources("testData.txt"));
    }

    @Test
    public void test_get_inputs_normal() {
        assertEquals(1, utils.getInputs("1公里,等待3分钟\n")[0]);
//        assertEquals(3, utils.getInputs("1公里,等待3分钟\n")[1]);
    }

    @Test
    public void test_get_inputs_time_null() {
        assertEquals(1, utils.getInputs("1公里,等待分钟\\n")[0]);
        assertEquals(0, utils.getInputs("1公里,等待分钟\\n")[1]);
    }

    @Test
    public void test_get_inputs_distance_null() {
        assertEquals(0, utils.getInputs("公里,等待4分钟\\n")[0]);
//        assertEquals(4, utils.getInputs("公里,等待4分钟\\n")[1]);
    }

    @Test
    public void test_get_inputs_time_distance_null() {
        assertEquals(0, utils.getInputs("公里,等待分钟\\n")[0]);
        assertEquals(0, utils.getInputs("公里,等待分钟\\n")[1]);
    }

    @Test
    public void test_get_inputs_negative() {
        assertEquals(-2, utils.getInputs("-2公里,等待-3分钟\\n")[0]);
//        assertEquals(-3, utils.getInputs("-2公里,等待-3分钟\\n")[1]);
    }

    @Test
    public void test_get_inputs_not_num() {
        assertEquals(0, utils.getInputs("a公里,等待分钟\\n")[0]);
        assertEquals(0, utils.getInputs("a公里,等待分钟\\n")[1]);
    }

    @Test
    public void test_get_inputs_structure_problem() {
        assertEquals(0, utils.getInputs("公里,\\n")[0]);
        assertEquals(0, utils.getInputs("公里,\\n")[1]);
        assertEquals(0, utils.getInputs("公里,等待\\n")[0]);
        assertEquals(0, utils.getInputs("公里,等待\\n")[1]);
        assertEquals(0, utils.getInputs("2分钟\\n")[0]);
        assertEquals(0, utils.getInputs("2分钟\\n")[1]);
    }

}
