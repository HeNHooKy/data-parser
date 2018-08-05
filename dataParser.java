import java.util.HashMap;

public class dataParser {
    public static String stringify(String[] data) {
        String str = "";
        for(int i = 0; i < data.length; i++) {
            str += data[i] + "/";
        }
        return str;
    }

    public static HashMap<String, String> parse(String data) throws ArithmeticException {
        HashMap<String, String> parseData = new HashMap<String, String>();
        String[] args = data.split("/",0);
        if(args.length%2 != 0) {
            System.err.println("Can't to parse data; args.length is uneven");
            throw new ArithmeticException("Can't to parse data");
        }
        for(int i = 0; i < args.length; i+=2) {
            parseData.put(args[i],args[i+1]);
        }
        return parseData;

    }
}
