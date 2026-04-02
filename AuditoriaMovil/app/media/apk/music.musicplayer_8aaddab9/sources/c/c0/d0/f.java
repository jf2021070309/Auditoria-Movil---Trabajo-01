package c.c0.d0;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import c.c0.d0.s.p;
import c.c0.d0.s.q;
import c.c0.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class f {
    public static final String a = r.e("Schedulers");

    public static void a(c.c0.c cVar, WorkDatabase workDatabase, List<e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        q q = workDatabase.q();
        workDatabase.c();
        try {
            c.c0.d0.s.r rVar = (c.c0.d0.s.r) q;
            List<p> c2 = rVar.c(Build.VERSION.SDK_INT == 23 ? cVar.f1323h / 2 : cVar.f1323h);
            List<p> b2 = rVar.b(200);
            if (((ArrayList) c2).size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = ((ArrayList) c2).iterator();
                while (it.hasNext()) {
                    rVar.l(((p) it.next()).a, currentTimeMillis);
                }
            }
            workDatabase.k();
            workDatabase.g();
            ArrayList arrayList = (ArrayList) c2;
            if (arrayList.size() > 0) {
                p[] pVarArr = (p[]) arrayList.toArray(new p[arrayList.size()]);
                for (e eVar : list) {
                    if (eVar.c()) {
                        eVar.a(pVarArr);
                    }
                }
            }
            ArrayList arrayList2 = (ArrayList) b2;
            if (arrayList2.size() > 0) {
                p[] pVarArr2 = (p[]) arrayList2.toArray(new p[arrayList2.size()]);
                for (e eVar2 : list) {
                    if (!eVar2.c()) {
                        eVar2.a(pVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}
