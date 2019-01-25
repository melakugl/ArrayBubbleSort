/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrray.bubble.sort;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Melaku
 */
public class ArrayBubbleSort {
    private LinkedList<Integer> iArrayList;
    public ArrayBubbleSort() {
        iArrayList = null;
    }
    public ArrayBubbleSort(Integer[] iArray) {
        this();
        iArrayList = new LinkedList(Arrays.asList(iArray));
    }
    public LinkedList<Integer> bubbleSort() {
        Collections.sort(iArrayList);
        return iArrayList;
    }
}
