package com.amazon.aps.iva.ga0;

import java.util.ArrayList;
/* loaded from: classes4.dex */
public final class p extends c {
    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("x");
        arrayList.add("y");
        arrayList.add("z");
    }

    public p() {
        Integer num = 0;
        if (num != null) {
            b("x", num.toString());
        }
        if (num != null) {
            b("y", num.toString());
        }
        if (num != null) {
            b("z", num.toString());
        }
    }

    public final String f() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("ViewDeviceOrientationData: ");
        String str3 = "";
        if (g() == null) {
            str = "";
        } else {
            str = "\n    x: " + g();
        }
        sb.append(str);
        if (h() == null) {
            str2 = "";
        } else {
            str2 = "\n    y: " + h();
        }
        sb.append(str2);
        if (i() != null) {
            str3 = "\n    z: " + i();
        }
        sb.append(str3);
        return sb.toString();
    }

    public final Integer g() {
        String a = a("x");
        if (a == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(a));
    }

    public final Integer h() {
        String a = a("y");
        if (a == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(a));
    }

    public final Integer i() {
        String a = a("z");
        if (a == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(a));
    }

    public p(com.amazon.aps.iva.if0.c cVar) throws com.amazon.aps.iva.if0.b {
        Integer valueOf = Integer.valueOf(cVar.getInt("x"));
        if (valueOf != null) {
            b("x", valueOf.toString());
        }
        Integer valueOf2 = Integer.valueOf(cVar.getInt("y"));
        if (valueOf2 != null) {
            b("y", valueOf2.toString());
        }
        Integer valueOf3 = Integer.valueOf(cVar.getInt("z"));
        if (valueOf3 != null) {
            b("z", valueOf3.toString());
        }
    }

    @Override // com.amazon.aps.iva.ga0.c
    public final void d() {
    }
}
