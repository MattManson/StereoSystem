public  class Radio extends Component{

    public Radio(String makeModel) {
        super(makeModel);
    }


    public String tune(String string) {
        return string;
    }

    public String play(String string) {
        return "Now playing on Radio " + string;

    }


}
