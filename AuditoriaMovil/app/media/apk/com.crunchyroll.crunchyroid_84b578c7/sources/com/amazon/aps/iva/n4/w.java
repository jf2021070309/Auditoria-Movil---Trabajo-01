package com.amazon.aps.iva.n4;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.x.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: FragmentTransition.kt */
/* loaded from: classes.dex */
public final class w {
    public static final y a = new y();
    public static final c0 b;

    static {
        c0 c0Var;
        try {
            c0Var = (c0) com.amazon.aps.iva.a9.f.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c0Var = null;
        }
        b = c0Var;
    }

    public static final void a(Fragment fragment, Fragment fragment2, boolean z, com.amazon.aps.iva.x.a aVar) {
        com.amazon.aps.iva.c3.f0 enterTransitionCallback;
        com.amazon.aps.iva.yb0.j.f(fragment, "inFragment");
        com.amazon.aps.iva.yb0.j.f(fragment2, "outFragment");
        if (z) {
            enterTransitionCallback = fragment2.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList(aVar.d);
            Iterator it = ((a.C0836a) aVar.entrySet()).iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(aVar.d);
            Iterator it2 = ((a.C0836a) aVar.entrySet()).iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
            }
        }
    }

    public static final String b(com.amazon.aps.iva.x.a<String, String> aVar, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((a.C0836a) aVar.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (com.amazon.aps.iva.yb0.j.a(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add((String) entry2.getKey());
        }
        return (String) com.amazon.aps.iva.lb0.x.v0(arrayList);
    }

    public static final void c(int i, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
