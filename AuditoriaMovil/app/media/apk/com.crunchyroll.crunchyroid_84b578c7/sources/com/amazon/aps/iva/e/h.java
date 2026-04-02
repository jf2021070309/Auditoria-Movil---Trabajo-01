package com.amazon.aps.iva.e;

import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.emoji2.text.g;
import com.amazon.aps.iva.ru.b;
import com.amazon.aps.iva.util.LogUtils;
import com.crunchyroll.sortandfilters.screen.SortAndFilterActivity;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ComponentActivity.f fVar = (ComponentActivity.f) obj;
                Runnable runnable = fVar.c;
                if (runnable != null) {
                    runnable.run();
                    fVar.c = null;
                    return;
                }
                return;
            case 1:
                ((g.b) obj).c();
                return;
            case 2:
                com.amazon.aps.iva.n6.c cVar = com.amazon.aps.iva.n6.c.this;
                if (cVar.g != null && (cVar.f & 3) != 0) {
                    cVar.a();
                    return;
                }
                return;
            case 3:
                int i2 = com.amazon.aps.iva.b8.t.u;
                ((com.amazon.aps.iva.b8.t) obj).getClass();
                return;
            case 4:
                float[] fArr = androidx.media3.ui.c.S0;
                ((androidx.media3.ui.c) obj).o();
                return;
            case 5:
                ((com.amazon.aps.iva.c8.t) obj).k();
                return;
            case 6:
                com.amazon.aps.iva.wa.f fVar2 = (com.amazon.aps.iva.wa.f) obj;
                String str = com.amazon.aps.iva.wa.f.h;
                fVar2.getClass();
                try {
                    JsonObject jsonObject = (JsonObject) fVar2.e.fromJson(fVar2.c(), (Class<Object>) JsonObject.class);
                    fVar2.d = jsonObject;
                    if (jsonObject == null) {
                        LogUtils.e("e", "apsIvaConfigJson is null");
                    } else {
                        fVar2.d();
                    }
                    return;
                } catch (JsonSyntaxException e) {
                    LogUtils.e("e", String.format("ApsIvaConfigFetcher: Error Parsing Config Data, Invalid Json format: %s", e));
                    return;
                } catch (RuntimeException e2) {
                    LogUtils.e("e", String.format("ApsIvaConfigFetcher: Runtime Error while Parsing Config Data: %s", e2));
                    return;
                }
            case 7:
                SortAndFilterActivity sortAndFilterActivity = (SortAndFilterActivity) obj;
                int i3 = SortAndFilterActivity.n;
                com.amazon.aps.iva.yb0.j.f(sortAndFilterActivity, "this$0");
                DrawerLayout drawerLayout = sortAndFilterActivity.mi().b;
                if (drawerLayout != null) {
                    View e3 = drawerLayout.e(8388613);
                    if (e3 != null) {
                        drawerLayout.p(e3);
                        return;
                    }
                    throw new IllegalArgumentException("No drawer view found with gravity " + DrawerLayout.j(8388613));
                }
                return;
            case 8:
                com.amazon.aps.iva.xb0.a aVar = (com.amazon.aps.iva.xb0.a) obj;
                b.a aVar2 = com.amazon.aps.iva.ru.b.m;
                com.amazon.aps.iva.yb0.j.f(aVar, "$onListUpdated");
                aVar.invoke();
                return;
            case 9:
                com.amazon.aps.iva.x50.l lVar = (com.amazon.aps.iva.x50.l) obj;
                com.amazon.aps.iva.yb0.j.f(lVar, "this$0");
                ((com.amazon.aps.iva.x50.j) lVar).f.invoke(lVar.e);
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
