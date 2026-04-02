package com.vungle.publisher;

import com.vungle.publisher.ct;
import com.vungle.publisher.env.r;
import com.vungle.publisher.wd;
import com.vungle.publisher.yg;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class xp implements MembersInjector<xg> {
    static final /* synthetic */ boolean a;
    private final Provider<uz> b;
    private final Provider<xq> c;
    private final Provider<uw> d;
    private final Provider<yg.a> e;
    private final Provider<xd> f;
    private final Provider<r> g;
    private final Provider<yd> h;
    private final Provider<com.vungle.publisher.env.k> i;
    private final Provider<qg> j;
    private final Provider<com.vungle.publisher.env.o> k;
    private final Provider<bw> l;
    private final Provider<ct.a> m;
    private final Provider<wd.a> n;
    private final Provider<com.vungle.publisher.log.g> o;

    static {
        a = !xp.class.desiredAssertionStatus();
    }

    public xp(Provider<uz> provider, Provider<xq> provider2, Provider<uw> provider3, Provider<yg.a> provider4, Provider<xd> provider5, Provider<r> provider6, Provider<yd> provider7, Provider<com.vungle.publisher.env.k> provider8, Provider<qg> provider9, Provider<com.vungle.publisher.env.o> provider10, Provider<bw> provider11, Provider<ct.a> provider12, Provider<wd.a> provider13, Provider<com.vungle.publisher.log.g> provider14) {
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
    }

    public static MembersInjector<xg> a(Provider<uz> provider, Provider<xq> provider2, Provider<uw> provider3, Provider<yg.a> provider4, Provider<xd> provider5, Provider<r> provider6, Provider<yd> provider7, Provider<com.vungle.publisher.env.k> provider8, Provider<qg> provider9, Provider<com.vungle.publisher.env.o> provider10, Provider<bw> provider11, Provider<ct.a> provider12, Provider<wd.a> provider13, Provider<com.vungle.publisher.log.g> provider14) {
        return new xp(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(xg xgVar) {
        if (xgVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        xgVar.b = this.b.get();
        xgVar.c = this.c.get();
        xgVar.d = this.d.get();
        xgVar.e = this.e.get();
        xgVar.f = this.f.get();
        xgVar.g = this.g.get();
        xgVar.h = this.h.get();
        xgVar.i = this.i.get();
        xgVar.j = this.j.get();
        xgVar.k = this.k.get();
        xgVar.l = this.l.get();
        xgVar.m = this.m.get();
        xgVar.n = this.n.get();
        xgVar.o = this.o.get();
    }
}
