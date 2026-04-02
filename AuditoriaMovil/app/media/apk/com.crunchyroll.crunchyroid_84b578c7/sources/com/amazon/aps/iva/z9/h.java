package com.amazon.aps.iva.z9;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* compiled from: LottieComposition.java */
/* loaded from: classes.dex */
public final class h {
    public Map<String, List<com.amazon.aps.iva.ia.e>> c;
    public Map<String, e0> d;
    public Map<String, com.amazon.aps.iva.fa.c> e;
    public List<com.amazon.aps.iva.fa.h> f;
    public com.amazon.aps.iva.x.i<com.amazon.aps.iva.fa.d> g;
    public com.amazon.aps.iva.x.f<com.amazon.aps.iva.ia.e> h;
    public List<com.amazon.aps.iva.ia.e> i;
    public Rect j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public final l0 a = new l0();
    public final HashSet<String> b = new HashSet<>();
    public int o = 0;

    public final void a(String str) {
        com.amazon.aps.iva.ma.c.b(str);
        this.b.add(str);
    }

    public final float b() {
        return ((this.l - this.k) / this.m) * 1000.0f;
    }

    public final com.amazon.aps.iva.fa.h c(String str) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            com.amazon.aps.iva.fa.h hVar = this.f.get(i);
            String str2 = hVar.a;
            boolean z = true;
            if (!str2.equalsIgnoreCase(str) && (!str2.endsWith("\r") || !str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                z = false;
            }
            if (z) {
                return hVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (com.amazon.aps.iva.ia.e eVar : this.i) {
            sb.append(eVar.a("\t"));
        }
        return sb.toString();
    }
}
