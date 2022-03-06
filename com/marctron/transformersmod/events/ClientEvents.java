/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.InputEvent$KeyInputEvent
 */
package com.marctron.transformersmod.events;

import com.marctron.transformersmod.proxy.ClientProxy;
import com.marctron.transformersmod.util.handlers.SoundsHandler;
import java.util.Timer;
import java.util.TimerTask;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class ClientEvents {
    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if (ClientProxy.MY_KEYBINDING.func_151470_d()) {
            Timer timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask(){

                @Override
                public void run() {
                    Minecraft.func_71410_x().field_71439_g.func_184185_a(SoundsHandler.TRANSFORMTWO, 0.3f, 1.85f);
                }
            }, 1L, 10000L);
            timer.cancel();
        }
        if (ClientProxy.ROBOT_MODE.func_151470_d()) {
            // empty if block
        }
    }
}

