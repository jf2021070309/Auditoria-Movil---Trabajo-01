package com.vungle.publisher;

import com.vungle.publisher.hk;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class hn implements MembersInjector<hk.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<hk> c;

    static {
        a = !hn.class.desiredAssertionStatus();
    }

    public hn(Provider<ci> provider, Provider<hk> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<hk.a> a(Provider<ci> provider, Provider<hk> provider2) {
        return new hn(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(hk.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.a = this.c;
    }
}
