package com.ss.android.downloadlib.rb;

import org.json.JSONObject;
/* loaded from: classes3.dex */
public class t {
    public static void dr(String str, String str2, JSONObject jSONObject) {
        com.ss.android.download.api.config.t x = com.ss.android.downloadlib.addownload.wb.x();
        if (x != null) {
            x.dr(2, str, str2, jSONObject);
        }
    }

    public static void ge(String str, String str2, JSONObject jSONObject) {
        com.ss.android.download.api.config.t x = com.ss.android.downloadlib.addownload.wb.x();
        if (x != null) {
            x.dr(3, str, str2, jSONObject);
        }
    }

    public static void o(String str, String str2, JSONObject jSONObject) {
        com.ss.android.download.api.config.t x = com.ss.android.downloadlib.addownload.wb.x();
        if (x != null) {
            x.dr(6, str, str2, jSONObject);
        }
    }

    public static void dr(String str, String str2) {
        o(str, str2, null);
    }

    public static void dr(String str) {
        o(null, str, null);
    }
}
