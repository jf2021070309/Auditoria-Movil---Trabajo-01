package com.flurry.sdk;

import java.util.Locale;
/* loaded from: classes2.dex */
public class kb {
    private static final String a = kb.class.getSimpleName();

    public static String a() {
        Object obj;
        if (c().length() > 0) {
            obj = ".";
        } else {
            obj = "";
        }
        return String.format(Locale.getDefault(), "Flurry_Android_%d_%d.%d.%d%s%s", Integer.valueOf(b()), Integer.valueOf(((Integer) lr.a().a("ReleaseMajorVersion")).intValue()), Integer.valueOf(((Integer) lr.a().a("ReleaseMinorVersion")).intValue()), Integer.valueOf(((Integer) lr.a().a("ReleasePatchVersion")).intValue()), obj, c());
    }

    private static String c() {
        return (String) lr.a().a("ReleaseBetaVersion");
    }

    public static int b() {
        int intValue = ((Integer) lr.a().a("AgentVersion")).intValue();
        ko.a(4, a, "getAgentVersion() = " + intValue);
        return intValue;
    }
}
