package com.vungle.publisher;

import com.vungle.publisher.df;
import com.vungle.publisher.jn;
import com.vungle.publisher.jo;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class js implements MembersInjector<jo> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<df.a> c;
    private final Provider<ge> d;
    private final Provider<jn.a> e;
    private final Provider<jo.a> f;

    static {
        a = !js.class.desiredAssertionStatus();
    }

    public js(Provider<ci> provider, Provider<df.a> provider2, Provider<ge> provider3, Provider<jn.a> provider4, Provider<jo.a> provider5) {
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
    }

    public static MembersInjector<jo> a(Provider<ci> provider, Provider<df.a> provider2, Provider<ge> provider3, Provider<jn.a> provider4, Provider<jo.a> provider5) {
        return new js(provider, provider2, provider3, provider4, provider5);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(jo joVar) {
        if (joVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        joVar.v = this.b.get();
        joVar.e = this.c.get();
        joVar.f = this.d.get();
        joVar.g = this.e.get();
        joVar.h = this.f.get();
    }
}
