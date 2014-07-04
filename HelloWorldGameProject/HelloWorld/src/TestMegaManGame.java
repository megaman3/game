import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */

/**
 * @author LordNelson
 *
 */
public class TestMegaManGame {

	private MegaManThing Game;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		Game = new MegaManThing();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		Game = null;
	}

	@Test
	public void _01_GetBossess() {

		int bosses_expected = 3;
		assertTrue("Bosses not equal", bosses_expected == Game.GetBosses());
	}

	@Test
	public void _02_GetBossess() {

		int levels_expected = 8;
		assertTrue("Bosses not equal", levels_expected == Game.GetLevels());
	}

	@Test
	public void _04_GetBossessNames() {

		int names_expected = 3;
		assertTrue("Bosses not equal", names_expected == Game.GetBossNames().length);
	}

}
