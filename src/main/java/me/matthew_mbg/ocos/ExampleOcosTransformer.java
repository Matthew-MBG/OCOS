package me.matthew_mbg.ocos.exampleocostransformer;

import net.labymod.addon.AddonTransformer;
import net.labymod.api.TransformerType;

public class ExampleOcosTransformer extends OcosTransformer {

  @Override
  public void registerTransformers() {
    this.registerTransformer(TransformerType.VANILLA, "example.mixin.json");
  }
}
