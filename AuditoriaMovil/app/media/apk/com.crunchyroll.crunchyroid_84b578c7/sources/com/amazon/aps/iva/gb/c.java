package com.amazon.aps.iva.gb;

import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NavigableSet;
import java.util.TreeSet;
/* compiled from: ViewCacheStorage.java */
/* loaded from: classes.dex */
public final class c implements b {
    public final RecyclerView.p a;
    public NavigableSet<Integer> b = new TreeSet();
    public NavigableSet<Integer> c = new TreeSet();
    public final int d = 1000;
    public final boolean e = true;

    public c(RecyclerView.p pVar) {
        this.a = pVar;
    }

    public final Integer a() {
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.last();
    }

    public final void b(int i) {
        if (this.c.isEmpty()) {
            return;
        }
        Iterator<Integer> it = this.b.tailSet(Integer.valueOf(i), true).iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        Integer lower = this.b.lower(Integer.valueOf(i));
        if (lower != null) {
            i = lower.intValue();
        }
        Iterator<Integer> it2 = this.c.tailSet(Integer.valueOf(i), true).iterator();
        while (it2.hasNext()) {
            it2.next();
            it2.remove();
        }
    }

    public final void c(LinkedList linkedList) {
        if (this.e && !linkedList.isEmpty()) {
            RecyclerView.p pVar = this.a;
            int position = pVar.getPosition((View) ((Pair) linkedList.get(0)).second);
            int position2 = pVar.getPosition((View) ((Pair) linkedList.get(linkedList.size() - 1)).second);
            int size = this.b.size();
            int i = this.d;
            if (size > i) {
                NavigableSet<Integer> navigableSet = this.b;
                navigableSet.remove(navigableSet.first());
            }
            if (this.c.size() > i) {
                NavigableSet<Integer> navigableSet2 = this.c;
                navigableSet2.remove(navigableSet2.first());
            }
            this.b.add(Integer.valueOf(position));
            this.c.add(Integer.valueOf(position2));
        }
    }
}
