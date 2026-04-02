package com.vungle.publisher;

import com.vungle.publisher.wa;
import com.vungle.publisher.wv;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class wx implements MembersInjector<wv.a> {
    static final /* synthetic */ boolean a;
    private final Provider<wa.a> b;

    static {
        a = !wx.class.desiredAssertionStatus();
    }

    public wx(Provider<wa.a> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<wv.a> a(Provider<wa.a> provider) {
        return new wx(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(wv.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b.get();
    }
}
