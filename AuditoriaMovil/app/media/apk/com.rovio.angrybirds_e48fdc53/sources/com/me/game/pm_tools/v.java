package com.me.game.pm_tools;

import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes5.dex */
public class v {
    public static final int b = 0;
    public static final int c = 1;
    private static volatile v d;
    private HashMap<Object, List<i>> a = new HashMap<>();

    /* loaded from: classes5.dex */
    public class a implements Runnable {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            List list = (List) v.this.a.remove(this.a);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((i) it.next()).c();
                        it.remove();
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    private v() {
    }

    private List<i> f(Context context) {
        List<i> list = this.a.get(context);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.a.put(context, arrayList);
            return arrayList;
        }
        return list;
    }

    public static v g() {
        synchronized (v.class) {
            if (d == null) {
                d = new v();
            }
        }
        return d;
    }

    public void b(Context context, i iVar) {
        List<i> f = f(context);
        if (f.contains(iVar)) {
            return;
        }
        f.add(iVar);
    }

    public void c(Context context) {
        a aVar = new a(context);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            b.d.e(aVar);
        } else {
            aVar.run();
        }
    }

    public void d(Context context, Class cls) {
        List<i> list = this.a.get(context);
        if (list != null) {
            Iterator<i> it = list.iterator();
            while (it.hasNext()) {
                i next = it.next();
                try {
                    if (next.getClass().equals(cls)) {
                        next.c();
                        it.remove();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public <Dlg extends i> Dlg e(Context context, Class cls) {
        Iterator<i> it = f(context).iterator();
        while (it.hasNext()) {
            Dlg dlg = (Dlg) it.next();
            if (dlg.getClass().equals(cls)) {
                return dlg;
            }
        }
        return null;
    }

    public void h(i iVar) {
        for (List<i> list : this.a.values()) {
            list.remove(iVar);
        }
    }

    public void i(i iVar) {
        b(iVar.d(), iVar);
    }
}
