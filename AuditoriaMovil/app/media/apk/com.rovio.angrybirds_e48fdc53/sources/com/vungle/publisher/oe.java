package com.vungle.publisher;

import com.vungle.publisher.ob;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class oe implements MembersInjector<ob.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ob> b;

    static {
        a = !oe.class.desiredAssertionStatus();
    }

    public oe(Provider<ob> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<ob.a> a(Provider<ob> provider) {
        return new oe(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ob.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b;
    }
}
