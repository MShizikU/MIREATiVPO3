package code.tdd;

import code.Equipment;

/*Отработка результатов ввода
 1. Стирание выбранной буквы из массива алфавита;
 2. Проверка на наличие буквы в массиве слова;
 3. Добавление буквы в пользовательский массив
 */
public class PerformUserInput {

    public static Boolean isLetterInWord(Equipment equipment, Character userInput){
        for (int i = 0; i < equipment.hiddenWord.size(); i++){
            if (equipment.hiddenWord.get(i).equals(userInput)){
                return true;
            }
        }
        return false;
    }

    public static Equipment removeLetterFromAlphabet(Equipment equipment, Character userInput){
        return null;
    }

    public static Equipment updateUserWord(Equipment equipment, Character userInput){
        return null;
    }

}
