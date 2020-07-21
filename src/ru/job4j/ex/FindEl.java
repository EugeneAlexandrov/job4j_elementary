package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        //int rsl = -1;
        /* for-each */
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                return i;
            }
        }
        throw new ElementNotFoundException("Array hasn't got such key.");
    }

    public static void main(String[] args) {
        FindEl find = new FindEl();
        try {
            System.out.println(indexOf(new String[]{"qwer", "asdf", "zxcv", "123"}, "asdf"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
