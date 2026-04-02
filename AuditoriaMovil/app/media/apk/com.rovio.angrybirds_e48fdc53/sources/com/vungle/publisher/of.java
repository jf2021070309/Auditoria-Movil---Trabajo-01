package com.vungle.publisher;

import android.content.Context;
import com.vungle.publisher.lf;
import com.vungle.publisher.om;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class of implements MembersInjector<ob> {
    static final /* synthetic */ boolean a;
    private final Provider<mq> b;
    private final Provider<com.vungle.publisher.env.i> c;
    private final Provider<qg> d;
    private final Provider<lf.b> e;
    private final Provider<Context> f;
    private final Provider<om.a> g;

    static {
        a = !of.class.desiredAssertionStatus();
    }

    public of(Provider<mq> provider, Provider<com.vungle.publisher.env.i> provider2, Provider<qg> provider3, Provider<lf.b> provider4, Provider<Context> provider5, Provider<om.a> provider6) {
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

    public static MembersInjector<ob> a(Provider<mq> provider, Provider<com.vungle.publisher.env.i> provider2, Provider<qg> provider3, Provider<lf.b> provider4, Provider<Context> provider5, Provider<om.a> provider6) {
        return new of(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ob obVar) {
        if (obVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        obVar.d = this.b.get();
        obVar.j = this.c.get();
        obVar.k = this.d.get();
        obVar.l = this.e.get();
        obVar.m = this.f.get();
        obVar.n = this.g.get();
    }
}
