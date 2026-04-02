package com.amazon.aps.iva.n4;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FragmentTransitionCompat21.java */
/* loaded from: classes.dex */
public final class y extends c0 {

    /* compiled from: FragmentTransitionCompat21.java */
    /* loaded from: classes.dex */
    public class b extends Transition.EpicenterCallback {
        public final /* synthetic */ Rect a;

        public b(Rect rect) {
            this.a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public final Rect onGetEpicenter(Transition transition) {
            Rect rect = this.a;
            if (rect != null && !rect.isEmpty()) {
                return rect;
            }
            return null;
        }
    }

    public static boolean s(Transition transition) {
        if (c0.h(transition.getTargetIds()) && c0.h(transition.getTargetNames()) && c0.h(transition.getTargetTypes())) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final void a(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                b(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
        } else if (!s(transition) && c0.h(transition.getTargets())) {
            int size = arrayList.size();
            while (i < size) {
                transition.addTarget(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final Object f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final Object i(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
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

    @Override // com.amazon.aps.iva.n4.c0
    public final Object j(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final void k(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new a(view, arrayList));
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new z(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final void m(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            c0.g(rect, view);
            ((Transition) obj).setEpicenterCallback(new x(rect));
        }
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final void n(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new b(rect));
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final void o(Object obj, com.amazon.aps.iva.k3.f fVar, d dVar) {
        ((Transition) obj).addListener(new a0(dVar));
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final void p(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c0.d(arrayList.get(i), targets);
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            t(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // com.amazon.aps.iva.n4.c0
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public final void t(Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        List<View> targets;
        int size;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                t(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!s(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                size = 0;
            } else {
                size = arrayList2.size();
            }
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            int size2 = arrayList.size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    transition.removeTarget(arrayList.get(size2));
                } else {
                    return;
                }
            }
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    /* loaded from: classes.dex */
    public class a implements Transition.TransitionListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ ArrayList b;

        public a(View view, ArrayList arrayList) {
            this.a = view;
            this.b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.a.setVisibility(8);
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((View) arrayList.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }
    }
}
