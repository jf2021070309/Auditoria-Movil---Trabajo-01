package com.amazon.aps.iva.x60;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.x60.a;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import java.util.LinkedList;
/* compiled from: TrackFragmentLifecycleCallbacks.kt */
/* loaded from: classes2.dex */
public final class e extends FragmentManager.l {
    public final l<String, q> a;
    public final LinkedList<String> b = new LinkedList<>();

    public e(a.c cVar) {
        this.a = cVar;
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void h(FragmentManager fragmentManager, Fragment fragment) {
        j.f(fragmentManager, "fm");
        j.f(fragment, "fragment");
        LinkedList<String> linkedList = this.b;
        linkedList.add(fragment.getClass().getName());
        String obj = linkedList.toString();
        j.e(obj, "activeFragmentsList.toString()");
        this.a.invoke(obj);
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void i(FragmentManager fragmentManager, Fragment fragment) {
        j.f(fragmentManager, "fm");
        j.f(fragment, "fragment");
        LinkedList<String> linkedList = this.b;
        linkedList.removeLastOccurrence(fragment.getClass().getName());
        String obj = linkedList.toString();
        j.e(obj, "activeFragmentsList.toString()");
        this.a.invoke(obj);
    }
}
