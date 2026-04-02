package com.amazon.aps.iva.lb0;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
/* compiled from: _Collections.kt */
/* loaded from: classes4.dex */
public class x extends u {
    public static /* synthetic */ void A0(Iterable iterable, Appendable appendable, String str, String str2, String str3, com.amazon.aps.iva.xb0.l lVar, int i) {
        String str4;
        String str5;
        int i2;
        CharSequence charSequence;
        com.amazon.aps.iva.xb0.l lVar2;
        if ((i & 2) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 8) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i & 16) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        int i3 = i2;
        if ((i & 32) != 0) {
            charSequence = "...";
        } else {
            charSequence = null;
        }
        if ((i & 64) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        z0(iterable, appendable, str6, str4, str5, i3, charSequence, lVar2);
    }

    public static String B0(Iterable iterable, String str, String str2, String str3, com.amazon.aps.iva.xb0.l lVar, int i) {
        String str4;
        String str5;
        int i2;
        CharSequence charSequence;
        com.amazon.aps.iva.xb0.l lVar2;
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        int i3 = i2;
        if ((i & 16) != 0) {
            charSequence = "...";
        } else {
            charSequence = null;
        }
        if ((i & 32) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        com.amazon.aps.iva.yb0.j.f(str6, "separator");
        com.amazon.aps.iva.yb0.j.f(str4, "prefix");
        com.amazon.aps.iva.yb0.j.f(str5, "postfix");
        com.amazon.aps.iva.yb0.j.f(charSequence, "truncated");
        StringBuilder sb = new StringBuilder();
        z0(iterable, sb, str6, str4, str5, i3, charSequence, lVar2);
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final <T> T C0(Iterable<? extends T> iterable) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) D0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T D0(List<? extends T> list) {
        com.amazon.aps.iva.yb0.j.f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(f1.B(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T E0(List<? extends T> list) {
        com.amazon.aps.iva.yb0.j.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final Comparable F0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final ArrayList G0(Iterable iterable, Object obj) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList(r.Y(iterable));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && com.amazon.aps.iva.yb0.j.a(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> H0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        com.amazon.aps.iva.yb0.j.f(iterable2, "elements");
        Collection f0 = t.f0(iterable2);
        if (f0.isEmpty()) {
            return X0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!f0.contains(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> I0(Iterable<? extends T> iterable, T[] tArr) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        com.amazon.aps.iva.yb0.j.f(tArr, "elements");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return X0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!o.N(tArr, t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final ArrayList J0(Iterable iterable, Iterable iterable2) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return L0(iterable2, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        t.d0(arrayList, iterable);
        t.d0(arrayList, iterable2);
        return arrayList;
    }

    public static final ArrayList K0(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return M0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        t.d0(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static final ArrayList L0(Iterable iterable, Collection collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "<this>");
        com.amazon.aps.iva.yb0.j.f(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        t.d0(arrayList2, iterable);
        return arrayList2;
    }

    public static final ArrayList M0(Collection collection, Object obj) {
        com.amazon.aps.iva.yb0.j.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static final List N0(AbstractList abstractList) {
        com.amazon.aps.iva.yb0.j.f(abstractList, "<this>");
        if (abstractList.size() <= 1) {
            return X0(abstractList);
        }
        List a1 = a1(abstractList);
        Collections.reverse(a1);
        return a1;
    }

    public static final <T> T O0(Iterable<? extends T> iterable) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) P0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T P0(List<? extends T> list) {
        com.amazon.aps.iva.yb0.j.f(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T Q0(Iterable<? extends T> iterable) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() != 1) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static final <T> T R0(List<? extends T> list) {
        com.amazon.aps.iva.yb0.j.f(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static final List S0(ArrayList arrayList) {
        if (arrayList.size() <= 1) {
            return X0(arrayList);
        }
        Object[] array = arrayList.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        com.amazon.aps.iva.yb0.j.f(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return m.B(array);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> T0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return X0(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            com.amazon.aps.iva.yb0.j.f(array, "<this>");
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            return m.B(array);
        }
        List<T> a1 = a1(iterable);
        s.a0(a1, comparator);
        return a1;
    }

    public static final <T> List<T> U0(Iterable<? extends T> iterable, int i) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        int i2 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == 0) {
                return z.b;
            }
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return X0(iterable);
                }
                if (i == 1) {
                    return f1.J(s0(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            for (T t : iterable) {
                arrayList.add(t);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return f1.N(arrayList);
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.c80.a.d("Requested element count ", i, " is less than zero.").toString());
    }

    public static final void V0(Iterable iterable, AbstractCollection abstractCollection) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    public static final int[] W0(Collection<Integer> collection) {
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Integer num : collection) {
            iArr[i] = num.intValue();
            i++;
        }
        return iArr;
    }

    public static final <T> List<T> X0(Iterable<? extends T> iterable) {
        Object next;
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return Z0(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return f1.J(next);
            }
            return z.b;
        }
        return f1.N(a1(iterable));
    }

    public static final long[] Y0(ArrayList arrayList) {
        com.amazon.aps.iva.yb0.j.f(arrayList, "<this>");
        long[] jArr = new long[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static final ArrayList Z0(Collection collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> List<T> a1(Iterable<? extends T> iterable) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Z0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        V0(iterable, arrayList);
        return arrayList;
    }

    public static final <T> Set<T> b1(Iterable<? extends T> iterable) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        V0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static final <T> Set<T> c1(Iterable<? extends T> iterable) {
        Object next;
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        b0 b0Var = b0.b;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(com.amazon.aps.iva.aq.k.w(collection.size()));
                    V0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return l1.H(next);
            }
            return b0Var;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        V0(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return linkedHashSet2;
            }
            return l1.H(linkedHashSet2.iterator().next());
        }
        return b0Var;
    }

    public static final d0 d1(Iterable iterable) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        return new d0(new w(iterable));
    }

    public static final ArrayList e1(Iterable iterable, Iterable iterable2) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        com.amazon.aps.iva.yb0.j.f(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(r.Y(iterable), r.Y(iterable2)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new com.amazon.aps.iva.kb0.j(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final v k0(Iterable iterable) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        return new v(iterable);
    }

    public static final ArrayList l0(Iterable iterable, int i) {
        boolean z;
        ArrayList arrayList;
        Iterator it;
        int i2;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        if (i > 0 && i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
                List list = (List) iterable;
                int size = list.size();
                int i3 = size / i;
                if (size % i == 0) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                arrayList = new ArrayList(i3 + i2);
                int i4 = 0;
                while (true) {
                    if (i4 >= 0 && i4 < size) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        break;
                    }
                    int i5 = size - i4;
                    if (i <= i5) {
                        i5 = i;
                    }
                    ArrayList arrayList2 = new ArrayList(i5);
                    for (int i6 = 0; i6 < i5; i6++) {
                        arrayList2.add(list.get(i6 + i4));
                    }
                    arrayList.add(arrayList2);
                    i4 += i;
                }
            } else {
                arrayList = new ArrayList();
                Iterator it2 = iterable.iterator();
                com.amazon.aps.iva.yb0.j.f(it2, "iterator");
                if (!it2.hasNext()) {
                    it = y.b;
                } else {
                    n0 n0Var = new n0(i, i, it2, false, true, null);
                    com.amazon.aps.iva.ne0.i iVar = new com.amazon.aps.iva.ne0.i();
                    iVar.e = com.amazon.aps.iva.a60.b.o(n0Var, iVar, iVar);
                    it = iVar;
                }
                while (it.hasNext()) {
                    arrayList.add((List) it.next());
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.c80.a.d("size ", i, " must be greater than zero.").toString());
    }

    public static final <T> boolean m0(Iterable<? extends T> iterable, T t) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        if (x0(iterable, t) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> List<T> n0(Iterable<? extends T> iterable) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        return X0(b1(iterable));
    }

    public static final List o0(Iterable iterable) {
        ArrayList arrayList;
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - 1;
            if (size <= 0) {
                return z.b;
            }
            if (size == 1) {
                return f1.J(C0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    for (int i = 1; i < size2; i++) {
                        arrayList.add(((List) iterable).get(i));
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(1);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= 1) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return f1.N(arrayList);
    }

    public static final List p0(List list) {
        com.amazon.aps.iva.yb0.j.f(list, "<this>");
        List list2 = list;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return U0(list2, size);
    }

    public static final ArrayList q0(Iterable iterable, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final ArrayList r0(Iterable iterable) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> T s0(Iterable<? extends T> iterable) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) t0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T t0(List<? extends T> list) {
        com.amazon.aps.iva.yb0.j.f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T u0(Iterable<? extends T> iterable) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static final <T> T v0(List<? extends T> list) {
        com.amazon.aps.iva.yb0.j.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final Object w0(int i, List list) {
        com.amazon.aps.iva.yb0.j.f(list, "<this>");
        if (i >= 0 && i <= f1.B(list)) {
            return list.get(i);
        }
        return null;
    }

    public static final <T> int x0(Iterable<? extends T> iterable, T t) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (T t2 : iterable) {
            if (i >= 0) {
                if (com.amazon.aps.iva.yb0.j.a(t, t2)) {
                    return i;
                }
                i++;
            } else {
                f1.S();
                throw null;
            }
        }
        return -1;
    }

    public static final <T> Set<T> y0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        com.amazon.aps.iva.yb0.j.f(iterable2, "other");
        Set<T> b1 = b1(iterable);
        b1.retainAll(t.f0(iterable2));
        return b1;
    }

    public static final void z0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        com.amazon.aps.iva.yb0.j.f(appendable, "buffer");
        com.amazon.aps.iva.yb0.j.f(charSequence, "separator");
        com.amazon.aps.iva.yb0.j.f(charSequence2, "prefix");
        com.amazon.aps.iva.yb0.j.f(charSequence3, "postfix");
        com.amazon.aps.iva.yb0.j.f(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            com.amazon.aps.iva.aq.k.g(appendable, obj, lVar);
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }
}
