package com.amazon.aps.iva.z9;

import java.util.Arrays;
/* compiled from: LottieResult.java */
/* loaded from: classes.dex */
public final class i0<V> {
    public final V a;
    public final Throwable b;

    /* JADX WARN: Multi-variable type inference failed */
    public i0(h hVar) {
        this.a = hVar;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        V v = this.a;
        if (v != null && v.equals(i0Var.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || i0Var.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public i0(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
