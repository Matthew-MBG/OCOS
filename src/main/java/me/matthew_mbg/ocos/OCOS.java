package me.matthew_mbg.ocos.ocos;

import net.labymod.api.LabyModAddon;
import net.labymod.api.event.events.network.server.DisconnectServerEvent;
import net.labymod.api.event.events.network.server.LoginServerEvent;
import net.labymod.gui.elements.DropDownMenu;
import net.labymod.settings.elements.BooleanElement;
import net.labymod.settings.elements.ControlElement;
import net.labymod.settings.elements.DropDownElement;
import net.labymod.settings.elements.NumberElement;
import net.labymod.settings.elements.SettingsElement;

import java.util.List;

public class OCOS {
	
	public String NAME =  "OCOS", VERSION = "1.0.0", NAMEVERSION = NAME + " " + VERSION, AUTHOR = "Matthew_MBG";


/**
 * OCOS
 */
public class OCOS
extends LabyModAddon {
	
    public static OCOS getInstance() {
      return instance;
    }

    /**
     * Called when the addon gets enabled
     */
    @Override
    public void onEnable() {
      instance = this;
      this.getApi().getEventService().registerListener((Object)this);
      System.out.println("Starting " + NAMEVERSION + " by " + AUTHOR + ".");

    }

    /**
     * Called when the addon gets disabled
     */
    @Override
    public void onDisable() {
      System.out.println("Shutting down " + NAME + ".");

    }

    /**
     * Called when this addon's config was loaded and is ready to use
     */
    @Override
    public void loadConfig() {
      System.out.println(NAME + "config loaded.");

    }

    /**
     * Called when the addon's ingame settings should be filled
     *
     * @param subSettings a list containing the addon's settings' elements
     */
    @Override
    protected void fillSettings( List<SettingsElement> subSettings ) {

    }

}
