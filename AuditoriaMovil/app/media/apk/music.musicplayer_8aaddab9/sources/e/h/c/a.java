package e.h.c;

import l.a.a.b;
/* loaded from: classes.dex */
public class a implements b {
    public l.a.a.a a;

    public a() {
        this.a = new l.a.a.a();
    }

    public a(int i2) {
        this.a = new l.a.a.a(i2);
    }

    public String a(int i2) {
        Object obj = this.a.get(i2);
        return obj instanceof String ? (String) obj : obj.toString();
    }

    @Override // l.a.a.b
    public String b() {
        return toString();
    }

    public int c() {
        return this.a.size();
    }

    public String toString() {
        return this.a.b();
    }
}
