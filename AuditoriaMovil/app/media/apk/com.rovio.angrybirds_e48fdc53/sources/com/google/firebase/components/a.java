package com.google.firebase.components;

import com.google.firebase.inject.Provider;
/* loaded from: classes2.dex */
abstract class a implements ComponentContainer {
    @Override // com.google.firebase.components.ComponentContainer
    public <T> T get(Class<T> cls) {
        Provider<T> provider = getProvider(cls);
        if (provider == null) {
            return null;
        }
        return provider.get();
    }
}
