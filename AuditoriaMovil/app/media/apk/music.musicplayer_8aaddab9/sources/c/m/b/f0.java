package c.m.b;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class f0 extends h0 {

    /* loaded from: classes.dex */
    public class a extends Transition.EpicenterCallback {
        public final /* synthetic */ Rect a;

        public a(f0 f0Var, Rect rect) {
            this.a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Transition.TransitionListener {
        public final /* synthetic */ View a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2350b;

        public b(f0 f0Var, View view, ArrayList arrayList) {
            this.a = view;
            this.f2350b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.a.setVisibility(8);
            int size = this.f2350b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((View) this.f2350b.get(i2)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Transition.TransitionListener {
        public final /* synthetic */ Object a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2351b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f2352c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2353d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f2354e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2355f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.f2351b = arrayList;
            this.f2352c = obj2;
            this.f2353d = arrayList2;
            this.f2354e = obj3;
            this.f2355f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.a;
            if (obj != null) {
                f0.this.u(obj, this.f2351b, null);
            }
            Object obj2 = this.f2352c;
            if (obj2 != null) {
                f0.this.u(obj2, this.f2353d, null);
            }
            Object obj3 = this.f2354e;
            if (obj3 != null) {
                f0.this.u(obj3, this.f2355f, null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements Transition.TransitionListener {
        public final /* synthetic */ Runnable a;

        public d(f0 f0Var, Runnable runnable) {
            this.a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* loaded from: classes.dex */
    public class e extends Transition.EpicenterCallback {
        public final /* synthetic */ Rect a;

        public e(f0 f0Var, Rect rect) {
            this.a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.a;
        }
    }

    public static boolean t(Transition transition) {
        return (h0.i(transition.getTargetIds()) && h0.i(transition.getTargetNames()) && h0.i(transition.getTargetTypes())) ? false : true;
    }

    @Override // c.m.b.h0
    public void a(Object obj, View view) {
        ((Transition) obj).addTarget(view);
    }

    @Override // c.m.b.h0
    public void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                b(transitionSet.getTransitionAt(i2), arrayList);
                i2++;
            }
        } else if (t(transition) || !h0.i(transition.getTargets())) {
        } else {
            int size = arrayList.size();
            while (i2 < size) {
                transition.addTarget(arrayList.get(i2));
                i2++;
            }
        }
    }

    @Override // c.m.b.h0
    public void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // c.m.b.h0
    public boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // c.m.b.h0
    public Object f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // c.m.b.h0
    public Object j(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // c.m.b.h0
    public Object k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // c.m.b.h0
    public void l(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(this, view, arrayList));
    }

    @Override // c.m.b.h0
    public void m(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, null, null, obj4, arrayList3));
    }

    @Override // c.m.b.h0
    public void n(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new e(this, rect));
    }

    @Override // c.m.b.h0
    public void o(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(this, rect));
        }
    }

    @Override // c.m.b.h0
    public void p(Fragment fragment, Object obj, c.i.g.a aVar, Runnable runnable) {
        ((Transition) obj).addListener(new d(this, runnable));
    }

    @Override // c.m.b.h0
    public void q(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            h0.d(targets, arrayList.get(i2));
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // c.m.b.h0
    public void r(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            u(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // c.m.b.h0
    public Object s(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public void u(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                u(transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!t(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i2 < size) {
                transition.addTarget(arrayList2.get(i2));
                i2++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }
}
