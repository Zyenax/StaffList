package net.stafflist.main;

import java.util.Arrays;
import java.util.List;

import net.stafflist.main.handlers.PlayerJoin;
import net.stafflist.main.utils.Utils;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class StaffList extends JavaPlugin implements Listener{
	
	ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
	
	public void onEnable(){
		loadListeners();
		createConfig();
		console.sendMessage(Utils.color("&a&lENABLED"));
		console.sendMessage(Utils.color("&a&lENABLED"));
		console.sendMessage(Utils.color("&a&lENABLED"));
	}
	
	public void loadListeners(){
		PluginManager manager = Bukkit.getPluginManager();
		manager.registerEvents(new Utils(this), this);
		manager.registerEvents(new PlayerJoin(this), this);
	}
	
	public void createConfig(){
		List<String> owner = Arrays.asList("x_Anthony", "Chelsea");
		List<String> manager = Arrays.asList("x_Anthony", "Chelsea");
		List<String> developer = Arrays.asList("x_Anthony", "Chelsea");
		List<String> admin = Arrays.asList("x_Anthony", "Chelsea");
		List<String> mod = Arrays.asList("x_Anthony", "Chelsea");
		List<String> helper = Arrays.asList("x_Anthony", "Chelsea");
		saveConfig();
		if (!getConfig().contains("Owner")) {
			getConfig().set("Owner", owner);
        }
		if (!getConfig().contains("Manager")) {
			getConfig().set("Manager", manager);
        }
		if (!getConfig().contains("Developer")) {
			getConfig().set("Developer", developer);
        }
		if (!getConfig().contains("Admin")) {
			getConfig().set("Admin", admin);
        }
		if (!getConfig().contains("Mod")) {
			getConfig().set("Mod", mod);
        }
		if (!getConfig().contains("Helper")) {
			getConfig().set("Helper", helper);
        }
		saveConfig();
	}

}
