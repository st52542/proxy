/**
 * plný Objekt
 */
public class HighResolutionImageInterface implements ImageInterface {

    public HighResolutionImageInterface(String imageFilePath) {
        loadImage(imageFilePath);
    }

    private void loadImage(String imageFilePath) {
        // načtení Image z disku do paměti
    }

    @Override
    public void showImage() {
        // logika pro zobrazení Image
        System.out.println("Vyvolání plného zobrazení");
    }
}