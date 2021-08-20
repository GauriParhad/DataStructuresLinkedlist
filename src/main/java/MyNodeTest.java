package com.javapractice;
import org.junit.Test;
import org.junit.Assert;

public class myLinkedList {
    @Test
    public void given3NumbersWhenLinkedShouldPassedLinkedListTest(){
        MyNode<Integer>myFirstNode=new MyNODE<>(key:70);
        MyNode<Integer>mySecondNode=new MyNODE<>(key:30);
        MyNode<Integer>myThirdNode=new MyNODE<>(key:56);
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);

        boolean result=myLinkedList.head.equals(MyThirdNode) && myLinkedList.head.getNext().equals(MySecondNode) &&
                myLinkedList.head.equals(MyfirstNode);

        Assert.assertTrue(result);

    }
}
