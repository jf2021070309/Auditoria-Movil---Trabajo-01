package com.vungle.publisher;

import com.vungle.publisher.jy;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class kb implements MembersInjector<jy.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<jy> c;

    static {
        a = !kb.class.desiredAssertionStatus();
    }

    public kb(Provider<ci> provider, Provider<jy> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<jy.a> a(Provider<ci> provider, Provider<jy> provider2) {
        return new kb(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(jy.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.a = this.c;
    }
}
