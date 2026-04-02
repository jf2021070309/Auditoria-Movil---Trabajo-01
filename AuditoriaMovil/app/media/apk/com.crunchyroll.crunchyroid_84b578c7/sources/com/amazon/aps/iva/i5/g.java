package com.amazon.aps.iva.i5;
/* compiled from: DefaultLifecycleObserver.kt */
/* loaded from: classes.dex */
public interface g extends n {
    default void onCreate(o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "owner");
    }

    default void onDestroy(o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "owner");
    }

    default void onPause(o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "owner");
    }

    default void onStart(o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "owner");
    }

    default void onStop(o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "owner");
    }

    default void onResume(o oVar) {
    }
}
