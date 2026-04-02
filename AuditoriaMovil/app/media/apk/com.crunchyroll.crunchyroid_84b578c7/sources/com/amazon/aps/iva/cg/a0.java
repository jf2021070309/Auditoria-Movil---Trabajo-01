package com.amazon.aps.iva.cg;

import com.amazon.aps.iva.cg.u;
/* compiled from: DeepLinkInput.kt */
/* loaded from: classes.dex */
public final class a0 extends e0 {
    public final u.a c;
    public final com.amazon.aps.iva.dg.a d;
    public final String e;

    /* compiled from: DeepLinkInput.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[u.a.values().length];
            try {
                iArr[u.a.SHOW_PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.a.WATCH_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(u.a aVar, com.amazon.aps.iva.dg.a aVar2, String str) {
        super(aVar, aVar2);
        com.amazon.aps.iva.yb0.j.f(aVar, "screenToLaunch");
        com.amazon.aps.iva.yb0.j.f(str, "id");
        this.c = aVar;
        this.d = aVar2;
        this.e = str;
    }

    @Override // com.amazon.aps.iva.cg.e0, com.amazon.aps.iva.cg.u
    public final u.a a() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.cg.e0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.c == a0Var.c && com.amazon.aps.iva.yb0.j.a(this.d, a0Var.d) && com.amazon.aps.iva.yb0.j.a(this.e, a0Var.e)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.cg.e0, com.amazon.aps.iva.cg.u
    public final com.amazon.aps.iva.dg.a getUri() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.cg.e0
    public final int hashCode() {
        int hashCode = this.d.hashCode();
        return this.e.hashCode() + ((hashCode + (this.c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaDeepLinkRawInput(screenToLaunch=");
        sb.append(this.c);
        sb.append(", uri=");
        sb.append(this.d);
        sb.append(", id=");
        return defpackage.b.c(sb, this.e, ")");
    }
}
