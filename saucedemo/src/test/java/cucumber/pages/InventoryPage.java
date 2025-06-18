package cucumber.pages;

import cucumber.webDriver.WebDriverInit;
import model.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventoryPage extends WebDriverInit {
    private final By inventoryList = By.xpath("(//div[@id='inventory_container']/div[@data-test='inventory-list']/div)");
    private final By lnkShoppingCart = By.xpath("//div[@id='shopping_cart_container']/a");

    private final String itemDescriptionXpath = "div[@data-test='inventory-item-description']//a/div";
    private final String itemAddToCartXpath = "div[@data-test='inventory-item-description']//button[contains(@id,'add-to-cart')]";

    private final CommonUtils commonUtils;

    public InventoryPage() {
        commonUtils = new CommonUtils();
    }

    public void addInventoryItem(String itemName) {
        List<WebElement> itemList = commonUtils.findElementList(inventoryList);
        for (WebElement item : itemList) {
            String description = item.findElement(By.xpath(itemDescriptionXpath)).getText();

            if (description.equalsIgnoreCase(itemName)) {
                item.findElement(By.xpath(itemAddToCartXpath)).click();
                System.out.printf("\nItem added to shopping cart : " + itemName);
                commonUtils.waitFor(2);
                break;
            }
        }
    }

    public void clickOnShoppingCartIcon() {
        commonUtils.click(lnkShoppingCart);
        commonUtils.waitFor(2);
    }



}
