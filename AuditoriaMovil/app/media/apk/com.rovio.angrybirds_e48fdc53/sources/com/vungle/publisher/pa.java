package com.vungle.publisher;

import com.vungle.publisher.ob;
import com.vungle.publisher.op;
import com.vungle.publisher.oy;
import com.vungle.publisher.ys;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class pa implements MembersInjector<oy> {
    static final /* synthetic */ boolean a;
    private final Provider<qg> b;
    private final Provider<zc> c;
    private final Provider<com.vungle.publisher.env.i> d;
    private final Provider<oy.a.C0334a> e;
    private final Provider<ys.a> f;
    private final Provider<op.a> g;
    private final Provider<ob.a> h;
    private final Provider<com.vungle.publisher.env.o> i;

    static {
        a = !pa.class.desiredAssertionStatus();
    }

    public pa(Provider<qg> provider, Provider<zc> provider2, Provider<com.vungle.publisher.env.i> provider3, Provider<oy.a.C0334a> provider4, Provider<ys.a> provider5, Provider<op.a> provider6, Provider<ob.a> provider7, Provider<com.vungle.publisher.env.o> provider8) {
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

    public static MembersInjector<oy> a(Provider<qg> provider, Provider<zc> provider2, Provider<com.vungle.publisher.env.i> provider3, Provider<oy.a.C0334a> provider4, Provider<ys.a> provider5, Provider<op.a> provider6, Provider<ob.a> provider7, Provider<com.vungle.publisher.env.o> provider8) {
        return new pa(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(oy oyVar) {
        if (oyVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        oyVar.i = this.b.get();
        oyVar.j = this.c.get();
        oyVar.k = this.d.get();
        oyVar.l = this.e.get();
        oyVar.m = this.f.get();
        oyVar.n = this.g.get();
        oyVar.o = this.h.get();
        oyVar.p = this.i.get();
    }
}
