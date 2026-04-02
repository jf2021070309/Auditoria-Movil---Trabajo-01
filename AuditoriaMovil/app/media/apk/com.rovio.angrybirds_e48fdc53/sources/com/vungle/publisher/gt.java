package com.vungle.publisher;

import com.vungle.publisher.gq;
import com.vungle.publisher.gw;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class gt implements MembersInjector<gq.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<gq> c;
    private final Provider<gw.a> d;

    static {
        a = !gt.class.desiredAssertionStatus();
    }

    public gt(Provider<ci> provider, Provider<gq> provider2, Provider<gw.a> provider3) {
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

    public static MembersInjector<gq.a> a(Provider<ci> provider, Provider<gq> provider2, Provider<gw.a> provider3) {
        return new gt(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(gq.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.a = this.c;
        aVar.b = this.d.get();
    }
}
