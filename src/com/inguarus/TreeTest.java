package com.inguarus;

public class TreeTest {

    public static void main(String[] args) {

        MyTreeMap<Integer, String> treeMap = new MyTreeMap<>();
        treeMap.put(15, "England");
        treeMap.put(12, "Poland");
        treeMap.put(18, "USA");
        treeMap.put(45, "Ukraine");
        treeMap.put(1, "Germany");
        treeMap.put(78, "Russia");
        treeMap.put(3, "Sweden");
        treeMap.put(80, "Italy");
        treeMap.put(27, "Brazil");
        treeMap.put(90, "Turkey");
        System.out.println("Contents of MyTreeMap collection: ");
        System.out.println(treeMap);
        System.out.println("Size of MyTreeMap collection: " + treeMap.size() + " elements");
        System.out.println(treeMap.containsKey(45));
        System.out.println(treeMap.containsValue("Russia"));
        System.out.println(treeMap.containsKey(100));
        System.out.println(treeMap.containsValue("GERMANY"));
        System.out.println(treeMap.get(90));
        System.out.println(treeMap.isEmpty());
        System.out.println("Contents of MyTreeMap collection before remove the element: ");
        System.out.println(treeMap);
        treeMap.remove(15);
        System.out.println("Contents of MyTreeMap collection after remove the element: ");
        System.out.println(treeMap);
    }
}

