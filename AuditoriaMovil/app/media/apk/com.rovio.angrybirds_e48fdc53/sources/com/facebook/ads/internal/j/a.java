package com.facebook.ads.internal.j;

import com.facebook.share.internal.ShareConstants;
import com.umeng.analytics.pro.bg;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class a {
    public static String a = null;
    private String b;
    private Map<String, Object> c;
    private int d;
    private String e;

    /* renamed from: com.facebook.ads.internal.j.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0112a {
        OPEN_STORE(0),
        OPEN_LINK(1),
        XOUT(2),
        OPEN_URL(3),
        SHOW_INTERSTITIAL(4);
        
        int f;

        EnumC0112a(int i) {
            this.f = i;
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        LOADING_AD(0);
        
        int b;

        b(int i) {
            this.b = i;
        }
    }

    public a(String str, Map<String, Object> map, int i, String str2) {
        this.b = str;
        this.c = map;
        this.d = i;
        this.e = str2;
    }

    public static a a(long j, EnumC0112a enumC0112a, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("Time", String.valueOf(currentTimeMillis - j));
        hashMap.put("AdAction", String.valueOf(enumC0112a.f));
        return new a("bounceback", hashMap, (int) (currentTimeMillis / 1000), str);
    }

    public static a a(b bVar, String str, long j, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("LatencyType", String.valueOf(bVar.b));
        hashMap.put("AdPlacementType", str);
        hashMap.put("Time", String.valueOf(j));
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (str2 == null) {
            str2 = a;
        }
        return new a(bg.aT, hashMap, currentTimeMillis, str2);
    }

    public static a a(Throwable th, String str) {
        HashMap hashMap = new HashMap();
        if (th != null) {
            hashMap.put("ex", th.getClass().getSimpleName());
            hashMap.put("ex_msg", th.getMessage());
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (str == null) {
            str = a;
        }
        return new a("error", hashMap, currentTimeMillis, str);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.b);
            jSONObject.put(ShareConstants.WEB_DIALOG_PARAM_DATA, new JSONObject(this.c));
            jSONObject.put("time", this.d);
            jSONObject.put("request_id", this.e);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
