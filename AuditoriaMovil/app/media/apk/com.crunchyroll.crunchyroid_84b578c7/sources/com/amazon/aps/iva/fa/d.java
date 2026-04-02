package com.amazon.aps.iva.fa;

import com.amazon.aps.iva.ha.o;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FontCharacter.java */
/* loaded from: classes.dex */
public final class d {
    public final List<o> a;
    public final char b;
    public final double c;
    public final String d;
    public final String e;

    public d(ArrayList arrayList, char c, double d, String str, String str2) {
        this.a = arrayList;
        this.b = c;
        this.c = d;
        this.d = str;
        this.e = str2;
    }

    public final int hashCode() {
        return this.d.hashCode() + com.amazon.aps.iva.c80.a.b(this.e, this.b * 31, 31);
    }
}
