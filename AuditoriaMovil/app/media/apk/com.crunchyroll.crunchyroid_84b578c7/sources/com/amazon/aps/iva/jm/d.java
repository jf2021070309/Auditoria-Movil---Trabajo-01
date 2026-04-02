package com.amazon.aps.iva.jm;

import com.amazon.aps.iva.jm.r;
import java.util.List;
/* compiled from: AvatarCollectionUiModel.kt */
/* loaded from: classes2.dex */
public abstract class d {
    public final String a;
    public final List<r> b;

    /* compiled from: AvatarCollectionUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends d {
        public final String c;
        public final List<r.a> d;

        public a() {
            this(null);
        }

        @Override // com.amazon.aps.iva.jm.d
        public final String a() {
            return this.c;
        }

        @Override // com.amazon.aps.iva.jm.d
        public final List<r.a> b() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.c, aVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, aVar.d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public final String toString() {
            return "EmptyAvatarUiCollection(adapterId=" + this.c + ", items=" + this.d + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.String r6 = "randomUUID().toString()"
                java.lang.String r6 = com.amazon.aps.iva.j0.j0.d(r6)
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                r0.<init>(r1)
                r2 = 0
                r3 = r2
            Lf:
                if (r3 >= r1) goto L1c
                com.amazon.aps.iva.jm.r$a r4 = new com.amazon.aps.iva.jm.r$a
                r4.<init>(r2)
                r0.add(r4)
                int r3 = r3 + 1
                goto Lf
            L1c:
                r5.<init>(r6, r0)
                r5.c = r6
                r5.d = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jm.d.a.<init>(java.lang.Object):void");
        }
    }

    /* compiled from: AvatarCollectionUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends d {
        public final String c;
        public final String d;
        public final List<r.b> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, List<r.b> list) {
            super(str2, list);
            com.amazon.aps.iva.yb0.j.f(str, "title");
            this.c = str;
            this.d = str2;
            this.e = list;
        }

        @Override // com.amazon.aps.iva.jm.d
        public final String a() {
            return this.d;
        }

        @Override // com.amazon.aps.iva.jm.d
        public final List<r.b> b() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.c, bVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, bVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, bVar.e)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode() + com.amazon.aps.iva.c80.a.b(this.d, this.c.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RemoteAvatarCollectionUiModel(title=");
            sb.append(this.c);
            sb.append(", adapterId=");
            sb.append(this.d);
            sb.append(", items=");
            return com.amazon.aps.iva.oa.a.b(sb, this.e, ")");
        }
    }

    public d() {
        throw null;
    }

    public d(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public String a() {
        return this.a;
    }

    public List<r> b() {
        return this.b;
    }
}
