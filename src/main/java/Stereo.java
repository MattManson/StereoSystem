public class Stereo {

    CDPlayer cdPlayer;
    RecordDeck recordDeck;
    Radio radio;
    String name;
    Subwoofer subwoofer;

    public Stereo(CDPlayer cdPlayer, RecordDeck recordDeck, Radio radio, String name, Subwoofer subwoofer) {
        this.cdPlayer = cdPlayer;
        this.recordDeck = recordDeck;
        this.radio = radio;
        this.name = name;
        this.subwoofer = subwoofer;

    }

    public CDPlayer getCdPlayer() {
        return cdPlayer;
    }

    public RecordDeck getRecordDeck() {
        return recordDeck;
    }

    public Radio getRadio() {
        return radio;
    }

    public String getName() {
        return name;
    }

    public String playCD(String string){
        return this.cdPlayer.play(string);
    }

     public String playRadio(String string){
        return this.radio.play(string);
    }

    public String tuneRadio(String string){
        return this.radio.tune(string);
    }

     public String playRecord(String string){
        return this.recordDeck.play(string);
    }


}
