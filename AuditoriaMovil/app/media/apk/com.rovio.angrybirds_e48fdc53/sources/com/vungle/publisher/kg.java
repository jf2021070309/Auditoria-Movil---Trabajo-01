package com.vungle.publisher;

import com.vungle.publisher.kd;
import com.vungle.publisher.kj;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class kg implements MembersInjector<kd.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<kd> c;
    private final Provider<kj.a> d;

    static {
        a = !kg.class.desiredAssertionStatus();
    }

    public kg(Provider<ci> provider, Provider<kd> provider2, Provider<kj.a> provider3) {
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

    public static MembersInjector<kd.a> a(Provider<ci> provider, Provider<kd> provider2, Provider<kj.a> provider3) {
        return new kg(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(kd.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.a = this.c;
        aVar.b = this.d.get();
    }
}
