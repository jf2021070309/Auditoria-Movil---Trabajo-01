package com.vungle.publisher.image;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
/* loaded from: classes4.dex */
public final class a implements Factory<AssetBitmapFactory> {
    static final /* synthetic */ boolean a;
    private final MembersInjector<AssetBitmapFactory> b;

    static {
        a = !a.class.desiredAssertionStatus();
    }

    public a(MembersInjector<AssetBitmapFactory> membersInjector) {
        if (!a && membersInjector == null) {
            throw new AssertionError();
        }
        this.b = membersInjector;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public AssetBitmapFactory get() {
        return (AssetBitmapFactory) MembersInjectors.injectMembers(this.b, new AssetBitmapFactory());
    }

    public static Factory<AssetBitmapFactory> a(MembersInjector<AssetBitmapFactory> membersInjector) {
        return new a(membersInjector);
    }
}
