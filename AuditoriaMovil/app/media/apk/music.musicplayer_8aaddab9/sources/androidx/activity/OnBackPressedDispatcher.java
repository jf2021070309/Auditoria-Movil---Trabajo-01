package androidx.activity;

import c.a.d;
import c.a.e;
import c.p.j;
import c.p.n;
import c.p.p;
import c.p.r;
import java.util.ArrayDeque;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    public final Runnable a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<e> f87b = new ArrayDeque<>();

    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements n, d {
        public final j a;

        /* renamed from: b  reason: collision with root package name */
        public final e f88b;

        /* renamed from: c  reason: collision with root package name */
        public d f89c;

        public LifecycleOnBackPressedCancellable(j jVar, e eVar) {
            this.a = jVar;
            this.f88b = eVar;
            jVar.a(this);
        }

        @Override // c.p.n
        public void c(p pVar, j.a aVar) {
            if (aVar == j.a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                e eVar = this.f88b;
                onBackPressedDispatcher.f87b.add(eVar);
                a aVar2 = new a(eVar);
                eVar.f684b.add(aVar2);
                this.f89c = aVar2;
            } else if (aVar != j.a.ON_STOP) {
                if (aVar == j.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                d dVar = this.f89c;
                if (dVar != null) {
                    dVar.cancel();
                }
            }
        }

        @Override // c.a.d
        public void cancel() {
            r rVar = (r) this.a;
            rVar.d("removeObserver");
            rVar.f2466b.e(this);
            this.f88b.f684b.remove(this);
            d dVar = this.f89c;
            if (dVar != null) {
                dVar.cancel();
                this.f89c = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements d {
        public final e a;

        public a(e eVar) {
            this.a = eVar;
        }

        @Override // c.a.d
        public void cancel() {
            OnBackPressedDispatcher.this.f87b.remove(this.a);
            this.a.f684b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.a = runnable;
    }

    public void a() {
        Iterator<e> descendingIterator = this.f87b.descendingIterator();
        while (descendingIterator.hasNext()) {
            e next = descendingIterator.next();
            if (next.a) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
