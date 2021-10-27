public class Block{
    int [] block;
    int width;
    int length;
    int height;
    Block( int block []){
        width=block[0];
        length=block[1];
        height=block[2];
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    int getVolume(){
        int volume = width * length * height;
        return volume;
    }

    int getSurfaceArea(){
        int area = 2 * ((width * length) + (length * height) + (width * height));
        return area;
    }

}