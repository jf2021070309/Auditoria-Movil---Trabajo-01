package com.amazon.aps.iva.ks;

import com.amazon.aps.iva.js.b0;
/* compiled from: ActionDetailProperty.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.is.a {
    private final String pageOrScreen;
    private final b0 position;
    private final String referrer;
    private final String textOfButtonOrLink;

    /* compiled from: ActionDetailProperty.kt */
    /* renamed from: com.amazon.aps.iva.ks.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0456a {
        public static a a(com.amazon.aps.iva.fs.b bVar, String str, String str2) {
            b0 b0Var;
            com.amazon.aps.iva.yb0.j.f(str, "screen");
            String str3 = (bVar == null || (str3 = bVar.b) == null) ? "" : "";
            if (bVar != null) {
                b0Var = bVar.a;
            } else {
                b0Var = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            return new a(str3, str, b0Var, str2);
        }

        public static a b(com.amazon.aps.iva.ls.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "screen");
            String aVar2 = aVar.toString();
            com.amazon.aps.iva.yb0.j.f(aVar2, "screen");
            return new a("", aVar2, null, "");
        }

        public static a c(com.amazon.aps.iva.ls.a aVar, com.amazon.aps.iva.fs.b bVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "screen");
            return a(bVar, aVar.toString(), "");
        }
    }

    static {
        new C0456a();
    }

    public a(String str, String str2, b0 b0Var, String str3) {
        this.textOfButtonOrLink = str;
        this.pageOrScreen = str2;
        this.position = b0Var;
        this.referrer = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.textOfButtonOrLink, aVar.textOfButtonOrLink) && com.amazon.aps.iva.yb0.j.a(this.pageOrScreen, aVar.pageOrScreen) && this.position == aVar.position && com.amazon.aps.iva.yb0.j.a(this.referrer, aVar.referrer)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.textOfButtonOrLink;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.pageOrScreen;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        b0 b0Var = this.position;
        if (b0Var != null) {
            i = b0Var.hashCode();
        }
        return this.referrer.hashCode() + ((i3 + i) * 31);
    }

    public final String toString() {
        String str = this.textOfButtonOrLink;
        String str2 = this.pageOrScreen;
        b0 b0Var = this.position;
        String str3 = this.referrer;
        StringBuilder b = com.amazon.aps.iva.n4.a.b("ActionDetailProperty(textOfButtonOrLink=", str, ", pageOrScreen=", str2, ", position=");
        b.append(b0Var);
        b.append(", referrer=");
        b.append(str3);
        b.append(")");
        return b.toString();
    }
}
