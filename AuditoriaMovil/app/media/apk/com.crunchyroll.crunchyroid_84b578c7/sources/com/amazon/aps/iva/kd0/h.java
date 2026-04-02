package com.amazon.aps.iva.kd0;

import com.amazon.aps.iva.id0.u;
import com.amazon.aps.iva.id0.v;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: VersionRequirement.kt */
/* loaded from: classes4.dex */
public final class h {
    public static final h b = new h(z.b);
    public final List<u> a;

    /* compiled from: VersionRequirement.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static h a(v vVar) {
            if (vVar.c.size() == 0) {
                return h.b;
            }
            List<u> list = vVar.c;
            j.e(list, "table.requirementList");
            return new h(list);
        }
    }

    public h(List<u> list) {
        this.a = list;
    }
}
