package roadhog360.mymodid.mixinplugin;

import com.gtnewhorizon.gtnhmixins.IEarlyMixinLoader;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import org.spongepowered.asm.mixin.MixinEnvironment;
import roadhog360.mymodid.Tags;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyModIdEarlyMixins implements IFMLLoadingPlugin, IEarlyMixinLoader {

    public static final MixinEnvironment.Side SIDE = MixinEnvironment.getCurrentEnvironment().getSide();

    @Override
    public String getMixinConfig() {
        return "mixins." + Tags.MOD_ID + ".early.json";
    }

    @Override
    public List<String> getMixins(Set<String> loadedCoreMods) {
        //Load configs here
//        try {
//            ConfigBase.initializeConfigs();
//        } catch (Exception e) {
//            throw new RuntimeException("Configs failed to load!", e);
//        }

        List<String> mixins = new ArrayList<>();
//        mixins.add("sample1");
        if (SIDE == MixinEnvironment.Side.CLIENT) {
//            mixins.add("sample2");
        }
        return mixins;
    }

    @Override
    public String[] getASMTransformerClass() {
        return null;
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {

    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
