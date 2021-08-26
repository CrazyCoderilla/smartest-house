package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerAdvancedTest {
    @Test
    public void shouldGetAndSet() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void setOntest() {
        ConditionerAdvanced conditionerAdvanced = new ConditionerAdvanced();
        conditionerAdvanced.setOn(true);
        assertTrue(conditionerAdvanced.isOn());
        conditionerAdvanced.setOn(false);
        assertFalse(conditionerAdvanced.isOn());
    }

    @Test
    public void setCurrentTemperatureTest() {
        ConditionerAdvanced conditionerAdvanced = new ConditionerAdvanced();
        conditionerAdvanced.setMinTemperature(0);
        conditionerAdvanced.setMaxTemperature(100);
        conditionerAdvanced.setCurrentTemperature(10);

        assertEquals(0, conditionerAdvanced.getMinTemperature());
        assertEquals(100, conditionerAdvanced.getMaxTemperature());
        assertEquals(10, conditionerAdvanced.getCurrentTemperature());

        conditionerAdvanced.setCurrentTemperature(101);
        assertEquals(10, conditionerAdvanced.getCurrentTemperature());

        conditionerAdvanced.setCurrentTemperature(-10);
        assertEquals(10, conditionerAdvanced.getCurrentTemperature());

        conditionerAdvanced.setCurrentTemperature(20);
        assertEquals(20, conditionerAdvanced.getCurrentTemperature());
    }
}