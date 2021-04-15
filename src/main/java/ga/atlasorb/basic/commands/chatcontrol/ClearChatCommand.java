package ga.atlasorb.basic.commands.chatcontrol;

import ga.atlasorb.basic.Basic;
import ga.atlasorb.basic.listeners.BootstrappedCommand;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ClearChatCommand extends BootstrappedCommand {
    public ClearChatCommand(Basic basic) {
        super(basic);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("vbasic.clearchat")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNo Permission."));
            return true;

        }
        Player player = (Player) sender;
        for (int x = 0; x < 150; x++) {
            Bukkit.broadcastMessage("");
        }
        String rankcolor = PlaceholderAPI.setPlaceholders(player, "%vault_prefix_color%");
        Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&dChat has been cleared by " + rankcolor + player.getDisplayName()));
        return true;
    }
}
