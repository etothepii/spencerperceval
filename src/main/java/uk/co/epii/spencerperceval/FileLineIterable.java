package uk.co.epii.spencerperceval;

import java.io.*;
import java.util.Iterator;

/**
 * User: James Robinson
 * Date: 12/10/2013
 * Time: 12:18
 */
public class FileLineIterable implements Iterable<String> {

    private final File file;

    public FileLineIterable(String fileName) {
        this(new File(fileName));
    }

    public FileLineIterable(File file) {
        this.file = file;
    }

    @Override
    public Iterator<String> iterator() {
        return new FileLineIterator(file);
    }

    private class FileLineIterator implements Iterator<String> {

        private FileReader fileReader;
        private BufferedReader bufferedReader;
        private String in;

        public FileLineIterator(String fileName) {
            this(new File(fileName));
        }

        public FileLineIterator(File file) {
            try {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
            }
            catch (FileNotFoundException fnfe) {
                fileReader = null;
                bufferedReader = null;
            }
        }

        @Override
        public boolean hasNext() {
            if (bufferedReader == null) return false;
            try {
                in = bufferedReader.readLine();
                if (in == null) {
                    close();
                }
                return in != null;
            }
            catch (IOException e) {
                close();
                return false;
            }
        }

        private void close() {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                }
                catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fileReader != null) {
                try {
                    fileReader.close();
                }
                catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        @Override
        public String next() {
            return in;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("File Line Iterator is readonly");
        }
    }

}
