interface IPrinter {

    void print(String content);

    void scan(String content);

    void fax(String content);
}

class Printer implements IPrinter {

    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }
}

class BasicPrinter implements IPrinter {

    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }

    @Override
    public void scan(String content) {
        throw new UnsupportedOperationException();
    }
}

class Fax implements IPrinter{
    @Override
    public void fax(String content){
        System.out.println("efrgethy" + content);
    }
}


    // @Override
    // public void scan(String content) {
    //     System.out.println("Scanning: " + content);
    // }

    // @Override
    // public void fax(String content) {
    //     System.out.println("Faxing: " + content);
    // }

    //     @Override
    // public void fax(String content) {
    //     throw new UnsupportedOperationException();
    // }