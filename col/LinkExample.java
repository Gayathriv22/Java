package col;

import java.util.*;

public class LinkExample {
    public static void main(String[]args){
        List list =new LinkedList();

        boolean isAdded=list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(8);
        list.add(6);
        Object o=list.get(0);
        int firstElement=(int) o;
        System.out.println(firstElement);
        LinkExample ex=new LinkExample();
        ex.print(list);
        list.remove(1);
        Object object=3;
        list.add(0,1);
        ex.print(list);
        int size=list.size();
        System.out.println("size : "+size);
        boolean isEmpty=list.isEmpty();
        System.out.println("is empty is: " +isEmpty);
        boolean contains=list.contains(1);
        System.out.println("list contains is :"+contains);
        ex.sort(list);
        ex.print(list);

    }
      public void sort(List list){
        IntegerComparator comp=new IntegerComparator();
        list.sort(comp);
      }
    public void printByIterator(List list){
        Iterator iterator=list.iterator();
        while(iterator.hasNext())
        {
            Object o=iterator.next();
            int num=(int)o;
            System.out.println("element : "+num);
        }
    }
    public void print(List list){
        for(Object e:list){
            int num=(int)e;
            System.out.println(num);}
    }


        }
