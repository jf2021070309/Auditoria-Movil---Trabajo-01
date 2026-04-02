package com.fyber.inneractive.sdk.player.c.i;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class f {
    public final int a;
    public final e[] b;
    private int c;

    public f(e... eVarArr) {
        this.b = eVarArr;
        this.a = eVarArr.length;
    }

    public final e[] a() {
        return (e[]) this.b.clone();
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((f) obj).b);
    }
}
