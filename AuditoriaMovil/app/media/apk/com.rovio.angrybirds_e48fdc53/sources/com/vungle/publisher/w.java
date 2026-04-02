package com.vungle.publisher;

import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class w implements MembersInjector<u> {
    static final /* synthetic */ boolean a;
    private final Provider<AdConfig> b;

    static {
        a = !w.class.desiredAssertionStatus();
    }

    public w(Provider<AdConfig> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<u> a(Provider<AdConfig> provider) {
        return new w(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(u uVar) {
        if (uVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        uVar.a = this.b.get();
    }
}
