package com.vungle.publisher;

import com.vungle.publisher.id;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ig implements MembersInjector<id.a> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<id> c;

    static {
        a = !ig.class.desiredAssertionStatus();
    }

    public ig(Provider<ci> provider, Provider<id> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<id.a> a(Provider<ci> provider, Provider<id> provider2) {
        return new ig(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(id.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.d = this.b.get();
        aVar.a = this.c;
    }
}
