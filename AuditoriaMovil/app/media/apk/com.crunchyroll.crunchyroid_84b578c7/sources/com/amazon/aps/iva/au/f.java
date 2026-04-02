package com.amazon.aps.iva.au;

import com.amazon.aps.iva.du.x;
/* compiled from: CommentsViewTypeProvider.kt */
/* loaded from: classes2.dex */
public final class f implements e {
    public final int a;

    public f(int i) {
        this.a = i;
    }

    @Override // com.amazon.aps.iva.au.e
    public final int a(x xVar) {
        int i = this.a;
        if (xVar != null && xVar.o) {
            if (i == 12002) {
                return 12005;
            }
            return 12004;
        } else if (xVar != null && xVar.q) {
            return 12006;
        } else {
            return i;
        }
    }
}
