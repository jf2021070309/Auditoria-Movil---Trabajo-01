package com.amazon.aps.iva.h8;

import android.os.Bundle;
import android.os.Parcelable;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.g8.m0;
import com.amazon.aps.iva.g8.r0;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.xb0.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: NavHostController.kt */
/* loaded from: classes.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.x0.o, m0, Bundle> {
    public static final j h = new j();

    public j() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Bundle invoke(com.amazon.aps.iva.x0.o oVar, m0 m0Var) {
        Bundle bundle;
        m0 m0Var2 = m0Var;
        m0Var2.getClass();
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : i0.a0(m0Var2.w.a).entrySet()) {
            String str = (String) entry.getKey();
            ((r0) entry.getValue()).getClass();
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        com.amazon.aps.iva.lb0.k<com.amazon.aps.iva.g8.f> kVar = m0Var2.g;
        if (!kVar.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[kVar.d];
            Iterator<com.amazon.aps.iva.g8.f> it = kVar.iterator();
            int i = 0;
            while (it.hasNext()) {
                parcelableArr[i] = new com.amazon.aps.iva.g8.g(it.next());
                i++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = m0Var2.n;
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i2 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                iArr[i2] = ((Number) entry2.getKey()).intValue();
                arrayList2.add((String) entry2.getValue());
                i2++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = m0Var2.o;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str2 = (String) entry3.getKey();
                com.amazon.aps.iva.lb0.k kVar2 = (com.amazon.aps.iva.lb0.k) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[kVar2.d];
                Iterator<E> it2 = kVar2.iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        parcelableArr2[i3] = (com.amazon.aps.iva.g8.g) next;
                        i3 = i4;
                    } else {
                        f1.S();
                        throw null;
                    }
                }
                bundle.putParcelableArray(com.amazon.aps.iva.oa.a.a("android-support-nav:controller:backStackStates:", str2), parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (m0Var2.f) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", m0Var2.f);
        }
        return bundle;
    }
}
