package chapter11.proxy.virtual;

public class ImageViewer {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("cat.jpg");
        Image image2 = new ProxyImage("dog.jpg");

        // Images are not loaded yet
        System.out.println("Images created but not loaded yet...");

        // Now load and display them
        image1.display();  // Loads and displays
        image1.display();  // Just displays, no re-loading

        image2.display();  // Loads and displays
    }
}

