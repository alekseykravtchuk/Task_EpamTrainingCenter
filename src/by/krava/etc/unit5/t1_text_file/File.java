package by.krava.etc.unit5.t1_text_file;

abstract class File {
    private Directory directory;
    private String fileName;

    File(Directory directory, String fileName) {
        this.directory = directory;
        this.fileName = fileName;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    abstract public void changeName(String fileName);

    @Override
    public String toString() {
        return "File{" +
                "fileName='" + fileName + '\'' +
                '}';
    }
}
