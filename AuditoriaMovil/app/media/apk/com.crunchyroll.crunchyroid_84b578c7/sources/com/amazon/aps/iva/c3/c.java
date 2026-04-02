package com.amazon.aps.iva.c3;

import android.app.Application;
import com.amazon.aps.iva.c3.e;
/* compiled from: ActivityRecreator.java */
/* loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ Application b;
    public final /* synthetic */ e.a c;

    public c(Application application, e.a aVar) {
        this.b = application;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.unregisterActivityLifecycleCallbacks(this.c);
    }
}
