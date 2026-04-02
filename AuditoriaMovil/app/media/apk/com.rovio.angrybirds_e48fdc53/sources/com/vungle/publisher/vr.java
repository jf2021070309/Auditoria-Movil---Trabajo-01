package com.vungle.publisher;

import com.vungle.publisher.env.r;
import com.vungle.publisher.hk;
import com.vungle.publisher.wm;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class vr implements MembersInjector<vc> {
    static final /* synthetic */ boolean a;
    private final Provider<qg> b;
    private final Provider<bw> c;
    private final Provider<yk> d;
    private final Provider<com.vungle.publisher.env.o> e;
    private final Provider<zf> f;
    private final Provider<wm.a> g;
    private final Provider<r> h;
    private final Provider<String> i;
    private final Provider<com.vungle.publisher.log.g> j;
    private final Provider<yd> k;
    private final Provider<hk.a> l;

    static {
        a = !vr.class.desiredAssertionStatus();
    }

    public vr(Provider<qg> provider, Provider<bw> provider2, Provider<yk> provider3, Provider<com.vungle.publisher.env.o> provider4, Provider<zf> provider5, Provider<wm.a> provider6, Provider<r> provider7, Provider<String> provider8, Provider<com.vungle.publisher.log.g> provider9, Provider<yd> provider10, Provider<hk.a> provider11) {
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

    public static MembersInjector<vc> a(Provider<qg> provider, Provider<bw> provider2, Provider<yk> provider3, Provider<com.vungle.publisher.env.o> provider4, Provider<zf> provider5, Provider<wm.a> provider6, Provider<r> provider7, Provider<String> provider8, Provider<com.vungle.publisher.log.g> provider9, Provider<yd> provider10, Provider<hk.a> provider11) {
        return new vr(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(vc vcVar) {
        if (vcVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        vcVar.a = this.b.get();
        vcVar.b = this.c.get();
        vcVar.c = DoubleCheck.lazy(this.d);
        vcVar.d = this.e.get();
        vcVar.e = this.f.get();
        vcVar.f = this.g.get();
        vcVar.g = DoubleCheck.lazy(this.h);
        vcVar.h = this.i.get();
        vcVar.i = this.j.get();
        vcVar.j = this.k.get();
        vcVar.k = this.l.get();
    }
}
