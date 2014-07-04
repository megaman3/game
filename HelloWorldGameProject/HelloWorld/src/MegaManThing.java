import java.util.Random;


public class MegaManThing {
	
	private int Levels = 8;
	private int Bosses = 3;
	private String[] BossNames = {"IceMan", "GutsMan", "ElectorMan"};
	
	
	public MegaManThing() {

		System.out.println("Loading game");
		
		for (int i = 1; i < 50; i++) {
			try {
				System.out.print(".");
				Random rand = new Random();
				Thread.sleep(rand.nextInt(5*i));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}	
		}
		
		System.out.println("");
		System.out.println("Game Initialited!");
	}

	public int GetLevels() {return Levels;}
	public int GetBosses() {return Bosses;}
	public String[] GetBossNames() {return BossNames;}
	
}
