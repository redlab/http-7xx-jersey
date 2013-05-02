/*
 * Copyright 2013 Balder Van Camp
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package be.redlab.jersey.status;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * get two random {@link HttpStatus7xx}, and compare for difference, once in a while this could fail yes. But this way
 * at least the method is
 * test, and the test is not just getRandom ? Oh we have one.
 *
 * @author redlab
 *
 */
public class RandomTest {

	private HttpStatus7xx random1;
	private HttpStatus7xx random2;

	@Before
	public void setup() {
		random1 = HttpStatus7xx.getRandom();
		random2 = HttpStatus7xx.getRandom();
	}
	@Test
	public void shouldBeDifferentSinceWeGetTwoAndItsRandom() {
		Assert.assertNotEquals(random1, random2);
	}
}
