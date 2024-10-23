[09:42:09] [ServerMain/ERROR]: [DirectoryProviderSource] Error loading plugin: Could not load plugin 'Lobbysystem v2.0.0-FOLIA' as it is not marked as supporting Folia!
java.lang.RuntimeException: Could not load plugin 'Lobbysystem v2.0.0-FOLIA' as it is not marked as supporting Folia!
	at io.papermc.paper.plugin.provider.type.spigot.SpigotPluginProviderFactory.build(SpigotPluginProviderFactory.java:40) ~[folia-1.20.6.jar:1.20.6-6-9a19e42]
	at io.papermc.paper.plugin.provider.type.spigot.SpigotPluginProviderFactory.build(SpigotPluginProviderFactory.java:28) ~[folia-1.20.6.jar:1.20.6-6-9a19e42]
	at io.papermc.paper.plugin.provider.type.PluginFileType.register(PluginFileType.java:72) ~[folia-1.20.6.jar:1.20.6-6-9a19e42]
	at io.papermc.paper.plugin.provider.source.FileProviderSource.registerProviders(FileProviderSource.java:85) ~[folia-1.20.6.jar:1.20.6-6-9a19e42]
	at io.papermc.paper.plugin.provider.source.DirectoryProviderSource.registerProviders(DirectoryProviderSource.java:52) ~[folia-1.20.6.jar:1.20.6-6-9a19e42]
	at io.papermc.paper.plugin.provider.source.DirectoryProviderSource.registerProviders(DirectoryProviderSource.java:17) ~[folia-1.20.6.jar:1.20.6-6-9a19e42]
	at io.papermc.paper.plugin.util.EntrypointUtil.registerProvidersFromSource(EntrypointUtil.java:15) ~[folia-1.20.6.jar:1.20.6-6-9a19e42]
	at io.papermc.paper.plugin.PluginInitializerManager.load(PluginInitializerManager.java:109) ~[folia-1.20.6.jar:1.20.6-6-9a19e42]
	at net.minecraft.server.Main.main(Main.java:122) ~[folia-1.20.6.jar:1.20.6-6-9a19e42]
	at org.bukkit.craftbukkit.Main.main(Main.java:328) ~[folia-1.20.6.jar:1.20.6-6-9a19e42]
	at io.papermc.paperclip.Paperclip.lambda$main$0(Paperclip.java:42
