interface MyInterface {
    int ix = 0; // static constant

    default void ff() {} // Method (can have body only with default)
    static void gg(){} // static Method
    void aff(); // abstract method
}
