package com.fyber.inneractive.sdk.d;

import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.j.e;
/* loaded from: classes.dex */
public abstract class g<T extends com.fyber.inneractive.sdk.j.e> {
    protected InneractiveAdRequest f;
    protected T g;
    protected com.fyber.inneractive.sdk.config.a.s h;
    protected final u i;
    protected boolean j = false;
    boolean k = false;

    public abstract void b();

    public abstract boolean d();

    public abstract boolean isVideoAd();

    /* JADX INFO: Access modifiers changed from: protected */
    public g(u uVar, com.fyber.inneractive.sdk.config.a.s sVar) {
        this.i = uVar;
        this.h = sVar;
    }

    public T f() {
        return this.g;
    }

    public final void a(T t) {
        this.g = t;
    }

    public final InneractiveAdRequest g() {
        return this.f;
    }

    public final void a(InneractiveAdRequest inneractiveAdRequest) {
        this.f = inneractiveAdRequest;
    }

    public final u h() {
        return this.i;
    }

    public final com.fyber.inneractive.sdk.config.a.s i() {
        return this.h;
    }

    public boolean a_() {
        if (this.i.d() != null) {
        }
        return false;
    }

    public final void j() {
        this.j = true;
    }

    public final boolean k() {
        InneractiveAdRequest inneractiveAdRequest = this.f;
        return (inneractiveAdRequest != null && inneractiveAdRequest.getMuteVideo()) || this.k;
    }
}
