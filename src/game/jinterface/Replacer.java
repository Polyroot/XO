package game.jinterface;


import game.jinterface.printer.AdvConsolePrinter;
import game.jinterface.printer.ConsolePrinter;
import game.jinterface.printer.IPrinter;
import game.jinterface.readers.IRead;
import game.jinterface.readers.PredefinedReader;

public class Replacer {


    private final IRead read;
    private final IPrinter printer;


    public Replacer(final IRead read, final IPrinter printer) {
        this.read = read;
        this.printer = printer;

    }

    public void replace(){
        final String text = read.read();
        final String replacedText =text.replace(":)","=)");
        printer.print(replacedText);

    }

    public static void main(String[] args) {

        final IRead reader = new PredefinedReader("adidas:) fdklfjdskfj:) :))");
        final IPrinter printer = new ConsolePrinter();
        final IPrinter aprinter = new AdvConsolePrinter();
        final Replacer replacer = new Replacer(reader, printer);
        final Replacer advreplacer = new Replacer(reader, aprinter);
        replacer.replace();
        advreplacer.replace();

    }

}
