package com.vungle.publisher;

import com.vungle.publisher.tw;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ua implements MembersInjector<tw.a> {
    static final /* synthetic */ boolean a;
    private final Provider<tw> b;

    static {
        a = !ua.class.desiredAssertionStatus();
    }

    public ua(Provider<tw> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<tw.a> a(Provider<tw> provider) {
        return new ua(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(tw.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b;
    }
}
