package me.nexobyte.BungeeSystem.main;


import java.util.logging.LogManager;

/**
 * Created by NexoByte on 15.07.2017.
 */
public class NetworkAPI {

   public static NetworkAPI instance;

   private String prefix;

   private String groupPrefix;

   private String friendPrefix;

   private String messagePrefix;

   private String gefundenPrefix;

   private String informationPrefix;

   public final void init() {
       NetworkAPI.instance = this;
       this.prefix = "§eSystem §8| ";
       this.groupPrefix = "§bGruppen §8| ";
       this.friendPrefix = "§aFreunde §8| ";
       this.messagePrefix = "§6MSG §8| ";
       this.gefundenPrefix = getPrefix() + "§7Dieser Befehl wurde nicht gefunden...";
       this.informationPrefix = "§3INFO §8| ";
   }

    public static NetworkAPI getInstance() {
        return instance;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getGroupPrefix() {
        return groupPrefix;
    }

    public String getFriendPrefix() {
        return friendPrefix;
    }

    public String getMessagePrefix() {
        return messagePrefix;
    }

    public String getGefundenPrefix() {
        return gefundenPrefix;
    }

    public String getInformationPrefix() {
        return informationPrefix;
    }
}