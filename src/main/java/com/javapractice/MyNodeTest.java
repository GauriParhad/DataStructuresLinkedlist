
package com.javapractice;
        import org.junit.Test;
        import org.junit.Assert;
@Tets
public class MyLinkedList {
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNODE<>(56);
        MyNode<Integer> mySecondNode = new MyNODE<>(30);
        MyNode<Integer> myThirdNode = new MyNODE<>(70);
        MyLinkedList myLinkedaList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myFirstNode);

        Assert.assertTrue(result);
    }
}
