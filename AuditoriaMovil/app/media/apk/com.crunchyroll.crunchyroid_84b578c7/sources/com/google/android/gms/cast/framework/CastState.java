package com.google.android.gms.cast.framework;

import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class CastState {
    public static final int CONNECTED = 4;
    public static final int CONNECTING = 3;
    public static final int NOT_CONNECTED = 2;
    public static final int NO_DEVICES_AVAILABLE = 1;

    private CastState() {
    }

    public static String toString(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return String.format(Locale.ROOT, "UNKNOWN_STATE(%d)", Integer.valueOf(i));
                    }
                    return "CONNECTED";
                }
                return "CONNECTING";
            }
            return "NOT_CONNECTED";
        }
        return "NO_DEVICES_AVAILABLE";
    }
}
