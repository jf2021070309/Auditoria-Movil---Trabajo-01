package com.amazon.aps.iva.f1;

import android.graphics.ColorSpace;
import android.net.Uri;
import android.view.View;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.b8.t;
import com.amazon.aps.iva.q3.p;
import com.amazon.aps.iva.z5.g;
import com.braze.Braze;
import com.braze.IBrazeEndpointProvider;
import com.ellation.crunchyroll.presentation.main.lists.b;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.firebase.crashlytics.internal.common.Utils;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements com.amazon.aps.iva.g1.j, com.amazon.aps.iva.s3.c, g.a, t.c, IBrazeEndpointProvider, TabLayoutMediator.TabConfigurationStrategy, com.amazon.aps.iva.q3.p, Continuation {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public final Uri a(Uri uri) {
        Uri configuredCustomEndpoint$lambda$12$lambda$11;
        configuredCustomEndpoint$lambda$12$lambda$11 = Braze.Companion.setConfiguredCustomEndpoint$lambda$12$lambda$11((String) this.c, uri);
        return configuredCustomEndpoint$lambda$12$lambda$11;
    }

    @Override // com.amazon.aps.iva.g1.j
    public final double f(double d) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ColorSpace colorSpace = (ColorSpace) obj;
                com.amazon.aps.iva.yb0.j.f(colorSpace, "$this_composeColorSpace");
                return ((ColorSpace.Rgb) colorSpace).getEotf().applyAsDouble(d);
            default:
                com.amazon.aps.iva.g1.u uVar = (com.amazon.aps.iva.g1.u) obj;
                com.amazon.aps.iva.yb0.j.f(uVar, "this$0");
                return com.amazon.aps.iva.aq.j.h(uVar.k.f(d), uVar.e, uVar.f);
        }
    }

    @Override // com.amazon.aps.iva.b8.t.c
    public final void g(q.c cVar, int i) {
        switch (this.b) {
            case 4:
                cVar.B();
                return;
            default:
                cVar.e((com.amazon.aps.iva.q5.f) this.c);
                return;
        }
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public final void onConfigureTab(TabLayout.Tab tab, int i) {
        com.ellation.crunchyroll.presentation.main.lists.b bVar = (com.ellation.crunchyroll.presentation.main.lists.b) this.c;
        b.a aVar = com.ellation.crunchyroll.presentation.main.lists.b.k;
        com.amazon.aps.iva.yb0.j.f(bVar, "this$0");
        com.amazon.aps.iva.yb0.j.f(tab, "tab");
        com.amazon.aps.iva.wy.e eVar = bVar.h.a.get(i);
        com.amazon.aps.iva.yb0.j.d(eVar, "null cannot be cast to non-null type com.ellation.widgets.tabs.TabContainer");
        tab.setText(((com.amazon.aps.iva.w70.i) eVar).H6());
    }

    @Override // com.amazon.aps.iva.q3.p
    public final boolean perform(View view, p.a aVar) {
        return BottomSheetDragHandleView.a((BottomSheetDragHandleView) this.c, view, aVar);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Void lambda$race$0;
        lambda$race$0 = Utils.lambda$race$0((TaskCompletionSource) this.c, task);
        return lambda$race$0;
    }
}
