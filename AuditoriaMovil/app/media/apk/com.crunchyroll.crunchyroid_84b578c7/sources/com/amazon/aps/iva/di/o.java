package com.amazon.aps.iva.di;

import com.amazon.aps.iva.j0.j0;
/* compiled from: FeaturedMusicViewModel.kt */
/* loaded from: classes.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<String> {
    public static final o h = new o();

    public o() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        return j0.d("randomUUID().toString()");
    }
}
