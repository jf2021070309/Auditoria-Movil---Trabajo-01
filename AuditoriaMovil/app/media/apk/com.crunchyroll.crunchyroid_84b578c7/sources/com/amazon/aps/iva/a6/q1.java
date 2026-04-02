package com.amazon.aps.iva.a6;
/* compiled from: RendererConfiguration.java */
/* loaded from: classes.dex */
public final class q1 {
    public static final q1 b = new q1(false);
    public final boolean a;

    public q1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass() && this.a == ((q1) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return !this.a ? 1 : 0;
    }
}
