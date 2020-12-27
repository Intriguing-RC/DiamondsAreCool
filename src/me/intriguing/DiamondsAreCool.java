package me.intriguing;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class DiamondsAreCool extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("getdiamond").setExecutor(
                (sender, cmd, label, arguments) -> {
                    if (!(sender instanceof Player)) return false;
                    Player playerSender = (Player) sender;

                    playerSender.getInventory().addItem(new ItemStack(Material.DIAMOND));
                    playerSender.sendMessage("You have been given a diamond!");
                    return true;
                }
        );
    }


}
