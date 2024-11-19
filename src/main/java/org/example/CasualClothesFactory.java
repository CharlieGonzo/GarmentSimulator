package org.example;

/**
 * This concrete Implementation of the Clothes Factory produces casual Clothing Items
 */
public class CasualClothesFactory implements ClothesFactory{
    @Override
    public ClothingItem tops() {
       return new CasualTop();
    }

    @Override
    public ClothingItem pants() {
        return new CasualPants();
    }

    @Override
    public ClothingItem shoes() {
       return new CasualShoes();
    }
}
