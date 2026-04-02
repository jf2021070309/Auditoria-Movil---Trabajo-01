package c.u.b;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import c.i.k.k0.b;
import ch.qos.logback.core.rolling.helper.Compressor;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class c0 extends c.i.k.e {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f2587d;

    /* renamed from: e  reason: collision with root package name */
    public final a f2588e;

    /* loaded from: classes.dex */
    public static class a extends c.i.k.e {

        /* renamed from: d  reason: collision with root package name */
        public final c0 f2589d;

        /* renamed from: e  reason: collision with root package name */
        public Map<View, c.i.k.e> f2590e = new WeakHashMap();

        public a(c0 c0Var) {
            this.f2589d = c0Var;
        }

        @Override // c.i.k.e
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            c.i.k.e eVar = this.f2590e.get(view);
            return eVar != null ? eVar.a(view, accessibilityEvent) : this.f2148b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // c.i.k.e
        public c.i.k.k0.c b(View view) {
            c.i.k.e eVar = this.f2590e.get(view);
            return eVar != null ? eVar.b(view) : super.b(view);
        }

        @Override // c.i.k.e
        public void c(View view, AccessibilityEvent accessibilityEvent) {
            c.i.k.e eVar = this.f2590e.get(view);
            if (eVar != null) {
                eVar.c(view, accessibilityEvent);
            } else {
                this.f2148b.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // c.i.k.e
        public void d(View view, c.i.k.k0.b bVar) {
            if (this.f2589d.k() || this.f2589d.f2587d.getLayoutManager() == null) {
                this.f2148b.onInitializeAccessibilityNodeInfo(view, bVar.f2193b);
                return;
            }
            this.f2589d.f2587d.getLayoutManager().n0(view, bVar);
            c.i.k.e eVar = this.f2590e.get(view);
            if (eVar != null) {
                eVar.d(view, bVar);
            } else {
                this.f2148b.onInitializeAccessibilityNodeInfo(view, bVar.f2193b);
            }
        }

        @Override // c.i.k.e
        public void e(View view, AccessibilityEvent accessibilityEvent) {
            c.i.k.e eVar = this.f2590e.get(view);
            if (eVar != null) {
                eVar.e(view, accessibilityEvent);
            } else {
                this.f2148b.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // c.i.k.e
        public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            c.i.k.e eVar = this.f2590e.get(viewGroup);
            return eVar != null ? eVar.f(viewGroup, view, accessibilityEvent) : this.f2148b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // c.i.k.e
        public boolean g(View view, int i2, Bundle bundle) {
            if (this.f2589d.k() || this.f2589d.f2587d.getLayoutManager() == null) {
                return super.g(view, i2, bundle);
            }
            c.i.k.e eVar = this.f2590e.get(view);
            if (eVar != null) {
                if (eVar.g(view, i2, bundle)) {
                    return true;
                }
            } else if (super.g(view, i2, bundle)) {
                return true;
            }
            RecyclerView.m layoutManager = this.f2589d.f2587d.getLayoutManager();
            RecyclerView.t tVar = layoutManager.f548b.f520i;
            return layoutManager.F0();
        }

        @Override // c.i.k.e
        public void h(View view, int i2) {
            c.i.k.e eVar = this.f2590e.get(view);
            if (eVar != null) {
                eVar.h(view, i2);
            } else {
                this.f2148b.sendAccessibilityEvent(view, i2);
            }
        }

        @Override // c.i.k.e
        public void i(View view, AccessibilityEvent accessibilityEvent) {
            c.i.k.e eVar = this.f2590e.get(view);
            if (eVar != null) {
                eVar.i(view, accessibilityEvent);
            } else {
                this.f2148b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public c0(RecyclerView recyclerView) {
        this.f2587d = recyclerView;
        c.i.k.e j2 = j();
        if (j2 == null || !(j2 instanceof a)) {
            this.f2588e = new a(this);
        } else {
            this.f2588e = (a) j2;
        }
    }

    @Override // c.i.k.e
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2148b.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || k()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().l0(accessibilityEvent);
        }
    }

    @Override // c.i.k.e
    public void d(View view, c.i.k.k0.b bVar) {
        this.f2148b.onInitializeAccessibilityNodeInfo(view, bVar.f2193b);
        if (k() || this.f2587d.getLayoutManager() == null) {
            return;
        }
        RecyclerView.m layoutManager = this.f2587d.getLayoutManager();
        RecyclerView recyclerView = layoutManager.f548b;
        RecyclerView.t tVar = recyclerView.f520i;
        RecyclerView.x xVar = recyclerView.t0;
        if (recyclerView.canScrollVertically(-1) || layoutManager.f548b.canScrollHorizontally(-1)) {
            bVar.f2193b.addAction(Compressor.BUFFER_SIZE);
            bVar.f2193b.setScrollable(true);
        }
        if (layoutManager.f548b.canScrollVertically(1) || layoutManager.f548b.canScrollHorizontally(1)) {
            bVar.f2193b.addAction(4096);
            bVar.f2193b.setScrollable(true);
        }
        bVar.i(b.C0040b.a(layoutManager.V(tVar, xVar), layoutManager.C(tVar, xVar), layoutManager.Z(), layoutManager.W()));
    }

    @Override // c.i.k.e
    public boolean g(View view, int i2, Bundle bundle) {
        if (super.g(view, i2, bundle)) {
            return true;
        }
        if (k() || this.f2587d.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.m layoutManager = this.f2587d.getLayoutManager();
        RecyclerView.t tVar = layoutManager.f548b.f520i;
        return layoutManager.E0(i2);
    }

    public c.i.k.e j() {
        return this.f2588e;
    }

    public boolean k() {
        return this.f2587d.P();
    }
}
