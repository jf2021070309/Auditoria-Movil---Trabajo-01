package com.vungle.publisher;

import com.vungle.publisher.my;
import com.vungle.publisher.ns;
import com.vungle.publisher.yn;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class nv implements MembersInjector<ns> {
    static final /* synthetic */ boolean a;
    private final Provider<qg> b;
    private final Provider<zc> c;
    private final Provider<com.vungle.publisher.env.i> d;
    private final Provider<yn.a> e;
    private final Provider<my.a> f;
    private final Provider<com.vungle.publisher.env.o> g;
    private final Provider<mv> h;
    private final Provider<ns.a.C0333a> i;

    static {
        a = !nv.class.desiredAssertionStatus();
    }

    public nv(Provider<qg> provider, Provider<zc> provider2, Provider<com.vungle.publisher.env.i> provider3, Provider<yn.a> provider4, Provider<my.a> provider5, Provider<com.vungle.publisher.env.o> provider6, Provider<mv> provider7, Provider<ns.a.C0333a> provider8) {
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
        if (!a && provider8 == null) {
            throw new AssertionError();
        }
        this.i = provider8;
    }

    public static MembersInjector<ns> a(Provider<qg> provider, Provider<zc> provider2, Provider<com.vungle.publisher.env.i> provider3, Provider<yn.a> provider4, Provider<my.a> provider5, Provider<com.vungle.publisher.env.o> provider6, Provider<mv> provider7, Provider<ns.a.C0333a> provider8) {
        return new nv(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ns nsVar) {
        if (nsVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        nsVar.i = this.b.get();
        nsVar.j = this.c.get();
        nsVar.k = this.d.get();
        nsVar.n = this.e.get();
        nsVar.o = this.f.get();
        nsVar.p = this.g.get();
        nsVar.q = this.h.get();
        nsVar.r = this.i.get();
    }
}
