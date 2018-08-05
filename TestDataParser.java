import java.util.HashMap;
import java.util.Map;

public class TestDataParser {
    public static void main(String args[]) {
        String[] str = {"name","hanji","sex","male","age","19"};
        String s = dataParser.stringify(str);System.out.println(s);
        HashMap<String,String> map = dataParser.parse(s);
        for (Map.Entry<String,String> entry:
                    map.entrySet())
        {
            System.out.println("His " + entry.getKey() + " is " + entry.getValue());
        }
    }
}
