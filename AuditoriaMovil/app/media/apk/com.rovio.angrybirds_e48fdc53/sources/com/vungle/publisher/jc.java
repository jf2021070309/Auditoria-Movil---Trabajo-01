package com.vungle.publisher;

import com.vungle.publisher.iz;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class jc implements MembersInjector<iz.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<iz> c;

    static {
        a = !jc.class.desiredAssertionStatus();
    }

    public jc(Provider<ci> provider, Provider<iz> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<iz.a> a(Provider<ci> provider, Provider<iz> provider2) {
        return new jc(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(iz.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.a = this.c;
    }
}
