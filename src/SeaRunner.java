
public class SeaRunner {

	public static void main(String[] args) {
		
		SeaCreature spongebob = new SeaCreature("Spongebob");
		SeaCreature squidward = new SeaCreature("Squidward");
		SeaCreature patrick = new SeaCreature("Patrick");
		
		spongebob.getName();
		squidward.getName();
		patrick.getName();
		
		squidward.eat();
		patrick.eat();
		
		spongebob.laugh();
		squidward.laugh();
		patrick.laugh();
		
		
	}
	
}
