package com.vungle.publisher;

import android.content.Context;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ch implements MembersInjector<cf> {
    static final /* synthetic */ boolean a;
    private final Provider<Context> b;
    private final Provider<ci> c;
    private final Provider<com.vungle.publisher.env.n> d;

    static {
        a = !ch.class.desiredAssertionStatus();
    }

    public ch(Provider<Context> provider, Provider<ci> provider2, Provider<com.vungle.publisher.env.n> provider3) {
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
    }

    public static MembersInjector<cf> a(Provider<Context> provider, Provider<ci> provider2, Provider<com.vungle.publisher.env.n> provider3) {
        return new ch(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(cf cfVar) {
        if (cfVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        cfVar.a = this.b.get();
        cfVar.b = this.c.get();
        cfVar.c = this.d.get();
    }
}
