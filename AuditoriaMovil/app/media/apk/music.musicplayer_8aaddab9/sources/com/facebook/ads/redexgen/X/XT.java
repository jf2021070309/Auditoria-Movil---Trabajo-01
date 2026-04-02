package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class XT implements InterfaceC04268k {
    public static byte[] A00;
    public static String[] A01 = {"pc9SDu4q0ndjUgaBFnTwnVDAc", "TEyfLLF07E8T9OIhIFGxWFWU1DoY0qu9", "PvlhzdyiCoI95AgVx9x8P", "ppbufhzmpe9EYGWIgBX1M6B8twBtPuNG", "VW2rk9PbFLMieIoskAj472iSAf", "xKqqzLM1286pXDLGNYNyGT", "Q7mC5PdUWk4VY8JyukicEp4IrY082xh3", "CYDjKAVW2ewG3Ov4lOk"};

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 62);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{0, 5, 16, 5, 27, 20, 22, 11, 7, 1, 23, 23, 13, 10, 3, 27, 11, 20, 16, 13, 11, 10, 23, 27, 7, 11, 17, 10, 16, 22, 29, 27, 15, 1, 29, 39, 34, 55, 34, 60, 51, 49, 44, 32, 38, 48, 48, 42, 45, 36, 60, 44, 51, 55, 42, 44, 45, 48, 60, 40, 38, 58, 36, 33, 52, 33, 63, 48, 50, 47, 35, 37, 51, 51, 41, 46, 39, 63, 47, 48, 52, 41, 47, 46, 51, 63, 51, 52, 33, 52, 37, 63, 43, 37, 57};
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04268k
    public final void A9Z(InterfaceC04258j interfaceC04258j) {
        String[] stringArray;
        Integer integer;
        Integer state;
        if (!AdInternalSettings.sDataProcessingOptionsUpdate.getAndSet(false)) {
            return;
        }
        synchronized (AdInternalSettings.sSettingsBundle) {
            stringArray = AdInternalSettings.sSettingsBundle.getStringArray(A00(35, 27, 93));
            integer = AdInternalSettings.sSettingsBundle.getInteger(A00(0, 35, 122));
            state = AdInternalSettings.sSettingsBundle.getInteger(A00(62, 33, 94));
        }
        interfaceC04258j.ACF(stringArray, integer, state);
        if (A01[5].length() == 5) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "GYxOMMaZWc0DYbyBdROYWQbo3ERgzJaS";
        strArr[3] = "daGGPBwMvn2dY2JRglHYxwxN7ZgOeNVo";
    }
}
