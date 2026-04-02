package com.vungle.publisher;

import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class by implements MembersInjector<bw> {
    static final /* synthetic */ boolean a;
    private final Provider<zl> b;

    static {
        a = !by.class.desiredAssertionStatus();
    }

    public by(Provider<zl> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<bw> a(Provider<zl> provider) {
        return new by(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(bw bwVar) {
        if (bwVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        bwVar.a = this.b.get();
    }
}
