package net.drew.shine_voxy_compat.mixin.voxy;

import com.bloom.client.compat.DhCompat;
import me.cortex.voxy.client.core.VoxyRenderSystem;
import me.cortex.voxy.client.core.rendering.Viewport;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = VoxyRenderSystem.class, remap = false)
public class VoxyRenderSystemMixin {
    @Inject(
        method = {"renderOpaque(Lme/cortex/voxy/client/core/rendering/Viewport;)V"},
            at = {@At("HEAD")}
    )
    private static void shine$enterRenderer(Viewport<?> viewport, CallbackInfo ci)
    {
        DhCompat.enterTerrainRender();
    }

    @Inject(
            method = {"renderOpaque(Lme/cortex/voxy/client/core/rendering/Viewport;)V"},
            at = {@At("RETURN")}
    )
    private static void shine$exitRenderer(Viewport<?> viewport, CallbackInfo ci)
    {
        DhCompat.exitTerrainRender();
    }
}
