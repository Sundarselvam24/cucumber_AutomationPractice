package com.ap.pomodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddBlouseIntoCart {

	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;

	@FindBy(xpath = "(//a[@title='Blouses'])[1]")
	private WebElement blouse;

	@FindBy(xpath = "//img[@itemprop='image']")
	private WebElement productImage;

	@FindBy(xpath = "//span[text()='Add to cart']")
	private WebElement addToCart;
	
	@FindBy(xpath="//span[@title='Continue shopping']")
	private WebElement continueShopping;

	public WebElement getWomen() {
		return women;
	}

	public WebElement getBlouse() {
		return blouse;
	}

	public WebElement getProductImage() {
		return productImage;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getContinueShopping() {
		return continueShopping;
	}

}
