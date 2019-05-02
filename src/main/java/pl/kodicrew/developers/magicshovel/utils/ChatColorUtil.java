package pl.kodicrew.developers.magicshovel.utils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.stream.Collectors;

public class ChatColorUtil {

    private ChatColorUtil(){
    }

    public static String colored(String message){
        return ChatColor.translateAlternateColorCodes('&', message.replace(">>", "»").replace("<<", "«"));
    }

    public static boolean sendMessage(Player player, String message){
        player.sendMessage(colored(message));
        return true;
    }

    public static List<String> colored(List<String> message){
        return message

                .stream()
                .map(ChatColorUtil::colored)
                .collect(Collectors.toList());
    }
}
