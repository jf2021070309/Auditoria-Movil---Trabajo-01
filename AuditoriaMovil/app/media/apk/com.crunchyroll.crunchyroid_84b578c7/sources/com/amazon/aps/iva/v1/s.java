package com.amazon.aps.iva.v1;

import com.ellation.crunchyroll.ui.animation.AnimationUtil;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a c;

    public /* synthetic */ s(int i, com.amazon.aps.iva.xb0.a aVar) {
        this.b = i;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        com.amazon.aps.iva.xb0.a aVar = this.c;
        switch (i) {
            case 0:
                com.amazon.aps.iva.yb0.j.f(aVar, "$tmp0");
                aVar.invoke();
                return;
            case 1:
                AnimationUtil.fadeOut$lambda$2(aVar);
                return;
            default:
                com.amazon.aps.iva.yb0.j.f(aVar, "$tmp0");
                aVar.invoke();
                return;
        }
    }
}
