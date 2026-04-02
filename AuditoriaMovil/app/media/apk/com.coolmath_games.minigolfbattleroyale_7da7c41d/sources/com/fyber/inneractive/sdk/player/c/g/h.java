package com.fyber.inneractive.sdk.player.c.g;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class h {
    public final int a;
    public final com.fyber.inneractive.sdk.player.c.h[] b;
    private int c;

    public h(com.fyber.inneractive.sdk.player.c.h... hVarArr) {
        com.fyber.inneractive.sdk.player.c.k.a.b(true);
        this.b = hVarArr;
        this.a = 1;
    }

    public final int a(com.fyber.inneractive.sdk.player.c.h hVar) {
        int i = 0;
        while (true) {
            com.fyber.inneractive.sdk.player.c.h[] hVarArr = this.b;
            if (i >= hVarArr.length) {
                return -1;
            }
            if (hVar == hVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = Arrays.hashCode(this.b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            h hVar = (h) obj;
            if (this.a == hVar.a && Arrays.equals(this.b, hVar.b)) {
                return true;
            }
        }
        return false;
    }
}
