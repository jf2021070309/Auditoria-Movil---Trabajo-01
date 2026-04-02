package com.vungle.publisher;

import com.vungle.publisher.ts;
import com.vungle.publisher.tw;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ug implements MembersInjector<ue> {
    static final /* synthetic */ boolean a;
    private final Provider<uh> b;
    private final Provider<tw.a> c;
    private final Provider<ts.a> d;

    static {
        a = !ug.class.desiredAssertionStatus();
    }

    public ug(Provider<uh> provider, Provider<tw.a> provider2, Provider<ts.a> provider3) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
        if (!a && provider2 == null) {
            throw new AssertionError();
        }
        this.c = provider2;
        if (!a && provider3 == null) {
            throw new AssertionError();
        }
        this.d = provider3;
    }

    public static MembersInjector<ue> a(Provider<uh> provider, Provider<tw.a> provider2, Provider<ts.a> provider3) {
        return new ug(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ue ueVar) {
        if (ueVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        ueVar.a = this.b.get();
        ueVar.b = this.c.get();
        ueVar.c = this.d.get();
    }
}
