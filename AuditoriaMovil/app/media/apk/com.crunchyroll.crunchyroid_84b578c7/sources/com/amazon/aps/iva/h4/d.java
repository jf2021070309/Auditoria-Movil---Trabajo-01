package com.amazon.aps.iva.h4;

import android.os.Looper;
import android.util.AndroidRuntimeException;
/* compiled from: SpringAnimation.java */
/* loaded from: classes.dex */
public final class d extends b<d> {
    public e r;
    public float s;
    public boolean t;

    public <K> d(K k, c<K> cVar) {
        super(k, cVar);
        this.r = null;
        this.s = Float.MAX_VALUE;
        this.t = false;
    }

    public final void c() {
        boolean z;
        if (this.r.b > 0.0d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f) {
                    this.t = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }
}
