package com.amazon.aps.iva.oy;

import java.util.Date;
/* compiled from: InAppUpdatesStore.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Long> {
    public static final j h = new j();

    public j() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Long invoke() {
        return Long.valueOf(com.amazon.aps.iva.gr.n.x(new Date().getTime()));
    }
}
