/**
 * Image Viewer
 */
public class ImageViewer {

    public static void main(String[] args) {
        System.out.println("-------Použití proxy-------");
        ImageInterface highResolutionImageInterface1 =
                new ImageInterfaceProxy("sample/veryHighResPhoto1.jpeg");
        ImageInterface highResolutionImageInterface2 =
                new ImageInterfaceProxy("sample/veryHighResPhoto2.jpeg");
        highResolutionImageInterface1.showImage();

        System.out.println("-------Vynechání proxy-------");
        ImageInterface highResolutionImageInterfaceNoProxy1 =
                new HighResolutionImageInterface("sample/veryHighResPhoto1.jpeg");
        ImageInterface highResolutionImageInterfaceNoProxy2 =
                new HighResolutionImageInterface("sample/veryHighResPhoto2.jpeg");
        highResolutionImageInterfaceNoProxy2.showImage();
    }
}