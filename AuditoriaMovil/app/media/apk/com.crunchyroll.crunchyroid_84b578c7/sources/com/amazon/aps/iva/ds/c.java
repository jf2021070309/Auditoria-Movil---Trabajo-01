package com.amazon.aps.iva.ds;

import android.annotation.SuppressLint;
import com.amazon.aps.iva.es.i;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.t;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import com.segment.analytics.Analytics;
import com.segment.analytics.Properties;
import com.segment.analytics.Traits;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* compiled from: AnalyticsGateway.kt */
/* loaded from: classes2.dex */
public final class c implements a {
    @SuppressLint({"StaticFieldLeak"})
    public static Analytics c;
    public static final c b = new c();
    public static final ArrayList d = new ArrayList();

    public static ArrayList f(i iVar) {
        ArrayList arrayList = d;
        ArrayList arrayList2 = new ArrayList(r.Y(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((b) it.next()).a(iVar));
        }
        return r.Z(arrayList2);
    }

    public static Properties g(ArrayList arrayList) {
        Properties properties = new Properties();
        Iterator it = x.r0(arrayList).iterator();
        while (it.hasNext()) {
            properties.putAll(((com.amazon.aps.iva.is.a) it.next()).a());
        }
        return properties;
    }

    @Override // com.amazon.aps.iva.ds.a
    public final void a(String str, Map<String, ? extends Object> map) {
        j.f(map, "identifyProperties");
        Traits traits = new Traits();
        traits.putAll(map);
        com.amazon.aps.iva.mf0.a.a.a("Identify " + traits, new Object[0]);
        Analytics analytics = c;
        if (analytics != null) {
            analytics.identify(str, traits, null);
        }
    }

    @Override // com.amazon.aps.iva.ds.a
    public final void b(b... bVarArr) {
        t.e0(d, bVarArr);
    }

    @Override // com.amazon.aps.iva.ds.a
    public final void c(com.amazon.aps.iva.es.j jVar) {
        Properties g = g(x.L0(f(jVar), o.b0(jVar.b)));
        StringBuilder sb = new StringBuilder();
        String str = jVar.a;
        sb.append(str);
        sb.append(" ");
        sb.append(g);
        com.amazon.aps.iva.mf0.a.a.a(sb.toString(), new Object[0]);
        Analytics analytics = c;
        if (analytics != null) {
            analytics.screen(str, g);
        }
    }

    @Override // com.amazon.aps.iva.ds.a
    public final void d() {
        com.amazon.aps.iva.mf0.a.a.a("resetUser", new Object[0]);
        Analytics analytics = c;
        if (analytics != null) {
            analytics.reset();
        }
    }

    @Override // com.amazon.aps.iva.ds.a
    public final void e(i iVar) {
        Properties g = g(x.L0(f(iVar), o.b0(iVar.b)));
        StringBuilder sb = new StringBuilder();
        String str = iVar.a;
        sb.append(str);
        sb.append(" ");
        sb.append(g);
        com.amazon.aps.iva.mf0.a.a.a(sb.toString(), new Object[0]);
        Analytics analytics = c;
        if (analytics != null) {
            analytics.track(str, g);
        }
    }
}
