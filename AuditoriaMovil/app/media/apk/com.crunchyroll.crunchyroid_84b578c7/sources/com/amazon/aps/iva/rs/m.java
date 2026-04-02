package com.amazon.aps.iva.rs;

import java.io.Serializable;
/* compiled from: BillingProduct.kt */
/* loaded from: classes2.dex */
public abstract class m implements Serializable {

    /* compiled from: BillingProduct.kt */
    /* loaded from: classes2.dex */
    public static final class a extends m {
        public final n b;
        public final n c;
        public final String d;
        public final String e;

        public a(n nVar, n nVar2, String str, String str2) {
            super(nVar, nVar2, str, str2);
            this.b = nVar;
            this.c = nVar2;
            this.d = str;
            this.e = str2;
        }

        @Override // com.amazon.aps.iva.rs.m
        public final n a() {
            return this.c;
        }

        @Override // com.amazon.aps.iva.rs.m
        public final n b() {
            return this.b;
        }

        @Override // com.amazon.aps.iva.rs.m
        public final String c() {
            return this.d;
        }

        @Override // com.amazon.aps.iva.rs.m
        public final String d() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.b, aVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, aVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, aVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, aVar.e)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = this.b.hashCode() * 31;
            int i = 0;
            n nVar = this.c;
            if (nVar == null) {
                hashCode = 0;
            } else {
                hashCode = nVar.hashCode();
            }
            int i2 = (hashCode2 + hashCode) * 31;
            String str = this.d;
            if (str != null) {
                i = str.hashCode();
            }
            return this.e.hashCode() + ((i2 + i) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExtendedFreeTrialBillingOffer(introPhase=");
            sb.append(this.b);
            sb.append(", basePhase=");
            sb.append(this.c);
            sb.append(", offerId=");
            sb.append(this.d);
            sb.append(", offerToken=");
            return defpackage.b.c(sb, this.e, ")");
        }
    }

    /* compiled from: BillingProduct.kt */
    /* loaded from: classes2.dex */
    public static abstract class b extends m {
        public final n b;
        public final n c;
        public final String d;
        public final String e;

        /* compiled from: BillingProduct.kt */
        /* loaded from: classes2.dex */
        public static final class a extends b {
            public final n f;
            public final n g;
            public final String h;
            public final String i;

            public a(n nVar, n nVar2, String str, String str2) {
                super(nVar, nVar2, str, str2);
                this.f = nVar;
                this.g = nVar2;
                this.h = str;
                this.i = str2;
            }

            @Override // com.amazon.aps.iva.rs.m.b, com.amazon.aps.iva.rs.m
            public final n a() {
                return this.g;
            }

            @Override // com.amazon.aps.iva.rs.m.b, com.amazon.aps.iva.rs.m
            public final n b() {
                return this.f;
            }

            @Override // com.amazon.aps.iva.rs.m.b, com.amazon.aps.iva.rs.m
            public final String c() {
                return this.h;
            }

            @Override // com.amazon.aps.iva.rs.m.b, com.amazon.aps.iva.rs.m
            public final String d() {
                return this.i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                if (com.amazon.aps.iva.yb0.j.a(this.f, aVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, aVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, aVar.h) && com.amazon.aps.iva.yb0.j.a(this.i, aVar.i)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                int hashCode;
                int hashCode2 = this.f.hashCode() * 31;
                int i = 0;
                n nVar = this.g;
                if (nVar == null) {
                    hashCode = 0;
                } else {
                    hashCode = nVar.hashCode();
                }
                int i2 = (hashCode2 + hashCode) * 31;
                String str = this.h;
                if (str != null) {
                    i = str.hashCode();
                }
                return this.i.hashCode() + ((i2 + i) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AbsoluteDiscountOffer(introPhase=");
                sb.append(this.f);
                sb.append(", basePhase=");
                sb.append(this.g);
                sb.append(", offerId=");
                sb.append(this.h);
                sb.append(", offerToken=");
                return defpackage.b.c(sb, this.i, ")");
            }
        }

        /* compiled from: BillingProduct.kt */
        /* renamed from: com.amazon.aps.iva.rs.m$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0682b extends b {
            public final n f;
            public final n g;
            public final String h;
            public final String i;

            public C0682b(n nVar, n nVar2, String str, String str2) {
                super(nVar, nVar2, str, str2);
                this.f = nVar;
                this.g = nVar2;
                this.h = str;
                this.i = str2;
            }

            @Override // com.amazon.aps.iva.rs.m.b, com.amazon.aps.iva.rs.m
            public final n a() {
                return this.g;
            }

            @Override // com.amazon.aps.iva.rs.m.b, com.amazon.aps.iva.rs.m
            public final n b() {
                return this.f;
            }

            @Override // com.amazon.aps.iva.rs.m.b, com.amazon.aps.iva.rs.m
            public final String c() {
                return this.h;
            }

            @Override // com.amazon.aps.iva.rs.m.b, com.amazon.aps.iva.rs.m
            public final String d() {
                return this.i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0682b)) {
                    return false;
                }
                C0682b c0682b = (C0682b) obj;
                if (com.amazon.aps.iva.yb0.j.a(this.f, c0682b.f) && com.amazon.aps.iva.yb0.j.a(this.g, c0682b.g) && com.amazon.aps.iva.yb0.j.a(this.h, c0682b.h) && com.amazon.aps.iva.yb0.j.a(this.i, c0682b.i)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                int hashCode;
                int hashCode2 = this.f.hashCode() * 31;
                int i = 0;
                n nVar = this.g;
                if (nVar == null) {
                    hashCode = 0;
                } else {
                    hashCode = nVar.hashCode();
                }
                int i2 = (hashCode2 + hashCode) * 31;
                String str = this.h;
                if (str != null) {
                    i = str.hashCode();
                }
                return this.i.hashCode() + ((i2 + i) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FixedAmountOffer(introPhase=");
                sb.append(this.f);
                sb.append(", basePhase=");
                sb.append(this.g);
                sb.append(", offerId=");
                sb.append(this.h);
                sb.append(", offerToken=");
                return defpackage.b.c(sb, this.i, ")");
            }
        }

        /* compiled from: BillingProduct.kt */
        /* loaded from: classes2.dex */
        public static final class c extends b {
            public final n f;
            public final n g;
            public final String h;
            public final String i;

            public c(n nVar, n nVar2, String str, String str2) {
                super(nVar, nVar2, str, str2);
                this.f = nVar;
                this.g = nVar2;
                this.h = str;
                this.i = str2;
            }

            @Override // com.amazon.aps.iva.rs.m.b, com.amazon.aps.iva.rs.m
            public final n a() {
                return this.g;
            }

            @Override // com.amazon.aps.iva.rs.m.b, com.amazon.aps.iva.rs.m
            public final n b() {
                return this.f;
            }

            @Override // com.amazon.aps.iva.rs.m.b, com.amazon.aps.iva.rs.m
            public final String c() {
                return this.h;
            }

            @Override // com.amazon.aps.iva.rs.m.b, com.amazon.aps.iva.rs.m
            public final String d() {
                return this.i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                if (com.amazon.aps.iva.yb0.j.a(this.f, cVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, cVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, cVar.h) && com.amazon.aps.iva.yb0.j.a(this.i, cVar.i)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                int hashCode;
                int hashCode2 = this.f.hashCode() * 31;
                int i = 0;
                n nVar = this.g;
                if (nVar == null) {
                    hashCode = 0;
                } else {
                    hashCode = nVar.hashCode();
                }
                int i2 = (hashCode2 + hashCode) * 31;
                String str = this.h;
                if (str != null) {
                    i = str.hashCode();
                }
                return this.i.hashCode() + ((i2 + i) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PercentageDiscountOffer(introPhase=");
                sb.append(this.f);
                sb.append(", basePhase=");
                sb.append(this.g);
                sb.append(", offerId=");
                sb.append(this.h);
                sb.append(", offerToken=");
                return defpackage.b.c(sb, this.i, ")");
            }
        }

        public b(n nVar, n nVar2, String str, String str2) {
            super(nVar, nVar2, str, str2);
            this.b = nVar;
            this.c = nVar2;
            this.d = str;
            this.e = str2;
        }

        @Override // com.amazon.aps.iva.rs.m
        public n a() {
            return this.c;
        }

        @Override // com.amazon.aps.iva.rs.m
        public n b() {
            return this.b;
        }

        @Override // com.amazon.aps.iva.rs.m
        public String c() {
            return this.d;
        }

        @Override // com.amazon.aps.iva.rs.m
        public String d() {
            return this.e;
        }
    }

    public m(n nVar, n nVar2, String str, String str2) {
    }

    public abstract n a();

    public abstract n b();

    public abstract String c();

    public abstract String d();
}
