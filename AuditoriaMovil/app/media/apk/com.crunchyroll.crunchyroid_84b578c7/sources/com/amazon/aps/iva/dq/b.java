package com.amazon.aps.iva.dq;

import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: RuntimeUtils.kt */
/* loaded from: classes2.dex */
public final class b extends l implements p<Integer, Throwable, Boolean> {
    public static final b h = new b();

    public b() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Boolean invoke(Integer num, Throwable th) {
        boolean z;
        if (num.intValue() >= com.amazon.aps.iva.jp.c.c) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
