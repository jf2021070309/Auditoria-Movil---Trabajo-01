package com.vungle.publisher.image;

import android.content.Context;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class b implements MembersInjector<AssetBitmapFactory> {
    static final /* synthetic */ boolean a;
    private final Provider<Context> b;

    static {
        a = !b.class.desiredAssertionStatus();
    }

    public b(Provider<Context> provider) {
        if (!a && provider == null) {
            throw new AssertionError();
        }
        this.b = provider;
    }

    public static MembersInjector<AssetBitmapFactory> a(Provider<Context> provider) {
        return new b(provider);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(AssetBitmapFactory assetBitmapFactory) {
        if (assetBitmapFactory == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
        assetBitmapFactory.a = this.b.get();
    }
}
