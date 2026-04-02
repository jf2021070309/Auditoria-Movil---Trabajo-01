package com.amazon.aps.iva.xd0;

import com.amazon.aps.iva.lb0.t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: MemberScope.kt */
/* loaded from: classes4.dex */
public final class k {
    public static final HashSet a(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set<com.amazon.aps.iva.nd0.f> f = ((i) it.next()).f();
            if (f == null) {
                return null;
            }
            t.d0(hashSet, f);
        }
        return hashSet;
    }
}
