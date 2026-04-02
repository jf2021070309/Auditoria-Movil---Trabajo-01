package com.rovio.fusion;

import android.provider.Settings;
import android.view.Window;
import android.view.WindowManager;
/* loaded from: classes2.dex */
public class DeviceScreenWrapper {
    public static void setBrightness(float f) {
        final Window window = Globals.getActivity().getWindow();
        final WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = f;
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.fusion.DeviceScreenWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                window.setAttributes(attributes);
            }
        });
    }

    public static float getBrightness() {
        double d = -1.0d;
        try {
            d = Settings.System.getInt(Globals.getActivity().getContentResolver(), "screen_brightness") / 255.0d;
        } catch (Settings.SettingNotFoundException e) {
        }
        return (float) d;
    }
}
