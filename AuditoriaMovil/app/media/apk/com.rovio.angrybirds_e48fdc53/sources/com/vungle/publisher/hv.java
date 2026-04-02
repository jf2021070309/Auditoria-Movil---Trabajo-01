package com.vungle.publisher;

import com.vungle.publisher.hs;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class hv implements MembersInjector<hs.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<hs> c;

    static {
        a = !hv.class.desiredAssertionStatus();
    }

    public hv(Provider<ci> provider, Provider<hs> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<hs.a> a(Provider<ci> provider, Provider<hs> provider2) {
        return new hv(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(hs.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.a = this.c;
    }
}
