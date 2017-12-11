public class RecordDeck extends Component{

    int speed;

    public RecordDeck(String makeModel, int speed) {
        super(makeModel);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String play(String string){
        return "Now playing record " + string;
    }
}
