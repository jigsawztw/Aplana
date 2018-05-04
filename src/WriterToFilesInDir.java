import java.util.*;
import java.io.*;


public class WriterToFilesInDir {
        public static void main(String[] args)
        {

            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Введите путь к папке: ");
                File dir = new File(sc.nextLine());
                if(dir.isDirectory()){
                    for(File item : dir.listFiles()){
                        if(item.getName().startsWith("v")){

                            FileWriter writer = new FileWriter(item, true);
                            BufferedWriter bufferWriter = new BufferedWriter(writer);
                            bufferWriter.write("L");
                            bufferWriter.close();
                            writer.close();
                        }
                    }
                }
            } catch (IOException e) {
                System.err.println(e);
            }

        }
    }
