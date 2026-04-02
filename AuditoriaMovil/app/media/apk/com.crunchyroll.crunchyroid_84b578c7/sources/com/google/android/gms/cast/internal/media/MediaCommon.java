package com.google.android.gms.cast.internal.media;

import com.google.android.gms.common.annotation.KeepForSdk;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class MediaCommon {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @KeepForSdk
    public static Integer mediaRepeatModeFromString(String str) {
        char c;
        if (str != null) {
            switch (str.hashCode()) {
                case -1118317585:
                    if (str.equals("REPEAT_ALL_AND_SHUFFLE")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -962896020:
                    if (str.equals("REPEAT_SINGLE")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1645938909:
                    if (str.equals("REPEAT_ALL")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1645952171:
                    if (str.equals("REPEAT_OFF")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            return null;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }
        return null;
    }

    public static String zza(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            return null;
                        }
                        return "REPEAT_ALL_AND_SHUFFLE";
                    }
                    return "REPEAT_SINGLE";
                }
                return "REPEAT_ALL";
            }
            return "REPEAT_OFF";
        }
        return null;
    }
}
