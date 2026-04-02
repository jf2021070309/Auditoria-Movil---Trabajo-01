package com.amazon.aps.iva.pj;

import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.qj.o;
/* compiled from: Events.kt */
/* loaded from: classes.dex */
public abstract class h implements com.amazon.aps.iva.pj.a {

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class a extends h {
        public final o a;
        public final int b;

        public a() {
            this(new o(null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, -1, 15), 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, aVar.a) && this.b == aVar.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QoSInitialStartupTimeReady(videoMetadataContent=");
            sb.append(this.a);
            sb.append(", initialStartupTime=");
            return b2.b(sb, this.b, ')');
        }

        public a(o oVar, int i) {
            com.amazon.aps.iva.yb0.j.f(oVar, "videoMetadataContent");
            this.a = oVar;
            this.b = i;
        }
    }
}
