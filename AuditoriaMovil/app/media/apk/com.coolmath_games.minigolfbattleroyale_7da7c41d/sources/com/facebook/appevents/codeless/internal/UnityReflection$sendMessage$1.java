package com.facebook.appevents.codeless.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
/* compiled from: UnityReflection.kt */
@Metadata(k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
final /* synthetic */ class UnityReflection$sendMessage$1 extends MutablePropertyReference0Impl {
    UnityReflection$sendMessage$1(UnityReflection unityReflection) {
        super(unityReflection, UnityReflection.class, "unityPlayer", "getUnityPlayer()Ljava/lang/Class;", 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
    public Object get() {
        return UnityReflection.access$getUnityPlayer$p((UnityReflection) this.receiver);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
    public void set(Object obj) {
        UnityReflection unityReflection = (UnityReflection) this.receiver;
        UnityReflection.unityPlayer = (Class) obj;
    }
}
