package by.krava.etc.unit5.t1_text_file;

class TextFile extends File {

    private Text content;

    TextFile(Directory directory, String fileName) {
        super(directory, fileName);
        content = new Text("");
        super.getDirectory().addFile(this);
    }

    public void addText(String line) {
        content.addText(line);
    }

    public void printContent() {
        System.out.println(content.getText());
    }

    @Override
    public void changeName(String fileName) {
        this.setFileName(fileName);
    }
}
