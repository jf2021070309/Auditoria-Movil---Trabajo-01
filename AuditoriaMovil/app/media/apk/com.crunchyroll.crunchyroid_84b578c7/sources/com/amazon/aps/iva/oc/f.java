package com.amazon.aps.iva.oc;

import com.amazon.aps.iva.oc.k;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: GroupedLinkedMap.java */
/* loaded from: classes.dex */
public final class f<K extends k, V> {
    public final a<K, V> a = new a<>();
    public final HashMap b = new HashMap();

    /* compiled from: GroupedLinkedMap.java */
    /* loaded from: classes.dex */
    public static class a<K, V> {
        public final K a;
        public ArrayList b;
        public a<K, V> c;
        public a<K, V> d;

        public a() {
            this(null);
        }

        public a(K k) {
            this.d = this;
            this.c = this;
            this.a = k;
        }
    }

    public final V a(K k) {
        a aVar;
        int i;
        HashMap hashMap = this.b;
        a aVar2 = (a) hashMap.get(k);
        if (aVar2 == null) {
            a aVar3 = new a(k);
            hashMap.put(k, aVar3);
            aVar = aVar3;
        } else {
            k.a();
            aVar = aVar2;
        }
        a<K, V> aVar4 = aVar.d;
        aVar4.c = aVar.c;
        aVar.c.d = aVar4;
        a<K, V> aVar5 = this.a;
        aVar.d = aVar5;
        a<K, V> aVar6 = aVar5.c;
        aVar.c = aVar6;
        aVar6.d = aVar;
        aVar.d.c = aVar;
        ArrayList arrayList = aVar.b;
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        if (i > 0) {
            return (V) aVar.b.remove(i - 1);
        }
        return null;
    }

    public final void b(K k, V v) {
        HashMap hashMap = this.b;
        a aVar = (a) hashMap.get(k);
        if (aVar == null) {
            aVar = new a(k);
            a<K, V> aVar2 = aVar.d;
            aVar2.c = aVar.c;
            aVar.c.d = aVar2;
            a<K, V> aVar3 = this.a;
            aVar.d = aVar3.d;
            aVar.c = aVar3;
            aVar3.d = aVar;
            aVar.d.c = aVar;
            hashMap.put(k, aVar);
        } else {
            k.a();
        }
        if (aVar.b == null) {
            aVar.b = new ArrayList();
        }
        aVar.b.add(v);
    }

    public final V c() {
        int i;
        a<K, V> aVar = this.a;
        a aVar2 = aVar.d;
        while (true) {
            V v = null;
            if (aVar2.equals(aVar)) {
                return null;
            }
            ArrayList arrayList = aVar2.b;
            if (arrayList != null) {
                i = arrayList.size();
            } else {
                i = 0;
            }
            if (i > 0) {
                v = (V) aVar2.b.remove(i - 1);
            }
            if (v != null) {
                return v;
            }
            a<K, V> aVar3 = aVar2.d;
            aVar3.c = aVar2.c;
            aVar2.c.d = aVar3;
            HashMap hashMap = this.b;
            Object obj = aVar2.a;
            hashMap.remove(obj);
            ((k) obj).a();
            aVar2 = aVar2.d;
        }
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a<K, V> aVar = this.a;
        a aVar2 = aVar.c;
        boolean z = false;
        while (!aVar2.equals(aVar)) {
            sb.append('{');
            sb.append(aVar2.a);
            sb.append(':');
            ArrayList arrayList = aVar2.b;
            if (arrayList != null) {
                i = arrayList.size();
            } else {
                i = 0;
            }
            sb.append(i);
            sb.append("}, ");
            aVar2 = aVar2.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
