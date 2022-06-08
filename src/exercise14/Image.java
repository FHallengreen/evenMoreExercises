package exercise14;

public class Image {
    private String fileName;
    private int width;
    private int height;


    public Image(String fileName, int width, int height) {
        this.fileName = fileName;
        this.width = width;
        this.height = height;
        System.out.println("Er portræt: " + isPortrait());
        System.out.println("Er landskab: " + isLandscape());
        System.out.println("Er portræt: " + isKnownFileType());
    }

    public boolean isKnownFileType(){
        String index = fileName.substring(fileName.indexOf("."));
        if (index.equals(".gif") || index.equals(".jpg") || index.equals(".jpeg") || index.equals(".png") ||
          index.equals(".webp") || index.equals(".bmp")){
            return true;
        }
        else return false;
    }

    public boolean isPortrait(){
        return height > width;
    }

    public boolean isLandscape(){
        return height < width;
    }

    public static void main(String[] args) {
        Image image = new Image("Frederik.jpg",400,500);
    }

}
