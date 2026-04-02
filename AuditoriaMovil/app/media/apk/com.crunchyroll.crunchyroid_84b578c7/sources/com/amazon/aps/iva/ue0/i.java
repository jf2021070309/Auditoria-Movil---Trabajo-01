package com.amazon.aps.iva.ue0;
/* compiled from: Channel.kt */
/* loaded from: classes4.dex */
public final class i<T> {
    public static final b b = new b();
    public final Object a;

    /* compiled from: Channel.kt */
    /* loaded from: classes4.dex */
    public static final class a extends b {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                if (com.amazon.aps.iva.yb0.j.a(this.a, ((a) obj).a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // com.amazon.aps.iva.ue0.i.b
        public final String toString() {
            return "Closed(" + this.a + ')';
        }
    }

    /* compiled from: Channel.kt */
    /* loaded from: classes4.dex */
    public static class b {
        public String toString() {
            return "Failed";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T a(Object obj) {
        if (obj instanceof b) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (!com.amazon.aps.iva.yb0.j.a(this.a, ((i) obj).a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
