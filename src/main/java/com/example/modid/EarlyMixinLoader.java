package com.example.modid;

import com.google.common.collect.ImmutableList;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import zone.rong.mixinbooter.IEarlyMixinLoader;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public class EarlyMixinLoader implements IFMLLoadingPlugin, IEarlyMixinLoader {
	@Override
	public List<String> getMixinConfigs() {
		return ImmutableList.of("mixins.modid.json");
	}

	// @formatter:off
	@Override public String getAccessTransformerClass() { return null; }
	@Override public String[] getASMTransformerClass() { return null; }
	@Override public void injectData(final Map<String, Object> data) {}
	@Nullable @Override public String getSetupClass() { return null; }
	@Override public String getModContainerClass() { return null; }
	// @formatter:on
}
