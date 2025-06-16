public class ChunkyMonkey extends BenNJerry implements Chunkable {

    public ChunkyMonkey() {
        super("Banana", true);
    }

    @Override
    public void describe() {
        System.out.println("This is Chunky Monkey. The flavor is Banana with nuts.");
    }

    @Override
    public void scoopAvailable() {
        System.out.println("Chunky Monkey is available in scoop shops.");
    }

    @Override
    public void limitedRun() {
        System.out.println("Chunky Monkey is not a limited-run flavor.");
    }
}
