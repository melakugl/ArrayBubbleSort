/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrray.bubble.sort;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Melaku
 */
public class Driver {

    public static void main(String[] args) {
        String delimiter = ",";
        int[] iArray = Arrays.stream(JOptionPane.showInputDialog("Please Enter Integers separated by comma").split(delimiter))
                .mapToInt(Integer::parseInt)
                .toArray();
        Integer[] iArrayObject = Arrays.stream(iArray).boxed().toArray(Integer[]::new);
        ArrayBubbleSort abs = new ArrayBubbleSort(iArrayObject);
        LinkedList<Integer> iList = abs.bubbleSort();
        StringBuilder strbul = new StringBuilder();
        Iterator i = iList.iterator();
        for (; i.hasNext();) {
            strbul.append(((Integer) i.next()).toString());
            strbul.append(",");
        }
        JOptionPane.showMessageDialog(null, "Sorted in ascending order " + strbul.toString());
    }
}
