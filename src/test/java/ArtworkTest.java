import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork artwork;

    @BeforeEach
    public void setUp(){
        artwork = new Artwork("Mona Lisa", "Da Vinci", 200);
    }

    @Test
    public void hasTitle(){
        assertThat(artwork.getTitle()).isEqualTo("Mona Lisa");
    }

    @Test
    public void hasArtist(){
        assertThat(artwork.getArtist()).isEqualTo("Da Vinci");
    }

    @Test
    public void hasPrice(){
        assertThat(artwork.getPrice()).isEqualTo(200);
    }
}
