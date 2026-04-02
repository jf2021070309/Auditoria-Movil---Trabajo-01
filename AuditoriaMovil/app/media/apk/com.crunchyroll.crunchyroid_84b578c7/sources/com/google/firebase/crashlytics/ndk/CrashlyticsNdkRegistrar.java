package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.amazon.aps.iva.l90.c;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes4.dex */
public class CrashlyticsNdkRegistrar implements ComponentRegistrar {
    public CrashlyticsNativeComponent buildCrashlyticsNdk(ComponentContainer componentContainer) {
        Context context = (Context) componentContainer.get(Context.class);
        return FirebaseCrashlyticsNdk.create(context, !DevelopmentPlatformProvider.isUnity(context));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(CrashlyticsNativeComponent.class).add(Dependency.required(Context.class)).factory(new c(this, 1)).eagerInDefaultApp().build(), LibraryVersionComponent.create("fire-cls-ndk", "18.2.6"));
    }
}
