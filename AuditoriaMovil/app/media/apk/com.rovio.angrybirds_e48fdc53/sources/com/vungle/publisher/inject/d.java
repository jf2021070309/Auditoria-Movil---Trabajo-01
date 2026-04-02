package com.vungle.publisher.inject;

import android.content.Context;
import android.media.AudioManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class d implements Factory<AudioManager> {
    static final /* synthetic */ boolean a;
    private final a b;
    private final Provider<Context> c;

    static {
        a = !d.class.desiredAssertionStatus();
    }

    public d(a aVar, Provider<Context> provider) {
        if (!a && aVar == null) {
            throw new AssertionError();
        }
        this.b = aVar;
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.c = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public AudioManager get() {
        return (AudioManager) Preconditions.checkNotNull(this.b.c(this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static Factory<AudioManager> a(a aVar, Provider<Context> provider) {
        return new d(aVar, provider);
    }
}
