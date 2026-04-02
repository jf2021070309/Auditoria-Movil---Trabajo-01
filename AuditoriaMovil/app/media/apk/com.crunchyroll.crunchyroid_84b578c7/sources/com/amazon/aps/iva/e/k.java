package com.amazon.aps.iva.e;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.b6.k0;
import com.amazon.aps.iva.b8.t;
import com.amazon.aps.iva.f8.f0;
import com.amazon.aps.iva.h6.m;
import com.amazon.aps.iva.h6.o;
import com.amazon.aps.iva.n10.j;
import com.amazon.aps.iva.o6.d0;
import com.amazon.aps.iva.w6.j;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.ellation.crunchyroll.feed.HomeFeedScreenView;
import com.ellation.crunchyroll.ui.animation.AnimationUtil;
import com.ellation.widgets.input.datainputbutton.DataInputButton;
import com.google.android.material.timepicker.MaterialTimePicker;
import java.util.Iterator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.c;
        switch (this.b) {
            case 1:
                k0 k0Var = (k0) obj;
                b.a t0 = k0Var.t0();
                k0Var.y0(t0, 1028, new com.amazon.aps.iva.b6.z(t0, 1));
                k0Var.g.c();
                return;
            case 2:
                ((m.a) ((o.a) obj)).b();
                return;
            case 3:
                ((d0) obj).G = true;
                return;
            case 4:
                com.amazon.aps.iva.w6.j jVar = (com.amazon.aps.iva.w6.j) obj;
                Surface surface = jVar.i;
                if (surface != null) {
                    Iterator<j.b> it = jVar.b.iterator();
                    while (it.hasNext()) {
                        it.next().b();
                    }
                }
                SurfaceTexture surfaceTexture = jVar.h;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                jVar.h = null;
                jVar.i = null;
                return;
            case 5:
                com.amazon.aps.iva.b8.t tVar = (com.amazon.aps.iva.b8.t) obj;
                t.b bVar = tVar.q;
                if (bVar != null) {
                    tVar.o.t0(bVar);
                    return;
                }
                return;
            case 6:
                ((f0.f) obj).b();
                return;
            case 7:
                ((com.amazon.aps.iva.wa.b) obj).a = null;
                return;
            case 8:
                InAppMessageHtmlBaseView.a((WebView) obj);
                return;
            case 9:
                com.amazon.aps.iva.xb0.a aVar = (com.amazon.aps.iva.xb0.a) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr = HomeFeedScreenView.n;
                com.amazon.aps.iva.yb0.j.f(aVar, "$tmp0");
                aVar.invoke();
                return;
            case 10:
                com.amazon.aps.iva.n10.j jVar2 = (com.amazon.aps.iva.n10.j) obj;
                j.a aVar2 = com.amazon.aps.iva.n10.j.q;
                com.amazon.aps.iva.yb0.j.f(jVar2, "this$0");
                ViewGroup viewGroup = (ViewGroup) jVar2.e.getValue(jVar2, com.amazon.aps.iva.n10.j.r[2]);
                com.amazon.aps.iva.n10.w wVar = jVar2.i;
                if (wVar != null) {
                    com.amazon.aps.iva.k60.a.d(viewGroup, new j.f(wVar), null, 0, 0, 0L, 0L, 254);
                    return;
                } else {
                    com.amazon.aps.iva.yb0.j.m("presenter");
                    throw null;
                }
            case 11:
                AnimationUtil.hideViewWithFade$lambda$4((View) obj);
                return;
            case 12:
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr2 = DataInputButton.h;
                ((TextView) obj).setVisibility(8);
                return;
            default:
                MaterialTimePicker.ci((MaterialTimePicker) obj);
                return;
        }
    }
}
