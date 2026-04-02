package com.vungle.publisher;

import com.vungle.publisher.ew;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class fa implements MembersInjector<ew> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<ew.a> c;

    static {
        a = !fa.class.desiredAssertionStatus();
    }

    public fa(Provider<ci> provider, Provider<ew.a> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<ew> a(Provider<ci> provider, Provider<ew.a> provider2) {
        return new fa(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ew ewVar) {
        if (ewVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        ewVar.v = this.b.get();
        ewVar.d = this.c.get();
    }
}
