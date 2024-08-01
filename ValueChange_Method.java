class ValueChange {

    int val() {
        return 1;
    }

    void use() {
        int a = val();
        int b = 10 / a;
    }
}
