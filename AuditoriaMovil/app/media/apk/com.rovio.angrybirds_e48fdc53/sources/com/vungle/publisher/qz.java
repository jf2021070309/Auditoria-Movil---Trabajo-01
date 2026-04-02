package com.vungle.publisher;

import android.content.Context;
import com.vungle.publisher.env.WrapperFramework;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class qz implements MembersInjector<qw> {
    static final /* synthetic */ boolean a;
    private final Provider<Context> b;
    private final Provider<com.vungle.publisher.env.n> c;
    private final Provider<com.vungle.publisher.env.i> d;
    private final Provider<WrapperFramework> e;
    private final Provider<String> f;

    static {
        a = !qz.class.desiredAssertionStatus();
    }

    public qz(Provider<Context> provider, Provider<com.vungle.publisher.env.n> provider2, Provider<com.vungle.publisher.env.i> provider3, Provider<WrapperFramework> provider4, Provider<String> provider5) {
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

    public static MembersInjector<qw> a(Provider<Context> provider, Provider<com.vungle.publisher.env.n> provider2, Provider<com.vungle.publisher.env.i> provider3, Provider<WrapperFramework> provider4, Provider<String> provider5) {
        return new qz(provider, provider2, provider3, provider4, provider5);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(qw qwVar) {
        if (qwVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        qwVar.a = this.b.get();
        qwVar.b = this.c.get();
        qwVar.c = this.d.get();
        qwVar.d = this.e.get();
        qwVar.e = this.f.get();
    }
}
