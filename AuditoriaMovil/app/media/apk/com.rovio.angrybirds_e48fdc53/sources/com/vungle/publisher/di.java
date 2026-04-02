package com.vungle.publisher;

import com.vungle.publisher.df;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class di implements MembersInjector<df.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<df> c;

    static {
        a = !di.class.desiredAssertionStatus();
    }

    public di(Provider<ci> provider, Provider<df> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<df.a> a(Provider<ci> provider, Provider<df> provider2) {
        return new di(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(df.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.a = this.c;
    }
}
