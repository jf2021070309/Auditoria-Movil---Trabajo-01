package com.fyber.inneractive.sdk.dv;

import com.fyber.inneractive.sdk.config.a.s;
import com.fyber.inneractive.sdk.config.u;
import com.google.android.gms.ads.AdRequest;
/* loaded from: classes.dex */
public abstract class a<T> extends com.fyber.inneractive.sdk.d.g<f> {
    protected c b;
    protected e c;
    protected T d;

    @Override // com.fyber.inneractive.sdk.d.g
    public boolean d() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.d.g
    public boolean isVideoAd() {
        return false;
    }

    public a(u uVar, s sVar, f fVar) {
        super(uVar, sVar);
        a((a<T>) fVar);
    }

    @Override // com.fyber.inneractive.sdk.d.g
    public final void b() {
        this.b = null;
        this.d = null;
    }

    public final f c() {
        return (f) super.f();
    }

    public final T e() {
        return this.d;
    }

    public void a(AdRequest adRequest, c cVar) {
        this.b = cVar;
    }

    public void a(e eVar) {
        this.c = eVar;
    }

    @Override // com.fyber.inneractive.sdk.d.g
    public final /* bridge */ /* synthetic */ f f() {
        return (f) super.f();
    }
}
