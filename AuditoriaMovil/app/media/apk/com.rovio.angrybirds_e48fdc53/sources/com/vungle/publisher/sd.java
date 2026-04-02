package com.vungle.publisher;

import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class sd implements MembersInjector<rz> {
    static final /* synthetic */ boolean a;
    private final Provider<mv> b;

    static {
        a = !sd.class.desiredAssertionStatus();
    }

    public sd(Provider<mv> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<rz> a(Provider<mv> provider) {
        return new sd(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(rz rzVar) {
        if (rzVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        rzVar.p = this.b.get();
    }
}
