package com.amazon.aps.iva.fs;

import java.util.concurrent.TimeUnit;
/* compiled from: ScreenLoadingTimer.kt */
/* loaded from: classes2.dex */
public final class d implements c {
    public final long a = System.currentTimeMillis();

    @Override // com.amazon.aps.iva.fs.c
    public final float a() {
        return ((float) (System.currentTimeMillis() - this.a)) / ((float) TimeUnit.SECONDS.toMillis(1L));
    }
}
