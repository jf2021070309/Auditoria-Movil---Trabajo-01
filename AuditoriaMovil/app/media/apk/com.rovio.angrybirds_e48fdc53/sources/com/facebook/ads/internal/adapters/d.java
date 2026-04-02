package com.facebook.ads.internal.adapters;

import com.facebook.share.internal.MessengerShareContentUtility;
import java.io.Serializable;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class d implements Serializable {
    private static final long serialVersionUID = 85021702336014823L;
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final int g;
    private final int h;
    private final String i;
    private final boolean j;
    private final boolean k;
    private final int l;

    private d(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, String str7, boolean z, boolean z2, int i3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i;
        this.h = i2;
        this.i = str7;
        this.j = z;
        this.k = z2;
        this.l = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d a(JSONObject jSONObject) {
        int i;
        int i2;
        String optString = jSONObject.optString("title");
        String optString2 = jSONObject.optString(MessengerShareContentUtility.SUBTITLE);
        String optString3 = jSONObject.optString("body");
        String optString4 = jSONObject.optString("call_to_action");
        if ("null".equalsIgnoreCase(optString4)) {
            optString4 = "";
        }
        String optString5 = jSONObject.optString("fbad_command");
        if ("null".equalsIgnoreCase(optString5)) {
            optString5 = "";
        }
        String str = "";
        JSONObject optJSONObject = jSONObject.optJSONObject(MessengerShareContentUtility.MEDIA_IMAGE);
        if (optJSONObject != null) {
            str = optJSONObject.optString("url");
            i2 = Integer.parseInt(optJSONObject.optString("width"));
            i = Integer.parseInt(optJSONObject.optString("height"));
        } else {
            i = 0;
            i2 = 0;
        }
        String optString6 = jSONObject.optString("video_url");
        boolean optBoolean = jSONObject.optBoolean("video_autoplay_enabled");
        return new d(optString, optString2, optString3, optString4, optString5, str, i2, i, optString6, optBoolean, jSONObject.optBoolean("video_autoplay_with_sound"), optBoolean ? jSONObject.optInt("unskippable_seconds", 0) : 0);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public String f() {
        return this.f;
    }

    public int g() {
        return this.g;
    }

    public int h() {
        return this.h;
    }

    public String i() {
        return this.i;
    }

    public boolean j() {
        return this.j;
    }

    public boolean k() {
        return this.k;
    }

    public int l() {
        return this.l;
    }
}
