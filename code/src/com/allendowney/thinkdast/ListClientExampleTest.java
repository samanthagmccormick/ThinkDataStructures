package com.allendowney.thinkdast;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @author downey
 *
 */
public class ListClientExampleTest {

	/**
	 * Test method for {@link ListClientExample}.
	 */
	@Test
	public void testListClientExample() {
		ListClientExample lce = new ListClientExample();

		List list = lce.getList();
		assertThat(list, instanceOf(ArrayList.class) );
	}

}
