package org.example;


/**
 * @author Charles Gonzalez Jr
 * this class holds the current clothing configuration of the app
 */
public class Application {
    private ClothingItem top;
    private ClothingItem pants;
    private ClothingItem shoes;

    /**
     * Pass a ClothesFactory to instantiate clothing items.
     * @param factory Used to set clothing items.
     */
    public Application(ClothesFactory factory){
        top = factory.tops();
        pants = factory.pants();
        shoes = factory.shoes();
    }

    /**
     * describe currently selected clothes
     */
    public void describeCurrentClothes(){
        top.itemDescription();
        pants.itemDescription();
        shoes.itemDescription();
    }
}
