package com.vungle.publisher;

import com.vungle.publisher.df;
import com.vungle.publisher.el;
import com.vungle.publisher.em;
import com.vungle.publisher.lb;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class eq implements MembersInjector<em> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<df.a> c;
    private final Provider<ge> d;
    private final Provider<el.a> e;
    private final Provider<em.a> f;
    private final Provider<lb.a> g;

    static {
        a = !eq.class.desiredAssertionStatus();
    }

    public eq(Provider<ci> provider, Provider<df.a> provider2, Provider<ge> provider3, Provider<el.a> provider4, Provider<em.a> provider5, Provider<lb.a> provider6) {
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
    }

    public static MembersInjector<em> a(Provider<ci> provider, Provider<df.a> provider2, Provider<ge> provider3, Provider<el.a> provider4, Provider<em.a> provider5, Provider<lb.a> provider6) {
        return new eq(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(em emVar) {
        if (emVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        emVar.v = this.b.get();
        emVar.e = this.c.get();
        emVar.f = this.d.get();
        emVar.g = this.e.get();
        emVar.h = this.f.get();
        emVar.i = this.g.get();
    }
}
