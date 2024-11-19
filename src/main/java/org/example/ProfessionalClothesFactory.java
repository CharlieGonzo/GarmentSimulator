package org.example;

/**
 * Concrete implementation of {@link ClothesFactory} for producing professional clothing items.
 */
public class ProfessionalClothesFactory implements ClothesFactory{
    @Override
    public ClothingItem tops() {
        return new ProfessionalTop();
    }

    @Override
    public ClothingItem pants() {
       return new ProfessionalPants();
    }

    @Override
    public ClothingItem shoes() {
      return new ProfessionalShoes();
    }
}
