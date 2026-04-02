package com.amazon.aps.iva.g8;

import com.amazon.aps.iva.g8.a;
import com.amazon.aps.iva.g8.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: NavDestinationBuilder.kt */
/* loaded from: classes.dex */
public class i0<D extends g0> {
    public final r0<? extends D> a;
    public final String c;
    public final int b = -1;
    public final LinkedHashMap d = new LinkedHashMap();
    public final ArrayList e = new ArrayList();
    public final LinkedHashMap f = new LinkedHashMap();

    public i0(r0<? extends D> r0Var, String str) {
        this.a = r0Var;
        this.c = str;
    }

    public D a() {
        D a = this.a.a();
        a.d = null;
        for (Map.Entry entry : this.d.entrySet()) {
            String str = (String) entry.getKey();
            e eVar = (e) entry.getValue();
            com.amazon.aps.iva.yb0.j.f(str, "argumentName");
            com.amazon.aps.iva.yb0.j.f(eVar, "argument");
            a.g.put(str, eVar);
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            a.b((u) it.next());
        }
        for (Map.Entry entry2 : this.f.entrySet()) {
            int intValue = ((Number) entry2.getKey()).intValue();
            d dVar = (d) entry2.getValue();
            com.amazon.aps.iva.yb0.j.f(dVar, "action");
            boolean z = true;
            if (!(a instanceof a.C0294a)) {
                if (intValue == 0) {
                    z = false;
                }
                if (z) {
                    a.f.f(intValue, dVar);
                } else {
                    throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
                }
            } else {
                throw new UnsupportedOperationException("Cannot add action " + intValue + " to " + a + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
            }
        }
        String str2 = this.c;
        if (str2 != null) {
            a.l(str2);
        }
        int i = this.b;
        if (i != -1) {
            a.h = i;
        }
        return a;
    }
}
