package com.amazon.aps.iva.x6;
/* compiled from: SeekMap.java */
/* loaded from: classes.dex */
public interface d0 {

    /* compiled from: SeekMap.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final e0 a;
        public final e0 b;

        public a() {
            throw null;
        }

        public a(e0 e0Var, e0 e0Var2) {
            this.a = e0Var;
            this.b = e0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a.equals(aVar.a) && this.b.equals(aVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            e0 e0Var = this.a;
            sb.append(e0Var);
            e0 e0Var2 = this.b;
            if (e0Var.equals(e0Var2)) {
                str = "";
            } else {
                str = ", " + e0Var2;
            }
            return defpackage.b.c(sb, str, "]");
        }
    }

    /* compiled from: SeekMap.java */
    /* loaded from: classes.dex */
    public static class b implements d0 {
        public final long a;
        public final a b;

        public b(long j) {
            this(j, 0L);
        }

        @Override // com.amazon.aps.iva.x6.d0
        public final a d(long j) {
            return this.b;
        }

        @Override // com.amazon.aps.iva.x6.d0
        public final boolean f() {
            return false;
        }

        @Override // com.amazon.aps.iva.x6.d0
        public final long i() {
            return this.a;
        }

        public b(long j, long j2) {
            this.a = j;
            e0 e0Var = j2 == 0 ? e0.c : new e0(0L, j2);
            this.b = new a(e0Var, e0Var);
        }
    }

    a d(long j);

    boolean f();

    long i();
}
