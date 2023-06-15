package task1.domain;

public class Product {

    protected String prodName;
    protected double cost;

    public Product(String prodName, double cost) {

        this.prodName = prodName;
        this.cost = cost;
    }

    public String getProdName() {
        return  this.prodName;
    }

    public void SetProdName(String name) {
        this.prodName = name;
    }

    public double setCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void showInfo() {

        System.out.println(" Информация о товаре:\n");
        System.out.println(" Название: " + this.prodName + "\nСтоимость: " + this.cost + " руб.\n");

    }

    @Override
    public String toString() {
        return " Название: " + this.prodName + "\nСтоимость: " + this.cost + " руб.";
    }

}
