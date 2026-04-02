package com.amazon.aps.iva.y4;
/* compiled from: Alignment.kt */
/* loaded from: classes.dex */
public final class a {
    public static final a c = new a(0, 0);
    public static final a d = new a(0, 1);
    public static final a e = new a(1, 1);
    public final int a;
    public final int b;

    /* compiled from: Alignment.kt */
    /* renamed from: com.amazon.aps.iva.y4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0884a {
        public final int a;

        public /* synthetic */ C0884a(int i) {
            this.a = i;
        }

        public static final /* synthetic */ C0884a a(int i) {
            return new C0884a(i);
        }

        public static String b(int i) {
            return "Horizontal(value=" + i + ')';
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C0884a)) {
                return false;
            }
            if (this.a != ((C0884a) obj).a) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return b(this.a);
        }
    }

    /* compiled from: Alignment.kt */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;

        public /* synthetic */ b(int i) {
            this.a = i;
        }

        public static final /* synthetic */ b a(int i) {
            return new b(i);
        }

        public static String b(int i) {
            return "Vertical(value=" + i + ')';
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (this.a != ((b) obj).a) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return b(this.a);
        }
    }

    public a(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!com.amazon.aps.iva.yb0.j.a(a.class, cls)) {
            return false;
        }
        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type androidx.glance.layout.Alignment");
        a aVar = (a) obj;
        if (this.a == aVar.a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.b == aVar.b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Alignment(horizontal=" + ((Object) C0884a.b(this.a)) + ", vertical=" + ((Object) b.b(this.b)) + ')';
    }
}
