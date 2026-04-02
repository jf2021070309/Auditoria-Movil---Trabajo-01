package com.amazon.aps.iva.d70;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.yb0.j;
/* compiled from: CharacterLimitPresenter.kt */
/* loaded from: classes2.dex */
public final class d {
    public final int a;
    public final int b;
    public final Integer c;
    public final String d;

    public d(int i, int i2, Integer num, String str) {
        this.a = i;
        this.b = i2;
        this.c = num;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a == dVar.a && this.b == dVar.b && j.a(this.c, dVar.c) && j.a(this.d, dVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a = r.a(this.b, Integer.hashCode(this.a) * 31, 31);
        int i = 0;
        Integer num = this.c;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (a + hashCode) * 31;
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextChangeData(before=");
        sb.append(this.a);
        sb.append(", count=");
        sb.append(this.b);
        sb.append(", cursorPosition=");
        sb.append(this.c);
        sb.append(", text=");
        return defpackage.b.c(sb, this.d, ")");
    }
}
