package defpackage;

import com.amazon.aps.iva.a1.b;
import com.amazon.aps.iva.d0.f;
import com.amazon.aps.iva.fc0.j;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.p;
/* compiled from: R8$$SyntheticClass */
/* renamed from: e  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class e {
    public static int a(String str, int i) {
        return String.valueOf(str).length() + i;
    }

    public static j b(Class cls, String str, String str2, int i) {
        return e0.b(new p(cls, str, str2, i));
    }

    public static d0 c(com.amazon.aps.iva.o0.j jVar, int i, b bVar, boolean z, com.amazon.aps.iva.o0.j jVar2, int i2) {
        jVar.s(i);
        d0 c = f.c(bVar, z, jVar2);
        jVar.s(i2);
        return c;
    }

    public static String d(String str, Class cls) {
        return str + cls;
    }

    public static String e(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String f(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }
}
