package game.aclass;

public class FileSmileProcessor extends AbstractSmileProcessor {

    @Override
    public String readString() {
        return "text from :) file:))";
    }

    public static void main(String[] args) {
        final FileSmileProcessor fileSmileProcessor = new FileSmileProcessor();
        fileSmileProcessor.process();
    }
}
