package ga.atlasorb.basic.commands;

import ga.atlasorb.basic.Basic;
import ga.atlasorb.basic.listeners.BootstrappedCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ListCommand extends BootstrappedCommand {

    public ListCommand(Basic basic) {
        super(basic);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length >= 0) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4&oOwner&f, &bDeveloper&f, &c&oPlatform Admin&f, &cAdmin&f, &5&oMod+&f, &5Mod&f, &3&oTrial Mod&f, &3Host&f, &d&oPartner&f, &dFamous&f, &cYouTuber&f, &9Master&f, &eSupreme&f, &aPrime&f, &2Basic&f, &7Member"));
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&f(" + Bukkit.getOnlinePlayers().size() + "/100) []"));
            return true;
        }
        return true;
    }
}

