package com.javadoc;

/**
 * @author Клим.
 * @version 1.0.
 * @since 0.9.
 * Главный класс. Здесь я буду писать <strong>код</strong>.
 * <img src="docfiles/bird.jpeg" alt="bird"/>
 */
public class Main {
    /**
     * Значения поля.
     */
    public int Field;

    /**
     * Начальная точка выполнения программы.
     * @param args значения командной строки.
     */
    public static void Main(String[] args){

    }

    /**
     * Метод возвращения значения поля.
     * @param i значения поля.
     * @param s значение второго поля.
     * @throws RuntimeException если что-то пошло не так, то выбрасывается это исключение.
     * @return возвращается значения поля.
     */
    public int getField(int i, String s) throws RuntimeException{
        return i;
    }

    /**
     * @deprecated пожалуйста используйте newMethod().
     */
    public void oldMethod(){

    }

    /**
     * Это описание с ссылками {@link OtherClass#otherMethod()}
     * @see OtherClass#otherMethod()
     * @see "глава 2"
     */
    public void newMethod(){

    }
}
