package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12;

import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.l0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class c {
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.Integer, java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k>> a(java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> r7) {
        /*
            if (r7 == 0) goto L67
            int r0 = r7.size()
            if (r0 != 0) goto L9
            goto L67
        L9:
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.l0.a(r7)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            r2 = -1000(0xfffffffffffffc18, float:NaN)
        L14:
            int r3 = r7.size()
            if (r1 >= r3) goto L68
            java.lang.Object r3 = r7.get(r1)
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k r3 = (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k) r3
            if (r3 == 0) goto L64
            int r4 = r3.f()
            r5 = 100
            if (r4 == r5) goto L4c
            int r4 = r3.f()
            if (r4 != 0) goto L31
            goto L4c
        L31:
            int r4 = r3.p()
            if (r4 == r2) goto L41
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r4 = r3.p()
            goto L55
        L41:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object r4 = r0.get(r4)
            java.util.List r4 = (java.util.List) r4
            goto L58
        L4c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r4 = r3.y()
        L55:
            r6 = r4
            r4 = r2
            r2 = r6
        L58:
            if (r4 == 0) goto L64
            r4.add(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.put(r3, r4)
        L64:
            int r1 = r1 + 1
            goto L14
        L67:
            r0 = 0
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_for12.c.a(java.util.List):java.util.Map");
    }

    public static Map<Integer, List<k>> b(List<k> list) {
        List list2;
        if (list == null || list.size() == 0) {
            return null;
        }
        l0.a(list);
        HashMap hashMap = new HashMap();
        int i = -1000;
        for (int i2 = 0; i2 < list.size(); i2++) {
            k kVar = list.get(i2);
            if (kVar != null) {
                if (kVar.p() != i) {
                    list2 = new ArrayList();
                    i = kVar.p();
                } else {
                    list2 = (List) hashMap.get(Integer.valueOf(i));
                }
                if (list2 != null) {
                    list2.add(kVar);
                    hashMap.put(Integer.valueOf(i), list2);
                }
            }
        }
        return hashMap;
    }
}
