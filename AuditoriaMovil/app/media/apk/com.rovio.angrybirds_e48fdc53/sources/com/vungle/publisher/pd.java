package com.vungle.publisher;

import com.vungle.publisher.oy;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class pd implements MembersInjector<oy.a.C0334a> {
    static final /* synthetic */ boolean a;
    private final Provider<oy.a> b;

    static {
        a = !pd.class.desiredAssertionStatus();
    }

    public pd(Provider<oy.a> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<oy.a.C0334a> a(Provider<oy.a> provider) {
        return new pd(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(oy.a.C0334a c0334a) {
        if (c0334a == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        c0334a.a = this.b.get();
    }
}
