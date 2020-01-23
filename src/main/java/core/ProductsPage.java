package core;

import org.openqa.selenium.By;

public class ProductsPage {

    public ProductsPage() {

        //private By firstsearchProduct = By.xpath("//li[@class='product-item promo-product']//img[@class='img-product']");
        //private By producttype = By.xpath("//div[@class='active']//tr[2]//td[1]");

        //test maksim
    }

    public FirstProductPage firstsearchProduct (String productName){

        By firstsearchProduct = By.xpath("//li[@class='product-item promo-product']//img[@class='img-product']");
        DriverManager.getDriver().findElement(firstsearchProduct).click();
        System.out.println("Hello I am a new Branch");
        return new FirstProductPage();

    }


}
