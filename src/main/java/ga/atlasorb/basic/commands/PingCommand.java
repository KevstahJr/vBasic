package ga.atlasorb.basic.commands;

import ga.atlasorb.basic.Basic;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.lang.reflect.InvocationTargetException;

public class PingCommand implements CommandExecutor {
    public PingCommand(final Basic basic) {
    }

    public boolean onCommand(final CommandSender commandSender, final Command command, final String s, final String[] strings) {
        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage("your not a player tf");
            return false;
        }
        final Player player = (Player)commandSender;
        final String replaced = PlaceholderAPI.setPlaceholders(player, "%vault_prefix_color%");
        player.sendMessage(
                ChatColor.translateAlternateColorCodes('&', "&f" + replaced + player.getDisplayName() + "&e's Ping: &a" + this.pingPlayer(player)+ "ms"));
        return false;
    }

    public int pingPlayer(Player who) {
        try {
            String e = Bukkit.getServer().getClass().getPackage().getName().substring(23);
            Class craftPlayer = Class.forName("org.bukkit.craftbukkit." + e + ".entity.CraftPlayer");
            Object handle = craftPlayer.getMethod("getHandle", new Class[0]).invoke(who, new Object[0]);
            Integer ping = (Integer)handle.getClass().getDeclaredField("ping").get(handle);
            return ping.intValue();
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException | NoSuchFieldException | ClassNotFoundException var6) {
            return -1;
        }
    }
}

