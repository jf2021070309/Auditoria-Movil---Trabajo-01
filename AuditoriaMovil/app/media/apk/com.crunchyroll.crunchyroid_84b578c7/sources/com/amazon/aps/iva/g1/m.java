package com.amazon.aps.iva.g1;

import android.view.View;
import androidx.fragment.app.Fragment;
import bo.app.i1;
import com.amazon.aps.iva.ApsIvaSdkBaseImpl;
import com.amazon.aps.iva.a6.k1;
import com.amazon.aps.iva.a6.m0;
import com.amazon.aps.iva.a6.q0;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.k6.s;
import com.amazon.aps.iva.ka0.e;
import com.amazon.aps.iva.n4.f0;
import com.amazon.aps.iva.p3.w0;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.t5.o;
import com.amazon.aps.iva.types.AdMediaState;
import com.amazon.aps.iva.tz.r0;
import com.braze.models.cards.ICardListener;
import com.braze.ui.feed.view.BaseFeedCardView;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.search.SearchView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.firebase.crashlytics.internal.common.Utils;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements j, o.a, q0.e, s.f, p1.e, OnCompleteListener, com.amazon.aps.iva.wa.r, ICardListener, TabLayoutMediator.TabConfigurationStrategy, ViewUtils.OnApplyWindowInsetsListener, Continuation, e.a {
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj) {
        this.b = obj;
    }

    @Override // com.amazon.aps.iva.wa.r
    public final AdMediaState a(Object obj) {
        return ((ApsIvaSdkBaseImpl) this.b).d.get((String) obj);
    }

    public final void b() {
        BaseFeedCardView.b((BaseFeedCardView) this.b);
    }

    @Override // com.amazon.aps.iva.ka0.e.a
    public final void c(Map map, boolean z) {
        e.b bVar = (e.b) this.b;
        if (bVar != null) {
            ((e.a) ((f0) bVar).c).c(null, z);
        }
    }

    @Override // com.amazon.aps.iva.k6.s.f
    public final int d(Object obj) {
        boolean z;
        com.amazon.aps.iva.q5.v vVar = (com.amazon.aps.iva.q5.v) this.b;
        com.amazon.aps.iva.k6.n nVar = (com.amazon.aps.iva.k6.n) obj;
        Pattern pattern = com.amazon.aps.iva.k6.s.a;
        nVar.getClass();
        String str = vVar.m;
        String str2 = nVar.b;
        if (!str2.equals(str) && !str2.equals(com.amazon.aps.iva.k6.s.b(vVar))) {
            z = false;
        } else {
            z = true;
        }
        if (!z || !nVar.c(vVar, false)) {
            return 0;
        }
        return 1;
    }

    @Override // com.amazon.aps.iva.b8.p1.e
    public final Object e(com.amazon.aps.iva.b8.t tVar, q.d dVar, int i) {
        int i2 = p1.i;
        ((com.amazon.aps.iva.b8.o) tVar).getClass();
        throw null;
    }

    @Override // com.amazon.aps.iva.g1.j
    public final double f(double d) {
        u uVar = (u) this.b;
        com.amazon.aps.iva.yb0.j.f(uVar, "this$0");
        return uVar.n.f(com.amazon.aps.iva.aq.j.h(d, uVar.e, uVar.f));
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        int i = m0.o0;
        ((l0.c) obj).P(((k1) this.b).f);
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public final w0 onApplyWindowInsets(View view, w0 w0Var, ViewUtils.RelativePadding relativePadding) {
        w0 lambda$setUpToolbarInsetListener$4;
        lambda$setUpToolbarInsetListener$4 = ((SearchView) this.b).lambda$setUpToolbarInsetListener$4(view, w0Var, relativePadding);
        return lambda$setUpToolbarInsetListener$4;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        i1.b((i1) this.b, task);
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public final void onConfigureTab(TabLayout.Tab tab, int i) {
        r0 r0Var = (r0) this.b;
        r0.a aVar = r0.k;
        com.amazon.aps.iva.yb0.j.f(r0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(tab, "tab");
        Fragment fragment = r0Var.di().p().get(i);
        com.amazon.aps.iva.yb0.j.d(fragment, "null cannot be cast to non-null type com.ellation.widgets.tabs.TabContainer");
        tab.setText(((com.amazon.aps.iva.w70.i) fragment).H6());
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Object lambda$awaitEvenIfOnMainThread$2;
        lambda$awaitEvenIfOnMainThread$2 = Utils.lambda$awaitEvenIfOnMainThread$2((CountDownLatch) this.b, task);
        return lambda$awaitEvenIfOnMainThread$2;
    }
}
