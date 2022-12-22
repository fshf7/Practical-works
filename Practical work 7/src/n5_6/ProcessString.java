package n5_6;

public class ProcessString implements ActionWithString{
    private final String string = "Faridun Sharipov";

    public ProcessString() {}

    @Override
    public int SymbolCounter()
    {
        return string.length();
    }

    @Override
    public String OddSymbol()
    {
        char[] chr = string.toCharArray();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < chr.length; i = i + 2)
        {
            str.append(chr[i]);
        }
        return str.toString();
    }

    @Override
    public String invertString()
    {
        char[] chr = string.toCharArray();
        StringBuilder str = new StringBuilder();
        for (int i = chr.length - 1; i >= 0; i--)
        {
            str.append(chr[i]);
        }
        return str.toString();
    }
}
