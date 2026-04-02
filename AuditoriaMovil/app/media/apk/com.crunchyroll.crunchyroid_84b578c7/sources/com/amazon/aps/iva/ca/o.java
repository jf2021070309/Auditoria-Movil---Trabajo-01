package com.amazon.aps.iva.ca;

import android.graphics.PointF;
import com.amazon.aps.iva.fa.b;
/* compiled from: TextKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class o extends com.amazon.aps.iva.na.c<com.amazon.aps.iva.fa.b> {
    public final /* synthetic */ com.amazon.aps.iva.na.b c;
    public final /* synthetic */ com.amazon.aps.iva.na.c d;
    public final /* synthetic */ com.amazon.aps.iva.fa.b e;

    public o(com.amazon.aps.iva.na.b bVar, com.amazon.aps.iva.na.c cVar, com.amazon.aps.iva.fa.b bVar2) {
        this.c = bVar;
        this.d = cVar;
        this.e = bVar2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.String] */
    @Override // com.amazon.aps.iva.na.c
    public final com.amazon.aps.iva.fa.b a(com.amazon.aps.iva.na.b<com.amazon.aps.iva.fa.b> bVar) {
        com.amazon.aps.iva.fa.b bVar2;
        float f = bVar.a;
        float f2 = bVar.b;
        ?? r2 = bVar.c.a;
        ?? r3 = bVar.d.a;
        float f3 = bVar.e;
        float f4 = bVar.f;
        float f5 = bVar.g;
        com.amazon.aps.iva.na.b bVar3 = this.c;
        bVar3.a = f;
        bVar3.b = f2;
        bVar3.c = r2;
        bVar3.d = r3;
        bVar3.e = f3;
        bVar3.f = f4;
        bVar3.g = f5;
        String str = (String) this.d.a(bVar3);
        if (bVar.f == 1.0f) {
            bVar2 = bVar.d;
        } else {
            bVar2 = bVar.c;
        }
        com.amazon.aps.iva.fa.b bVar4 = bVar2;
        String str2 = bVar4.b;
        float f6 = bVar4.c;
        b.a aVar = bVar4.d;
        int i = bVar4.e;
        float f7 = bVar4.f;
        float f8 = bVar4.g;
        int i2 = bVar4.h;
        int i3 = bVar4.i;
        float f9 = bVar4.j;
        boolean z = bVar4.k;
        PointF pointF = bVar4.l;
        PointF pointF2 = bVar4.m;
        com.amazon.aps.iva.fa.b bVar5 = this.e;
        bVar5.a = str;
        bVar5.b = str2;
        bVar5.c = f6;
        bVar5.d = aVar;
        bVar5.e = i;
        bVar5.f = f7;
        bVar5.g = f8;
        bVar5.h = i2;
        bVar5.i = i3;
        bVar5.j = f9;
        bVar5.k = z;
        bVar5.l = pointF;
        bVar5.m = pointF2;
        return bVar5;
    }
}
