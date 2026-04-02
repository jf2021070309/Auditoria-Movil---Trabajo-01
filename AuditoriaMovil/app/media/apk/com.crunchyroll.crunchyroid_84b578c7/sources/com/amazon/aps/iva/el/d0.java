package com.amazon.aps.iva.el;

import android.view.View;
import com.ellation.crunchyroll.ui.animation.AnimationUtil;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ d0(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                com.amazon.aps.iva.yb0.j.f(view, "$it");
                view.setVisibility(4);
                return;
            default:
                AnimationUtil.b(view);
                return;
        }
    }
}
