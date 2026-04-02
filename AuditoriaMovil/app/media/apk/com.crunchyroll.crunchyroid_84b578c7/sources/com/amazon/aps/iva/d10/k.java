package com.amazon.aps.iva.d10;

import java.util.List;
/* compiled from: DownloadedPanelsInteractor.kt */
/* loaded from: classes2.dex */
public interface k extends com.amazon.aps.iva.wy.j {

    /* compiled from: DownloadedPanelsInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public final com.amazon.aps.iva.xb0.l<List<i>, com.amazon.aps.iva.kb0.q> a;
        public final com.amazon.aps.iva.xb0.l<i, com.amazon.aps.iva.kb0.q> b;

        public a(com.amazon.aps.iva.i10.j jVar, com.amazon.aps.iva.i10.k kVar) {
            this.a = jVar;
            this.b = kVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, aVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, aVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PanelsUpdateListener(onPanelsUpdate=" + this.a + ", onPanelUpdate=" + this.b + ")";
        }
    }

    void A(a aVar);

    a L0(com.amazon.aps.iva.i10.j jVar, com.amazon.aps.iva.i10.k kVar);

    void p0(List<i> list);
}
