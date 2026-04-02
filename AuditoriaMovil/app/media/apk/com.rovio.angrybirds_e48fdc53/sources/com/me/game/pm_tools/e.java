package com.me.game.pm_tools;

import org.json.JSONObject;
/* loaded from: classes5.dex */
public class e {
    public boolean a = true;
    public String b = "https://www.youtube.com/channel/UCyXOJ8wYoL-4u2Obz6u-VAw";
    public String c = "https://www.tiktok.com/@playmods.net?lang=zh-Hant-TW";
    public String d = "https://t.me/playmodsapp";
    public String e = "https://discord.gg/8Rq4UcEydn";
    public String f = "https://twitter.com/PLAYMODS1";

    public static e a(String str) {
        e eVar = new e();
        try {
            JSONObject jSONObject = new JSONObject(str);
            eVar.a = jSONObject.optBoolean("cancelable", eVar.a);
            eVar.f = jSONObject.optString("twitter", eVar.f);
            eVar.b = jSONObject.optString("YouTube", eVar.b);
            eVar.c = jSONObject.optString("tiktok", eVar.c);
            eVar.e = jSONObject.optString("Discord", eVar.e);
            eVar.d = jSONObject.optString("Telegram", eVar.d);
            y.e("configBean.cancelable", Boolean.valueOf(eVar.a));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return eVar;
    }
}
