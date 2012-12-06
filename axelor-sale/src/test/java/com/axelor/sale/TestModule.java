package com.axelor.sale;

import com.axelor.db.JpaModule;
import com.google.inject.AbstractModule;

public class TestModule extends AbstractModule {

	@Override
	protected void configure() {
		install(new JpaModule("testUnit"));
	}
}
