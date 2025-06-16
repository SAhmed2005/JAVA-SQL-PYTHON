public class MarshmallowSky extends BenNJerry implements Chunkable {

    public MarshmallowSky() {
        super("Marshmallow", false);
    }

    @Override
    public void describe() {
        System.out.println("This is Marshmallow Sky. The flavor is Marshmallow without any nuts.");
    }

    @Override
    public void scoopAvailable() {
        System.out.println("Marshmallow Sky is not available in scoop shops.");
    }

    @Override
    public void limitedRun() {
        System.out.println("Marshmallow Sky is a limited-run flavor.");
    }
}
