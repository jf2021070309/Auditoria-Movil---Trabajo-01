package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ListFieldSchema.java */
/* loaded from: classes.dex */
public abstract class g0 {
    public static final a a = new a();
    public static final b b = new b();

    /* compiled from: ListFieldSchema.java */
    /* loaded from: classes.dex */
    public static final class a extends g0 {
        public static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        /* JADX WARN: Multi-variable type inference failed */
        public static <L> List<L> d(Object obj, long j, int i) {
            e0 e0Var;
            List<L> arrayList;
            List<L> list = (List) r1.n(obj, j);
            if (list.isEmpty()) {
                if (list instanceof f0) {
                    arrayList = new e0(i);
                } else if ((list instanceof a1) && (list instanceof z.c)) {
                    arrayList = ((z.c) list).mutableCopyWithCapacity(i);
                } else {
                    arrayList = new ArrayList<>(i);
                }
                r1.u(obj, j, arrayList);
                return arrayList;
            }
            if (c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList2 = new ArrayList(list.size() + i);
                arrayList2.addAll(list);
                r1.u(obj, j, arrayList2);
                e0Var = arrayList2;
            } else if (list instanceof q1) {
                e0 e0Var2 = new e0(list.size() + i);
                e0Var2.addAll((q1) list);
                r1.u(obj, j, e0Var2);
                e0Var = e0Var2;
            } else if ((list instanceof a1) && (list instanceof z.c)) {
                z.c cVar = (z.c) list;
                if (!cVar.isModifiable()) {
                    z.c mutableCopyWithCapacity = cVar.mutableCopyWithCapacity(list.size() + i);
                    r1.u(obj, j, mutableCopyWithCapacity);
                    return mutableCopyWithCapacity;
                }
                return list;
            } else {
                return list;
            }
            return e0Var;
        }

        @Override // com.amazon.aps.iva.e4.g0
        public final void a(Object obj, long j) {
            Object unmodifiableList;
            List list = (List) r1.n(obj, j);
            if (list instanceof f0) {
                unmodifiableList = ((f0) list).getUnmodifiableView();
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof a1) && (list instanceof z.c)) {
                    z.c cVar = (z.c) list;
                    if (cVar.isModifiable()) {
                        cVar.makeImmutable();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            r1.u(obj, j, unmodifiableList);
        }

        @Override // com.amazon.aps.iva.e4.g0
        public final <E> void b(Object obj, Object obj2, long j) {
            List list = (List) r1.n(obj2, j);
            List d = d(obj, j, list.size());
            int size = d.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                d.addAll(list);
            }
            if (size > 0) {
                list = d;
            }
            r1.u(obj, j, list);
        }

        @Override // com.amazon.aps.iva.e4.g0
        public final <L> List<L> c(Object obj, long j) {
            return d(obj, j, 10);
        }
    }

    /* compiled from: ListFieldSchema.java */
    /* loaded from: classes.dex */
    public static final class b extends g0 {
        @Override // com.amazon.aps.iva.e4.g0
        public final void a(Object obj, long j) {
            ((z.c) r1.n(obj, j)).makeImmutable();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
        @Override // com.amazon.aps.iva.e4.g0
        public final <E> void b(Object obj, Object obj2, long j) {
            z.c<E> cVar = (z.c) r1.n(obj, j);
            z.c<E> cVar2 = (z.c) r1.n(obj2, j);
            int size = cVar.size();
            int size2 = cVar2.size();
            z.c<E> cVar3 = cVar;
            cVar3 = cVar;
            if (size > 0 && size2 > 0) {
                boolean isModifiable = cVar.isModifiable();
                z.c<E> cVar4 = cVar;
                if (!isModifiable) {
                    cVar4 = cVar.mutableCopyWithCapacity(size2 + size);
                }
                cVar4.addAll(cVar2);
                cVar3 = cVar4;
            }
            if (size > 0) {
                cVar2 = cVar3;
            }
            r1.u(obj, j, cVar2);
        }

        @Override // com.amazon.aps.iva.e4.g0
        public final <L> List<L> c(Object obj, long j) {
            int i;
            z.c cVar = (z.c) r1.n(obj, j);
            if (!cVar.isModifiable()) {
                int size = cVar.size();
                if (size == 0) {
                    i = 10;
                } else {
                    i = size * 2;
                }
                z.c mutableCopyWithCapacity = cVar.mutableCopyWithCapacity(i);
                r1.u(obj, j, mutableCopyWithCapacity);
                return mutableCopyWithCapacity;
            }
            return cVar;
        }
    }

    public abstract void a(Object obj, long j);

    public abstract <L> void b(Object obj, Object obj2, long j);

    public abstract <L> List<L> c(Object obj, long j);
}
