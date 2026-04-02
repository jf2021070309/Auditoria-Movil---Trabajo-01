package com.amazon.aps.iva.p10;

import java.util.ArrayList;
import java.util.List;
/* compiled from: SubgenreCarouselDataModel.kt */
/* loaded from: classes2.dex */
public final class a {
    public final int a;
    public final List<com.amazon.aps.iva.q10.e> b;
    public final String c;
    public final com.amazon.aps.iva.l10.a d;
    public final com.amazon.aps.iva.a00.b e;

    public a() {
        throw null;
    }

    public a(int i, ArrayList arrayList, String str, com.amazon.aps.iva.l10.a aVar, com.amazon.aps.iva.a00.b bVar, int i2) {
        str = (i2 & 4) != 0 ? null : str;
        aVar = (i2 & 8) != 0 ? null : aVar;
        bVar = (i2 & 16) != 0 ? null : bVar;
        this.a = i;
        this.b = arrayList;
        this.c = str;
        this.d = aVar;
        this.e = bVar;
    }
}
