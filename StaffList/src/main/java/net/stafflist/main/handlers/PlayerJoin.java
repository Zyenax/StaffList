package net.stafflist.main.handlers;

import java.util.List;

import net.stafflist.main.StaffList;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener{
	
	private static StaffList plugin;

	public PlayerJoin(StaffList hub) {
		PlayerJoin.plugin = hub;
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event){
		List<String> owner = plugin.getConfig().getStringList("Owner");
		List<String> manager = plugin.getConfig().getStringList("Manager");
		List<String> developer = plugin.getConfig().getStringList("Developer");
		List<String> admin = plugin.getConfig().getStringList("Admin");
		List<String> mod = plugin.getConfig().getStringList("Mod");
		List<String> helper = plugin.getConfig().getStringList("Helper");
		
		
		event.getPlayer().sendMessage("OWNERS: " + owner.toString());
		event.getPlayer().sendMessage("MANAGERS: " + manager.toString());
		event.getPlayer().sendMessage("DEVELOPERS: " + developer.toString());
		event.getPlayer().sendMessage("ADMINS: " + admin.toString());
		event.getPlayer().sendMessage("MODS: " + mod.toString());
		event.getPlayer().sendMessage("HELPERS: " + helper.toString());
	}
}
