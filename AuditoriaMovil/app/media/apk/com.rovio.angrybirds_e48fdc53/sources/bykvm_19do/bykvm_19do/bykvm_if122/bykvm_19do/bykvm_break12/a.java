package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_break12;

import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class a {
    public static c a(c cVar, String str) {
        c cVar2 = null;
        if (cVar != null && !TextUtils.isEmpty(str) && cVar.F() != null && cVar.F().size() != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<k> it = cVar.F().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k next = it.next();
                if (str.equals(next.d())) {
                    arrayList.add(next.b());
                    break;
                }
            }
            if (arrayList.size() != 0) {
                k kVar = arrayList.get(0);
                if (kVar != null && kVar.G() && !"pangle".equals(kVar.e())) {
                    Iterator<k> it2 = cVar.F().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        k next2 = it2.next();
                        if (next2.G() && "pangle".equals(next2.e())) {
                            arrayList.add(next2.b());
                            break;
                        }
                    }
                }
                cVar2 = cVar.a();
                if (cVar2.N()) {
                    cVar2.a(arrayList);
                } else {
                    cVar2.b(arrayList);
                }
                k kVar2 = arrayList.get(0);
                kVar2.f(0);
                if (kVar2.f() == 0) {
                    cVar2.b(kVar2.i());
                }
                if (kVar2.f() == 2) {
                    cVar2.b(true);
                }
                if (kVar2.f() == 1 || kVar2.f() == 3) {
                    cVar2.a(true);
                }
                cVar2.i(0);
            }
        }
        return cVar2;
    }

    public static String a(String str) {
        try {
            if (!TextUtils.isEmpty(str) && str.startsWith("gm_test_slot_")) {
                return str.substring(13);
            }
        } catch (Exception e) {
        }
        return null;
    }
}
