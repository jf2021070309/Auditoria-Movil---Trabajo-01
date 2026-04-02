package com.amazon.aps.iva.iy;

import com.amazon.aps.iva.wy.j;
/* compiled from: SmoothCarouselPresenter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.b<f> implements d {
    public e(c cVar) {
        super(cVar, new j[0]);
    }

    @Override // com.amazon.aps.iva.iy.d
    public final void V5(int i, com.amazon.aps.iva.xx.g gVar) {
        boolean z;
        f view = getView();
        view.p();
        String str = gVar.d;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                view.setTitle(str);
                view.x2();
            }
        }
        view.R1(i, gVar.b());
    }
}
