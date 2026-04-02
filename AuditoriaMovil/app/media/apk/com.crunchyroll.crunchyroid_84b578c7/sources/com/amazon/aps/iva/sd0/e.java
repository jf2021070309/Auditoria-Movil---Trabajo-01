package com.amazon.aps.iva.sd0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.m0;
import java.util.Arrays;
/* compiled from: constantValues.kt */
/* loaded from: classes4.dex */
public final class e extends r {
    public e(char c) {
        super(Character.valueOf(c));
    }

    @Override // com.amazon.aps.iva.sd0.g
    public final e0 a(com.amazon.aps.iva.oc0.c0 c0Var) {
        com.amazon.aps.iva.yb0.j.f(c0Var, "module");
        com.amazon.aps.iva.lc0.k j = c0Var.j();
        j.getClass();
        m0 t = j.t(com.amazon.aps.iva.lc0.l.CHAR);
        if (t != null) {
            return t;
        }
        com.amazon.aps.iva.lc0.k.a(62);
        throw null;
    }

    @Override // com.amazon.aps.iva.sd0.g
    public final String toString() {
        String str;
        Object[] objArr = new Object[2];
        T t = this.a;
        boolean z = false;
        objArr[0] = Integer.valueOf(((Character) t).charValue());
        char charValue = ((Character) t).charValue();
        if (charValue == '\b') {
            str = "\\b";
        } else if (charValue == '\t') {
            str = "\\t";
        } else if (charValue == '\n') {
            str = "\\n";
        } else if (charValue == '\f') {
            str = "\\f";
        } else if (charValue == '\r') {
            str = "\\r";
        } else {
            byte type = (byte) Character.getType(charValue);
            if (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) {
                z = true;
            }
            if (z) {
                str = String.valueOf(charValue);
            } else {
                str = "?";
            }
        }
        objArr[1] = str;
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(objArr, 2));
        com.amazon.aps.iva.yb0.j.e(format, "format(this, *args)");
        return format;
    }
}
