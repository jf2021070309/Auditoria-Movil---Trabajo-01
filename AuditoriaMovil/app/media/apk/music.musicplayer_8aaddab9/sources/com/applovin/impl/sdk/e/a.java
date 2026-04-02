package com.applovin.impl.sdk.e;

import android.content.Context;
/* loaded from: classes.dex */
public abstract class a implements Runnable {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    public final com.applovin.impl.sdk.m f4020b;

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.sdk.v f4021c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f4022d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4023e;

    public a(String str, com.applovin.impl.sdk.m mVar) {
        this(str, mVar, false);
    }

    public a(String str, com.applovin.impl.sdk.m mVar, boolean z) {
        this.a = str;
        this.f4020b = mVar;
        this.f4021c = mVar.B();
        this.f4022d = mVar.L();
        this.f4023e = z;
    }

    public void a(String str) {
        this.f4021c.b(this.a, str);
    }

    public void a(String str, Throwable th) {
        this.f4021c.b(this.a, str, th);
    }

    public void b(String str) {
        this.f4021c.c(this.a, str);
    }

    public void c(String str) {
        this.f4021c.d(this.a, str);
    }

    public com.applovin.impl.sdk.m d() {
        return this.f4020b;
    }

    public void d(String str) {
        this.f4021c.e(this.a, str);
    }

    public String e() {
        return this.a;
    }

    public Context f() {
        return this.f4022d;
    }

    public boolean g() {
        return this.f4023e;
    }
}
