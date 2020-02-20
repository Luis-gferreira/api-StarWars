package br.com.rsi.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import br.com.rsi.api.Peoples;
import br.com.rsi.api.Planets;
import br.com.rsi.api.Vehicles;

@RunWith(org.junit.runners.Suite.class)
@SuiteClasses({
	Peoples.class,
	Planets.class,
	Vehicles.class
})
public class Suite {

}
