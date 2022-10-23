package com.dudev.collections.part1.homework.task1;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public final class ChatUtil {

    private ChatUtil() {
    }

    public static void deleteChatWithThousandPeople(List<Chat> chats) {
        ListIterator<Chat> chatListIterator = chats.listIterator();
        while (chatListIterator.hasNext()) {
            Chat nextChat = chatListIterator.next();
            if (nextChat.getUserNumber() > 1000) {
                chatListIterator.remove();
            }
        }
    }
    public static class ChatComparator implements Comparator<Chat> {

        @Override
        public int compare(Chat o1, Chat o2) {
            if (o1.getUserNumber() == o2.getUserNumber()) {
                return o1.getName().compareTo(o2.getName());
            } else {
                return Integer.compare(o1.getUserNumber(), o2.getUserNumber()) * -1;
            }
        }
    }
}
