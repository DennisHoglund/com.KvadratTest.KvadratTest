package com.KvadratTest.KvadratTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  Assert.assertEquals(4, 4);
  }
  
  @Test
	 public void LoginValidUser() {

		LoginPage lp = new LoginPage();
		boolean vs = lp.ValidUser("100kalle", "kallekulahoppar");

		Assert.assertEquals(vs, true);
	}
}
