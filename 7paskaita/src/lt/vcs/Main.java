package lt.vcs;

import java.io.*;
import java.nio.Buffer;
import java.nio.charset.Charset;

public class Main {

    public static void main(String[] args) throws IOException {
	    File file = new File("D:\\failas.txt");
        VcsUtils.println(file.toString());

        BufferedReader br;
        String line;
        try (BufferedWriter bw = VcsUtils.newWriter(file.toString())) {
            bw.append(VcsUtils.NEW_LINE + "ketvirta");
            bw.flush();
            bw.close();
        }


        br = VcsUtils.newReader(file.toString());
        while ((line = br.readLine()) != null) {
            VcsUtils.println(line);
        }
        br.close();




    }
}
