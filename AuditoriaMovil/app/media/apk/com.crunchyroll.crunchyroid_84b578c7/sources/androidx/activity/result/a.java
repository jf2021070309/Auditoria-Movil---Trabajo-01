package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.a;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import com.amazon.aps.iva.cc0.c;
import com.amazon.aps.iva.h.b;
import com.amazon.aps.iva.h.d;
import com.amazon.aps.iva.h.e;
import com.amazon.aps.iva.i5.o;
import com.google.android.gms.cast.Cast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
/* compiled from: ActivityResultRegistry.java */
/* loaded from: classes.dex */
public abstract class a {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public ArrayList<String> d = new ArrayList<>();
    public final transient HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final Bundle g = new Bundle();

    /* compiled from: ActivityResultRegistry.java */
    /* renamed from: androidx.activity.result.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0005a<O> {
        public final com.amazon.aps.iva.h.b<O> a;
        public final com.amazon.aps.iva.i.a<?, O> b;

        public C0005a(com.amazon.aps.iva.i.a aVar, com.amazon.aps.iva.h.b bVar) {
            this.a = bVar;
            this.b = aVar;
        }
    }

    /* compiled from: ActivityResultRegistry.java */
    /* loaded from: classes.dex */
    public static class b {
        public final g a;
        public final ArrayList<j> b = new ArrayList<>();

        public b(g gVar) {
            this.a = gVar;
        }
    }

    public final boolean a(int i, int i2, Intent intent) {
        com.amazon.aps.iva.h.b<O> bVar;
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0005a c0005a = (C0005a) this.e.get(str);
        if (c0005a != null && (bVar = c0005a.a) != 0 && this.d.contains(str)) {
            bVar.a(c0005a.b.c(i2, intent));
            this.d.remove(str);
            return true;
        }
        this.f.remove(str);
        this.g.putParcelable(str, new com.amazon.aps.iva.h.a(i2, intent));
        return true;
    }

    public abstract void b(int i, com.amazon.aps.iva.i.a aVar, @SuppressLint({"UnknownNullness"}) Object obj);

    public final d c(final String str, o oVar, final com.amazon.aps.iva.i.a aVar, final com.amazon.aps.iva.h.b bVar) {
        g lifecycle = oVar.getLifecycle();
        if (!lifecycle.getCurrentState().isAtLeast(g.b.STARTED)) {
            e(str);
            HashMap hashMap = this.c;
            b bVar2 = (b) hashMap.get(str);
            if (bVar2 == null) {
                bVar2 = new b(lifecycle);
            }
            j jVar = new j() { // from class: androidx.activity.result.ActivityResultRegistry$1
                @Override // androidx.lifecycle.j
                public final void U2(o oVar2, g.a aVar2) {
                    boolean equals = g.a.ON_START.equals(aVar2);
                    String str2 = str;
                    a aVar3 = a.this;
                    if (equals) {
                        HashMap hashMap2 = aVar3.e;
                        com.amazon.aps.iva.i.a aVar4 = aVar;
                        b bVar3 = bVar;
                        hashMap2.put(str2, new a.C0005a(aVar4, bVar3));
                        HashMap hashMap3 = aVar3.f;
                        if (hashMap3.containsKey(str2)) {
                            Object obj = hashMap3.get(str2);
                            hashMap3.remove(str2);
                            bVar3.a(obj);
                        }
                        Bundle bundle = aVar3.g;
                        com.amazon.aps.iva.h.a aVar5 = (com.amazon.aps.iva.h.a) bundle.getParcelable(str2);
                        if (aVar5 != null) {
                            bundle.remove(str2);
                            bVar3.a(aVar4.c(aVar5.b, aVar5.c));
                        }
                    } else if (g.a.ON_STOP.equals(aVar2)) {
                        aVar3.e.remove(str2);
                    } else if (g.a.ON_DESTROY.equals(aVar2)) {
                        aVar3.f(str2);
                    }
                }
            };
            bVar2.a.addObserver(jVar);
            bVar2.b.add(jVar);
            hashMap.put(str, bVar2);
            return new d(this, str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + oVar + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final e d(String str, com.amazon.aps.iva.i.a aVar, com.amazon.aps.iva.h.b bVar) {
        e(str);
        this.e.put(str, new C0005a(aVar, bVar));
        HashMap hashMap = this.f;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            bVar.a(obj);
        }
        Bundle bundle = this.g;
        com.amazon.aps.iva.h.a aVar2 = (com.amazon.aps.iva.h.a) bundle.getParcelable(str);
        if (aVar2 != null) {
            bundle.remove(str);
            bVar.a(aVar.c(aVar2.b, aVar2.c));
        }
        return new e(this, str, aVar);
    }

    public final void e(String str) {
        HashMap hashMap = this.b;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        int e = c.b.e(2147418112);
        while (true) {
            int i = e + Cast.MAX_MESSAGE_LENGTH;
            HashMap hashMap2 = this.a;
            if (hashMap2.containsKey(Integer.valueOf(i))) {
                e = c.b.e(2147418112);
            } else {
                hashMap2.put(Integer.valueOf(i), str);
                hashMap.put(str, Integer.valueOf(i));
                return;
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        HashMap hashMap = this.f;
        if (hashMap.containsKey(str)) {
            Objects.toString(hashMap.get(str));
            hashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Objects.toString(bundle.getParcelable(str));
            bundle.remove(str);
        }
        HashMap hashMap2 = this.c;
        b bVar = (b) hashMap2.get(str);
        if (bVar != null) {
            ArrayList<j> arrayList = bVar.b;
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                bVar.a.removeObserver(it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
