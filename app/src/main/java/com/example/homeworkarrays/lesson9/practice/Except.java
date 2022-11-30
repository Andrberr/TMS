package com.example.homeworkarrays.lesson9.practice;

public class Except {

    public static boolean check(String str){
        boolean correct = true;
        if (str.length() >=20) correct = false;
        if (correct) {
            for (int i = 0; i < str.length(); i++) {
                char code = str.charAt(i);
                if (!((code >= 65 && code <= 90) || (code >= 97 && code <= 122) || (code >= 48 && code <= 57) || code == 95)) {
                    correct = false;
                    break;
                }
            }
        }
        return correct;
    }

    public static void test(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
       if (!check(login)) throw new WrongLoginException("Wrong login");
       if (!check(password) || !password.equals(confirmPassword)) throw new WrongPasswordException("Wrong password.");
    }

    public static void main(String[] args) {
          try{
              test("lll12;", "111_ll", "111_ll");
          }catch(WrongLoginException e1){
              System.out.println("Login Exception");
          } catch (WrongPasswordException e) {
              System.out.println("Password Exception");
          }
    }
}
