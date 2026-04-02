package com.vungle.publisher;

import com.vungle.publisher.iz;
import com.vungle.publisher.rg;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class rk implements MembersInjector<rg.a> {
    static final /* synthetic */ boolean a;
    private final Provider<rg> b;
    private final Provider<iz.a> c;

    static {
        a = !rk.class.desiredAssertionStatus();
    }

    public rk(Provider<rg> provider, Provider<iz.a> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<rg.a> a(Provider<rg> provider, Provider<iz.a> provider2) {
        return new rk(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(rg.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b;
        aVar.b = this.c.get();
    }
}
