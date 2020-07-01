package at.helpch.hccce

import at.helpch.hccce.events.RespawnEvent
import org.bukkit.plugin.java.JavaPlugin

class HCCCE : JavaPlugin() {

    override fun onEnable() {
        firstTime()
        // TODO: Register command, would have done but I would have gone over character limit with CommandExecutor implementation
        //zod - start
        server.pluginManager.registerEvents(RespawnEvent(),this)
        //zod - end
    }


}
