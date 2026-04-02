package com.amazon.aps.iva.ha;

import com.amazon.aps.iva.z9.d0;
/* compiled from: MergePaths.java */
/* loaded from: classes.dex */
public final class h implements b {
    public final a a;
    public final boolean b;

    /* compiled from: MergePaths.java */
    /* loaded from: classes.dex */
    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a forId(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return MERGE;
                            }
                            return EXCLUDE_INTERSECTIONS;
                        }
                        return INTERSECT;
                    }
                    return SUBTRACT;
                }
                return ADD;
            }
            return MERGE;
        }
    }

    public h(String str, a aVar, boolean z) {
        this.a = aVar;
        this.b = z;
    }

    @Override // com.amazon.aps.iva.ha.b
    public final com.amazon.aps.iva.ba.b a(d0 d0Var, com.amazon.aps.iva.z9.h hVar, com.amazon.aps.iva.ia.b bVar) {
        if (!d0Var.n) {
            com.amazon.aps.iva.ma.c.b("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new com.amazon.aps.iva.ba.k(this);
    }

    public final String toString() {
        return "MergePaths{mode=" + this.a + '}';
    }
}
