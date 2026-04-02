package com.vungle.publisher;

import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class tm implements MembersInjector<tj> {
    static final /* synthetic */ boolean a;
    private final Provider<uq> b;
    private final Provider<bw> c;

    static {
        a = !tm.class.desiredAssertionStatus();
    }

    public tm(Provider<uq> provider, Provider<bw> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<tj> a(Provider<uq> provider, Provider<bw> provider2) {
        return new tm(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(tj tjVar) {
        if (tjVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        tjVar.a = this.b.get();
        tjVar.b = this.c.get();
    }
}
