package e.j.d.z;

import h.o.c.j;
import h.t.g;
import n.a.a;
/* loaded from: classes2.dex */
public final class c extends a.c {

    /* renamed from: b  reason: collision with root package name */
    public final String f8908b;

    public c(Object obj, String str) {
        j.e(obj, "thisRef");
        if (str == null) {
            String simpleName = obj.getClass().getSimpleName();
            j.d(simpleName, "");
            if (g.b(simpleName, "Impl", false, 2)) {
                simpleName = simpleName.substring(0, simpleName.length() - 4);
                j.d(simpleName, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            if (simpleName.length() > 23) {
                String n2 = g.n(g.n(g.n(g.n(simpleName, "Fragment", "Frag", false, 4), "ViewModel", "VM", false, 4), "Controller", "Ctrl", false, 4), "Manager", "Mgr", false, 4);
                j.e(n2, "<this>");
                int length = n2.length();
                simpleName = n2.substring(0, 23 > length ? length : 23);
                j.d(simpleName, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            str = simpleName;
        }
        this.f8908b = str;
    }

    @Override // n.a.a.c
    public void i(int i2, String str, String str2, Throwable th) {
        j.e(str2, "message");
        if (str == null) {
            str = this.f8908b;
        }
        n.a.a.b(str).j(i2, th, str2, new Object[0]);
    }
}
