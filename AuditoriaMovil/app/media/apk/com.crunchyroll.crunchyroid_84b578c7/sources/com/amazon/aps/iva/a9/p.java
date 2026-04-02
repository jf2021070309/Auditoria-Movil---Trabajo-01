package com.amazon.aps.iva.a9;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.crunchyroll.crunchyroid.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
/* compiled from: TransitionManager.java */
/* loaded from: classes.dex */
public final class p {
    public static final com.amazon.aps.iva.a9.a a = new com.amazon.aps.iva.a9.a();
    public static final ThreadLocal<WeakReference<com.amazon.aps.iva.x.a<ViewGroup, ArrayList<n>>>> b = new ThreadLocal<>();
    public static final ArrayList<ViewGroup> c = new ArrayList<>();

    public static void a(ViewGroup viewGroup, n nVar) {
        ArrayList<ViewGroup> arrayList = c;
        if (!arrayList.contains(viewGroup)) {
            WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
            if (g0.g.c(viewGroup)) {
                arrayList.add(viewGroup);
                if (nVar == null) {
                    nVar = a;
                }
                n mo4clone = nVar.mo4clone();
                ArrayList<n> orDefault = b().getOrDefault(viewGroup, null);
                if (orDefault != null && orDefault.size() > 0) {
                    Iterator<n> it = orDefault.iterator();
                    while (it.hasNext()) {
                        it.next().pause(viewGroup);
                    }
                }
                if (mo4clone != null) {
                    mo4clone.captureValues(viewGroup, true);
                }
                if (((l) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                    viewGroup.setTag(R.id.transition_current_scene, null);
                    if (mo4clone != null) {
                        a aVar = new a(viewGroup, mo4clone);
                        viewGroup.addOnAttachStateChangeListener(aVar);
                        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    public static com.amazon.aps.iva.x.a<ViewGroup, ArrayList<n>> b() {
        com.amazon.aps.iva.x.a<ViewGroup, ArrayList<n>> aVar;
        ThreadLocal<WeakReference<com.amazon.aps.iva.x.a<ViewGroup, ArrayList<n>>>> threadLocal = b;
        WeakReference<com.amazon.aps.iva.x.a<ViewGroup, ArrayList<n>>> weakReference = threadLocal.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        com.amazon.aps.iva.x.a<ViewGroup, ArrayList<n>> aVar2 = new com.amazon.aps.iva.x.a<>();
        threadLocal.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    /* compiled from: TransitionManager.java */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public final n b;
        public final ViewGroup c;

        /* compiled from: TransitionManager.java */
        /* renamed from: com.amazon.aps.iva.a9.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0109a extends o {
            public final /* synthetic */ com.amazon.aps.iva.x.a a;

            public C0109a(com.amazon.aps.iva.x.a aVar) {
                this.a = aVar;
            }

            @Override // com.amazon.aps.iva.a9.n.g
            public final void onTransitionEnd(n nVar) {
                ((ArrayList) this.a.getOrDefault(a.this.c, null)).remove(nVar);
                nVar.removeListener(this);
            }
        }

        public a(ViewGroup viewGroup, n nVar) {
            this.b = nVar;
            this.c = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ViewGroup viewGroup = this.c;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            if (!p.c.remove(viewGroup)) {
                return true;
            }
            com.amazon.aps.iva.x.a<ViewGroup, ArrayList<n>> b = p.b();
            ArrayList arrayList = null;
            ArrayList<n> orDefault = b.getOrDefault(viewGroup, null);
            if (orDefault == null) {
                orDefault = new ArrayList<>();
                b.put(viewGroup, orDefault);
            } else if (orDefault.size() > 0) {
                arrayList = new ArrayList(orDefault);
            }
            n nVar = this.b;
            orDefault.add(nVar);
            nVar.addListener(new C0109a(b));
            nVar.captureValues(viewGroup, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).resume(viewGroup);
                }
            }
            nVar.playTransition(viewGroup);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.c;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            p.c.remove(viewGroup);
            ArrayList<n> orDefault = p.b().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<n> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().resume(viewGroup);
                }
            }
            this.b.clearValues(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
