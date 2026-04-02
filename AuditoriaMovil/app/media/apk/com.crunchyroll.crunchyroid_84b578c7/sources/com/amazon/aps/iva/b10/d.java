package com.amazon.aps.iva.b10;

import android.content.Context;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: DetailedNotificationView.kt */
/* loaded from: classes2.dex */
public final class d extends com.ellation.crunchyroll.presentation.download.notification.a implements c {
    public final com.amazon.aps.iva.a9.w e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.e = new com.amazon.aps.iva.a9.w(context);
    }

    @Override // com.amazon.aps.iva.b10.c
    public final void b(e0 e0Var, PlayableAsset playableAsset) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        com.amazon.aps.iva.c3.s m = m(playableAsset, e0Var.e());
        m.e(o(playableAsset));
        com.amazon.aps.iva.c3.r rVar = new com.amazon.aps.iva.c3.r();
        rVar.a(this.e.f(playableAsset, p(R.string.waiting)));
        m.h(rVar);
        m.d(p(R.string.waiting));
        n(e0Var.e().hashCode(), m);
    }

    @Override // com.amazon.aps.iva.b10.c
    public final void c(e0 e0Var, PlayableAsset playableAsset) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        com.amazon.aps.iva.c3.s m = m(playableAsset, e0Var.e());
        m.e(o(playableAsset));
        com.amazon.aps.iva.a9.w wVar = this.e;
        CharSequence string = ((Context) wVar.c).getString(R.string.percents_progress, Integer.valueOf((int) e0Var.f()));
        com.amazon.aps.iva.yb0.j.e(string, "context.getString(R.stri…ogress, progress.toInt())");
        m.d(string);
        m.f(16, false);
        m.n = 100;
        m.o = (int) e0Var.f();
        m.p = false;
        com.amazon.aps.iva.c3.r rVar = new com.amazon.aps.iva.c3.r();
        long j = 1000000;
        String string2 = ((Context) wVar.c).getString(R.string.detailed_download_progress, Integer.valueOf((int) e0Var.f()), Long.valueOf(e0Var.b() / j), Long.valueOf(e0Var.c() / j));
        com.amazon.aps.iva.yb0.j.e(string2, "context.getString(\n     …izeBytes.toMb()\n        )");
        rVar.a(wVar.f(playableAsset, string2));
        m.h(rVar);
        m.f(2, true);
        n(e0Var.e().hashCode(), m);
    }

    @Override // com.amazon.aps.iva.b10.c
    public final void f() {
        this.c.cancelAll();
    }

    @Override // com.amazon.aps.iva.b10.c
    public final void i(e0 e0Var, PlayableAsset playableAsset) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        com.amazon.aps.iva.c3.s m = m(playableAsset, e0Var.e());
        m.e(o(playableAsset));
        m.d(p(R.string.sync_complete));
        com.amazon.aps.iva.c3.r rVar = new com.amazon.aps.iva.c3.r();
        rVar.a(this.e.f(playableAsset, p(R.string.sync_complete)));
        m.h(rVar);
        n(e0Var.e().hashCode(), m);
    }

    @Override // com.amazon.aps.iva.b10.c
    public final void j(e0 e0Var, PlayableAsset playableAsset) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        com.amazon.aps.iva.c3.s m = m(playableAsset, e0Var.e());
        m.e(o(playableAsset));
        com.amazon.aps.iva.a9.w wVar = this.e;
        m.d(wVar.e(playableAsset));
        com.amazon.aps.iva.c3.r rVar = new com.amazon.aps.iva.c3.r();
        rVar.a(wVar.f(playableAsset, p(R.string.unable_to_sync)));
        m.h(rVar);
        n(e0Var.e().hashCode(), m);
    }

    @Override // com.amazon.aps.iva.b10.c
    public final void k(e0 e0Var, PlayableAsset playableAsset) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        com.amazon.aps.iva.c3.s m = m(playableAsset, e0Var.e());
        m.e(o(playableAsset));
        m.d(p(R.string.paused));
        com.amazon.aps.iva.c3.r rVar = new com.amazon.aps.iva.c3.r();
        rVar.a(this.e.f(playableAsset, p(R.string.paused)));
        m.h(rVar);
        n(e0Var.e().hashCode(), m);
    }

    public final String o(PlayableAsset playableAsset) {
        this.e.getClass();
        if (playableAsset instanceof Episode) {
            return ((Episode) playableAsset).getSeriesTitle();
        }
        return playableAsset.getTitle();
    }

    public final String p(int i) {
        String string = this.a.getString(i);
        com.amazon.aps.iva.yb0.j.e(string, "context.getString(resId)");
        return string;
    }
}
