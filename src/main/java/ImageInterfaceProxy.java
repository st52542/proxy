/**
 * Proxy
 */
public class ImageInterfaceProxy implements ImageInterface {

    private String imageFilePath;

    /**
     * Odkaz na plny objekt
     */
    private ImageInterface proxifiedImageInterface;


    public ImageInterfaceProxy(String imageFilePath) {
        this.imageFilePath= imageFilePath;
    }

    @Override
    public void showImage() {

        // vytvoření objektu Image jen pokud je ho potřeba zobrazit
        System.out.println("Vyvolání proxy (náhled na obrázek)");
        proxifiedImageInterface = new HighResolutionImageInterface(imageFilePath);

        // nyní vyvoláme showImage pomocí plného objektu
        System.out.println("Vyvolání obrázku v plném rozlyšení");
        proxifiedImageInterface.showImage();

    }

}