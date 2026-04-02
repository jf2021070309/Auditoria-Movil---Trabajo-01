package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.i;
import androidx.fragment.app.u;
import com.amazon.aps.iva.n4.c0;
import com.amazon.aps.iva.n4.w;
import com.amazon.aps.iva.n4.y;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.k0;
import com.amazon.aps.iva.p3.r0;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
/* compiled from: DefaultSpecialEffectsController.kt */
/* loaded from: classes.dex */
public final class d extends u {

    /* compiled from: DefaultSpecialEffectsController.kt */
    /* loaded from: classes.dex */
    public static final class a extends b {
        public final boolean c;
        public boolean d;
        public i.a e;

        public a(u.b bVar, com.amazon.aps.iva.k3.f fVar, boolean z) {
            super(bVar, fVar);
            this.c = z;
        }

        public final i.a c(Context context) {
            boolean z;
            int exitAnim;
            Animation loadAnimation;
            i.a aVar;
            i.a aVar2;
            int i;
            if (this.d) {
                return this.e;
            }
            u.b bVar = this.a;
            Fragment fragment = bVar.c;
            boolean z2 = false;
            if (bVar.a == u.b.EnumC0029b.VISIBLE) {
                z = true;
            } else {
                z = false;
            }
            int nextTransition = fragment.getNextTransition();
            if (this.c) {
                if (z) {
                    exitAnim = fragment.getPopEnterAnim();
                } else {
                    exitAnim = fragment.getPopExitAnim();
                }
            } else if (z) {
                exitAnim = fragment.getEnterAnim();
            } else {
                exitAnim = fragment.getExitAnim();
            }
            fragment.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.mContainer;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, exitAnim);
                if (onCreateAnimation != null) {
                    aVar2 = new i.a(onCreateAnimation);
                } else {
                    Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, exitAnim);
                    if (onCreateAnimator != null) {
                        aVar2 = new i.a(onCreateAnimator);
                    } else {
                        if (exitAnim == 0 && nextTransition != 0) {
                            if (nextTransition != 4097) {
                                if (nextTransition != 8194) {
                                    if (nextTransition != 8197) {
                                        if (nextTransition != 4099) {
                                            if (nextTransition != 4100) {
                                                i = -1;
                                            } else if (z) {
                                                i = i.a(16842936, context);
                                            } else {
                                                i = i.a(16842937, context);
                                            }
                                        } else if (z) {
                                            i = R.animator.fragment_fade_enter;
                                        } else {
                                            i = R.animator.fragment_fade_exit;
                                        }
                                    } else if (z) {
                                        i = i.a(16842938, context);
                                    } else {
                                        i = i.a(16842939, context);
                                    }
                                } else if (z) {
                                    i = R.animator.fragment_close_enter;
                                } else {
                                    i = R.animator.fragment_close_exit;
                                }
                            } else if (z) {
                                i = R.animator.fragment_open_enter;
                            } else {
                                i = R.animator.fragment_open_exit;
                            }
                            exitAnim = i;
                        }
                        if (exitAnim != 0) {
                            boolean equals = "anim".equals(context.getResources().getResourceTypeName(exitAnim));
                            if (equals) {
                                try {
                                    loadAnimation = AnimationUtils.loadAnimation(context, exitAnim);
                                } catch (Resources.NotFoundException e) {
                                    throw e;
                                } catch (RuntimeException unused) {
                                }
                                if (loadAnimation != null) {
                                    aVar = new i.a(loadAnimation);
                                    aVar2 = aVar;
                                } else {
                                    z2 = true;
                                }
                            }
                            if (!z2) {
                                try {
                                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, exitAnim);
                                    if (loadAnimator != null) {
                                        aVar = new i.a(loadAnimator);
                                        aVar2 = aVar;
                                    }
                                } catch (RuntimeException e2) {
                                    if (!equals) {
                                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, exitAnim);
                                        if (loadAnimation2 != null) {
                                            aVar2 = new i.a(loadAnimation2);
                                        }
                                    } else {
                                        throw e2;
                                    }
                                }
                            }
                        }
                    }
                }
                this.e = aVar2;
                this.d = true;
                return aVar2;
            }
            aVar2 = null;
            this.e = aVar2;
            this.d = true;
            return aVar2;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    /* loaded from: classes.dex */
    public static class b {
        public final u.b a;
        public final com.amazon.aps.iva.k3.f b;

        public b(u.b bVar, com.amazon.aps.iva.k3.f fVar) {
            this.a = bVar;
            this.b = fVar;
        }

        public final void a() {
            u.b bVar = this.a;
            bVar.getClass();
            com.amazon.aps.iva.k3.f fVar = this.b;
            com.amazon.aps.iva.yb0.j.f(fVar, "signal");
            LinkedHashSet linkedHashSet = bVar.e;
            if (linkedHashSet.remove(fVar) && linkedHashSet.isEmpty()) {
                bVar.b();
            }
        }

        public final boolean b() {
            u.b.EnumC0029b enumC0029b;
            u.b.EnumC0029b.a aVar = u.b.EnumC0029b.Companion;
            u.b bVar = this.a;
            View view = bVar.c.mView;
            com.amazon.aps.iva.yb0.j.e(view, "operation.fragment.mView");
            aVar.getClass();
            u.b.EnumC0029b a = u.b.EnumC0029b.a.a(view);
            u.b.EnumC0029b enumC0029b2 = bVar.a;
            if (a != enumC0029b2 && (a == (enumC0029b = u.b.EnumC0029b.VISIBLE) || enumC0029b2 == enumC0029b)) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    /* loaded from: classes.dex */
    public static final class c extends b {
        public final Object c;
        public final boolean d;
        public final Object e;

        public c(u.b bVar, com.amazon.aps.iva.k3.f fVar, boolean z, boolean z2) {
            super(bVar, fVar);
            Object exitTransition;
            boolean z3;
            Object obj;
            u.b.EnumC0029b enumC0029b = bVar.a;
            u.b.EnumC0029b enumC0029b2 = u.b.EnumC0029b.VISIBLE;
            Fragment fragment = bVar.c;
            if (enumC0029b == enumC0029b2) {
                if (z) {
                    exitTransition = fragment.getReenterTransition();
                } else {
                    exitTransition = fragment.getEnterTransition();
                }
            } else if (z) {
                exitTransition = fragment.getReturnTransition();
            } else {
                exitTransition = fragment.getExitTransition();
            }
            this.c = exitTransition;
            if (bVar.a == enumC0029b2) {
                if (z) {
                    z3 = fragment.getAllowReturnTransitionOverlap();
                } else {
                    z3 = fragment.getAllowEnterTransitionOverlap();
                }
            } else {
                z3 = true;
            }
            this.d = z3;
            if (z2) {
                if (z) {
                    obj = fragment.getSharedElementReturnTransition();
                } else {
                    obj = fragment.getSharedElementEnterTransition();
                }
            } else {
                obj = null;
            }
            this.e = obj;
        }

        public final c0 c() {
            boolean z;
            Object obj = this.c;
            c0 d = d(obj);
            Object obj2 = this.e;
            c0 d2 = d(obj2);
            if (d != null && d2 != null && d != d2) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (d == null) {
                    return d2;
                }
                return d;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.a.c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
        }

        public final c0 d(Object obj) {
            if (obj == null) {
                return null;
            }
            y yVar = w.a;
            if (yVar != null && (obj instanceof Transition)) {
                return yVar;
            }
            c0 c0Var = w.b;
            if (c0Var != null && c0Var.e(obj)) {
                return c0Var;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.a.c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ViewGroup viewGroup) {
        super(viewGroup);
        com.amazon.aps.iva.yb0.j.f(viewGroup, "container");
    }

    public static void i(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (k0.b(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(view);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    i(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static void j(View view, com.amazon.aps.iva.x.a aVar) {
        WeakHashMap<View, r0> weakHashMap = g0.a;
        String k = g0.i.k(view);
        if (k != null) {
            aVar.put(k, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    j(childAt, aVar);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05b1  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v66, types: [java.lang.Object] */
    @Override // androidx.fragment.app.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.ArrayList r36, final boolean r37) {
        /*
            Method dump skipped, instructions count: 2206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.d.b(java.util.ArrayList, boolean):void");
    }
}
