
package com.day17;
import java.io.;
import java.util.;

public class MyMapNode<k,v>implemented INode<k>{
k key;
v value;
MyMapNode<k,V>next;

public MyMapNode(k key ,v value)
public k getkey() { return key;}
pbplic void setkey(k key) {this.key = key;}
public INode<k> getnext() {return next;}
public INode<k> getNext() {return next;}
   this.next = (MyMapNode<k,v>) next;
}
public V getvalue() {return this value;}

public void setvalue(v value) {this. value = value;}
@override
public string to string()
}
public class MyMapNode<k.v>{

MyLinkedList<k> mylinkedlist;
public MyMap() {
  this. MyLinkedList = new MyLinkedList;
}
public v get (k key) {

 MyMapNode<k,v> my mapnode = (MyMapNode<k,v>
 this .myLinkedList.search(key);
 return(myMapNode == null)
}
public void add (k key,v value) {

MyMapNode<k,v> my mapnode = (mymapnode<k,v>
this .myLinkedList.search(key);
  if(myMapNode = null){
  myMapNode= new MyMapNode<>(key.value);
  this.myLinkedList.append(mymapNode);
}else{

myMapNode.setvalue(value);
  }
}

@override
public string to string() {
return "MyMapNode{" + mylinkedlist +"}";}
}

public class MyLinkedhashMap<k,v> {
  private final int  numBuckets;
  ArrayList<MyLinkedList<k>> myBucketArray;

public MyLinkedHashmap() {
  this.numbuckets = 10;
  this.mybucktArray = new ArrayList<>(numbuckets);
for (int i = 0; i < numbuckets; i++);
  this.myBucketArray.add(null);
]
private int bucketIndex(k key)
{
  int hashcode = math.abs(key.hashcode());
  int index = hashcode % numbuckets;
  return index;
}
public v get (k key) {
  int index = this getBucketIndex(key);
  myLinkedList<k> myLinkedList = this.myBucketArray.get(index);
  if(myLinkedList == null)
  return null;
  myMapNode<k,v> myMapNode = (MyMapNode<k,v>) myLinkedList.search(key);
  return (myMapNode == null)
}

public void add(k key,v value) {
 int index = this getBucketIndex(key);
 myLinkedList<k> myLinkedList = this.myBucketArray.get(index);
 if(myLinkedList == null) {
 my LinkedList = newLinkedListM<>();
 this myBucketArray.set(index,myLinkedList);
}
 myMapNode<k,v> myMapNode = (MyMapNode<k,v>) myLinkedList.search(key);
  return (myMapNode == null)
  mymAPnODE = newMapNode<>(key,value);
  myLinkedList .append(myMapNode);
}
else{
 myMapNode.setValue(value);
 }
}
 @override
public string tostring() {
  return "MyLinkedHashMap List{" + myBucketArray +"};
 }
}
 


 


 
 