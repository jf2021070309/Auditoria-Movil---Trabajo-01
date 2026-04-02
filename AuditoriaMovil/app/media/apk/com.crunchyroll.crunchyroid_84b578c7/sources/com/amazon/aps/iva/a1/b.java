package com.amazon.aps.iva.a1;

import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.o2.l;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.yb0.j;
/* compiled from: Alignment.kt */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.a1.a {
    public final float b;
    public final float c;

    /* compiled from: Alignment.kt */
    /* loaded from: classes.dex */
    public static final class a implements a.b {
        public final float a;

        public a(float f) {
            this.a = f;
        }

        @Override // com.amazon.aps.iva.a1.a.b
        public final int a(int i, int i2, l lVar) {
            j.f(lVar, "layoutDirection");
            float f = (i2 - i) / 2.0f;
            l lVar2 = l.Ltr;
            float f2 = this.a;
            if (lVar != lVar2) {
                f2 *= -1;
            }
            return com.amazon.aps.iva.ob0.f.a((1 + f2) * f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && Float.compare(this.a, ((a) obj).a) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return c0.b(new StringBuilder("Horizontal(bias="), this.a, ')');
        }
    }

    /* compiled from: Alignment.kt */
    /* renamed from: com.amazon.aps.iva.a1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0098b implements a.c {
        public final float a;

        public C0098b(float f) {
            this.a = f;
        }

        @Override // com.amazon.aps.iva.a1.a.c
        public final int a(int i, int i2) {
            return com.amazon.aps.iva.ob0.f.a((1 + this.a) * ((i2 - i) / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0098b) && Float.compare(this.a, ((C0098b) obj).a) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return c0.b(new StringBuilder("Vertical(bias="), this.a, ')');
        }
    }

    public b(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // com.amazon.aps.iva.a1.a
    public final long a(long j, long j2, l lVar) {
        j.f(lVar, "layoutDirection");
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float b = (com.amazon.aps.iva.o2.j.b(j2) - com.amazon.aps.iva.o2.j.b(j)) / 2.0f;
        l lVar2 = l.Ltr;
        float f2 = this.b;
        if (lVar != lVar2) {
            f2 *= -1;
        }
        float f3 = 1;
        return w.e(com.amazon.aps.iva.ob0.f.a((f2 + f3) * f), com.amazon.aps.iva.ob0.f.a((f3 + this.c) * b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Float.compare(this.b, bVar.b) == 0 && Float.compare(this.c, bVar.c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.b);
        sb.append(", verticalBias=");
        return c0.b(sb, this.c, ')');
    }
}
