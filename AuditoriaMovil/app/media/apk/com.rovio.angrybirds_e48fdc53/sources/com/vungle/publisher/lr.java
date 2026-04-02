package com.vungle.publisher;

import android.content.Context;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class lr implements MembersInjector<lp> {
    static final /* synthetic */ boolean a;
    private final Provider<Context> b;
    private final Provider<qg> c;

    static {
        a = !lr.class.desiredAssertionStatus();
    }

    public lr(Provider<Context> provider, Provider<qg> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<lp> a(Provider<Context> provider, Provider<qg> provider2) {
        return new lr(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(lp lpVar) {
        if (lpVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        lpVar.a = this.b.get();
        lpVar.b = this.c.get();
    }
}
