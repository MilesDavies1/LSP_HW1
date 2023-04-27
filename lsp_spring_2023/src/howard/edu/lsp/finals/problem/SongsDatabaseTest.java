package howard.edu.lsp.finals.problem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.Set;


class SongsDatabaseTest {
    @Test
    void testAddSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");

        Set<String> rapSongs = db.getSongs("Rap");
        assertEquals(2, rapSongs.size());
        assertTrue(rapSongs.contains("Savage"));
        assertTrue(rapSongs.contains("Gin and Juice"));

        Set<String> jazzSongs = db.getSongs("Jazz");
        assertEquals(1, jazzSongs.size());
        assertTrue(jazzSongs.contains("Always There"));
    }

    @Test
    void testGetSongs() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");

        Set<String> rapSongs = db.getSongs("Rap");
        assertEquals(2, rapSongs.size());
        assertTrue(rapSongs.contains("Savage"));
        assertTrue(rapSongs.contains("Gin and Juice"));

        Set<String> jazzSongs = db.getSongs("Jazz");
        assertEquals(1, jazzSongs.size());
        assertTrue(jazzSongs.contains("Always There"));

        Set<String> countrySongs = db.getSongs("Country");
        assertNull(countrySongs);
    }

    @Test
    void testGetGenreOfSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");

        String rapGenre = db.getGenreOfSong("Savage");
        assertEquals("Rap", rapGenre);

        String jazzGenre = db.getGenreOfSong("Always There");
        assertEquals("Jazz", jazzGenre);

        String nonexistentGenre = db.getGenreOfSong("Stairway to Heaven");
        assertNull(nonexistentGenre);
    }
}

