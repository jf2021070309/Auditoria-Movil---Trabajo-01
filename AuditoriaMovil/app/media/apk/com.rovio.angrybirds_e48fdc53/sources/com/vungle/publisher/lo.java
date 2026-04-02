package com.vungle.publisher;

import android.media.AudioManager;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class lo implements MembersInjector<lm> {
    static final /* synthetic */ boolean a;
    private final Provider<AudioManager> b;

    static {
        a = !lo.class.desiredAssertionStatus();
    }

    public lo(Provider<AudioManager> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<lm> a(Provider<AudioManager> provider) {
        return new lo(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(lm lmVar) {
        if (lmVar == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        lmVar.a = this.b.get();
    }
}
