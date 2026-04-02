package com.iab.omid.library.applovin.b;

import android.annotation.SuppressLint;
import android.content.Context;
/* loaded from: classes2.dex */
public class d {
    @SuppressLint({"StaticFieldLeak"})
    private static d a = new d();

    /* renamed from: b  reason: collision with root package name */
    private Context f4784b;

    private d() {
    }

    public static d a() {
        return a;
    }

    public void a(Context context) {
        this.f4784b = context != null ? context.getApplicationContext() : null;
    }

    public Context b() {
        return this.f4784b;
    }
}
