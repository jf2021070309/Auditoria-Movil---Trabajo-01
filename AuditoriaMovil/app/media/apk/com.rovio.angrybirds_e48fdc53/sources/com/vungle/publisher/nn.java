package com.vungle.publisher;

import com.vungle.publisher.my;
import com.vungle.publisher.nk;
import com.vungle.publisher.yn;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class nn implements MembersInjector<nk> {
    static final /* synthetic */ boolean a;
    private final Provider<qg> b;
    private final Provider<zc> c;
    private final Provider<com.vungle.publisher.env.i> d;
    private final Provider<yn.a> e;
    private final Provider<my.a> f;
    private final Provider<com.vungle.publisher.env.o> g;
    private final Provider<nk.a.C0332a> h;

    static {
        a = !nn.class.desiredAssertionStatus();
    }

    public nn(Provider<qg> provider, Provider<zc> provider2, Provider<com.vungle.publisher.env.i> provider3, Provider<yn.a> provider4, Provider<my.a> provider5, Provider<com.vungle.publisher.env.o> provider6, Provider<nk.a.C0332a> provider7) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
        if (!a && provider3 == null) {
            throw new AssertionError();
        }
        this.d = provider3;
        if (!a && provider4 == null) {
            throw new AssertionError();
        }
        this.e = provider4;
        if (!a && provider5 == null) {
            throw new AssertionError();
        }
        this.f = provider5;
        if (!a && provider6 == null) {
            throw new AssertionError();
        }
        this.g = provider6;
        if (!a && provider7 == null) {
            throw new AssertionError();
        }
        this.h = provider7;
    }

    public static MembersInjector<nk> a(Provider<qg> provider, Provider<zc> provider2, Provider<com.vungle.publisher.env.i> provider3, Provider<yn.a> provider4, Provider<my.a> provider5, Provider<com.vungle.publisher.env.o> provider6, Provider<nk.a.C0332a> provider7) {
        return new nn(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(nk nkVar) {
        if (nkVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        nkVar.i = this.b.get();
        nkVar.j = this.c.get();
        nkVar.k = this.d.get();
        nkVar.n = this.e.get();
        nkVar.o = this.f.get();
        nkVar.p = this.g.get();
        nkVar.q = this.h.get();
    }
}
