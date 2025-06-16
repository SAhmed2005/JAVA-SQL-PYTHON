public class BenNJerryTest {
    
	public static void main(String[] args) {
        
		BenNJerryManager manager = new BenNJerryManager();

        ChunkyMonkey chunkyMonkey = new ChunkyMonkey();
        MarshmallowSky marshmallowSky = new MarshmallowSky();

        manager.addChunkable(chunkyMonkey);
        manager.addChunkable(marshmallowSky);

        System.out.println("List of Ben & Jerry's Flavors:");
        manager.showAllBenNJerrys();

        System.out.println("Scoop Availability:");
        manager.allScoops();

        System.out.println("Limited Run:");
        manager.allLimitedRuns();

        System.out.println("Total Number of Ben & Jerry's Flavors: " + BenNJerry.getCount());
    }
}
