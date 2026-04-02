package com.vungle.publisher;

import com.vungle.publisher.ct;
import com.vungle.publisher.dk;
import com.vungle.publisher.dw;
import com.vungle.publisher.iz;
import com.vungle.publisher.jn;
import com.vungle.publisher.jo;
import com.vungle.publisher.jt;
import com.vungle.publisher.jy;
import com.vungle.publisher.ks;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class kz implements MembersInjector<jn.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<qg> c;
    private final Provider<zl> d;
    private final Provider<ct.a> e;
    private final Provider<jn> f;
    private final Provider<dk.a> g;
    private final Provider<String> h;
    private final Provider<jt.a> i;
    private final Provider<jo.a> j;
    private final Provider<jy.a> k;
    private final Provider<ks.a> l;
    private final Provider<iz.a> m;
    private final Provider<dw.a> n;

    static {
        a = !kz.class.desiredAssertionStatus();
    }

    public kz(Provider<ci> provider, Provider<qg> provider2, Provider<zl> provider3, Provider<ct.a> provider4, Provider<jn> provider5, Provider<dk.a> provider6, Provider<String> provider7, Provider<jt.a> provider8, Provider<jo.a> provider9, Provider<jy.a> provider10, Provider<ks.a> provider11, Provider<iz.a> provider12, Provider<dw.a> provider13) {
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
        if (!a && provider9 == null) {
            throw new AssertionError();
        }
        this.j = provider9;
        if (!a && provider10 == null) {
            throw new AssertionError();
        }
        this.k = provider10;
        if (!a && provider11 == null) {
            throw new AssertionError();
        }
        this.l = provider11;
        if (!a && provider12 == null) {
            throw new AssertionError();
        }
        this.m = provider12;
        if (!a && provider13 == null) {
            throw new AssertionError();
        }
        this.n = provider13;
    }

    public static MembersInjector<jn.a> a(Provider<ci> provider, Provider<qg> provider2, Provider<zl> provider3, Provider<ct.a> provider4, Provider<jn> provider5, Provider<dk.a> provider6, Provider<String> provider7, Provider<jt.a> provider8, Provider<jo.a> provider9, Provider<jy.a> provider10, Provider<ks.a> provider11, Provider<iz.a> provider12, Provider<dw.a> provider13) {
        return new kz(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(jn.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.a = this.c.get();
        aVar.b = this.d.get();
        aVar.c = this.e.get();
        aVar.e = this.f;
        aVar.f = this.d.get();
        aVar.g = this.g.get();
        aVar.h = this.h;
        aVar.i = this.i.get();
        aVar.j = this.j.get();
        aVar.k = this.k.get();
        aVar.l = this.l.get();
        aVar.m = this.m.get();
        aVar.n = this.n.get();
    }
}
