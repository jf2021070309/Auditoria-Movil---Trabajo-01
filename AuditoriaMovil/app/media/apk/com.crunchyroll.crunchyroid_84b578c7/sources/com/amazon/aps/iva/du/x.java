package com.amazon.aps.iva.du;

import com.ellation.crunchyroll.api.etp.model.Image;
import com.google.android.gms.ads.AdRequest;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import okhttp3.internal.http2.Http2;
/* compiled from: CommentUiModel.kt */
/* loaded from: classes2.dex */
public final class x implements Serializable {
    public final String b;
    public final String c;
    public final String d;
    public final List<Image> e;
    public final String f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final Date j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final int p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;

    public x(String str, String str2, String str3, List<Image> list, String str4, int i, boolean z, boolean z2, Date date, int i2, boolean z3, boolean z4, boolean z5, boolean z6, int i3, boolean z7, boolean z8, boolean z9) {
        com.amazon.aps.iva.yb0.j.f(str, "id");
        com.amazon.aps.iva.yb0.j.f(str3, "authorUsername");
        com.amazon.aps.iva.yb0.j.f(list, "authorAvatar");
        com.amazon.aps.iva.yb0.j.f(str4, "text");
        com.amazon.aps.iva.yb0.j.f(date, "createdDate");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = str4;
        this.g = i;
        this.h = z;
        this.i = z2;
        this.j = date;
        this.k = i2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = i3;
        this.q = z7;
        this.r = z8;
        this.s = z9;
        this.t = str2 == null;
    }

    public static x a(x xVar, int i, boolean z, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i3) {
        String str;
        String str2;
        String str3;
        List<Image> list;
        String str4;
        int i4;
        boolean z9;
        boolean z10;
        int i5;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i6;
        boolean z15;
        boolean z16;
        boolean z17;
        Date date = null;
        if ((i3 & 1) != 0) {
            str = xVar.b;
        } else {
            str = null;
        }
        if ((i3 & 2) != 0) {
            str2 = xVar.c;
        } else {
            str2 = null;
        }
        if ((i3 & 4) != 0) {
            str3 = xVar.d;
        } else {
            str3 = null;
        }
        if ((i3 & 8) != 0) {
            list = xVar.e;
        } else {
            list = null;
        }
        if ((i3 & 16) != 0) {
            str4 = xVar.f;
        } else {
            str4 = null;
        }
        if ((i3 & 32) != 0) {
            i4 = xVar.g;
        } else {
            i4 = i;
        }
        if ((i3 & 64) != 0) {
            z9 = xVar.h;
        } else {
            z9 = z;
        }
        if ((i3 & 128) != 0) {
            z10 = xVar.i;
        } else {
            z10 = false;
        }
        if ((i3 & 256) != 0) {
            date = xVar.j;
        }
        Date date2 = date;
        if ((i3 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            i5 = xVar.k;
        } else {
            i5 = i2;
        }
        if ((i3 & 1024) != 0) {
            z11 = xVar.l;
        } else {
            z11 = z2;
        }
        if ((i3 & 2048) != 0) {
            z12 = xVar.m;
        } else {
            z12 = z3;
        }
        if ((i3 & 4096) != 0) {
            z13 = xVar.n;
        } else {
            z13 = z4;
        }
        if ((i3 & 8192) != 0) {
            z14 = xVar.o;
        } else {
            z14 = z5;
        }
        if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            i6 = xVar.p;
        } else {
            i6 = 0;
        }
        if ((32768 & i3) != 0) {
            z15 = xVar.q;
        } else {
            z15 = z6;
        }
        if ((65536 & i3) != 0) {
            z16 = xVar.r;
        } else {
            z16 = z7;
        }
        if ((i3 & 131072) != 0) {
            z17 = xVar.s;
        } else {
            z17 = z8;
        }
        xVar.getClass();
        com.amazon.aps.iva.yb0.j.f(str, "id");
        com.amazon.aps.iva.yb0.j.f(str3, "authorUsername");
        com.amazon.aps.iva.yb0.j.f(list, "authorAvatar");
        com.amazon.aps.iva.yb0.j.f(str4, "text");
        com.amazon.aps.iva.yb0.j.f(date2, "createdDate");
        return new x(str, str2, str3, list, str4, i4, z9, z10, date2, i5, z11, z12, z13, z14, i6, z15, z16, z17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, xVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, xVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, xVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, xVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, xVar.f) && this.g == xVar.g && this.h == xVar.h && this.i == xVar.i && com.amazon.aps.iva.yb0.j.a(this.j, xVar.j) && this.k == xVar.k && this.l == xVar.l && this.m == xVar.m && this.n == xVar.n && this.o == xVar.o && this.p == xVar.p && this.q == xVar.q && this.r == xVar.r && this.s == xVar.s) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode() * 31;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int a = com.amazon.aps.iva.a0.r.a(this.g, com.amazon.aps.iva.c80.a.b(this.f, defpackage.a.a(this.e, com.amazon.aps.iva.c80.a.b(this.d, (hashCode2 + hashCode) * 31, 31), 31), 31), 31);
        int i = 1;
        boolean z = this.h;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (a + i2) * 31;
        boolean z2 = this.i;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int a2 = com.amazon.aps.iva.a0.r.a(this.k, (this.j.hashCode() + ((i3 + i4) * 31)) * 31, 31);
        boolean z3 = this.l;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (a2 + i5) * 31;
        boolean z4 = this.m;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z5 = this.n;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z6 = this.o;
        int i11 = z6;
        if (z6 != 0) {
            i11 = 1;
        }
        int a3 = com.amazon.aps.iva.a0.r.a(this.p, (i10 + i11) * 31, 31);
        boolean z7 = this.q;
        int i12 = z7;
        if (z7 != 0) {
            i12 = 1;
        }
        int i13 = (a3 + i12) * 31;
        boolean z8 = this.r;
        int i14 = z8;
        if (z8 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z9 = this.s;
        if (!z9) {
            i = z9 ? 1 : 0;
        }
        return i15 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentUiModel(id=");
        sb.append(this.b);
        sb.append(", parentId=");
        sb.append(this.c);
        sb.append(", authorUsername=");
        sb.append(this.d);
        sb.append(", authorAvatar=");
        sb.append(this.e);
        sb.append(", text=");
        sb.append(this.f);
        sb.append(", likesCount=");
        sb.append(this.g);
        sb.append(", isLikedByUser=");
        sb.append(this.h);
        sb.append(", isOwner=");
        sb.append(this.i);
        sb.append(", createdDate=");
        sb.append(this.j);
        sb.append(", repliesCount=");
        sb.append(this.k);
        sb.append(", isSpoiler=");
        sb.append(this.l);
        sb.append(", isFlaggedAsSpoilerByUser=");
        sb.append(this.m);
        sb.append(", isFlaggedAsInappropriateByUser=");
        sb.append(this.n);
        sb.append(", isDeleted=");
        sb.append(this.o);
        sb.append(", backgroundColorId=");
        sb.append(this.p);
        sb.append(", isHardDeleted=");
        sb.append(this.q);
        sb.append(", isSpoilerOverlayShown=");
        sb.append(this.r);
        sb.append(", isCollapsed=");
        return com.amazon.aps.iva.e4.e.c(sb, this.s, ")");
    }
}
