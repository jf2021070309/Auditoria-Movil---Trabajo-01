package com.applovin.impl.sdk.e;

import android.content.Context;
/* loaded from: classes.dex */
public abstract class a implements Runnable {
    private final String a;
    protected final com.applovin.impl.sdk.k b;
    private final com.applovin.impl.sdk.r c;
    private final Context d;
    private final boolean e;

    public a(String str, com.applovin.impl.sdk.k kVar) {
        this(str, kVar, false);
    }

    public a(String str, com.applovin.impl.sdk.k kVar, boolean z) {
        this.a = str;
        this.b = kVar;
        this.c = kVar.z();
        this.d = kVar.J();
        this.e = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str) {
        this.c.b(this.a, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, Throwable th) {
        this.c.b(this.a, str, th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(String str) {
        this.c.c(this.a, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(String str) {
        this.c.d(this.a, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.applovin.impl.sdk.k d() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(String str) {
        this.c.e(this.a, str);
    }

    public String e() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Context f() {
        return this.d;
    }

    public boolean g() {
        return this.e;
    }
}
