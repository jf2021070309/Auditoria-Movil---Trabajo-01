package com.amazon.aps.iva.x2;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.x2.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: ViewTransitionController.java */
/* loaded from: classes.dex */
public final class x {
    public final o a;
    public HashSet<View> c;
    public ArrayList<w.a> d;
    public final ArrayList<w> b = new ArrayList<>();
    public final ArrayList<w.a> e = new ArrayList<>();

    /* compiled from: ViewTransitionController.java */
    /* loaded from: classes.dex */
    public class a {
    }

    public x(o oVar) {
        this.a = oVar;
    }

    public static void a(w wVar, boolean z) {
        com.amazon.aps.iva.y2.e sharedValues = ConstraintLayout.getSharedValues();
        int i = wVar.u;
        a aVar = new a();
        HashMap<Integer, HashSet<WeakReference<Object>>> hashMap = sharedValues.a;
        HashSet<WeakReference<Object>> hashSet = hashMap.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            hashMap.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference<>(aVar));
    }
}
