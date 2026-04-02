package com.vungle.publisher;

import com.vungle.publisher.yn;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class yq implements MembersInjector<yn.a> {
    static final /* synthetic */ boolean a;
    private final Provider<yn> b;

    static {
        a = !yq.class.desiredAssertionStatus();
    }

    public yq(Provider<yn> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<yn.a> a(Provider<yn> provider) {
        return new yq(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(yn.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b.get();
    }
}
