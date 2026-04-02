package com.amazon.aps.iva.vq;

import com.amazon.aps.iva.xq.i;
import com.amazon.aps.iva.xq.k;
import com.amazon.aps.iva.yb0.j;
import java.util.UUID;
/* compiled from: RumContext.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final String i;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final i.a g;
    public final k.a h;

    static {
        String uuid = new UUID(0L, 0L).toString();
        j.e(uuid, "UUID(0, 0).toString()");
        i = uuid;
    }

    public a() {
        this(null, 255);
    }

    public static a a(a aVar, String str, String str2, String str3, String str4, String str5, i.a aVar2, k.a aVar3, int i2) {
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        i.a aVar4;
        k.a aVar5;
        if ((i2 & 1) != 0) {
            str6 = aVar.a;
        } else {
            str6 = null;
        }
        if ((i2 & 2) != 0) {
            str7 = aVar.b;
        } else {
            str7 = str;
        }
        if ((i2 & 4) != 0) {
            str8 = aVar.c;
        } else {
            str8 = str2;
        }
        if ((i2 & 8) != 0) {
            str9 = aVar.d;
        } else {
            str9 = str3;
        }
        if ((i2 & 16) != 0) {
            str10 = aVar.e;
        } else {
            str10 = str4;
        }
        if ((i2 & 32) != 0) {
            str11 = aVar.f;
        } else {
            str11 = str5;
        }
        if ((i2 & 64) != 0) {
            aVar4 = aVar.g;
        } else {
            aVar4 = aVar2;
        }
        if ((i2 & 128) != 0) {
            aVar5 = aVar.h;
        } else {
            aVar5 = aVar3;
        }
        aVar.getClass();
        j.f(str6, "applicationId");
        j.f(str7, "sessionId");
        j.f(aVar4, "sessionState");
        j.f(aVar5, "viewType");
        return new a(str6, str7, str8, str9, str10, str11, aVar4, aVar5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.a, aVar.a) && j.a(this.b, aVar.b) && j.a(this.c, aVar.c) && j.a(this.d, aVar.d) && j.a(this.e, aVar.e) && j.a(this.f, aVar.f) && this.g == aVar.g && this.h == aVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int b = com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
        int i2 = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (b + hashCode) * 31;
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        String str3 = this.e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        String str4 = this.f;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return this.h.hashCode() + ((this.g.hashCode() + ((i5 + i2) * 31)) * 31);
    }

    public final String toString() {
        return "RumContext(applicationId=" + this.a + ", sessionId=" + this.b + ", viewId=" + this.c + ", viewName=" + this.d + ", viewUrl=" + this.e + ", actionId=" + this.f + ", sessionState=" + this.g + ", viewType=" + this.h + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ a(java.lang.String r12, int r13) {
        /*
            r11 = this;
            r0 = r13 & 1
            java.lang.String r1 = com.amazon.aps.iva.vq.a.i
            if (r0 == 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r12
        L9:
            r12 = r13 & 2
            r0 = 0
            if (r12 == 0) goto L10
            r4 = r1
            goto L11
        L10:
            r4 = r0
        L11:
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r12 = r13 & 64
            if (r12 == 0) goto L1d
            com.amazon.aps.iva.xq.i$a r12 = com.amazon.aps.iva.xq.i.a.NOT_TRACKED
            r9 = r12
            goto L1e
        L1d:
            r9 = r0
        L1e:
            r12 = r13 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L26
            com.amazon.aps.iva.xq.k$a r12 = com.amazon.aps.iva.xq.k.a.NONE
            r10 = r12
            goto L27
        L26:
            r10 = r0
        L27:
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.vq.a.<init>(java.lang.String, int):void");
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6, i.a aVar, k.a aVar2) {
        j.f(str, "applicationId");
        j.f(str2, "sessionId");
        j.f(aVar, "sessionState");
        j.f(aVar2, "viewType");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = aVar;
        this.h = aVar2;
    }
}
