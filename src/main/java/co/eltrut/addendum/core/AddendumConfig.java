package co.eltrut.addendum.core;

import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class AddendumConfig {

    public static final AddendumConfig CONFIG;
    public static final ModConfigSpec SPEC;

    public final ModConfigSpec.ConfigValue<Boolean> dragonCandles;

    private AddendumConfig(ModConfigSpec.Builder builder) {

        builder.comment("Whether candles on blocks which create dragon fire should emit dragon fire particles");
        dragonCandles = builder.define("dragonCandles", false);

    }

    static {
        Pair<AddendumConfig, ModConfigSpec> pair = new ModConfigSpec.Builder().configure(AddendumConfig::new);
        CONFIG = pair.getLeft();
        SPEC = pair.getRight();
    }

}
