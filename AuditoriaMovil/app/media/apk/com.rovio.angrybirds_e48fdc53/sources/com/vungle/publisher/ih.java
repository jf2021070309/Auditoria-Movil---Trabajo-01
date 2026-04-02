package com.vungle.publisher;

import com.vungle.publisher.id;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ih implements MembersInjector<id> {
    static final /* synthetic */ boolean a;
    private final Provider<ci> b;
    private final Provider<id.a> c;

    static {
        a = !ih.class.desiredAssertionStatus();
    }

    public ih(Provider<ci> provider, Provider<id.a> provider2) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
    }

    public static MembersInjector<id> a(Provider<ci> provider, Provider<id.a> provider2) {
        return new ih(provider, provider2);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(id idVar) {
        if (idVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        idVar.v = this.b.get();
        idVar.e = this.c.get();
    }
}
