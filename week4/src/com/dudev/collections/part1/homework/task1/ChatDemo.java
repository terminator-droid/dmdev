package com.dudev.collections.part1.homework.task1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ChatDemo {
    public static void main(String[] args) {

        Chat work = new Chat("work", 1001);
        Chat home = new Chat("home", 10);
        Chat friends = new Chat("friends", 32);

        List<Chat> chats =new LinkedList<>(List.of(work, home, friends));
        ChatUtil.deleteChatWithThousandPeople(chats);
        System.out.println(chats);
        Collections.sort(chats, new ChatUtil.ChatComparator());
        System.out.println(chats);
    }

}
