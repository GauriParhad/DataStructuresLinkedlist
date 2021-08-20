
package com.javapractice;
import org.junit.Test;
import org.junit.Assert;

@Test
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
@Test
public class myLinkedList {
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNODE<>(56);
        MyNode<Integer> mySecondNode = new MyNODE<>(30);
        MyNode<Integer> myThirdNode = new MyNODE<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        myLinkedList.pop();
        boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }
}
@Test
public class myLinkedList {
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNODE<>(56);
        MyNode<Integer> mySecondNode = new MyNODE<>(30);
        MyNode<Integer> myThirdNode = new MyNODE<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        myLinkedList.pop();
        myLinkedList.poplast();
        boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }
}
@Test
//NSTERING 40 IN BETWEEN 56,30,70*/
public class myLinkedList {
    public void given3NumbersWhenlinkShouldPassedToLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNODE<>(56);
        MyNode<Integer> mySecondNode = new MyNODE<>(30);
        MyNode<Integer> myThirdNode = new MyNODE<>(40);
        MyNode<Integer> myFourthNode =new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        myThirdNode.setNext(myFourthNode);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(mySecondNode);
        myLinkedList.append(myFourthNode);
        myLinkedList.insert(myThirdNode,mySecondNode);
        boolean result=myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);

        Assert.assertTrue(result);
    }
}
