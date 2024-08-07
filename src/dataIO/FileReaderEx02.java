package dataIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReaderEx02 {

  public static void main(String[] args) throws IOException {

    Path path = Paths.get("C:/Temp/study01.txt");
    Stream<String> stream;

    stream = Files.lines(path, Charset.defaultCharset());
    stream.forEach(System.out::println);

    System.out.println();

    File file = path.toFile();
    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);
    stream  = br.lines();
    stream.forEach(System.out::println);

    stream.close();



  }

}
