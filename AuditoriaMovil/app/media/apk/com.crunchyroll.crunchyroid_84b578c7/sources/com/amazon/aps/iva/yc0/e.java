package com.amazon.aps.iva.yc0;

import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.t;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.pc0.m;
import com.amazon.aps.iva.pc0.n;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes4.dex */
public final class e {
    public static final Map<String, EnumSet<n>> a = i0.U(new com.amazon.aps.iva.kb0.j("PACKAGE", EnumSet.noneOf(n.class)), new com.amazon.aps.iva.kb0.j("TYPE", EnumSet.of(n.CLASS, n.FILE)), new com.amazon.aps.iva.kb0.j("ANNOTATION_TYPE", EnumSet.of(n.ANNOTATION_CLASS)), new com.amazon.aps.iva.kb0.j("TYPE_PARAMETER", EnumSet.of(n.TYPE_PARAMETER)), new com.amazon.aps.iva.kb0.j("FIELD", EnumSet.of(n.FIELD)), new com.amazon.aps.iva.kb0.j("LOCAL_VARIABLE", EnumSet.of(n.LOCAL_VARIABLE)), new com.amazon.aps.iva.kb0.j("PARAMETER", EnumSet.of(n.VALUE_PARAMETER)), new com.amazon.aps.iva.kb0.j("CONSTRUCTOR", EnumSet.of(n.CONSTRUCTOR)), new com.amazon.aps.iva.kb0.j("METHOD", EnumSet.of(n.FUNCTION, n.PROPERTY_GETTER, n.PROPERTY_SETTER)), new com.amazon.aps.iva.kb0.j("TYPE_USE", EnumSet.of(n.TYPE)));
    public static final Map<String, m> b = i0.U(new com.amazon.aps.iva.kb0.j("RUNTIME", m.RUNTIME), new com.amazon.aps.iva.kb0.j("CLASS", m.BINARY), new com.amazon.aps.iva.kb0.j("SOURCE", m.SOURCE));

    public static com.amazon.aps.iva.sd0.b a(List list) {
        String str;
        com.amazon.aps.iva.yb0.j.f(list, "arguments");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof com.amazon.aps.iva.ed0.m) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.nd0.f e = ((com.amazon.aps.iva.ed0.m) it.next()).e();
            if (e != null) {
                str = e.b();
            } else {
                str = null;
            }
            EnumSet<n> enumSet = a.get(str);
            if (enumSet == null) {
                enumSet = b0.b;
            }
            t.d0(arrayList2, enumSet);
        }
        ArrayList arrayList3 = new ArrayList(r.Y(arrayList2));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new com.amazon.aps.iva.sd0.j(com.amazon.aps.iva.nd0.b.l(o.a.u), com.amazon.aps.iva.nd0.f.h(((n) it2.next()).name())));
        }
        return new com.amazon.aps.iva.sd0.b(arrayList3, d.h);
    }
}
