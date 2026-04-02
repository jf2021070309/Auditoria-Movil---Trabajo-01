package com.amazon.aps.iva.nv;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.yb0.j;
import java.util.Date;
/* compiled from: CrunchylistItemUiModel.kt */
/* loaded from: classes2.dex */
public final class e extends b {
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final Date g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, String str2, String str3, int i, Date date) {
        super(str);
        j.f(str2, "id");
        j.f(str3, "title");
        j.f(date, "modifiedAt");
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i;
        this.g = date;
    }

    public static e b(e eVar, String str) {
        String str2 = eVar.c;
        String str3 = eVar.d;
        int i = eVar.f;
        Date date = eVar.g;
        eVar.getClass();
        j.f(str2, "adapterId");
        j.f(str3, "id");
        j.f(str, "title");
        j.f(date, "modifiedAt");
        return new e(str2, str3, str, i, date);
    }

    @Override // com.amazon.aps.iva.nv.b
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (j.a(this.c, eVar.c) && j.a(this.d, eVar.d) && j.a(this.e, eVar.e) && this.f == eVar.f && j.a(this.g, eVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + r.a(this.f, com.amazon.aps.iva.c80.a.b(this.e, com.amazon.aps.iva.c80.a.b(this.d, this.c.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "CrunchylistItemUiModel(adapterId=" + this.c + ", id=" + this.d + ", title=" + this.e + ", total=" + this.f + ", modifiedAt=" + this.g + ")";
    }
}
