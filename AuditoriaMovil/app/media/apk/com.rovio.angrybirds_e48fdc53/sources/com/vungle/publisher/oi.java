package com.vungle.publisher;

import com.vungle.publisher.og;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class oi implements MembersInjector<og.a> {
    static final /* synthetic */ boolean a;
    private final Provider<zo> b;
    private final Provider<qg> c;

    static {
        a = !oi.class.desiredAssertionStatus();
    }

    public oi(Provider<zo> provider, Provider<qg> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<og.a> a(Provider<zo> provider, Provider<qg> provider2) {
        return new oi(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(og.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b.get();
        aVar.b = this.c.get();
    }
}
