package Module2_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list {
    private List<Integer> list = new ArrayList<>();
    public list(int size) {
        for (int i = 0; i < size; i++){
            list.add((int)( Math.random()*1000));}
            System.out.println(list);
    }

    void add(int number){
        for (int i = 0; i<list.size(); i++){
            list.set(i,list.get(i)+number);}
            list.add(number);
        System.out.println(list);
        }

    void removebyindex (int index){
        int value;
        if (index>list.size())
        { System.out.println("Index error");}
        else {value=list.remove(index);
            for (int i = 0; i <list.size(); i++) {
                list.set(i, list.get(i) - value);
            }}
        System.out.println(list);
    }
    void removebyvalue(int value){
        Iterator<Integer> iterator=list.iterator();
        int num=-1;
        while (iterator.hasNext()){
            if (iterator.next()==value){
                num=value;
                iterator.remove();}
        }if (num==-1){System.out.println("Value not found");}
        System.out.println(list);
    }

    void getbyindex(int index){
        if (index>list.size())
        { System.out.println("Index error");}
        else {System.out.println(list.get(index));}
    }
    void getbyvalue(int value){
        int num=-1;
        for (int i:list) {
            if(i==value){
                System.out.println("Value index = "+list.indexOf(i)+"");
                num=i;}
        }
        if (num==-1){System.out.println("Value not found");}
    }

    int maxvalue(){
        list.sort(Integer::compareTo);
        return list.get(list.size()-1);}

    int minvalue(){
        list.sort(Integer::compareTo);
        return list.get(0);
    }

    int mediumarithmetic (){
        int medium=0;
        for (int i:list){
            medium+=i;
        }return medium/list.size();
    }
}

