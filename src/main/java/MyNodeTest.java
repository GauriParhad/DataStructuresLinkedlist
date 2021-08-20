package com.javapractice;
import org.junit.Test;
import org.junit.Assert;

public class myLinkedList {
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop(){
        MyNode<Integer>myFirstNode=new MyNODE<>(30);
        MyNode<Integer>mySecondNode=new MyNODE<>(70);
        MyNode<Integer>myThirdNode=new MyNODE<>(56);
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);

        boolean result=myLinkedList.head.equals(MyThirdNode) && myLinkedList.head.getNext().equals(MySecondNode) &&
                myLinkedList.head.equals(MyfirstNode);
        Assert.assertTrue(result);

    }
}
