package com.example;

public class MyLibraryTest {
    @Test
    public void testGetMessage() {
        MyLibrary myLibrary = new MyLibrary();
        assertEquals("Welcome to My Library!", myLibrary.getMessage());
            }
        
            private void assertEquals(String string, String message) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
            }
}
