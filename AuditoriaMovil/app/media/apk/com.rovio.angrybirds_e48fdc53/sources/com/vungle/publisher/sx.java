package com.vungle.publisher;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class sx implements MembersInjector<sv> {
    static final /* synthetic */ boolean a;
    private final Provider<ConnectivityManager> b;
    private final Provider<ta> c;
    private final Provider<TelephonyManager> d;

    static {
        a = !sx.class.desiredAssertionStatus();
    }

    public sx(Provider<ConnectivityManager> provider, Provider<ta> provider2, Provider<TelephonyManager> provider3) {
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

    public static MembersInjector<sv> a(Provider<ConnectivityManager> provider, Provider<ta> provider2, Provider<TelephonyManager> provider3) {
        return new sx(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(sv svVar) {
        if (svVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        svVar.a = this.b.get();
        svVar.b = this.c;
        svVar.c = this.d.get();
    }
}
