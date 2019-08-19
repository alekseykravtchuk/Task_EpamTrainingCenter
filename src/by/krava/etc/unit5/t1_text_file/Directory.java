package by.krava.etc.unit5.t1_text_file;

import java.util.ArrayList;

class Directory {
    private String directoryName;
    private ArrayList<TextFile> files;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        files = new ArrayList<>();
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void changeDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public ArrayList<TextFile> getFiles() {
        return files;
    }

    public void addFile(TextFile file) {
        this.files.add(file);
    }

    public void removeFile(String fileName) {
        for (int i = 0; i < files.size(); i++) {
            if(files.get(i).getFileName().equalsIgnoreCase(fileName)) {
                files.remove(i);
            }
        }
    }
}
