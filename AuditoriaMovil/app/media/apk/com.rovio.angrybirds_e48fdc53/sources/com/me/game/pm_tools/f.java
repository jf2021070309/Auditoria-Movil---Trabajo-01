package com.me.game.pm_tools;

import android.text.TextUtils;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class f {
    public String a = "Safe and 100% working mods!";
    public String b = "Download PlayMods to keep playing~";
    public String c = "Follow Us";
    public String d = "Download It Now";
    public String e = "Download in PlayMods";
    public String f = "The Only Official Website:";
    public String g = "PlayMods";
    public String h = "";

    public static f b(String str) {
        f fVar = new f();
        try {
            JSONObject jSONObject = new JSONObject(str);
            fVar.a = jSONObject.optString("text_safe_and_working_mods", fVar.a);
            fVar.b = jSONObject.optString("text_download_playmods_to_keep_playing", fVar.b);
            fVar.c = jSONObject.optString("text_follow_us", fVar.c);
            fVar.d = jSONObject.optString("text_download_it_now", fVar.d);
            fVar.e = jSONObject.optString("text_download_in_playmods", fVar.e);
            fVar.f = jSONObject.optString("text_only_official_website", fVar.f);
            fVar.g = jSONObject.optString("text_google_notice", fVar.g);
            fVar.h = jSONObject.optString("text_supplement_content", fVar.h);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fVar;
    }

    public String a() {
        return TextUtils.isEmpty(this.g) ? "PlayMods" : this.g;
    }
}
