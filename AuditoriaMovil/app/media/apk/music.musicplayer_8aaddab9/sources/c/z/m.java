package c.z;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import c.i.k.d0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class m {
    public static i a = new c.z.a();

    /* renamed from: b  reason: collision with root package name */
    public static ThreadLocal<WeakReference<c.f.a<ViewGroup, ArrayList<i>>>> f2901b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static ArrayList<ViewGroup> f2902c = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public i a;

        /* renamed from: b  reason: collision with root package name */
        public ViewGroup f2903b;

        /* renamed from: c.z.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0063a extends l {
            public final /* synthetic */ c.f.a a;

            public C0063a(c.f.a aVar) {
                this.a = aVar;
            }

            @Override // c.z.i.d
            public void c(i iVar) {
                ((ArrayList) this.a.get(a.this.f2903b)).remove(iVar);
                iVar.y(this);
            }
        }

        public a(i iVar, ViewGroup viewGroup) {
            this.a = iVar;
            this.f2903b = viewGroup;
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x021a  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0247  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x01f4 A[EDGE_INSN: B:139:0x01f4->B:93:0x01f4 ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01f9  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onPreDraw() {
            /*
                Method dump skipped, instructions count: 697
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: c.z.m.a.onPreDraw():boolean");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f2903b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f2903b.removeOnAttachStateChangeListener(this);
            m.f2902c.remove(this.f2903b);
            ArrayList<i> arrayList = m.b().get(this.f2903b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<i> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().A(this.f2903b);
                }
            }
            this.a.k(true);
        }
    }

    public static void a(ViewGroup viewGroup, i iVar) {
        if (f2902c.contains(viewGroup)) {
            return;
        }
        AtomicInteger atomicInteger = c.i.k.d0.a;
        if (d0.f.c(viewGroup)) {
            f2902c.add(viewGroup);
            if (iVar == null) {
                iVar = a;
            }
            i clone = iVar.clone();
            ArrayList<i> orDefault = b().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<i> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().x(viewGroup);
                }
            }
            if (clone != null) {
                clone.j(viewGroup, true);
            }
            if (((h) viewGroup.getTag(R.id.transition_current_scene)) != null) {
                throw null;
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (clone != null) {
                a aVar = new a(clone, viewGroup);
                viewGroup.addOnAttachStateChangeListener(aVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
            }
        }
    }

    public static c.f.a<ViewGroup, ArrayList<i>> b() {
        c.f.a<ViewGroup, ArrayList<i>> aVar;
        WeakReference<c.f.a<ViewGroup, ArrayList<i>>> weakReference = f2901b.get();
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            c.f.a<ViewGroup, ArrayList<i>> aVar2 = new c.f.a<>();
            f2901b.set(new WeakReference<>(aVar2));
            return aVar2;
        }
        return aVar;
    }
}
