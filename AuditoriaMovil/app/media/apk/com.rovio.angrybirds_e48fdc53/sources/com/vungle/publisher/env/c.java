package com.vungle.publisher.env;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.vungle.publisher.bw;
import com.vungle.publisher.qg;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class c implements MembersInjector<a> {
    static final /* synthetic */ boolean a;
    private final Provider<Context> b;
    private final Provider<qg> c;
    private final Provider<bw> d;
    private final Provider<WifiManager> e;

    static {
        a = !c.class.desiredAssertionStatus();
    }

    public c(Provider<Context> provider, Provider<qg> provider2, Provider<bw> provider3, Provider<WifiManager> provider4) {
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

    public static MembersInjector<a> a(Provider<Context> provider, Provider<qg> provider2, Provider<bw> provider3, Provider<WifiManager> provider4) {
        return new c(provider, provider2, provider3, provider4);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.c = this.b.get();
        aVar.d = this.c.get();
        aVar.e = this.d.get();
        aVar.a = this.b.get();
        aVar.b = this.e.get();
    }
}
