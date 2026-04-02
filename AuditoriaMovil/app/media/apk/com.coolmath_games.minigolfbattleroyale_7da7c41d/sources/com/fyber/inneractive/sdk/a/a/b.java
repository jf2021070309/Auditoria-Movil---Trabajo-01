package com.fyber.inneractive.sdk.a.a;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
final class b {
    int a;
    int b;
    int c;
    long d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b() {
        this(0, 0, 0, System.currentTimeMillis());
    }

    private b(int i, int i2, int i3, long j) {
        this.d = j;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    /* renamed from: com.fyber.inneractive.sdk.a.a.b$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.fyber.inneractive.sdk.a.a.a.a.a().length];
            a = iArr;
            try {
                iArr[com.fyber.inneractive.sdk.a.a.a.a.b - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.fyber.inneractive.sdk.a.a.a.a.c - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[com.fyber.inneractive.sdk.a.a.a.a.a - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONObject a(boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                jSONObject.put("time", this.d);
            } catch (JSONException unused) {
            }
        }
        jSONObject.put("imp", this.a);
        if (z2) {
            jSONObject.put("com", this.c);
        }
        jSONObject.put("cli", this.b);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b a(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("time");
        int optInt = jSONObject.optInt("cli", -1);
        int optInt2 = jSONObject.optInt("imp", -1);
        int optInt3 = jSONObject.optInt("com", -1);
        if (optLong == 0 || optInt < 0 || optInt2 < 0 || optInt3 < 0) {
            return null;
        }
        return new b(optInt2, optInt, optInt3, optLong);
    }
}
