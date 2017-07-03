package net.stafflist.main.utils;

import net.stafflist.main.StaffList;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;

public class Utils implements Listener{
	
	@SuppressWarnings("unused")
	private static StaffList plugin;

	public Utils(StaffList hub) {
		Utils.plugin = hub;
	}

	public static String color(String string){
		return ChatColor.translateAlternateColorCodes('&', string);
	}
}
