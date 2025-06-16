public abstract class BenNJerry {
   
	protected String baseFlavor;
    protected boolean nuts;
    protected static int count = 0;

    public BenNJerry(String baseFlavor, boolean nuts) {
        this.baseFlavor = baseFlavor;
        this.nuts = nuts;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
