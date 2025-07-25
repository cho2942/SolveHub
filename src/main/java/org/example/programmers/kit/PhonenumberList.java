package org.example.programmers.kit;

public class PhonenumberList {
    public boolean solution(String[] phone_book) {
        if(phone_book.length == 1){
            return false;
        }

        for(int i=0;i<phone_book.length;i++){
            String check = phone_book[i];
            for(int j=0;j<phone_book.length;j++){
                if(i!=j&&phone_book[j].indexOf(check)==0){
                    return false;
                }
            }
        }
        return true;
    }
}
