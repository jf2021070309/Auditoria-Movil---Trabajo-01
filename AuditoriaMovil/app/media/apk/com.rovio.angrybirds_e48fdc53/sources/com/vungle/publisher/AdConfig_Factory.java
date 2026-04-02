package com.vungle.publisher;

import dagger.internal.Factory;
/* loaded from: classes4.dex */
public enum AdConfig_Factory implements Factory<AdConfig> {
    INSTANCE;

    @Override // javax.inject.Provider
    public AdConfig get() {
        return new AdConfig();
    }

    public static Factory<AdConfig> create() {
        return INSTANCE;
    }
}
