class ValueChange {

    int val() {
        return 0;
    }

    void use() {
        int a = val();
        int b = 10 / a;
    }
}
