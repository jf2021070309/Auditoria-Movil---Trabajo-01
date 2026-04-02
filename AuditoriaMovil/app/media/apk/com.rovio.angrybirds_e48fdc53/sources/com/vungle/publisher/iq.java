package com.vungle.publisher;

import com.vungle.publisher.im;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class iq implements MembersInjector<im> {
    static final /* synthetic */ boolean a;
    private final Provider<im.a> b;

    static {
        a = !iq.class.desiredAssertionStatus();
    }

    public iq(Provider<im.a> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<im> a(Provider<im.a> provider) {
        return new iq(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(im imVar) {
        if (imVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        imVar.a = this.b.get();
    }
}
