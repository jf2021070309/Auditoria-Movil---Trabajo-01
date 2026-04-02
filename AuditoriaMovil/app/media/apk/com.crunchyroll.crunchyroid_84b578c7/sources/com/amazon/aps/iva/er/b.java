package com.amazon.aps.iva.er;

import com.amazon.aps.iva.oe0.l;
import com.amazon.aps.iva.oe0.q;
import java.io.File;
import java.util.List;
/* compiled from: CPUVitalReader.kt */
/* loaded from: classes2.dex */
public final class b implements i {
    public static final File b = new File("/proc/self/stat");
    public final File a;

    public b() {
        File file = b;
        com.amazon.aps.iva.yb0.j.f(file, "statFile");
        this.a = file;
    }

    @Override // com.amazon.aps.iva.er.i
    public final Double a() {
        String e;
        File file = this.a;
        if (!com.amazon.aps.iva.tp.b.b(file) || !com.amazon.aps.iva.tp.b.a(file) || (e = com.amazon.aps.iva.tp.b.e(file)) == null) {
            return null;
        }
        List D0 = q.D0(e, new char[]{' '});
        if (D0.size() <= 13) {
            return null;
        }
        return l.V((String) D0.get(13));
    }
}
