package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ViewTypeStorage.java */
/* loaded from: classes.dex */
public interface j0 {

    /* compiled from: ViewTypeStorage.java */
    /* loaded from: classes.dex */
    public static class a implements j0 {
        public final SparseArray<w> a = new SparseArray<>();
        public int b = 0;

        /* compiled from: ViewTypeStorage.java */
        /* renamed from: androidx.recyclerview.widget.j0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0058a implements c {
            public final SparseIntArray a = new SparseIntArray(1);
            public final SparseIntArray b = new SparseIntArray(1);
            public final w c;

            public C0058a(w wVar) {
                this.c = wVar;
            }

            @Override // androidx.recyclerview.widget.j0.c
            public final int a(int i) {
                SparseIntArray sparseIntArray = this.b;
                int indexOfKey = sparseIntArray.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                StringBuilder d = com.amazon.aps.iva.e4.e.d("requested global type ", i, " does not belong to the adapter:");
                d.append(this.c.c);
                throw new IllegalStateException(d.toString());
            }

            @Override // androidx.recyclerview.widget.j0.c
            public final int b(int i) {
                SparseIntArray sparseIntArray = this.a;
                int indexOfKey = sparseIntArray.indexOfKey(i);
                if (indexOfKey > -1) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                a aVar = a.this;
                int i2 = aVar.b;
                aVar.b = i2 + 1;
                aVar.a.put(i2, this.c);
                sparseIntArray.put(i, i2);
                this.b.put(i2, i);
                return i2;
            }

            @Override // androidx.recyclerview.widget.j0.c
            public final void dispose() {
                SparseArray<w> sparseArray = a.this.a;
                int size = sparseArray.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (sparseArray.valueAt(size) == this.c) {
                            sparseArray.removeAt(size);
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.j0
        public final w a(int i) {
            w wVar = this.a.get(i);
            if (wVar != null) {
                return wVar;
            }
            throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("Cannot find the wrapper for global view type ", i));
        }

        @Override // androidx.recyclerview.widget.j0
        public final c b(w wVar) {
            return new C0058a(wVar);
        }
    }

    /* compiled from: ViewTypeStorage.java */
    /* loaded from: classes.dex */
    public interface c {
        int a(int i);

        int b(int i);

        void dispose();
    }

    w a(int i);

    c b(w wVar);

    /* compiled from: ViewTypeStorage.java */
    /* loaded from: classes.dex */
    public static class b implements j0 {
        public final SparseArray<List<w>> a = new SparseArray<>();

        @Override // androidx.recyclerview.widget.j0
        public final w a(int i) {
            List<w> list = this.a.get(i);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("Cannot find the wrapper for global view type ", i));
        }

        @Override // androidx.recyclerview.widget.j0
        public final c b(w wVar) {
            return new a(wVar);
        }

        /* compiled from: ViewTypeStorage.java */
        /* loaded from: classes.dex */
        public class a implements c {
            public final w a;

            public a(w wVar) {
                this.a = wVar;
            }

            @Override // androidx.recyclerview.widget.j0.c
            public final int b(int i) {
                b bVar = b.this;
                List<w> list = bVar.a.get(i);
                if (list == null) {
                    list = new ArrayList<>();
                    bVar.a.put(i, list);
                }
                w wVar = this.a;
                if (!list.contains(wVar)) {
                    list.add(wVar);
                }
                return i;
            }

            @Override // androidx.recyclerview.widget.j0.c
            public final void dispose() {
                SparseArray<List<w>> sparseArray = b.this.a;
                int size = sparseArray.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        List<w> valueAt = sparseArray.valueAt(size);
                        if (valueAt.remove(this.a) && valueAt.isEmpty()) {
                            sparseArray.removeAt(size);
                        }
                    } else {
                        return;
                    }
                }
            }

            @Override // androidx.recyclerview.widget.j0.c
            public final int a(int i) {
                return i;
            }
        }
    }
}
