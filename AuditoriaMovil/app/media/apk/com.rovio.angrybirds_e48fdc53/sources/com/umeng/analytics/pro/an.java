package com.umeng.analytics.pro;

import com.umeng.commonsdk.service.UMGlobalContext;
import org.json.JSONObject;
/* compiled from: HttpPostThread.java */
/* loaded from: classes3.dex */
public class an implements Runnable {
    public static final String a = "https://ucc.umeng.com/v2/inn/fetch";
    private String b;
    private String c;
    private String d;

    public an(String str, JSONObject jSONObject, String str2) {
        this.b = str;
        this.c = jSONObject.toString();
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONObject jSONObject = null;
        try {
            byte[] a2 = al.a(this.b, this.c);
            if (a2 != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject(new String(a2));
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("sourceIucc", this.d);
                        jSONObject3.put("config", jSONObject2);
                        jSONObject = jSONObject3;
                    } catch (Throwable th) {
                        jSONObject = jSONObject3;
                    }
                } catch (Throwable th2) {
                }
            }
        } catch (Throwable th3) {
        }
        com.umeng.ccg.b.a(UMGlobalContext.getAppContext(), 102, com.umeng.ccg.c.a(), jSONObject);
    }
}
