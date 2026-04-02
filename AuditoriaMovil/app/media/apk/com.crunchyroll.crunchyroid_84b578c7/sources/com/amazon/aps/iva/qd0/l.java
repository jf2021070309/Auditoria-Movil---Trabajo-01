package com.amazon.aps.iva.qd0;

import com.amazon.aps.iva.oc0.n0;
import com.amazon.aps.iva.oc0.x0;
import java.util.Comparator;
/* compiled from: MemberComparator.java */
/* loaded from: classes4.dex */
public final class l implements Comparator<com.amazon.aps.iva.oc0.k> {
    public static final l b = new l();

    public static int a(com.amazon.aps.iva.oc0.k kVar) {
        if (i.m(kVar)) {
            return 8;
        }
        if (kVar instanceof com.amazon.aps.iva.oc0.j) {
            return 7;
        }
        if (kVar instanceof n0) {
            if (((n0) kVar).M() == null) {
                return 6;
            }
            return 5;
        } else if (kVar instanceof com.amazon.aps.iva.oc0.v) {
            if (((com.amazon.aps.iva.oc0.v) kVar).M() == null) {
                return 4;
            }
            return 3;
        } else if (kVar instanceof com.amazon.aps.iva.oc0.e) {
            return 2;
        } else {
            if (kVar instanceof x0) {
                return 1;
            }
            return 0;
        }
    }

    @Override // java.util.Comparator
    public final int compare(com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.oc0.k kVar2) {
        Integer num;
        com.amazon.aps.iva.oc0.k kVar3 = kVar;
        com.amazon.aps.iva.oc0.k kVar4 = kVar2;
        int a = a(kVar4) - a(kVar3);
        if (a != 0) {
            num = Integer.valueOf(a);
        } else if (i.m(kVar3) && i.m(kVar4)) {
            num = 0;
        } else {
            int compareTo = kVar3.getName().b.compareTo(kVar4.getName().b);
            if (compareTo != 0) {
                num = Integer.valueOf(compareTo);
            } else {
                num = null;
            }
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
