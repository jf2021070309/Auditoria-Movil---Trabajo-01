package com.vungle.publisher;

import com.vungle.publisher.ew;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ez implements MembersInjector<ew.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<ew> c;

    static {
        a = !ez.class.desiredAssertionStatus();
    }

    public ez(Provider<ci> provider, Provider<ew> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<ew.a> a(Provider<ci> provider, Provider<ew> provider2) {
        return new ez(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ew.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.a = this.c;
    }
}
