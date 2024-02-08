import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    Customer customer;
    Gallery gallery;
    Artwork monaLisa;
    Artwork starryNight;

    @BeforeEach
    public void setUp(){
        customer = new Customer("John", 170);
        gallery =  new Gallery("Gallery");
        monaLisa = new Artwork("Mona Lisa", "Da Vinci", 200);
        starryNight = new Artwork("Starry Night", "Van Gogh", 150);
    }


    @Test
    


}
