package com.amazon.aps.iva.ha;

import com.amazon.aps.iva.ba.t;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.z9.d0;
/* compiled from: ShapeTrimPath.java */
/* loaded from: classes.dex */
public final class r implements b {
    public final a a;
    public final com.amazon.aps.iva.ga.b b;
    public final com.amazon.aps.iva.ga.b c;
    public final com.amazon.aps.iva.ga.b d;
    public final boolean e;

    /* compiled from: ShapeTrimPath.java */
    /* loaded from: classes.dex */
    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a forId(int i) {
            if (i != 1) {
                if (i == 2) {
                    return INDIVIDUALLY;
                }
                throw new IllegalArgumentException(c0.a("Unknown trim path type ", i));
            }
            return SIMULTANEOUSLY;
        }
    }

    public r(String str, a aVar, com.amazon.aps.iva.ga.b bVar, com.amazon.aps.iva.ga.b bVar2, com.amazon.aps.iva.ga.b bVar3, boolean z) {
        this.a = aVar;
        this.b = bVar;
        this.c = bVar2;
        this.d = bVar3;
        this.e = z;
    }

    @Override // com.amazon.aps.iva.ha.b
    public final com.amazon.aps.iva.ba.b a(d0 d0Var, com.amazon.aps.iva.z9.h hVar, com.amazon.aps.iva.ia.b bVar) {
        return new t(bVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.b + ", end: " + this.c + ", offset: " + this.d + "}";
    }
}
