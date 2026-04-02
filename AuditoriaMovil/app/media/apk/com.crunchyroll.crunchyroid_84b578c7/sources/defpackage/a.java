package defpackage;

import com.amazon.aps.iva.o0.j;
import com.amazon.aps.iva.u1.e;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* renamed from: a  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class a {
    public static int a(List list, int i, int i2) {
        return (list.hashCode() + i) * i2;
    }

    public static String b(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static void c(int i, j jVar, int i2, e.a.C0752a c0752a) {
        jVar.K0(Integer.valueOf(i));
        jVar.B(Integer.valueOf(i2), c0752a);
    }
}
