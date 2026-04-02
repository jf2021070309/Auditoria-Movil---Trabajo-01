package com.fyber.inneractive.sdk.player.c;
/* loaded from: classes.dex */
public final class p {
    public static final p a = new p(0);
    public final int b;

    public p(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.b == ((p) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }
}
