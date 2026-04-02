package com.amazon.aps.iva.t3;

import android.widget.ListView;
/* compiled from: ListViewCompat.java */
/* loaded from: classes.dex */
public final class g {
    public static boolean a(ListView listView, int i) {
        return listView.canScrollList(i);
    }

    public static void b(ListView listView, int i) {
        listView.scrollListBy(i);
    }
}
