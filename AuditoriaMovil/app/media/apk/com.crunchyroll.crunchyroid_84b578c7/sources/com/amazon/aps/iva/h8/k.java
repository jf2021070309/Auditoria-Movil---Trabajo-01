package com.amazon.aps.iva.h8;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.amazon.aps.iva.g8.m0;
import com.amazon.aps.iva.lb0.e0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: NavHostController.kt */
/* loaded from: classes.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Bundle, m0> {
    public final /* synthetic */ Context h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context) {
        super(1);
        this.h = context;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final m0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        m0 e = com.amazon.aps.iva.e1.d.e(this.h);
        if (bundle2 != null) {
            bundle2.setClassLoader(e.a.getClassLoader());
            e.d = bundle2.getBundle("android-support-nav:controller:navigatorState");
            e.e = bundle2.getParcelableArray("android-support-nav:controller:backStack");
            LinkedHashMap linkedHashMap = e.o;
            linkedHashMap.clear();
            int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
            if (intArray != null && stringArrayList != null) {
                int length = intArray.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    e.n.put(Integer.valueOf(intArray[i]), stringArrayList.get(i2));
                    i++;
                    i2++;
                }
            }
            ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
            if (stringArrayList2 != null) {
                for (String str : stringArrayList2) {
                    Parcelable[] parcelableArray = bundle2.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                    if (parcelableArray != null) {
                        com.amazon.aps.iva.yb0.j.e(str, "id");
                        com.amazon.aps.iva.lb0.k kVar = new com.amazon.aps.iva.lb0.k(parcelableArray.length);
                        e0 C = com.amazon.aps.iva.aq.j.C(parcelableArray);
                        while (C.hasNext()) {
                            Parcelable parcelable = (Parcelable) C.next();
                            com.amazon.aps.iva.yb0.j.d(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                            kVar.addLast((com.amazon.aps.iva.g8.g) parcelable);
                        }
                        linkedHashMap.put(str, kVar);
                    }
                }
            }
            e.f = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
        return e;
    }
}
