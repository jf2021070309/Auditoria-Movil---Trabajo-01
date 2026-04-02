package com.amazon.aps.iva.cg;

import com.amazon.aps.iva.cg.u;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: DeepLinkInput.kt */
/* loaded from: classes.dex */
public final class b extends e0 {
    public final com.amazon.aps.iva.dg.a c;
    public final c d;
    public final String e;

    /* compiled from: DeepLinkInput.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.POPULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.GENRES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.SIMULCAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.amazon.aps.iva.dg.a aVar, c cVar, String str) {
        super(u.a.BROWSE, aVar);
        com.amazon.aps.iva.yb0.j.f(cVar, FirebaseAnalytics.Param.DESTINATION);
        com.amazon.aps.iva.yb0.j.f(str, "id");
        this.c = aVar;
        this.d = cVar;
        this.e = str;
    }

    @Override // com.amazon.aps.iva.cg.e0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.c, bVar.c) && this.d == bVar.d && com.amazon.aps.iva.yb0.j.a(this.e, bVar.e)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.cg.e0, com.amazon.aps.iva.cg.u
    public final com.amazon.aps.iva.dg.a getUri() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.cg.e0
    public final int hashCode() {
        int hashCode = this.d.hashCode();
        return this.e.hashCode() + ((hashCode + (this.c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrowseDeepLinkRawInput(uri=");
        sb.append(this.c);
        sb.append(", destination=");
        sb.append(this.d);
        sb.append(", id=");
        return defpackage.b.c(sb, this.e, ")");
    }
}
