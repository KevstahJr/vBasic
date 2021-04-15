package ga.atlasorb.basic.listeners;

import ga.atlasorb.basic.Basic;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public abstract class BootstrappedCommand extends BootStrapped implements CommandExecutor {

    public BootstrappedCommand(Basic basic) {
        super(basic);
    }

    /**
     * Executes the given command, returning its success
     *
     * @param sender  Source of the command
     * @param command Command which was executed
     * @param label   Alias of the command which was used
     * @param args    Passed command arguments
     * @return true if a valid command, otherwise false
     */
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("This dumbo didnt set it up.");
        return true;
    }
}
