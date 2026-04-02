package com.amazon.aps.iva.v4;

import com.amazon.aps.iva.v4.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ListFieldSchema.java */
/* loaded from: classes.dex */
public abstract class f0 {
    public static final a a = new a();
    public static final b b = new b();

    /* compiled from: ListFieldSchema.java */
    /* loaded from: classes.dex */
    public static final class a extends f0 {
        public static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        /* JADX WARN: Multi-variable type inference failed */
        public static <L> List<L> d(Object obj, long j, int i) {
            d0 d0Var;
            List<L> arrayList;
            List<L> list = (List) o1.o(obj, j);
            if (list.isEmpty()) {
                if (list instanceof e0) {
                    arrayList = new d0(i);
                } else if ((list instanceof y0) && (list instanceof y.d)) {
                    arrayList = ((y.d) list).mutableCopyWithCapacity(i);
                } else {
                    arrayList = new ArrayList<>(i);
                }
                o1.v(obj, j, arrayList);
                return arrayList;
            }
            if (c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList2 = new ArrayList(list.size() + i);
                arrayList2.addAll(list);
                o1.v(obj, j, arrayList2);
                d0Var = arrayList2;
            } else if (list instanceof n1) {
                d0 d0Var2 = new d0(list.size() + i);
                d0Var2.addAll((n1) list);
                o1.v(obj, j, d0Var2);
                d0Var = d0Var2;
            } else if ((list instanceof y0) && (list instanceof y.d)) {
                y.d dVar = (y.d) list;
                if (!dVar.isModifiable()) {
                    y.d mutableCopyWithCapacity = dVar.mutableCopyWithCapacity(list.size() + i);
                    o1.v(obj, j, mutableCopyWithCapacity);
                    return mutableCopyWithCapacity;
                }
                return list;
            } else {
                return list;
            }
            return d0Var;
        }

        @Override // com.amazon.aps.iva.v4.f0
        public final void a(Object obj, long j) {
            Object unmodifiableList;
            List list = (List) o1.o(obj, j);
            if (list instanceof e0) {
                unmodifiableList = ((e0) list).getUnmodifiableView();
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof y0) && (list instanceof y.d)) {
                    y.d dVar = (y.d) list;
                    if (dVar.isModifiable()) {
                        dVar.makeImmutable();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            o1.v(obj, j, unmodifiableList);
        }

        @Override // com.amazon.aps.iva.v4.f0
        public final <E> void b(Object obj, Object obj2, long j) {
            List list = (List) o1.o(obj2, j);
            List d = d(obj, j, list.size());
            int size = d.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                d.addAll(list);
            }
            if (size > 0) {
                list = d;
            }
            o1.v(obj, j, list);
        }

        @Override // com.amazon.aps.iva.v4.f0
        public final <L> List<L> c(Object obj, long j) {
            return d(obj, j, 10);
        }
    }

    /* compiled from: ListFieldSchema.java */
    /* loaded from: classes.dex */
    public static final class b extends f0 {
        @Override // com.amazon.aps.iva.v4.f0
        public final void a(Object obj, long j) {
            ((y.d) o1.o(obj, j)).makeImmutable();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
        @Override // com.amazon.aps.iva.v4.f0
        public final <E> void b(Object obj, Object obj2, long j) {
            y.d<E> dVar = (y.d) o1.o(obj, j);
            y.d<E> dVar2 = (y.d) o1.o(obj2, j);
            int size = dVar.size();
            int size2 = dVar2.size();
            y.d<E> dVar3 = dVar;
            dVar3 = dVar;
            if (size > 0 && size2 > 0) {
                boolean isModifiable = dVar.isModifiable();
                y.d<E> dVar4 = dVar;
                if (!isModifiable) {
                    dVar4 = dVar.mutableCopyWithCapacity(size2 + size);
                }
                dVar4.addAll(dVar2);
                dVar3 = dVar4;
            }
            if (size > 0) {
                dVar2 = dVar3;
            }
            o1.v(obj, j, dVar2);
        }

        @Override // com.amazon.aps.iva.v4.f0
        public final <L> List<L> c(Object obj, long j) {
            int i;
            y.d dVar = (y.d) o1.o(obj, j);
            if (!dVar.isModifiable()) {
                int size = dVar.size();
                if (size == 0) {
                    i = 10;
                } else {
                    i = size * 2;
                }
                y.d mutableCopyWithCapacity = dVar.mutableCopyWithCapacity(i);
                o1.v(obj, j, mutableCopyWithCapacity);
                return mutableCopyWithCapacity;
            }
            return dVar;
        }
    }

    public abstract void a(Object obj, long j);

    public abstract <L> void b(Object obj, Object obj2, long j);

    public abstract <L> List<L> c(Object obj, long j);
}
