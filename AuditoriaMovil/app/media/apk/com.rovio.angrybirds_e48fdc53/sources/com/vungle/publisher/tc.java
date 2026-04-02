package com.vungle.publisher;

import android.content.Context;
import android.net.ConnectivityManager;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class tc implements MembersInjector<ta> {
    static final /* synthetic */ boolean a;
    private final Provider<Context> b;
    private final Provider<sz> c;
    private final Provider<qg> d;
    private final Provider<ConnectivityManager> e;

    static {
        a = !tc.class.desiredAssertionStatus();
    }

    public tc(Provider<Context> provider, Provider<sz> provider2, Provider<qg> provider3, Provider<ConnectivityManager> provider4) {
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
    }

    public static MembersInjector<ta> a(Provider<Context> provider, Provider<sz> provider2, Provider<qg> provider3, Provider<ConnectivityManager> provider4) {
        return new tc(provider, provider2, provider3, provider4);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ta taVar) {
        if (taVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        taVar.a = this.b.get();
        taVar.b = this.c.get();
        taVar.c = this.d.get();
        taVar.d = this.e.get();
    }
}
