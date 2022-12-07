package com.example;

import org.junit.jupiter.api.Test;

import com.example.Model.PlanEnrolled;
import com.example.Service.PlanService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;
import java.util.Random;

/**
 * Unit test for simple App.
 */
public class PlanServiceTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        Random rand = new Random();
		PlanEnrolled planEnrolled = new PlanEnrolled();
		planEnrolled.setId(rand.nextInt(10000));
		planEnrolled.setPlanId(1);
		planEnrolled.setStatus("ACTIVE");
		planEnrolled.setUsername("S");
		planEnrolled.setValidFrom(LocalDate.now());
		planEnrolled.setValidTill(LocalDate.now().plusMonths(1));

        assertNotEquals(planEnrolled, new PlanService().setPlanEnrolled("S", 1));
    }
}
