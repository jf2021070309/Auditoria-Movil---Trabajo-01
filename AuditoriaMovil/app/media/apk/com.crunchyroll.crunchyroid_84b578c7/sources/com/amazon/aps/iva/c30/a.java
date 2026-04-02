package com.amazon.aps.iva.c30;

import java.io.Serializable;
/* compiled from: CrPlusDurationModel.kt */
/* loaded from: classes2.dex */
public abstract class a implements Serializable {

    /* compiled from: CrPlusDurationModel.kt */
    /* renamed from: com.amazon.aps.iva.c30.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0161a extends a {
        public final int b;
        public final int c;

        public C0161a(int i, int i2) {
            super(i, i2);
            this.b = i;
            this.c = i2;
        }

        @Override // com.amazon.aps.iva.c30.a
        public final int a() {
            return this.b;
        }

        @Override // com.amazon.aps.iva.c30.a
        public final int b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0161a)) {
                return false;
            }
            C0161a c0161a = (C0161a) obj;
            if (this.b == c0161a.b && this.c == c0161a.c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Day(count=");
            sb.append(this.b);
            sb.append(", timeUnitRes=");
            return e.f(sb, this.c, ")");
        }
    }

    /* compiled from: CrPlusDurationModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends a {
        public final int b;
        public final int c;

        public b(int i, int i2) {
            super(i, i2);
            this.b = i;
            this.c = i2;
        }

        @Override // com.amazon.aps.iva.c30.a
        public final int a() {
            return this.b;
        }

        @Override // com.amazon.aps.iva.c30.a
        public final int b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.b == bVar.b && this.c == bVar.c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Month(count=");
            sb.append(this.b);
            sb.append(", timeUnitRes=");
            return e.f(sb, this.c, ")");
        }
    }

    /* compiled from: CrPlusDurationModel.kt */
    /* loaded from: classes2.dex */
    public static final class c extends a {
        public final int b;
        public final int c;

        public c(int i, int i2) {
            super(i, i2);
            this.b = i;
            this.c = i2;
        }

        @Override // com.amazon.aps.iva.c30.a
        public final int a() {
            return this.b;
        }

        @Override // com.amazon.aps.iva.c30.a
        public final int b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.b == cVar.b && this.c == cVar.c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Year(count=");
            sb.append(this.b);
            sb.append(", timeUnitRes=");
            return e.f(sb, this.c, ")");
        }
    }

    public a(int i, int i2) {
    }

    public abstract int a();

    public abstract int b();
}
