package c.m.b;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import c.f.g;
import c.i.k.d0;
import c.m.b.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class e extends k0 {

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ List a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ k0.d f2336b;

        public a(List list, k0.d dVar) {
            this.a = list;
            this.f2336b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.contains(this.f2336b)) {
                this.a.remove(this.f2336b);
                e eVar = e.this;
                k0.d dVar = this.f2336b;
                Objects.requireNonNull(eVar);
                dVar.a.applyState(dVar.f2384c.mView);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends c {

        /* renamed from: c  reason: collision with root package name */
        public boolean f2338c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2339d;

        /* renamed from: e  reason: collision with root package name */
        public p f2340e;

        public b(k0.d dVar, c.i.g.a aVar, boolean z) {
            super(dVar, aVar);
            this.f2339d = false;
            this.f2338c = z;
        }

        public p c(Context context) {
            int n0;
            if (this.f2339d) {
                return this.f2340e;
            }
            k0.d dVar = this.a;
            Fragment fragment = dVar.f2384c;
            boolean z = false;
            boolean z2 = dVar.a == k0.d.c.VISIBLE;
            boolean z3 = this.f2338c;
            int nextTransition = fragment.getNextTransition();
            int popEnterAnim = z3 ? z2 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z2 ? fragment.getEnterAnim() : fragment.getExitAnim();
            fragment.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.mContainer;
            p pVar = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z2, popEnterAnim);
                if (onCreateAnimation != null) {
                    pVar = new p(onCreateAnimation);
                } else {
                    Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z2, popEnterAnim);
                    if (onCreateAnimator != null) {
                        pVar = new p(onCreateAnimator);
                    } else {
                        if (popEnterAnim == 0 && nextTransition != 0) {
                            if (nextTransition == 4097) {
                                popEnterAnim = z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                            } else if (nextTransition != 8194) {
                                if (nextTransition == 8197) {
                                    n0 = z2 ? c.i.a.n0(context, 16842938) : c.i.a.n0(context, 16842939);
                                } else if (nextTransition == 4099) {
                                    popEnterAnim = z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                                } else if (nextTransition != 4100) {
                                    popEnterAnim = -1;
                                } else {
                                    n0 = z2 ? c.i.a.n0(context, 16842936) : c.i.a.n0(context, 16842937);
                                }
                                popEnterAnim = n0;
                            } else {
                                popEnterAnim = z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                            }
                        }
                        if (popEnterAnim != 0) {
                            boolean equals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                            if (equals) {
                                try {
                                    Animation loadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                                    if (loadAnimation != null) {
                                        pVar = new p(loadAnimation);
                                    } else {
                                        z = true;
                                    }
                                } catch (Resources.NotFoundException e2) {
                                    throw e2;
                                } catch (RuntimeException unused) {
                                }
                            }
                            if (!z) {
                                try {
                                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                                    if (loadAnimator != null) {
                                        pVar = new p(loadAnimator);
                                    }
                                } catch (RuntimeException e3) {
                                    if (equals) {
                                        throw e3;
                                    }
                                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                                    if (loadAnimation2 != null) {
                                        pVar = new p(loadAnimation2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.f2340e = pVar;
            this.f2339d = true;
            return pVar;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public final k0.d a;

        /* renamed from: b  reason: collision with root package name */
        public final c.i.g.a f2341b;

        public c(k0.d dVar, c.i.g.a aVar) {
            this.a = dVar;
            this.f2341b = aVar;
        }

        public void a() {
            k0.d dVar = this.a;
            if (dVar.f2386e.remove(this.f2341b) && dVar.f2386e.isEmpty()) {
                dVar.b();
            }
        }

        public boolean b() {
            k0.d.c cVar;
            k0.d.c from = k0.d.c.from(this.a.f2384c.mView);
            k0.d.c cVar2 = this.a.a;
            return from == cVar2 || !(from == (cVar = k0.d.c.VISIBLE) || cVar2 == cVar);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends c {

        /* renamed from: c  reason: collision with root package name */
        public final Object f2342c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f2343d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f2344e;

        public d(k0.d dVar, c.i.g.a aVar, boolean z, boolean z2) {
            super(dVar, aVar);
            if (dVar.a == k0.d.c.VISIBLE) {
                this.f2342c = z ? dVar.f2384c.getReenterTransition() : dVar.f2384c.getEnterTransition();
                this.f2343d = z ? dVar.f2384c.getAllowReturnTransitionOverlap() : dVar.f2384c.getAllowEnterTransitionOverlap();
            } else {
                this.f2342c = z ? dVar.f2384c.getReturnTransition() : dVar.f2384c.getExitTransition();
                this.f2343d = true;
            }
            if (!z2) {
                this.f2344e = null;
            } else if (z) {
                this.f2344e = dVar.f2384c.getSharedElementReturnTransition();
            } else {
                this.f2344e = dVar.f2384c.getSharedElementEnterTransition();
            }
        }

        public final h0 c(Object obj) {
            if (obj == null) {
                return null;
            }
            h0 h0Var = e0.a;
            if (h0Var == null || !h0Var.e(obj)) {
                h0 h0Var2 = e0.f2345b;
                if (h0Var2 == null || !h0Var2.e(obj)) {
                    throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.a.f2384c + " is not a valid framework Transition or AndroidX Transition");
                }
                return h0Var2;
            }
            return h0Var;
        }
    }

    public e(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.m.b.k0
    public void b(List<k0.d> list, boolean z) {
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        HashMap hashMap;
        k0.d dVar;
        k0.d dVar2;
        k0.d dVar3;
        k0.d dVar4;
        View next;
        View next2;
        k0.d dVar5;
        k0.d dVar6;
        Object obj;
        Object obj2;
        k0.d dVar7;
        View view;
        View view2;
        c.f.a aVar;
        ArrayList<View> arrayList3;
        k0.d dVar8;
        View view3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        HashMap hashMap2;
        h0 h0Var;
        View view4;
        ArrayList<View> arrayList6;
        k0.d dVar9;
        Rect rect;
        Object obj3;
        c.i.c.t enterTransitionCallback;
        c.i.c.t exitTransitionCallback;
        h0 h0Var2;
        Object obj4;
        int i2;
        View view5;
        View view6;
        boolean z2;
        k0.d dVar10;
        boolean z3 = z;
        k0.d dVar11 = null;
        k0.d dVar12 = null;
        for (k0.d dVar13 : list) {
            k0.d.c from = k0.d.c.from(dVar13.f2384c.mView);
            int ordinal = dVar13.a.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3) {
                    }
                } else if (from != k0.d.c.VISIBLE) {
                    dVar12 = dVar13;
                }
            }
            if (from == k0.d.c.VISIBLE && dVar11 == null) {
                dVar11 = dVar13;
            }
        }
        if (FragmentManager.L(2)) {
            String str2 = "Executing operations from " + dVar11 + " to " + dVar12;
        }
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList(list);
        Iterator<k0.d> it = list.iterator();
        while (it.hasNext()) {
            k0.d next3 = it.next();
            c.i.g.a aVar2 = new c.i.g.a();
            next3.d();
            next3.f2386e.add(aVar2);
            arrayList7.add(new b(next3, aVar2, z3));
            c.i.g.a aVar3 = new c.i.g.a();
            next3.d();
            next3.f2386e.add(aVar3);
            arrayList8.add(new d(next3, aVar3, z3, !z3 ? next3 != dVar12 : next3 != dVar11));
            next3.f2385d.add(new a(arrayList9, next3));
        }
        HashMap hashMap3 = new HashMap();
        Iterator it2 = arrayList8.iterator();
        h0 h0Var3 = null;
        while (it2.hasNext()) {
            d dVar14 = (d) it2.next();
            if (!dVar14.b()) {
                h0 c2 = dVar14.c(dVar14.f2342c);
                h0 c3 = dVar14.c(dVar14.f2344e);
                if (c2 != null && c3 != null && c2 != c3) {
                    StringBuilder y = e.a.d.a.a.y("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    y.append(dVar14.a.f2384c);
                    y.append(" returned Transition ");
                    y.append(dVar14.f2342c);
                    y.append(" which uses a different Transition  type than its shared element transition ");
                    y.append(dVar14.f2344e);
                    throw new IllegalArgumentException(y.toString());
                }
                if (c2 == null) {
                    c2 = c3;
                }
                if (h0Var3 == null) {
                    h0Var3 = c2;
                } else if (c2 != null && h0Var3 != c2) {
                    StringBuilder y2 = e.a.d.a.a.y("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    y2.append(dVar14.a.f2384c);
                    y2.append(" returned Transition ");
                    y2.append(dVar14.f2342c);
                    y2.append(" which uses a different Transition  type than other Fragments.");
                    throw new IllegalArgumentException(y2.toString());
                }
            }
        }
        if (h0Var3 == null) {
            Iterator it3 = arrayList8.iterator();
            while (it3.hasNext()) {
                d dVar15 = (d) it3.next();
                hashMap3.put(dVar15.a, Boolean.FALSE);
                dVar15.a();
            }
            dVar = dVar11;
            dVar3 = dVar12;
            str = " to ";
            arrayList = arrayList7;
            arrayList2 = arrayList9;
            hashMap = hashMap3;
        } else {
            View view7 = new View(this.a.getContext());
            Rect rect2 = new Rect();
            ArrayList<View> arrayList10 = new ArrayList<>();
            ArrayList<View> arrayList11 = new ArrayList<>();
            c.f.a aVar4 = new c.f.a();
            Iterator it4 = arrayList8.iterator();
            Object obj5 = null;
            Rect rect3 = rect2;
            k0.d dVar16 = dVar11;
            str = " to ";
            View view8 = null;
            boolean z4 = false;
            View view9 = view7;
            k0.d dVar17 = dVar12;
            while (it4.hasNext()) {
                ArrayList arrayList12 = arrayList7;
                Object obj6 = ((d) it4.next()).f2344e;
                if (!(obj6 != null) || dVar16 == null || dVar17 == null) {
                    aVar = aVar4;
                    arrayList3 = arrayList10;
                    dVar8 = dVar11;
                    view3 = view8;
                    arrayList4 = arrayList8;
                    arrayList5 = arrayList9;
                    hashMap2 = hashMap3;
                    h0Var = h0Var3;
                    view4 = view9;
                    arrayList6 = arrayList11;
                    dVar9 = dVar12;
                    rect = rect3;
                } else {
                    Object s = h0Var3.s(h0Var3.f(obj6));
                    ArrayList<String> sharedElementSourceNames = dVar17.f2384c.getSharedElementSourceNames();
                    view3 = view8;
                    ArrayList<String> sharedElementSourceNames2 = dVar16.f2384c.getSharedElementSourceNames();
                    arrayList5 = arrayList9;
                    ArrayList<String> sharedElementTargetNames = dVar16.f2384c.getSharedElementTargetNames();
                    arrayList4 = arrayList8;
                    HashMap hashMap4 = hashMap3;
                    int i3 = 0;
                    while (true) {
                        obj3 = s;
                        if (i3 >= sharedElementTargetNames.size()) {
                            break;
                        }
                        int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i3));
                        if (indexOf != -1) {
                            sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i3));
                        }
                        i3++;
                        s = obj3;
                    }
                    ArrayList<String> sharedElementTargetNames2 = dVar17.f2384c.getSharedElementTargetNames();
                    if (z3) {
                        enterTransitionCallback = dVar16.f2384c.getEnterTransitionCallback();
                        exitTransitionCallback = dVar17.f2384c.getExitTransitionCallback();
                    } else {
                        enterTransitionCallback = dVar16.f2384c.getExitTransitionCallback();
                        exitTransitionCallback = dVar17.f2384c.getEnterTransitionCallback();
                    }
                    int size = sharedElementSourceNames.size();
                    int i4 = 0;
                    while (i4 < size) {
                        aVar4.put(sharedElementSourceNames.get(i4), sharedElementTargetNames2.get(i4));
                        i4++;
                        size = size;
                        h0Var3 = h0Var3;
                    }
                    h0 h0Var4 = h0Var3;
                    if (FragmentManager.L(2)) {
                        Iterator<String> it5 = sharedElementTargetNames2.iterator();
                        while (it5.hasNext()) {
                            it5.next();
                        }
                        Iterator<String> it6 = sharedElementSourceNames.iterator();
                        while (it6.hasNext()) {
                            it6.next();
                        }
                    }
                    c.f.a<String, View> aVar5 = new c.f.a<>();
                    k(aVar5, dVar16.f2384c.mView);
                    c.f.g.n(aVar5, sharedElementSourceNames);
                    if (enterTransitionCallback != null) {
                        if (FragmentManager.L(2)) {
                            String str3 = "Executing exit callback for operation " + dVar16;
                        }
                        throw null;
                    }
                    c.f.g.n(aVar4, aVar5.keySet());
                    c.f.a<String, View> aVar6 = new c.f.a<>();
                    k(aVar6, dVar17.f2384c.mView);
                    c.f.g.n(aVar6, sharedElementTargetNames2);
                    c.f.g.n(aVar6, aVar4.values());
                    if (exitTransitionCallback != null) {
                        if (FragmentManager.L(2)) {
                            String str4 = "Executing enter callback for operation " + dVar17;
                        }
                        throw null;
                    }
                    h0 h0Var5 = e0.a;
                    int i5 = aVar4.f1665g;
                    while (true) {
                        i5--;
                        if (i5 < 0) {
                            break;
                        } else if (!aVar6.containsKey((String) aVar4.l(i5))) {
                            aVar4.j(i5);
                        }
                    }
                    l(aVar5, aVar4.keySet());
                    l(aVar6, aVar4.values());
                    if (aVar4.isEmpty()) {
                        arrayList10.clear();
                        arrayList11.clear();
                        obj5 = null;
                        aVar = aVar4;
                        arrayList3 = arrayList10;
                        dVar8 = dVar11;
                        dVar9 = dVar12;
                        view4 = view9;
                        h0Var = h0Var4;
                        hashMap2 = hashMap4;
                        rect = rect3;
                        arrayList6 = arrayList11;
                    } else {
                        e0.a(dVar17.f2384c, dVar16.f2384c, z3, aVar5, true);
                        ArrayList<View> arrayList13 = arrayList11;
                        k0.d dVar18 = dVar12;
                        arrayList3 = arrayList10;
                        k0.d dVar19 = dVar11;
                        k0.d dVar20 = dVar11;
                        k0.d dVar21 = dVar12;
                        rect = rect3;
                        arrayList6 = arrayList13;
                        aVar = aVar4;
                        View view10 = view9;
                        c.i.k.x.a(this.a, new j(this, dVar18, dVar19, z, aVar6));
                        arrayList3.addAll(aVar5.values());
                        if (sharedElementSourceNames.isEmpty()) {
                            h0Var2 = h0Var4;
                            obj4 = obj3;
                            i2 = 0;
                            view5 = view3;
                        } else {
                            i2 = 0;
                            view5 = aVar5.get(sharedElementSourceNames.get(0));
                            h0Var2 = h0Var4;
                            obj4 = obj3;
                            h0Var2.o(obj4, view5);
                        }
                        arrayList6.addAll(aVar6.values());
                        if (!sharedElementTargetNames2.isEmpty() && (view6 = aVar6.get(sharedElementTargetNames2.get(i2))) != null) {
                            c.i.k.x.a(this.a, new k(this, h0Var2, view6, rect));
                            z4 = true;
                        }
                        view4 = view10;
                        h0Var2.q(obj4, view4, arrayList3);
                        h0Var = h0Var2;
                        h0Var2.m(obj4, null, null, null, null, obj4, arrayList6);
                        Boolean bool = Boolean.TRUE;
                        hashMap2 = hashMap4;
                        dVar8 = dVar20;
                        hashMap2.put(dVar8, bool);
                        dVar9 = dVar21;
                        hashMap2.put(dVar9, bool);
                        view3 = view5;
                        obj5 = obj4;
                        dVar16 = dVar8;
                        dVar17 = dVar9;
                    }
                }
                view9 = view4;
                arrayList10 = arrayList3;
                arrayList11 = arrayList6;
                rect3 = rect;
                h0Var3 = h0Var;
                dVar11 = dVar8;
                hashMap3 = hashMap2;
                dVar12 = dVar9;
                arrayList7 = arrayList12;
                view8 = view3;
                arrayList9 = arrayList5;
                arrayList8 = arrayList4;
                aVar4 = aVar;
                z3 = z;
            }
            c.f.a aVar7 = aVar4;
            ArrayList<View> arrayList14 = arrayList10;
            View view11 = view8;
            arrayList = arrayList7;
            ArrayList arrayList15 = arrayList8;
            arrayList2 = arrayList9;
            hashMap = hashMap3;
            h0 h0Var6 = h0Var3;
            View view12 = view9;
            k0.d dVar22 = dVar11;
            k0.d dVar23 = dVar12;
            Rect rect4 = rect3;
            ArrayList<View> arrayList16 = arrayList11;
            ArrayList arrayList17 = new ArrayList();
            Iterator it7 = arrayList15.iterator();
            Object obj7 = null;
            Object obj8 = null;
            while (it7.hasNext()) {
                Iterator it8 = it7;
                d dVar24 = (d) it7.next();
                if (dVar24.b()) {
                    dVar5 = dVar22;
                    hashMap.put(dVar24.a, Boolean.FALSE);
                    dVar24.a();
                    obj8 = obj8;
                    obj = obj5;
                    view = view12;
                    dVar6 = dVar23;
                    view2 = view11;
                } else {
                    dVar5 = dVar22;
                    Object obj9 = obj8;
                    Object f2 = h0Var6.f(dVar24.f2342c);
                    k0.d dVar25 = dVar24.a;
                    boolean z5 = obj5 != null && (dVar25 == dVar16 || dVar25 == dVar17);
                    if (f2 == null) {
                        if (!z5) {
                            hashMap.put(dVar25, Boolean.FALSE);
                            dVar24.a();
                        }
                        obj8 = obj9;
                        obj = obj5;
                        view = view12;
                        dVar6 = dVar23;
                        view2 = view11;
                    } else {
                        dVar6 = dVar23;
                        ArrayList<View> arrayList18 = new ArrayList<>();
                        obj = obj5;
                        j(arrayList18, dVar25.f2384c.mView);
                        if (z5) {
                            if (dVar25 == dVar16) {
                                arrayList18.removeAll(arrayList14);
                            } else {
                                arrayList18.removeAll(arrayList16);
                            }
                        }
                        if (arrayList18.isEmpty()) {
                            h0Var6.a(f2, view12);
                            obj2 = obj9;
                            view = view12;
                            dVar7 = dVar25;
                        } else {
                            h0Var6.b(f2, arrayList18);
                            obj2 = obj9;
                            dVar7 = dVar25;
                            h0Var6.m(f2, f2, arrayList18, null, null, null, null);
                            view = view12;
                            if (dVar7.a == k0.d.c.GONE) {
                                arrayList2.remove(dVar7);
                                ArrayList arrayList19 = new ArrayList(arrayList18);
                                arrayList19.remove(dVar7.f2384c.mView);
                                h0Var6.l(f2, dVar7.f2384c.mView, arrayList19);
                                c.i.k.x.a(this.a, new l(this, arrayList18));
                            }
                        }
                        if (dVar7.a == k0.d.c.VISIBLE) {
                            arrayList17.addAll(arrayList18);
                            if (z4) {
                                h0Var6.n(f2, rect4);
                            }
                            view2 = view11;
                        } else {
                            view2 = view11;
                            h0Var6.o(f2, view2);
                        }
                        hashMap.put(dVar7, Boolean.TRUE);
                        if (dVar24.f2343d) {
                            obj8 = h0Var6.k(obj2, f2, null);
                        } else {
                            obj7 = h0Var6.k(obj7, f2, null);
                            obj8 = obj2;
                        }
                    }
                    dVar17 = dVar6;
                }
                it7 = it8;
                view11 = view2;
                obj5 = obj;
                dVar23 = dVar6;
                dVar22 = dVar5;
                view12 = view;
            }
            Object obj10 = obj5;
            dVar = dVar22;
            k0.d dVar26 = dVar23;
            Object j2 = h0Var6.j(obj8, obj7, obj10);
            if (j2 == null) {
                dVar2 = dVar26;
            } else {
                Iterator it9 = arrayList15.iterator();
                while (it9.hasNext()) {
                    d dVar27 = (d) it9.next();
                    if (!dVar27.b()) {
                        Object obj11 = dVar27.f2342c;
                        k0.d dVar28 = dVar27.a;
                        k0.d dVar29 = dVar26;
                        boolean z6 = obj10 != null && (dVar28 == dVar16 || dVar28 == dVar29);
                        if (obj11 != null || z6) {
                            ViewGroup viewGroup = this.a;
                            AtomicInteger atomicInteger = c.i.k.d0.a;
                            if (d0.f.c(viewGroup)) {
                                h0Var6.p(dVar27.a.f2384c, j2, dVar27.f2341b, new m(this, dVar27, dVar28));
                            } else {
                                if (FragmentManager.L(2)) {
                                    StringBuilder y3 = e.a.d.a.a.y("SpecialEffectsController: Container ");
                                    y3.append(this.a);
                                    y3.append(" has not been laid out. Completing operation ");
                                    y3.append(dVar28);
                                    y3.toString();
                                }
                                dVar27.a();
                            }
                        }
                        dVar26 = dVar29;
                    }
                }
                dVar2 = dVar26;
                ViewGroup viewGroup2 = this.a;
                AtomicInteger atomicInteger2 = c.i.k.d0.a;
                if (d0.f.c(viewGroup2)) {
                    e0.b(arrayList17, 4);
                    ArrayList arrayList20 = new ArrayList();
                    int size2 = arrayList16.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        View view13 = arrayList16.get(i6);
                        arrayList20.add(c.i.k.d0.p(view13));
                        c.i.k.d0.D(view13, null);
                    }
                    if (FragmentManager.L(2)) {
                        Iterator<View> it10 = arrayList14.iterator();
                        while (it10.hasNext()) {
                            String str5 = "View: " + it10.next() + " Name: " + c.i.k.d0.p(next2);
                        }
                        Iterator<View> it11 = arrayList16.iterator();
                        while (it11.hasNext()) {
                            String str6 = "View: " + it11.next() + " Name: " + c.i.k.d0.p(next);
                        }
                    }
                    h0Var6.c(this.a, j2);
                    ViewGroup viewGroup3 = this.a;
                    int size3 = arrayList16.size();
                    ArrayList arrayList21 = new ArrayList();
                    int i7 = 0;
                    while (i7 < size3) {
                        View view14 = arrayList14.get(i7);
                        String p = c.i.k.d0.p(view14);
                        arrayList21.add(p);
                        if (p != null) {
                            c.i.k.d0.D(view14, null);
                            String str7 = (String) aVar7.getOrDefault(p, null);
                            int i8 = 0;
                            while (i8 < size3) {
                                dVar4 = dVar2;
                                if (str7.equals(arrayList20.get(i8))) {
                                    c.i.k.d0.D(arrayList16.get(i8), p);
                                    break;
                                } else {
                                    i8++;
                                    dVar2 = dVar4;
                                }
                            }
                        }
                        dVar4 = dVar2;
                        i7++;
                        dVar2 = dVar4;
                    }
                    dVar3 = dVar2;
                    c.i.k.x.a(viewGroup3, new g0(h0Var6, size3, arrayList16, arrayList20, arrayList14, arrayList21));
                    e0.b(arrayList17, 0);
                    h0Var6.r(obj10, arrayList14, arrayList16);
                }
            }
            dVar3 = dVar2;
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup4 = this.a;
        Context context = viewGroup4.getContext();
        ArrayList arrayList22 = new ArrayList();
        Iterator it12 = arrayList.iterator();
        boolean z7 = false;
        while (it12.hasNext()) {
            b bVar = (b) it12.next();
            if (bVar.b()) {
                bVar.a();
            } else {
                p c4 = bVar.c(context);
                if (c4 == null) {
                    bVar.a();
                } else {
                    Animator animator = c4.f2400b;
                    if (animator == null) {
                        arrayList22.add(bVar);
                    } else {
                        k0.d dVar30 = bVar.a;
                        Fragment fragment = dVar30.f2384c;
                        if (Boolean.TRUE.equals(hashMap.get(dVar30))) {
                            if (FragmentManager.L(2)) {
                                String str8 = "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.";
                            }
                            bVar.a();
                        } else {
                            boolean z8 = dVar30.a == k0.d.c.GONE;
                            ArrayList arrayList23 = arrayList2;
                            if (z8) {
                                arrayList23.remove(dVar30);
                            }
                            View view15 = fragment.mView;
                            viewGroup4.startViewTransition(view15);
                            HashMap hashMap5 = hashMap;
                            Iterator it13 = it12;
                            animator.addListener(new f(this, viewGroup4, view15, z8, dVar30, bVar));
                            animator.setTarget(view15);
                            animator.start();
                            if (FragmentManager.L(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Animator from operation ");
                                dVar10 = dVar30;
                                sb.append(dVar10);
                                sb.append(" has started.");
                                sb.toString();
                            } else {
                                dVar10 = dVar30;
                            }
                            bVar.f2341b.b(new g(this, animator, dVar10));
                            z7 = true;
                            arrayList2 = arrayList23;
                            it12 = it13;
                            hashMap = hashMap5;
                        }
                    }
                }
            }
        }
        ArrayList arrayList24 = arrayList2;
        Iterator it14 = arrayList22.iterator();
        while (it14.hasNext()) {
            b bVar2 = (b) it14.next();
            k0.d dVar31 = bVar2.a;
            Fragment fragment2 = dVar31.f2384c;
            if (containsValue) {
                if (FragmentManager.L(2)) {
                    String str9 = "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.";
                }
                bVar2.a();
            } else if (z7) {
                if (FragmentManager.L(2)) {
                    String str10 = "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.";
                }
                bVar2.a();
            } else {
                View view16 = fragment2.mView;
                p c5 = bVar2.c(context);
                Objects.requireNonNull(c5);
                Animation animation = c5.a;
                Objects.requireNonNull(animation);
                if (dVar31.a != k0.d.c.REMOVED) {
                    view16.startAnimation(animation);
                    bVar2.a();
                    z2 = z7;
                } else {
                    viewGroup4.startViewTransition(view16);
                    q qVar = new q(animation, viewGroup4, view16);
                    z2 = z7;
                    qVar.setAnimationListener(new h(this, dVar31, viewGroup4, view16, bVar2));
                    view16.startAnimation(qVar);
                    if (FragmentManager.L(2)) {
                        String str11 = "Animation from operation " + dVar31 + " has started.";
                    }
                }
                bVar2.f2341b.b(new i(this, view16, viewGroup4, bVar2, dVar31));
                z7 = z2;
            }
        }
        Iterator it15 = arrayList24.iterator();
        while (it15.hasNext()) {
            k0.d dVar32 = (k0.d) it15.next();
            dVar32.a.applyState(dVar32.f2384c.mView);
        }
        arrayList24.clear();
        if (FragmentManager.L(2)) {
            String str12 = "Completed executing operations from " + dVar + str + dVar3;
        }
    }

    public void j(ArrayList<View> arrayList, View view) {
        boolean z;
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (Build.VERSION.SDK_INT >= 21) {
            z = viewGroup.isTransitionGroup();
        } else {
            Boolean bool = (Boolean) viewGroup.getTag(R.id.tag_transition_group);
            z = ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && c.i.k.d0.p(viewGroup) == null) ? false : true;
        }
        if (z) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                j(arrayList, childAt);
            }
        }
    }

    public void k(Map<String, View> map, View view) {
        String p = c.i.k.d0.p(view);
        if (p != null) {
            map.put(p, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    k(map, childAt);
                }
            }
        }
    }

    public void l(c.f.a<String, View> aVar, Collection<String> collection) {
        Iterator it = ((g.b) aVar.entrySet()).iterator();
        while (true) {
            g.d dVar = (g.d) it;
            if (!dVar.hasNext()) {
                return;
            }
            dVar.next();
            if (!collection.contains(c.i.k.d0.p((View) dVar.getValue()))) {
                dVar.remove();
            }
        }
    }
}
