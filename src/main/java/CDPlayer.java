public class CDPlayer extends Component {

    int cdDeck;

    public CDPlayer(String makeModel, int cdDeck) {
        super(makeModel);
        this.cdDeck = cdDeck;
    }

    public int getCdDeck() {
        return cdDeck;
    }

    public String play(String string){
        return "Now playing CD " + string;

    }

}
