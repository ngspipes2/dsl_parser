package pt.isel.ngspipes.dsl_parser.transversal;

import java.io.*;
import java.nio.file.Files;

public class IO {

    public static void write(String content, String fileName) throws IOException {
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")){
            writer.println(content);
        }
    }

    public static void write(byte[] content, String fileName) throws IOException {
        try(FileOutputStream fos = new FileOutputStream(fileName)){
            fos.write(content);
        }
    }

    public static String read(String fileName) throws IOException {
        StringBuilder sb = new StringBuilder();

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
        }

        return sb.toString();
    }

    public static byte[] getBytes(String filePath) throws IOException {
        File file = new File(filePath);
        return Files.readAllBytes(file.toPath());
    }

}
