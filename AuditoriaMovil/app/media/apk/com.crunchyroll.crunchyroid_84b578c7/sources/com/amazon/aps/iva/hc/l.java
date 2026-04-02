package com.amazon.aps.iva.hc;
/* compiled from: GlideImage.kt */
/* loaded from: classes.dex */
public abstract class l {

    /* compiled from: GlideImage.kt */
    /* loaded from: classes.dex */
    public static final class a extends l {
        public static final a a = new a();
    }

    /* compiled from: GlideImage.kt */
    /* loaded from: classes.dex */
    public static final class b extends l {
        public static final b a = new b();
    }

    /* compiled from: GlideImage.kt */
    /* loaded from: classes.dex */
    public static final class c extends l {
        public final com.amazon.aps.iva.kc.a a;

        public c(com.amazon.aps.iva.kc.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "dataSource");
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && this.a == ((c) obj).a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Success(dataSource=" + this.a + ')';
        }
    }
}
