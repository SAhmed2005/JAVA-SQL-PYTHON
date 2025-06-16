public class BenNJerryManager {
    private Chunkable[] chunkablesArray;
    private int count;

    public BenNJerryManager() {
        chunkablesArray = new Chunkable[5];
        count = 0;
    }

    public void addChunkable(Chunkable chunkable) {
        if (count < chunkablesArray.length) {
            chunkablesArray[count] = chunkable;
            count++;
        } else {
            System.out.println("Cannot add more flavors, no more space.");
        }
    }

    public void showAllBenNJerrys() {
        for (int i = 0; i < count; i++) {
            chunkablesArray[i].describe();
        }
    }

    public void allScoops() {
        for (int i = 0; i < count; i++) {
            chunkablesArray[i].scoopAvailable();
        }
    }

    public void allLimitedRuns() {
        for (int i = 0; i < count; i++) {
            chunkablesArray[i].limitedRun();
        }
    }
}
