package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.n;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
/* compiled from: AsyncListDiffer.java */
/* loaded from: classes.dex */
public final class d<T> {
    public static final c h = new c();
    public final com.amazon.aps.iva.o8.b a;
    public final androidx.recyclerview.widget.c<T> b;
    public List<T> e;
    public int g;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public List<T> f = Collections.emptyList();
    public final c c = h;

    /* compiled from: AsyncListDiffer.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ List b;
        public final /* synthetic */ List c;
        public final /* synthetic */ int d;
        public final /* synthetic */ Runnable e;

        /* compiled from: AsyncListDiffer.java */
        /* renamed from: androidx.recyclerview.widget.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0055a extends n.b {
            public C0055a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.n.b
            public final boolean areContentsTheSame(int i, int i2) {
                a aVar = a.this;
                Object obj = aVar.b.get(i);
                Object obj2 = aVar.c.get(i2);
                if (obj != null && obj2 != null) {
                    return d.this.b.b.areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.n.b
            public final boolean areItemsTheSame(int i, int i2) {
                a aVar = a.this;
                Object obj = aVar.b.get(i);
                Object obj2 = aVar.c.get(i2);
                if (obj != null && obj2 != null) {
                    return d.this.b.b.areItemsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.n.b
            public final Object getChangePayload(int i, int i2) {
                a aVar = a.this;
                Object obj = aVar.b.get(i);
                Object obj2 = aVar.c.get(i2);
                if (obj != null && obj2 != null) {
                    return d.this.b.b.getChangePayload(obj, obj2);
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.n.b
            public final int getNewListSize() {
                return a.this.c.size();
            }

            @Override // androidx.recyclerview.widget.n.b
            public final int getOldListSize() {
                return a.this.b.size();
            }
        }

        /* compiled from: AsyncListDiffer.java */
        /* loaded from: classes.dex */
        public class b implements Runnable {
            public final /* synthetic */ n.d b;

            public b(n.d dVar) {
                this.b = dVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.g == aVar.d) {
                    List<T> list = aVar.c;
                    Runnable runnable = aVar.e;
                    List<T> list2 = dVar.f;
                    dVar.e = list;
                    dVar.f = Collections.unmodifiableList(list);
                    this.b.a(dVar.a);
                    dVar.a(list2, runnable);
                }
            }
        }

        public a(List list, List list2, int i, Runnable runnable) {
            this.b = list;
            this.c = list2;
            this.d = i;
            this.e = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.this.c.execute(new b(n.a(new C0055a())));
        }
    }

    /* compiled from: AsyncListDiffer.java */
    /* loaded from: classes.dex */
    public interface b<T> {
        void a();
    }

    /* compiled from: AsyncListDiffer.java */
    /* loaded from: classes.dex */
    public static class c implements Executor {
        public final Handler b = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.b.post(runnable);
        }
    }

    public d(androidx.recyclerview.widget.b bVar, androidx.recyclerview.widget.c cVar) {
        this.a = bVar;
        this.b = cVar;
    }

    public final void a(List<T> list, Runnable runnable) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(List<T> list, Runnable runnable) {
        int i = this.g + 1;
        this.g = i;
        List<T> list2 = this.e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f;
        com.amazon.aps.iva.o8.b bVar = this.a;
        if (list == null) {
            int size = list2.size();
            this.e = null;
            this.f = Collections.emptyList();
            bVar.b(0, size);
            a(list3, runnable);
        } else if (list2 == null) {
            this.e = list;
            this.f = Collections.unmodifiableList(list);
            bVar.a(0, list.size());
            a(list3, runnable);
        } else {
            this.b.a.execute(new a(list2, list, i, runnable));
        }
    }
}
