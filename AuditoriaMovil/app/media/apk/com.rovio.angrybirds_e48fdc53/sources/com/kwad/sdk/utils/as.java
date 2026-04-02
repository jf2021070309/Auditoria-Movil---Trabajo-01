package com.kwad.sdk.utils;

import android.os.Build;
import android.text.TextUtils;
/* loaded from: classes3.dex */
public final class as {
    private static String aJk;
    private static String aJl;

    public static boolean IP() {
        return W("EMUI");
    }

    public static boolean IQ() {
        return W("MIUI");
    }

    public static boolean IR() {
        return W("FLYME");
    }

    private static boolean W(String str) {
        String upperCase;
        String str2 = aJk;
        if (str2 != null) {
            return str2.contains(str);
        }
        String str3 = bd.get("ro.build.version.opporom");
        aJl = str3;
        if (TextUtils.isEmpty(str3)) {
            String str4 = bd.get("ro.vivo.os.version");
            aJl = str4;
            if (TextUtils.isEmpty(str4)) {
                String str5 = bd.get("ro.build.version.emui");
                aJl = str5;
                if (TextUtils.isEmpty(str5)) {
                    String str6 = bd.get("ro.miui.ui.version.name");
                    aJl = str6;
                    if (TextUtils.isEmpty(str6)) {
                        String str7 = bd.get("ro.product.system.manufacturer");
                        aJl = str7;
                        if (TextUtils.isEmpty(str7)) {
                            String str8 = bd.get("ro.smartisan.version");
                            aJl = str8;
                            if (TextUtils.isEmpty(str8)) {
                                String str9 = "SAMSUNG";
                                if (!bd.get("ro.product.manufacturer").toUpperCase().contains("SAMSUNG")) {
                                    String str10 = Build.DISPLAY;
                                    aJl = str10;
                                    str9 = "FLYME";
                                    if (!str10.toUpperCase().contains("FLYME")) {
                                        aJl = "unknown";
                                        upperCase = Build.MANUFACTURER.toUpperCase();
                                    }
                                }
                                aJk = str9;
                                return aJk.contains(str);
                            }
                            upperCase = "SMARTISAN";
                        } else {
                            upperCase = "OnePlus";
                        }
                    } else {
                        upperCase = "MIUI";
                    }
                } else {
                    upperCase = "EMUI";
                }
            } else {
                upperCase = "VIVO";
            }
        } else {
            upperCase = "OPPO";
        }
        aJk = upperCase;
        return aJk.contains(str);
    }

    public static String getName() {
        if (aJk == null) {
            W("");
        }
        return aJk;
    }

    public static String getVersion() {
        if (aJl == null) {
            W("");
        }
        return aJl;
    }
}
