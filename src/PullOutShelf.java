public class PullOutShelf {
    int numberOfProducts;
    String[] nameOfProducts = new String[numberOfProducts];

    public PullOutShelf(String[] nameOfProducts) {
        this.numberOfProducts = nameOfProducts.length;
        this.nameOfProducts = nameOfProducts;
    }

    public PullOutShelf() {

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
