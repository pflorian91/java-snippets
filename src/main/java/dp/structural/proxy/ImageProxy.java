package dp.structural.proxy;

/**
 * ImageProxy
 *
 * @author Florian Popa <florian@webgenerals.com>
 */
public class ImageProxy implements Image {

    private String imageFilePath;
    private Image proxifiedImage;

    public ImageProxy(String imageFilePath) {
        this.imageFilePath = imageFilePath;
    }

    public void showImage() {
        proxifiedImage = new HighResolutionImage(imageFilePath);

        proxifiedImage.showImage();
    }
}
