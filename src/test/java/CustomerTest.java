import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

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
        gallery.addArtwork(monaLisa);
        gallery.addArtwork(starryNight);
    }


    @Test
    public void canGetCustomerWallet(){
        assertThat(customer.getWallet()).isEqualTo(170);
    }

    @Test
    public void canBuyArtworkFromGallery(){
        customer.buyArtwork(gallery, starryNight);
        assertThat(customer.getWallet()).isEqualTo(20);
        assertThat(gallery.getTill()).isEqualTo(150);
        assertThat(gallery.getStock().size()).isEqualTo(1);
        assertThat(customer.getArtCollection().size()).isEqualTo(1);
    }

    @Test
    public void cannotBuyArtworkFromGallery(){
        customer.buyArtwork(gallery, monaLisa);
        assertThat(customer.getWallet()).isEqualTo(170);
        assertThat(gallery.getTill()).isEqualTo(0);
        assertThat(gallery.getStock().size()).isEqualTo(2);
        assertThat(customer.getArtCollection().size()).isEqualTo(0);

    }


}
