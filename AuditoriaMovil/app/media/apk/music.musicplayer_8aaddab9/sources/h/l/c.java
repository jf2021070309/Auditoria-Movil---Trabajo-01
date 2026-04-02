package h.l;

import e.j.d.w;
import h.o.c.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class c extends b {
    public static final <T> List<T> a(T[] tArr) {
        j.e(tArr, "<this>");
        List<T> asList = Arrays.asList(tArr);
        j.d(asList, "asList(this)");
        return asList;
    }

    public static final byte[] b(byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        j.e(bArr, "<this>");
        j.e(bArr2, "destination");
        System.arraycopy(bArr, i3, bArr2, i2, i4 - i3);
        return bArr2;
    }

    public static /* synthetic */ byte[] c(byte[] bArr, byte[] bArr2, int i2, int i3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = bArr.length;
        }
        b(bArr, bArr2, i2, i3, i4);
        return bArr2;
    }

    public static Object[] d(Object[] objArr, Object[] objArr2, int i2, int i3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = objArr.length;
        }
        j.e(objArr, "<this>");
        j.e(objArr2, "destination");
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
        return objArr2;
    }

    public static final <T> List<T> e(T... tArr) {
        j.e(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new a(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> f(List<? extends T> list) {
        j.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : w.a0(list.get(0)) : e.a;
    }

    public static final <T> List<T> g(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        j.e(collection, "<this>");
        j.e(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            w.e(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static final void h() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final <T, C extends Collection<? super T>> C i(Iterable<? extends T> iterable, C c2) {
        j.e(iterable, "<this>");
        j.e(c2, "destination");
        for (T t : iterable) {
            c2.add(t);
        }
        return c2;
    }

    public static final <T> List<T> j(Iterable<? extends T> iterable) {
        ArrayList arrayList;
        j.e(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return w.a0(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                }
                j.e(collection, "<this>");
                return new ArrayList(collection);
            }
            return e.a;
        }
        j.e(iterable, "<this>");
        if (z) {
            Collection collection2 = (Collection) iterable;
            j.e(collection2, "<this>");
            arrayList = new ArrayList(collection2);
        } else {
            arrayList = new ArrayList();
            i(iterable, arrayList);
        }
        return f(arrayList);
    }

    public static final <K, V> Map<K, V> k(Iterable<? extends h.f<? extends K, ? extends V>> iterable) {
        j.e(iterable, "<this>");
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(w.b0(collection.size()));
                l(iterable, linkedHashMap);
                return linkedHashMap;
            }
            h.f fVar = (h.f) ((List) iterable).get(0);
            j.e(fVar, "pair");
            Map<K, V> singletonMap = Collections.singletonMap(fVar.a, fVar.f8925b);
            j.d(singletonMap, "singletonMap(pair.first, pair.second)");
            return singletonMap;
        }
        return f.a;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M l(Iterable<? extends h.f<? extends K, ? extends V>> iterable, M m2) {
        j.e(iterable, "<this>");
        j.e(m2, "destination");
        j.e(m2, "<this>");
        j.e(iterable, "pairs");
        for (h.f<? extends K, ? extends V> fVar : iterable) {
            m2.put(fVar.a, fVar.f8925b);
        }
        return m2;
    }
}
