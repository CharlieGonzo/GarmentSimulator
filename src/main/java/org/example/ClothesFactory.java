package org.example;

/**
 * Interface for implementing concrete factories for {@link ClothingItem}
 */
public interface ClothesFactory {

    public ClothingItem tops();

    public ClothingItem pants();

    public ClothingItem shoes();
}
