package com.amazon.aps.iva.gm;
/* compiled from: AssetSelectionScreen.kt */
/* loaded from: classes2.dex */
public abstract class z implements com.amazon.aps.iva.ri.c {

    /* compiled from: AssetSelectionScreen.kt */
    /* loaded from: classes2.dex */
    public static final class a extends z {
        public final com.amazon.aps.iva.hm.d a;

        public a(com.amazon.aps.iva.hm.d dVar) {
            com.amazon.aps.iva.yb0.j.f(dVar, "asset");
            this.a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && com.amazon.aps.iva.yb0.j.a(this.a, ((a) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AssetSelected(asset=" + this.a + ")";
        }
    }

    /* compiled from: AssetSelectionScreen.kt */
    /* loaded from: classes2.dex */
    public static final class b extends z {
        public static final b a = new b();
    }

    /* compiled from: AssetSelectionScreen.kt */
    /* loaded from: classes2.dex */
    public static final class c extends z {
        public static final c a = new c();
    }

    /* compiled from: AssetSelectionScreen.kt */
    /* loaded from: classes2.dex */
    public static final class d extends z {
        public static final d a = new d();
    }
}
