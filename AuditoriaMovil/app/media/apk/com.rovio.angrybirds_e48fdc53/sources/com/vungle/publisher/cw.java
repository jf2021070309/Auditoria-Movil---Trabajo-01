package com.vungle.publisher;

import com.vungle.publisher.ct;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class cw implements MembersInjector<ct.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<ct> c;

    static {
        a = !cw.class.desiredAssertionStatus();
    }

    public cw(Provider<ci> provider, Provider<ct> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<ct.a> a(Provider<ci> provider, Provider<ct> provider2) {
        return new cw(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ct.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.a = this.c;
    }
}
