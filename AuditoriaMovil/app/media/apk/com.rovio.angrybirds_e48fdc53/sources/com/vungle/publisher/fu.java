package com.vungle.publisher;

import com.vungle.publisher.fq;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class fu implements MembersInjector<fq> {
    static final /* synthetic */ boolean a;
    private final Provider<fq.a> b;

    static {
        a = !fu.class.desiredAssertionStatus();
    }

    public fu(Provider<fq.a> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<fq> a(Provider<fq.a> provider) {
        return new fu(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(fq fqVar) {
        if (fqVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        fqVar.a = this.b.get();
    }
}
