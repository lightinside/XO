package com.lightinside.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testGetName() throws Exception {
        final Player player = new Player("Tork", null);

        assertEquals("Torkk", player.getName());
    }

    @Test
    public void testGetFigure() throws Exception {

    }
}