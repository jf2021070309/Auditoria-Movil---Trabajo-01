package com.amazon.aps.iva.l90;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.crashlytics.ndk.CrashlyticsNdkRegistrar;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements ComponentFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        Object lambda$of$0;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                lambda$of$0 = Component.lambda$of$0(obj, componentContainer);
                return lambda$of$0;
            default:
                return CrashlyticsNdkRegistrar.a((CrashlyticsNdkRegistrar) obj, componentContainer);
        }
    }
}
