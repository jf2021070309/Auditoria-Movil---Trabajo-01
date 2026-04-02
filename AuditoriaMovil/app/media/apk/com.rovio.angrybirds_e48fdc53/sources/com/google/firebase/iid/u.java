package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
final class u {
    private static final long b = TimeUnit.DAYS.toMillis(7);
    final String a;
    private final String c;
    private final long d;

    private u(String str, String str2, long j) {
        this.a = str;
        this.c = str2;
        this.d = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("{")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new u(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                String valueOf = String.valueOf(e);
                Log.w("FirebaseInstanceId", new StringBuilder(String.valueOf(valueOf).length() + 23).append("Failed to parse token: ").append(valueOf).toString());
                return null;
            }
        }
        return new u(str, null, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            Log.w("FirebaseInstanceId", new StringBuilder(String.valueOf(valueOf).length() + 24).append("Failed to encode token: ").append(valueOf).toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(u uVar) {
        if (uVar == null) {
            return null;
        }
        return uVar.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(String str) {
        return System.currentTimeMillis() > this.d + b || !str.equals(this.c);
    }
}
