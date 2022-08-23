package com.qa.atos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoyalMailTest {
	@Test
	public void idtest() {
		int id = 4;
		RoyalMail r = new RoyalMail();
		r.setId(id);
		assertEquals(id,r.getId());
	}

}
