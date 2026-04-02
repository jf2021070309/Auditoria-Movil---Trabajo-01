package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.unity.ResourceUnityVersionProvider;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public class CrashlyticsNdkRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(CrashlyticsNativeComponent.class).add(Dependency.required(Context.class)).factory(new ComponentFactory() { // from class: com.google.firebase.crashlytics.ndk.-$$Lambda$CrashlyticsNdkRegistrar$Pjkt4zQ7jb-U0_I19nksvJJlmaM
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                CrashlyticsNativeComponent buildCrashlyticsNdk;
                buildCrashlyticsNdk = CrashlyticsNdkRegistrar.this.buildCrashlyticsNdk(componentContainer);
                return buildCrashlyticsNdk;
            }
        }).eagerInDefaultApp().build(), LibraryVersionComponent.create("fire-cls-ndk", "18.2.4"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CrashlyticsNativeComponent buildCrashlyticsNdk(ComponentContainer componentContainer) {
        Context context = (Context) componentContainer.get(Context.class);
        return FirebaseCrashlyticsNdk.create(context, ResourceUnityVersionProvider.resolveUnityEditorVersion(context) == null);
    }
}
