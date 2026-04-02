package com.ellation.crunchyroll.application;

import com.amazon.aps.iva.i5.o;
/* compiled from: AppLifecycle.kt */
/* loaded from: classes2.dex */
public interface d extends o {

    /* compiled from: AppLifecycle.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static d a() {
            return AppLifecycleImpl.c;
        }
    }

    void Lf(com.amazon.aps.iva.ys.d dVar);

    void S7(com.amazon.aps.iva.ys.d dVar, o oVar);

    boolean isResumed();
}
