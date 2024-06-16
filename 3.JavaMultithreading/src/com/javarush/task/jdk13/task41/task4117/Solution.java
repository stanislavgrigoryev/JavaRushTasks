package com.javarush.task.jdk13.task41.task4117;

/* 
Приветики в этом чате
*/

public class Solution {
    public static void main(String[] args) {
        Mediator db = new Chat(new UserDB());
        User user1 = new User(db,1, "Леша");
        User user2 = new User(db,2, "Боря");
        User user3 = new User(db,3, "Чингиз");
        User user4 = new User(db,4, "David");

        db.register(user1);
        db.register(user2);
        db.register(user3);
        db.register(user4);

        user1.send("Добрый день, Борис Алексеевич", 2);
        user2.send("Приветствую! Алексей Борисович", 1);
    }
}
