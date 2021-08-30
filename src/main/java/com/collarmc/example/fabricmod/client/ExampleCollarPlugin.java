package com.collarmc.example.fabricmod.client;

import com.collarmc.api.CollarPlugin;
import com.collarmc.api.CollarPluginLoadedEvent;
import com.collarmc.client.Collar;
import com.collarmc.client.api.messaging.events.PrivateMessageReceivedEvent;
import com.collarmc.pounce.EventBus;
import com.collarmc.pounce.Preference;
import com.collarmc.pounce.Subscribe;

/**
 * Add to entry points in collar.mod.json
 *     "collar": [
 *       "com.collarmc.example.fabricmod.client.ExampleCollarPlugin"
 *     ]
 */
public class ExampleCollarPlugin implements CollarPlugin {

    EventBus eventBus;

    @Override
    public void onLoad(CollarPluginLoadedEvent event) {
        eventBus = event.eventBus;
    }

    @Override
    public void onConnecting(Collar collar) {
        // Connecting
    }

    @Override
    public void onConnected(Collar collar) {
        // Connected
    }

    @Override
    public void onDisconnected(Collar collar) {
        // Disconnected
    }

    /**
     * Example that listens to {@link PrivateMessageReceivedEvent}
     * Use {@link Preference} to decide what thread your event runs on
     * @param e event
     */
    @Subscribe(Preference.CALLER)
    public void onMessageReceived(PrivateMessageReceivedEvent e) {
        System.out.println("Message received");
    }
}
