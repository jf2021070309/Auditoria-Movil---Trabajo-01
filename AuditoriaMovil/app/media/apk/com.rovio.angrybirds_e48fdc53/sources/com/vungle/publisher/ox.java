package com.vungle.publisher;

import com.vungle.publisher.og;
import com.vungle.publisher.oj;
import com.vungle.publisher.op;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ox implements MembersInjector<op> {
    static final /* synthetic */ boolean a;
    private final Provider<mq> b;
    private final Provider<mv> c;
    private final Provider<qg> d;
    private final Provider<op.a> e;
    private final Provider<og.a> f;
    private final Provider<oj.a> g;
    private final Provider<com.vungle.publisher.env.i> h;
    private final Provider<zo> i;
    private final Provider<cb> j;
    private final Provider<lm> k;
    private final Provider<zf> l;

    static {
        a = !ox.class.desiredAssertionStatus();
    }

    public ox(Provider<mq> provider, Provider<mv> provider2, Provider<qg> provider3, Provider<op.a> provider4, Provider<og.a> provider5, Provider<oj.a> provider6, Provider<com.vungle.publisher.env.i> provider7, Provider<zo> provider8, Provider<cb> provider9, Provider<lm> provider10, Provider<zf> provider11) {
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
    }

    public static MembersInjector<op> a(Provider<mq> provider, Provider<mv> provider2, Provider<qg> provider3, Provider<op.a> provider4, Provider<og.a> provider5, Provider<oj.a> provider6, Provider<com.vungle.publisher.env.i> provider7, Provider<zo> provider8, Provider<cb> provider9, Provider<lm> provider10, Provider<zf> provider11) {
        return new ox(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(op opVar) {
        if (opVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        opVar.d = this.b.get();
        opVar.g = this.c.get();
        opVar.h = this.d.get();
        opVar.i = this.e.get();
        opVar.j = this.f.get();
        opVar.k = this.g.get();
        opVar.l = this.h.get();
        opVar.m = this.i.get();
        opVar.n = this.j.get();
        opVar.o = this.k.get();
        opVar.p = this.l.get();
    }
}
