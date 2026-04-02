package com.vungle.publisher;

import com.vungle.publisher.jt;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class jw implements MembersInjector<jt.a> {
    static final /* synthetic */ boolean a;
    private final Provider<jt> b;

    static {
        a = !jw.class.desiredAssertionStatus();
    }

    public jw(Provider<jt> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<jt.a> a(Provider<jt> provider) {
        return new jw(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(jt.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        aVar.a = this.b.get();
    }
}
