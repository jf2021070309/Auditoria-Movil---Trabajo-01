package com.fyber.inneractive.sdk.player.c.g;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class i {
    public static final i a = new i(new h[0]);
    public final int b;
    public final h[] c;
    private int d;

    public i(h... hVarArr) {
        this.c = hVarArr;
        this.b = hVarArr.length;
    }

    public final int a(h hVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.c[i] == hVar) {
                return i;
            }
        }
        return -1;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = Arrays.hashCode(this.c);
        }
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            i iVar = (i) obj;
            if (this.b == iVar.b && Arrays.equals(this.c, iVar.c)) {
                return true;
            }
        }
        return false;
    }
}
