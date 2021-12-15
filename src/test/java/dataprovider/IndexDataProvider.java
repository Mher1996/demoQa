package dataprovider;

import org.testng.annotations.DataProvider;

public class IndexDataProvider {
    @DataProvider(name = "EmailDataProvider")
    public static Object[][] emailData() {
        return new Object[][]{

                {"asb@"},
                {"@asb"},
                {"asb"},
                {"asb.com"},
                {".acb@com"}
        };

    }

    @DataProvider(name = "nameDataProvider")
    public static Object[][] nameData() {
        return new Object[][]{
                {"Armen"},
                {"Karen"},
                {"Hayk"},
                {"Mher"}
        };

    }

    @DataProvider(name = "lNameDataProvider")
    public static Object[][] lNameData() {
        return new Object[][]{
                {"Armenyan"},
                {"Karenyan"},
                {"Haykyan"},
                {"Mheryan"}
        };
    }

}
