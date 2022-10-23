package com.dudev.collections.part1.homework.task2;


import java.util.List;

import static com.dudev.collections.part1.homework.task2.ChatUtil.filterUsersAboveEighteen;
import static com.dudev.collections.part1.homework.task2.ChatUtil.getMeanAge;

public class ChatDemo {
    public static void main(String[] args) {
        User cracker = new User(1, "Cracker", 23);
        User eater = new User(2, "Eater", 43);
        User petr = new User(6, "Petr", 14);
        User ivan = new User(3, "Ivan", 24);
        User mary = new User(5, "Mary", 17);

        Chat work = new Chat("work", List.of(petr, eater, cracker));
        Chat home = new Chat("home", List.of(petr, ivan, mary));
        Chat friends = new Chat("friends", List.of(cracker, eater, petr, ivan, mary));

        List<Chat> chats = List.of(work, home, friends);
        List<User> users = ChatUtil.convertToUserList(chats);
        System.out.println(filterUsersAboveEighteen(users));
        System.out.println(getMeanAge(filterUsersAboveEighteen(users)));
    }

}
