package com.amazon.aps.iva.a2;
/* compiled from: SemanticsProperties.kt */
/* loaded from: classes.dex */
public final class j {
    public final com.amazon.aps.iva.xb0.a<Float> a;
    public final com.amazon.aps.iva.xb0.a<Float> b;
    public final boolean c;

    public j(com.amazon.aps.iva.xb0.a aVar, boolean z, com.amazon.aps.iva.xb0.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
        this.c = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(this.a.invoke().floatValue());
        sb.append(", maxValue=");
        sb.append(this.b.invoke().floatValue());
        sb.append(", reverseScrolling=");
        return defpackage.a.b(sb, this.c, ')');
    }
}
