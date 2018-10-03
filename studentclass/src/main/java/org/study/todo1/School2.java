package org.study.todo1;

import java.util.*;

public class School2 {

     private static School2 userdao = new School2();
    
     private ArrayList<Student> userLists = new ArrayList<Student>();
    
     private School2() {
     }
    
     //객체 생성 제한 -> static 메소드 사용 
     public static School2 getInstance() {
          return userdao;
     }
    
     //자료 저장용 메소드
     public void add(Student user) {
          this.userLists.add(user);
     }
    
     //자료 갯수 확인용 메소드
     public int count() {
          return this.userLists.size();
     }

     //자료 전체 출력용 메소드
     public ArrayList<Student> lists() {
          return this.userLists;
     }
    
     //자료 검색용 메소드 -> ID 기준
     public Student searchID(int id) {
         
          Student user = null;
          Student temp = new Student();
          temp.setId(id);
         
          for (int idx = 0; idx<this.userLists.size(); idx++) {
              
               if (this.compareToId(temp, this.userLists.get(idx))) {
                    user = this.userLists.get(idx);
               }
          }
         
          return user;
     }
    
     public ArrayList<Student> searchName(String name) {
         
  
          ArrayList<Student> result = new ArrayList<>();
         
    
         
         
          Student temp = new Student();
          temp.setName(name);

          for (int idx=0; idx<this.userLists.size(); idx++) {
             
               if (this.compareToName(temp, this.userLists.get(idx))) {
                   
                    result.add(this.userLists.get(idx));
               }
          }
         
          return result;
     }

   
     private boolean compareToId(Student o1, Student o2) {
        
    
          return false;
     }

    
     private boolean compareToName(Student o1, Student o2) {
          return o1.getName().toLowerCase().equals(o2.getName().toLowerCase());
     }
    
}

