package com.jecvay.ecosuites.esblocklimit;

import javafx.scene.shape.Path;
import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import ninja.leaping.configurate.loader.ConfigurationLoader;
import org.slf4j.Logger;

import java.io.IOException;
import java.nio.file.Files;

public class MainConfig {
    final private String mainConfName = "config.conf";

    private ConfigurationLoader<CommentedConfigurationNode> configLoader;
    private ESBlockLimit esl;
    private Logger logger;
    private CommentedConfigurationNode node = null;

    MainConfig(ESBlockLimit esl, Path configDir) {
        Path path = configDir.resolve(mainConfName);
        this.esl = esl;
        try {
            if (!Files.exists(path)) {
                esl.getContainer().getAsset(mainConfName).get().copyToFile(path);
            } else {
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
