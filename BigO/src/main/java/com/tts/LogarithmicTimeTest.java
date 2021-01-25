package com.tts;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LogarithmicTimeTest extends TestBase {

    @Parameterized.Parameters
    public static Collection input() {
        return TestBase.TEST_SIZE_PARAMETER;
    }

    private int[] integerArray;

    private int searchingItem;

    private LogarithmicTime testClass = new LogarithmicTime();

    public LogarithmicTimeTest(long nSize) {
        super();
        this.nSize = nSize;
    }

    @Before
    public void setup() {
        integerArray = setArray(this.nSize);
        Arrays.sort(integerArray);

        int intSearchItemPo = randam.nextInt((int) this.nSize);
        searchingItem = integerArray[intSearchItemPo];
        this.filename = FileNameConstants.LOG_TIME;
        super.setup();
    }

    @Test
    public void binarySearchItem() {
        int foundKey = testClass.binarySearchItem(integerArray, searchingItem);
        System.out.printf("Searching %d in array[%d], found at position %d\n", searchingItem, integerArray.length,
                foundKey);
    }

}