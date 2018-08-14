package dp.structural.proxy;

/**
 * ProxyDemo
 *
 * @author Florian Popa <florian@webgenerals.com>
 */
public class ProxyDemo {

    public static void main(String[] args) {

        /**
         * With proxy implementation
         * The user clicks only one image and only one is loaded in memory
         */
        Image highResImage1 = new ImageProxy("hiResPhoto1.jpeg");
        Image highResImage2 = new ImageProxy("hiResPhoto2.jpeg");
        Image highResImage3 = new ImageProxy("hiResPhoto3.jpeg");

        highResImage1.showImage();

        /**
         * Without proxy impl
         * All 3 images are loaded even thought the user clicked only one image
         */
        Image hiResImageA = new HighResolutionImage("photo1.jpg");
        Image hiResImageB = new HighResolutionImage("photo2.jpg");
        Image hiResImageC = new HighResolutionImage("photo3.jpg");

        hiResImageA.showImage();
    }

}
