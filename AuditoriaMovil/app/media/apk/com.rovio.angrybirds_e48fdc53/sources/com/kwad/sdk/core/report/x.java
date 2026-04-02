package com.kwad.sdk.core.report;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
/* loaded from: classes.dex */
public final class x {
    private static Context PK;
    private static String asK = Cn();
    private static long asL = 0;

    public static String Cj() {
        com.kwad.sdk.core.e.c.d("ReportIdManager", ">> updateSessionId");
        String Cn = Cn();
        asK = Cn;
        return Cn;
    }

    public static String Ck() {
        return asK;
    }

    public static long Cl() {
        long bg = bg(PK);
        b(PK, 1 + bg);
        return bg;
    }

    public static long Cm() {
        return asL;
    }

    private static String Cn() {
        return UUID.randomUUID().toString();
    }

    private static boolean b(Context context, long j) {
        if (context != null) {
            SharedPreferences.Editor edit = context.getSharedPreferences("ksadsdk_seq", 0).edit();
            edit.putLong("seq", j);
            return edit.commit();
        }
        return false;
    }

    private static long bg(Context context) {
        SharedPreferences sharedPreferences;
        if (context == null || (sharedPreferences = context.getSharedPreferences("ksadsdk_seq", 0)) == null) {
            return 0L;
        }
        return sharedPreferences.getLong("seq", 1L);
    }

    public static void init(Context context) {
        PK = context;
    }
}
