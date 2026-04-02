package com.vungle.publisher;

import com.vungle.publisher.kj;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class km implements MembersInjector<kj.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<kj> c;

    static {
        a = !km.class.desiredAssertionStatus();
    }

    public km(Provider<ci> provider, Provider<kj> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<kj.a> a(Provider<ci> provider, Provider<kj> provider2) {
        return new km(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(kj.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.a = this.c;
    }
}
