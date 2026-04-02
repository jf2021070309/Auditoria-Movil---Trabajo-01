package com.amazon.aps.iva.pj;
/* compiled from: Events.kt */
/* loaded from: classes.dex */
public abstract class j implements com.amazon.aps.iva.pj.a {

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class a extends j {
        public static final a a = new a();
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class b extends j {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            if (com.amazon.aps.iva.yb0.j.a(null, null) && com.amazon.aps.iva.yb0.j.a(null, null)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "SubtitleUpdateEvent(locale=null, id=null)";
        }
    }
}
