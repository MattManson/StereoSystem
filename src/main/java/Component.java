public abstract class Component {

    String makemodel;

    public Component(String makeModel){
        this.makemodel = makeModel;
    }

    public String getMakemodel() {
        return makemodel;
    }

    abstract String play(String string);






}
