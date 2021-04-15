package ga.atlasorb.basic.commands;

import ga.atlasorb.basic.Basic;
import ga.atlasorb.basic.listeners.BootstrappedCommand;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.Arrays;

public class VoteCommand extends BootstrappedCommand {
    public VoteCommand(Basic basic) {
        super(basic);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            Arrays.asList(
                    "",
                    "&7&nHere are the websites you can vote on to receive rewards!",
                    "",
                    "&6&l* &fhttps://minecraft-server-list.com/server/461021/vote/",
                    ""
            ).forEach(it -> sender.sendMessage(ChatColor.translateAlternateColorCodes('&', it)));
            return true;
        }
        return true;
    }
}
