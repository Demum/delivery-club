package ru.deliveryClub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends WebDriverSettings{
    public ChromeDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();

    }

    @Test
    public void firstTest() {

        driver.get("https://www.delivery-club.ru/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Delivery Club — Доставка еды и продуктов"));
        System.out.println("1test");


    }

    @Test
    public void firstTes2t() {
        driver.get("https://www.delivery-club.ru/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Delivery Club — Доставка еды и продуктов"));
        System.out.println("2test");


    }

    @After
    public void close() {

        driver.quit();

    }
}
