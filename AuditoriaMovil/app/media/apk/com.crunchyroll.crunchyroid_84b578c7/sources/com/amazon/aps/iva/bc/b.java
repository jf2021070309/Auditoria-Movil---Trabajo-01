package com.amazon.aps.iva.bc;

import android.view.View;
import com.amazon.aps.iva.yb0.j;
import com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView;
import com.ellation.crunchyroll.presentation.search.result.summary.c;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ b(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                InAppMessageImmersiveBaseView.a(view);
                return;
            default:
                c.a aVar = com.ellation.crunchyroll.presentation.search.result.summary.c.u;
                j.f(view, "$it");
                view.setVisibility(8);
                return;
        }
    }
}
