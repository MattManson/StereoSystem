import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RadioTEst {

    Radio radio;
    CDPlayer cdPlayer;
    RecordDeck recordDeck;
    Stereo stereo;
    Mp3Player mp3Player;
    Subwoofer subwoofer;

    @Before
    public void before(){
        radio = new Radio("Sony Beep Boop");
        cdPlayer = new CDPlayer("Sony Beep Boop", 10);
        recordDeck = new RecordDeck("Sony Beep Boop", 45);
        subwoofer = new Subwoofer();
        stereo = new Stereo(cdPlayer, recordDeck, radio, "Ian's Stereo", subwoofer);
        mp3Player = new Mp3Player();


    }

    @Test
    public void canGetTune(){
        assertEquals("Radio One", radio.tune("Radio One"));
    }

    @Test
    public void canGetMakeModel(){
        assertEquals("Sony Beep Boop", cdPlayer.getMakemodel());
        assertEquals("Sony Beep Boop", radio.getMakemodel());
        assertEquals("Sony Beep Boop", recordDeck.getMakemodel());

    }

    @Test
    public void canGetSpeedAndCDDeckNo(){
        assertEquals(45, recordDeck.getSpeed());
        assertEquals(10, cdPlayer.getCdDeck());
    }

    @Test
    public void canPlayAll(){
        assertEquals("Now playing CD One", cdPlayer.play("One"));
        assertEquals("Now playing record Two", recordDeck.play("Two"));
        assertEquals("Now playing on Radio Three", radio.play("Three"));
    }

    @Test
    public void canUseSteroControls(){
            assertEquals("Now playing CD One", stereo.playCD("One"));
            assertEquals("Now playing record Two", stereo.playRecord("Two"));
            assertEquals("Now playing on Radio Three", stereo.playRadio("Three"));
    }

    @Test
    public void canConnectMp3(){
        assertEquals("Ian's Stereo", mp3Player.connect(stereo));
    }
    @Test
    public void canMegaBass(){
        System.out.println(subwoofer.playSound());
        assertEquals("Wub Wub", subwoofer.playSound());
    }


}
