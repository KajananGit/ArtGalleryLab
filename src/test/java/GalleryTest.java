import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Artwork monaLisa;
    Artwork starryNight;

    @BeforeEach
    public void setUp(){

        gallery =  new Gallery("Gallery");
        monaLisa = new Artwork("Mona Lisa", "Da Vinci", 200);
        starryNight = new Artwork("Starry Night", "Van Gogh", 150);
    }

    @Test
    public void canGetTill(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }

    @Test
    public void canAddArtworkToStock(){
        this.gallery.addArtwork(monaLisa);
        assertThat(gallery.getStock().size()).isEqualTo(1);
    }

    @Test
    public void canRemoveArtworkFromStock(){
        this.gallery.addArtwork(monaLisa);
        this.gallery.addArtwork(starryNight);
        this.gallery.removeArtWork(monaLisa);
        assertThat(gallery.getStock().size()).isEqualTo(1);
    }





}
