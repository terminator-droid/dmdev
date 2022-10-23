package com.dudev.collections.part1.homework.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public final class ChatUtil {

    private ChatUtil() {
    }

    public static double getMeanAge(List<User> users) {
        ListIterator<User> userListIterator = users.listIterator();
        int sumAge = 0;
        while (userListIterator.hasNext()) {
            User nextUser = userListIterator.next();
            sumAge += nextUser.getAge();
        }
        return  sumAge /  users.size();
    }

    public static List<User> convertToUserList(List<Chat> chats) {
        ListIterator<Chat> chatListIterator = chats.listIterator();
        List<User> users = new ArrayList<>();
        while (chatListIterator.hasNext()) {
            Chat nextChat = chatListIterator.next();
            List<User> currentChatUsers = nextChat.getUsers();
            if (!currentChatUsers.isEmpty()) {
                users = mergeLists(currentChatUsers, users);
            }
        }
        return users;
    }

    private static List<User> mergeLists(List<User> source, List<User> destination) {
        ListIterator<User> userListIterator = source.listIterator();
        List<User> mergedList = destination;
        while (userListIterator.hasNext()) {
            User nextUser = userListIterator.next();
            if (!destination.contains(nextUser)) {
                mergedList.add(nextUser);
            }
        }
        return mergedList;
    }

    public static List<User> filterUsersAboveEighteen(List<User> users) {
        ListIterator<User> userListIterator = users.listIterator();
        List<User> usersAboveEighteen = new ArrayList<>();
        while (userListIterator.hasNext()) {
            User nextUser = userListIterator.next();
            if (nextUser.getAge() > 18) {
                usersAboveEighteen.add(nextUser);
            }
        }
        return usersAboveEighteen;
    }
}
