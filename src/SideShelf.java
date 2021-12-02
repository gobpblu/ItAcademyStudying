public class SideShelf {
    int numberOfProducts;
    String[] nameOfProducts = new String[numberOfProducts];

    public SideShelf(String[] nameOfProduct) {
        this.numberOfProducts = nameOfProduct.length;
        this.nameOfProducts = nameOfProduct;
    }

    public SideShelf() {

    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public void setNameOfProducts(String[] nameOfProducts) {
        this.nameOfProducts = nameOfProducts;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public String[] getNameOfProducts() {
        return nameOfProducts;
    }

    @Override
    public String toString() {
        String message = "\nКоличество продуктов: " + numberOfProducts + "\n";
        for (int i = 0; i < numberOfProducts; i++) {
            message += "Название " + (i+1) + " продукта: " + nameOfProducts[i] + "\n";
        }
        return message;
    }
}
