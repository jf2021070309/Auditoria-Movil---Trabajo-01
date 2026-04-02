package com.umeng.analytics.pro;

import android.text.TextUtils;
import org.json.JSONObject;
/* compiled from: HttpPostDataThread.java */
/* loaded from: classes3.dex */
public class am implements Runnable {
    public static final String a = "https://aspect-upush.umeng.com/occa/v1/event/report";
    private String b;
    private String c;

    public am(String str, JSONObject jSONObject) {
        this.b = str;
        this.c = jSONObject.toString();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!TextUtils.isEmpty(this.c)) {
                al.b(this.b, this.c.getBytes());
            }
        } catch (Throwable th) {
        }
    }
}
