package me.flexdevelopment.servermanager.modules.player.commands;

import me.flexdevelopment.servermanager.ServerManager;
import me.flexdevelopment.servermanager.api.enums.Commands;
import me.flexdevelopment.servermanager.modules.player.commands.base.CommandBase;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class ShowReportsCommand extends CommandBase {


    public ShowReportsCommand() {
        super("showreports", Commands.SHOWREPORTSCOMMAND.getPermission());
    }

    @Override
    public boolean executeCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player target = (Player) Bukkit.getOfflinePlayer(args[0]);

        Player player = (Player) sender;

        ServerManager.getInstance().getReportManager().showReportsFromPlayer(player, target);

        return false;
    }

    @Override
    public List<String> tabComplete(CommandSender sender, Command cmd, String label, String[] args) {
        return null;
    }
}
