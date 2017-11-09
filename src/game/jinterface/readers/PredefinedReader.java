package game.jinterface.readers;

public class PredefinedReader implements IRead {

    private final String str;

    public PredefinedReader(String str) {
        this.str = str;
    }

    @Override
    public String read() {
        return str;
    }
}
