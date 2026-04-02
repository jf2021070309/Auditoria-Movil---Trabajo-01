package com.amazon.aps.iva.pj;
/* compiled from: Events.kt */
/* loaded from: classes.dex */
public abstract class f implements com.amazon.aps.iva.pj.a {

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class a extends f {
        public final com.amazon.aps.iva.qj.b a;

        public a(com.amazon.aps.iva.qj.b bVar) {
            com.amazon.aps.iva.yb0.j.f(bVar, "newOrientation");
            this.a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.a == ((a) obj).a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "PlaybackOrientationChangeEvent(newOrientation=" + this.a + ')';
        }
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class b extends f {
        public final com.amazon.aps.iva.qj.c a;

        public b(com.amazon.aps.iva.qj.c cVar) {
            com.amazon.aps.iva.yb0.j.f(cVar, "newPresentation");
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && this.a == ((b) obj).a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "PlaybackPresentationChangeEvent(newPresentation=" + this.a + ')';
        }
    }
}
