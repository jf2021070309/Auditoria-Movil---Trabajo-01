package e.g.a.a;

import c.u.b.l;
import c.u.b.t;
import e.h.g.j0;
import e.h.g.j1;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: classes2.dex */
public class j<T> {
    public static Executor a = Executors.newFixedThreadPool(2);

    /* renamed from: b  reason: collision with root package name */
    public int f7987b;

    /* renamed from: c  reason: collision with root package name */
    public final l.e<T> f7988c;

    /* renamed from: d  reason: collision with root package name */
    public List<T> f7989d;

    /* renamed from: e  reason: collision with root package name */
    public final List<c.u.b.c<T>> f7990e = new CopyOnWriteArrayList();

    /* renamed from: f  reason: collision with root package name */
    public List<T> f7991f = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    public final t f7992g;

    public j(t tVar, l.e<T> eVar) {
        this.f7988c = eVar;
        this.f7992g = tVar;
    }

    public final void a(List<T> list, Runnable runnable) {
        for (c.u.b.c<T> cVar : this.f7990e) {
            cVar.a(list, this.f7991f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void b(final List<T> list, final Runnable runnable) {
        Object obj = j1.a;
        final int i2 = this.f7987b + 1;
        this.f7987b = i2;
        final List<T> list2 = this.f7989d;
        if (list == list2) {
            runnable.run();
            return;
        }
        List<T> list3 = this.f7991f;
        if (list == null) {
            int size = list2.size();
            this.f7989d = null;
            this.f7991f = Collections.emptyList();
            this.f7992g.c(0, size);
            a(list3, runnable);
        } else if (list2 != null) {
            a.execute(new Runnable() { // from class: e.g.a.a.a
                @Override // java.lang.Runnable
                public final void run() {
                    final j jVar = j.this;
                    final int i3 = i2;
                    List list4 = list2;
                    final List list5 = list;
                    final Runnable runnable2 = runnable;
                    if (i3 == jVar.f7987b) {
                        final l.d a2 = c.u.b.l.a(new i(jVar, list4, list5), false);
                        j0.h(new j0.c() { // from class: e.g.a.a.b
                            @Override // e.h.g.j0.c
                            public final void a() {
                                j jVar2 = j.this;
                                int i4 = i3;
                                List<T> list6 = list5;
                                l.d dVar = a2;
                                Runnable runnable3 = runnable2;
                                if (jVar2.f7987b == i4) {
                                    Collection collection = jVar2.f7991f;
                                    jVar2.f7989d = list6;
                                    jVar2.f7991f = Collections.unmodifiableList(list6);
                                    dVar.a(jVar2.f7992g);
                                    jVar2.a(collection, runnable3);
                                }
                            }
                        });
                    }
                }
            });
        } else {
            this.f7989d = list;
            this.f7991f = Collections.unmodifiableList(list);
            this.f7992g.b(0, list.size());
            a(list3, runnable);
        }
    }
}
