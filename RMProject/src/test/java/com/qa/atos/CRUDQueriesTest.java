package com.qa.atos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CRUDQueriesTest {
	RoyalMail r = new RoyalMail("Haz", "Raf", 044, "Erd");
	CRUDqueries q = new CRUDqueries();
	@Test
	public void readtest() {
		q.create("haz", "raf", 044, "erd");
		q.read();
	    q.update(1, "David");
	    q.delete(3);     
	}
}
