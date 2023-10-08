package test.tdd;

import code.Equipment;
import code.tdd.PerformUserInput;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class PerformUserInputTest {

    Equipment basicEquipment;

    @BeforeEach
    void setUpEach() {
        basicEquipment = new Equipment();
        basicEquipment.alphabet = new ArrayList<>();
        basicEquipment.hiddenWord = new ArrayList<>();
        basicEquipment.userWord = new ArrayList<>();

        for (int i = 1072; i <= 1103; i++) basicEquipment.alphabet.add( (char) i );
    }

    void testIsLetterInWordMiddleTrue(){
        basicEquipment.hiddenWord.add('к');
        basicEquipment.hiddenWord.add('о');
        basicEquipment.hiddenWord.add('ш');
        basicEquipment.hiddenWord.add('к');
        basicEquipment.hiddenWord.add('а');

        Character userInput = 'а';

        Boolean isLetterInWord = PerformUserInput.isLetterInWord(basicEquipment, userInput);

        assertEquals(true, isLetterInWord);
    }

    void testIsLetterInWordFirstTrue(){
        basicEquipment.hiddenWord.add('м');
        basicEquipment.hiddenWord.add('ы');
        basicEquipment.hiddenWord.add('ш');
        basicEquipment.hiddenWord.add('к');
        basicEquipment.hiddenWord.add('а');

        Character userInput = 'м';

        Boolean isLetterInWord = PerformUserInput.isLetterInWord(basicEquipment, userInput);

        assertEquals(true, isLetterInWord);
    }

    void testIsLetterInWordLastTrue(){

        basicEquipment.hiddenWord.add('х');
        basicEquipment.hiddenWord.add('л');
        basicEquipment.hiddenWord.add('е');
        basicEquipment.hiddenWord.add('б');

        Character userInput = 'б';

        Boolean isLetterInWord = PerformUserInput.isLetterInWord(basicEquipment, userInput);

        assertEquals(true, isLetterInWord);
    }
}