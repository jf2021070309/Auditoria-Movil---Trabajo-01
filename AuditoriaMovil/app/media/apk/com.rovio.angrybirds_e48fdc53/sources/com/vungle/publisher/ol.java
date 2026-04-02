package com.vungle.publisher;

import android.content.Context;
import com.vungle.publisher.oj;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ol implements MembersInjector<oj.a> {
    static final /* synthetic */ boolean a;
    private final Provider<Context> b;
    private final Provider<mv> c;

    static {
        a = !ol.class.desiredAssertionStatus();
    }

    public ol(Provider<Context> provider, Provider<mv> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<oj.a> a(Provider<Context> provider, Provider<mv> provider2) {
        return new ol(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(oj.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b.get();
        aVar.b = this.c.get();
    }
}
