package com.fyber.inneractive.sdk.util;
/* loaded from: classes.dex */
public final class ak {
    public int a;
    public int b;

    public ak(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ak akVar = (ak) obj;
            if (this.a == akVar.a && this.b == akVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
