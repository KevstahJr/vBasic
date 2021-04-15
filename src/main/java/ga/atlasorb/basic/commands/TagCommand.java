package ga.atlasorb.basic.commands;

import ga.atlasorb.basic.Basic;
import ga.atlasorb.basic.listeners.BootstrappedCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class TagCommand extends BootstrappedCommand {
    public TagCommand(Basic basic) {
        super(basic);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        Inventory gui = Bukkit.createInventory(player, 9, ChatColor.translateAlternateColorCodes('&', "&e&lChoose a Prefix &c1/1"));
        player.openInventory(gui);
        return true;
    }
}
