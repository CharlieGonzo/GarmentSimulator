package org.example;

/**
 * Concrete implementation of {@link ClothesFactory} that produces Party Clothes
 */
public class PartyClothesFactory implements  ClothesFactory{
    @Override
    public ClothingItem tops() {
       return new PartyTop();
    }

    @Override
    public ClothingItem pants() {
        return new PartyTop();
    }

    @Override
    public ClothingItem shoes() {
        return new PartyShoes();
    }
}
