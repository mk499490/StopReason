package com.horizonbagel.stopreason;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by mk499490 on 2017/01/08.
 */
public class StopCommandWithReason implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!sender.hasPermission("bukkit.command.stop")) {
            sender.sendMessage("You don't have permissions!");
            return true;
        }
        if (sender.hasPermission("bukkit.command.stop")) {
            if (args.length == 0) {
                Bukkit.shutdown();
            }
            if (!(args.length == 0)) {
                String reason = args[0];
                for (Player players : Bukkit.getOnlinePlayers()) {
                    players.kickPlayer(reason);
                    Bukkit.shutdown();
                    return true;
                }
            }
        }
        return false;
    }
}
