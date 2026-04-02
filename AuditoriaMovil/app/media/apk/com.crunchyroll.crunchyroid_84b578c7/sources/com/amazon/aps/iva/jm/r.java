package com.amazon.aps.iva.jm;
/* compiled from: AvatarUiModel.kt */
/* loaded from: classes2.dex */
public abstract class r {
    public final String a;

    /* compiled from: AvatarUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends r {
        public final String b;

        public a() {
            this(0);
        }

        @Override // com.amazon.aps.iva.jm.r
        public final String a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && com.amazon.aps.iva.yb0.j.a(this.b, ((a) obj).b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return defpackage.b.c(new StringBuilder("EmptyAvatarUiModel(adapterId="), this.b, ")");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(int r1) {
            /*
                r0 = this;
                java.lang.String r1 = "randomUUID().toString()"
                java.lang.String r1 = com.amazon.aps.iva.j0.j0.d(r1)
                r0.<init>(r1)
                r0.b = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jm.r.a.<init>(int):void");
        }
    }

    /* compiled from: AvatarUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends r {
        public final String b;
        public final String c;
        public final boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, boolean z) {
            super(str);
            com.amazon.aps.iva.yb0.j.f(str2, "avatarUrl");
            this.b = str;
            this.c = str2;
            this.d = z;
        }

        @Override // com.amazon.aps.iva.jm.r
        public final String a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.b, bVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, bVar.c) && this.d == bVar.d) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int b = com.amazon.aps.iva.c80.a.b(this.c, this.b.hashCode() * 31, 31);
            boolean z = this.d;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return b + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RemoteAvatarUiModel(adapterId=");
            sb.append(this.b);
            sb.append(", avatarUrl=");
            sb.append(this.c);
            sb.append(", isSelected=");
            return com.amazon.aps.iva.e4.e.c(sb, this.d, ")");
        }
    }

    public r(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }
}
