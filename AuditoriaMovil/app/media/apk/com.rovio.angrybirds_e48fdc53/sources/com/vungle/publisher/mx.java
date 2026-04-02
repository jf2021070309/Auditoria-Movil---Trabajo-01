package com.vungle.publisher;

import android.content.Context;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class mx implements MembersInjector<mv> {
    static final /* synthetic */ boolean a;
    private final Provider<Context> b;

    static {
        a = !mx.class.desiredAssertionStatus();
    }

    public mx(Provider<Context> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<mv> a(Provider<Context> provider) {
        return new mx(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(mv mvVar) {
        if (mvVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        mvVar.a = this.b.get();
    }
}
