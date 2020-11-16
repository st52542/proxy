/**
 * Image Viewer main
 */
public class ImageViewer {

    public static void main(String[] args) {
        ImageInterface highResolutionImageInterface1 =
                new ImageInterfaceProxy("sample/veryHighResPhoto1.jpeg");
        ImageInterface highResolutionImageInterface2 =
                new ImageInterfaceProxy("sample/veryHighResPhoto2.jpeg");
        System.out.println("Použití proxy");
        highResolutionImageInterface1.showImage();

        ImageInterface highResolutionImageInterfaceNoProxy1 =
                new HighResolutionImageInterface("sample/veryHighResPhoto1.jpeg");
        ImageInterface highResolutionImageInterfaceNoProxy2 =
                new HighResolutionImageInterface("sample/veryHighResPhoto2.jpeg");
        System.out.println("Vynechání proxy");
        highResolutionImageInterfaceNoProxy2.showImage();
    }
}