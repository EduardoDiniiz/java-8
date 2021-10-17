package strings.comparators;

public class ComparadorPorTamanho implements java.util.Comparator<String> {

    @Override
    public int compare(String primeiro, String segundo) {
        if(segundo.length() > primeiro.length())
            return -1;
        if(primeiro.length() > segundo.length())
            return 1;
        return 0;
    }
}
