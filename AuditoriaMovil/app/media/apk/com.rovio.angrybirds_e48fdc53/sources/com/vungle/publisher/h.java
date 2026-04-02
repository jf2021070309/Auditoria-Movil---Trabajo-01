package com.vungle.publisher;

import android.content.Context;
import com.vungle.publisher.c;
import com.vungle.publisher.eb;
import com.vungle.publisher.env.r;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class h implements MembersInjector<c> {
    static final /* synthetic */ boolean a;
    private final Provider<qg> b;
    private final Provider<r> c;
    private final Provider<Context> d;
    private final Provider<com.vungle.publisher.env.i> e;
    private final Provider<Class> f;
    private final Provider<Class> g;
    private final Provider<Class> h;
    private final Provider<bw> i;
    private final Provider<sz> j;
    private final Provider<c.a> k;
    private final Provider<c.b> l;
    private final Provider<vc> m;
    private final Provider<com.vungle.publisher.env.o> n;
    private final Provider<u> o;
    private final Provider<com.vungle.publisher.env.k> p;
    private final Provider<eb.b> q;
    private final Provider<xg> r;
    private final Provider<com.vungle.publisher.log.g> s;

    static {
        a = !h.class.desiredAssertionStatus();
    }

    public h(Provider<qg> provider, Provider<r> provider2, Provider<Context> provider3, Provider<com.vungle.publisher.env.i> provider4, Provider<Class> provider5, Provider<Class> provider6, Provider<Class> provider7, Provider<bw> provider8, Provider<sz> provider9, Provider<c.a> provider10, Provider<c.b> provider11, Provider<vc> provider12, Provider<com.vungle.publisher.env.o> provider13, Provider<u> provider14, Provider<com.vungle.publisher.env.k> provider15, Provider<eb.b> provider16, Provider<xg> provider17, Provider<com.vungle.publisher.log.g> provider18) {
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
        if (!a && provider14 == null) {
            throw new AssertionError();
        }
        this.o = provider14;
        if (!a && provider15 == null) {
            throw new AssertionError();
        }
        this.p = provider15;
        if (!a && provider16 == null) {
            throw new AssertionError();
        }
        this.q = provider16;
        if (!a && provider17 == null) {
            throw new AssertionError();
        }
        this.r = provider17;
        if (!a && provider18 == null) {
            throw new AssertionError();
        }
        this.s = provider18;
    }

    public static MembersInjector<c> a(Provider<qg> provider, Provider<r> provider2, Provider<Context> provider3, Provider<com.vungle.publisher.env.i> provider4, Provider<Class> provider5, Provider<Class> provider6, Provider<Class> provider7, Provider<bw> provider8, Provider<sz> provider9, Provider<c.a> provider10, Provider<c.b> provider11, Provider<vc> provider12, Provider<com.vungle.publisher.env.o> provider13, Provider<u> provider14, Provider<com.vungle.publisher.env.k> provider15, Provider<eb.b> provider16, Provider<xg> provider17, Provider<com.vungle.publisher.log.g> provider18) {
        return new h(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(c cVar) {
        if (cVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        cVar.eventBus = this.b.get();
        cVar.a = this.c.get();
        cVar.b = this.d.get();
        cVar.c = this.e.get();
        cVar.d = this.b.get();
        cVar.e = this.f.get();
        cVar.f = this.g.get();
        cVar.g = this.h.get();
        cVar.h = this.i.get();
        cVar.i = this.j.get();
        cVar.j = DoubleCheck.lazy(this.k);
        cVar.k = this.l;
        cVar.l = this.m.get();
        cVar.m = this.n.get();
        cVar.n = this.o.get();
        cVar.o = this.p.get();
        cVar.p = this.q.get();
        cVar.q = this.r.get();
        cVar.r = this.s.get();
    }
}
