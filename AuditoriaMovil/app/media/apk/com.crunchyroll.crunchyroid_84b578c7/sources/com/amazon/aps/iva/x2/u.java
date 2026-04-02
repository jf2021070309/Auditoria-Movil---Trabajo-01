package com.amazon.aps.iva.x2;

import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.view.Surface;
import android.webkit.WebView;
import com.amazon.aps.iva.c6.j;
import com.amazon.aps.iva.f3.f;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.v6.m;
import com.amazon.aps.iva.w6.j;
import com.segment.analytics.Analytics;
import java.util.Iterator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 1:
                ((f.e) this.c).lambda$callbackSuccessAsync$0((Typeface) this.d);
                return;
            case 2:
                j.a aVar = (j.a) this.c;
                com.amazon.aps.iva.a6.f fVar = (com.amazon.aps.iva.a6.f) this.d;
                aVar.getClass();
                synchronized (fVar) {
                }
                com.amazon.aps.iva.c6.j jVar = aVar.b;
                int i = g0.a;
                jVar.v(fVar);
                return;
            case 3:
                e.a aVar2 = (e.a) this.c;
                ((com.amazon.aps.iva.g6.e) this.d).Q(aVar2.a, aVar2.b);
                return;
            case 4:
                v.b bVar = (v.b) this.d;
                com.amazon.aps.iva.p6.b bVar2 = com.amazon.aps.iva.p6.b.this;
                bVar2.n.a(bVar2, bVar.b, bVar.c);
                return;
            case 5:
                m.a aVar3 = (m.a) this.c;
                aVar3.getClass();
                int i2 = g0.a;
                aVar3.b.s((com.amazon.aps.iva.a6.f) this.d);
                return;
            case 6:
                com.amazon.aps.iva.w6.j jVar2 = (com.amazon.aps.iva.w6.j) this.c;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                SurfaceTexture surfaceTexture2 = jVar2.h;
                Surface surface = jVar2.i;
                Surface surface2 = new Surface(surfaceTexture);
                jVar2.h = surfaceTexture;
                jVar2.i = surface2;
                Iterator<j.b> it = jVar2.b.iterator();
                while (it.hasNext()) {
                    it.next().a(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 7:
                String str = (String) this.c;
                String.format("#sendMessageToWebView#post: javascript callback: %s", str);
                ((WebView) this.d).evaluateJavascript(str, null);
                return;
            default:
                ((Analytics) this.c).lambda$new$0((androidx.lifecycle.g) this.d);
                return;
        }
    }
}
