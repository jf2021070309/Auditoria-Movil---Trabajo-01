package com.vungle.publisher;

import com.vungle.publisher.jy;
import com.vungle.publisher.ks;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class kv implements MembersInjector<ks.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ks> b;
    private final Provider<jy.a> c;

    static {
        a = !kv.class.desiredAssertionStatus();
    }

    public kv(Provider<ks> provider, Provider<jy.a> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<ks.a> a(Provider<ks> provider, Provider<jy.a> provider2) {
        return new kv(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ks.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b;
        aVar.b = this.c.get();
    }
}
