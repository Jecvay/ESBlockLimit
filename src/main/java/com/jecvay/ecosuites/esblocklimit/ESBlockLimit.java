package com.jecvay.ecosuites.esblocklimit;

import com.google.inject.Inject;
import javafx.scene.shape.Path;
import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import ninja.leaping.configurate.loader.ConfigurationLoader;
import org.slf4j.Logger;
import org.spongepowered.api.config.ConfigDir;
import org.spongepowered.api.config.DefaultConfig;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
        id = "esblocklimit",
        name = "EsBlockLimit",
        authors = {
                "Jecvay"
        }
)
public class ESBlockLimit {

    @Inject
    private Logger logger;

    @Inject
    @DefaultConfig(sharedRoot = false)
    private Path defaultConfig;

    @Inject
    @DefaultConfig(sharedRoot = false)
    private ConfigurationLoader<CommentedConfigurationNode> configManager;

    @Inject
    @ConfigDir(sharedRoot = false)
    private Path privateConfigDir;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
    }
}
