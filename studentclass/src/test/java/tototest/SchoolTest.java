package tototest;

import java.util.*;

import org.study.todo1.Student;
import org.study.todo1.School2;

public class SchoolTest {
    
     private School2 userdao;
    
     public SchoolTest() {
          userdao = School2.getInstance();
         
         
          this.userdao.add(new Student());    
         
     }
    
     public void menu1(Scanner sc) {
        
          System.out.print("ID:");
          int id = sc.nextInt();
          System.out.print("NAME:");
          String name = sc.next();
         
          Student user = new Student();
      
          user.setId(id);
          user.setName(name);
 
          this.userdao.add(user);    
         
          System.out.println("회원 자료 입력이 완료");
     }

     public void menu2() {

          
          System.out.printf("%-6s %-15s %-15s %-15s %n","[ID]","[NAME]");
          for (Student user : userdao.lists()) {
               System.out.println(user);
          }
         
     }

     public void menu3(Scanner sc) {
          
         
          System.out.println("1.ID 검색");
          System.out.println("2.NAME 검색");
         
          System.out.printf("선택(1~2, 0 종료)?");
          int submenu = sc.nextInt();
          if (submenu == 0) {
               return;
          }
          switch (submenu) {
          case 1: this.searchId(sc); break;
          case 2: this.searchName(sc);  break;
          default: break;
          }

     
         
     }

     public void menu4(Scanner sc) {
         
     }
    
  
     private void searchId(Scanner sc) {
          System.out.print("검색할 ID?");
          int id = sc.nextInt();

          Student user = this.userdao.searchID(id);

          if (user != null) {
               System.out.printf("%-6s %-15s %-15s %-15s %n","[ID]","[NAME]");
               System.out.println(user);
          } else {
               System.out.println("검색 결과가 없습니다.");
          }
         
     }
    
   
     private void searchName(Scanner sc) {
          System.out.print("검색할 NAME");
          String name = sc.next();
 
          ArrayList<Student> lists = this.userdao.searchName(name);
         
  
          if (lists.size() > 0) {
               System.out.printf("%-6s %-15s %-15s %-15s %n","[ID]","[NAME]");
               for (Student user : lists) {
                    System.out.println(user);
               }
          } else {
               System.out.println("검색 결과가 없습니다");
          }
         
     }
    
}




