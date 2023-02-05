package com.timbuchalka2;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        }else{
            languages.put("Java","A compiled high level, object-oriented, platform independant language");
            System.out.println("Java added successfully");
        }
        languages.put("Python","An interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol","An algorithmic language");
        languages.put("BASIC","Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp","Therein lies madness");

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        }else{
            System.out.println(languages.put("Java","this course is about Java"));

        }
//        languages.remove("Lisp");

        if(languages.remove("Algol","An algorithmic language")){
            System.out.println("Algol removed");
        }else{
            System.out.println("Algol  not removed, key/value pair not found");
        }

        if(languages.replace("Lisp","Therein lies madness","a functional programing language with imperative feature")){
            System.out.println("Lisp replaced");
        }else{
            System.out.println("Lisp was not replaced");
        }

        System.out.println(languages.replace("Scala","This will not be added"));
        System.out.println("===========================");
        for (String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
