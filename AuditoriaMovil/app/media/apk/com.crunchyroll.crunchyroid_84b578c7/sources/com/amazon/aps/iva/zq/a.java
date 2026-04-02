package com.amazon.aps.iva.zq;

import android.content.Context;
import android.view.Window;
import com.amazon.aps.iva.gr.l;
import com.amazon.aps.iva.gr.p;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.o0.n3;
import com.amazon.aps.iva.yb0.j;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* compiled from: DatadogGesturesTracker.kt */
/* loaded from: classes2.dex */
public final class a implements c {
    public final p[] a;
    public final l b;

    public a(p[] pVarArr, l lVar) {
        this.a = pVarArr;
        this.b = lVar;
    }

    @Override // com.amazon.aps.iva.zq.c
    public final void a(Context context, Window window) {
        j.f(context, "context");
        if (window == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new d();
        }
        window.setCallback(new f(window, callback, new n3(context, new b(new WeakReference(window), this.a, this.b)), this.b, this.a));
    }

    @Override // com.amazon.aps.iva.zq.c
    public final void b(Context context, Window window) {
        j.f(context, "context");
        if (window == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof f) {
            Window.Callback callback2 = ((f) callback).b;
            if (!(callback2 instanceof d)) {
                window.setCallback(callback2);
            } else {
                window.setCallback(null);
            }
        }
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (!j.a(a.class, cls)) {
            return false;
        }
        if (obj != null) {
            a aVar = (a) obj;
            if (Arrays.equals(this.a, aVar.a) && j.a(this.b.getClass(), aVar.b.getClass())) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.datadog.android.rum.internal.instrumentation.gestures.DatadogGesturesTracker");
    }

    public final int hashCode() {
        int hashCode = 527 + Arrays.hashCode(this.a) + 17;
        return this.b.getClass().hashCode() + (hashCode * 31) + hashCode;
    }

    public final String toString() {
        return defpackage.e.e("DatadogGesturesTracker(", o.V(this.a, null, null, null, null, 63), ")");
    }
}
