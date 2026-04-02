package com.amazon.aps.iva.i50;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.amazon.aps.iva.ap.h;
import com.amazon.aps.iva.ap.i;
import com.amazon.aps.iva.xw.f0;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: WatchScreenRouter.kt */
/* loaded from: classes2.dex */
public final class c implements b {
    public final Context a;
    public final com.amazon.aps.iva.xb0.a<Intent> b;

    public c(Context context, a aVar) {
        j.f(context, "context");
        this.a = context;
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.i50.b
    public final void a(h hVar, com.amazon.aps.iva.no.a aVar) {
        Intent invoke = this.b.invoke();
        invoke.putExtra("watch_page_raw_input", hVar);
        invoke.putExtra("watch_page_session_origin", aVar);
        this.a.startActivity(invoke);
    }

    @Override // com.amazon.aps.iva.i50.b
    public final void b(PlayableAsset playableAsset, long j, boolean z, com.amazon.aps.iva.no.a aVar) {
        j.f(playableAsset, "playableAsset");
        Intent invoke = this.b.invoke();
        invoke.putExtra("playable_asset", playableAsset);
        invoke.putExtra("watch_page_session_origin", aVar);
        invoke.putExtra("playhead", j);
        invoke.putExtra("is_completed", z);
        Activity a = q.a(this.a);
        j.c(a);
        a.startActivityForResult(invoke, 0);
    }

    @Override // com.amazon.aps.iva.i50.b
    public final void c(Panel panel, com.amazon.aps.iva.no.a aVar, Long l, Boolean bool) {
        String str;
        j.f(panel, "panel");
        Intent invoke = this.b.invoke();
        com.amazon.aps.iva.ap.a aVar2 = new com.amazon.aps.iva.ap.a(f0.a(panel), f0.c(panel));
        int i = i.a[panel.getResourceType().ordinal()];
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (z) {
            str = panel.getId();
        } else {
            str = null;
        }
        invoke.putExtra("watch_page_raw_input", new h(aVar2, str));
        invoke.putExtra("watch_page_session_origin", aVar);
        invoke.putExtra("playhead", l);
        invoke.putExtra("is_completed", bool);
        this.a.startActivity(invoke);
    }
}
