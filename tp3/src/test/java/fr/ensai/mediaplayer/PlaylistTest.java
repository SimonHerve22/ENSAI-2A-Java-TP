package fr.ensai.mediaplayer;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PlaylistTest {

    @Test
    void testAddMedia() {
        // GIVEN
        Artist stromae = new Artist("Paul", "Van Haver", "Belge");
        Artist author = new Artist("Aut", "Hor", "Français");
        Artist composer = new Artist("Comp", "Oser", "Français");
        MusicalGenres[] listPapaoutai = {MusicalGenres.POP, MusicalGenres.ROCK};
        Song papaoutai = new Song("Papaoutai", stromae, 2013, 232, "Dites-moi d'où il vient\n" + //
                        "Enfin je saurai où je vais", author, composer, listPapaoutai);
        List<Media> list = new ArrayList<>();
        list.add(papaoutai);
        Playlist playlist = new Playlist("playlist_du_futur", list, 500);

        // WHEN
        Song mamanoutai = new Song("Mamanoutai", stromae, 2014, 262, "Dites-moi d'où elle vient\n" + //
                        "Enfin je saurai où je vais", author, composer, listPapaoutai);
                    
        playlist.addMedia(mamanoutai);

        // THEN
        assertTrue(playlist.getMediaList().contains(mamanoutai));
        
    }

    @Test
    void testRemoveMedia() {
        // GIVEN
        Artist stromae = new Artist("Paul", "Van Haver", "Belge");
        Artist author = new Artist("Aut", "Hor", "Français");
        Artist composer = new Artist("Comp", "Oser", "Français");
        MusicalGenres[] listPapaoutai = {MusicalGenres.POP, MusicalGenres.ROCK};
        Song papaoutai = new Song("Papaoutai", stromae, 2013, 232, "Dites-moi d'où il vient\n" + //
                        "Enfin je saurai où je vais", author, composer, listPapaoutai);
        Song mamanoutai = new Song("Mamanoutai", stromae, 2014, 262, "Dites-moi d'où elle vient\n" + //
                        "Enfin je saurai où je vais", author, composer, listPapaoutai);
        List<Media> list = new ArrayList<>();
        list.add(papaoutai);
        list.add(mamanoutai);
        Playlist playlist = new Playlist("playlist_du_futur", list, 500);

        // WHEN       
        playlist.removeMedia(mamanoutai);

        // THEN
        assertFalse(playlist.getMediaList().contains(mamanoutai));
        
    }

    

}
