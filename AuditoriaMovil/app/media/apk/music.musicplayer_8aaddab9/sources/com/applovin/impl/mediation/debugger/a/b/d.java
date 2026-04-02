package com.applovin.impl.mediation.debugger.a.b;

import android.content.Context;
import com.applovin.impl.sdk.utils.g;
/* loaded from: classes.dex */
public class d {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3521b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3522c;

    public d(String str, String str2, Context context) {
        this.a = str.replace("android.permission.", "");
        this.f3521b = str2;
        this.f3522c = g.a(str, context);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.f3521b;
    }

    public boolean c() {
        return this.f3522c;
    }
}
