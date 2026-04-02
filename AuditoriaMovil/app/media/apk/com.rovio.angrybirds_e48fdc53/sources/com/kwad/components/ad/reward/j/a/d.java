package com.kwad.components.ad.reward.j.a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ViewGroup;
import com.kwad.components.ad.reward.j;
import com.kwad.components.ad.reward.j.l;
import com.kwad.components.ad.reward.j.m;
import com.kwad.components.ad.reward.j.n;
import com.kwad.components.ad.reward.j.o;
import com.kwad.components.ad.reward.j.p;
import com.kwad.components.ad.reward.j.r;
import com.kwad.components.ad.reward.j.s;
import com.kwad.components.ad.reward.page.BackPressHandleResult;
import com.kwad.components.core.webview.b.h;
import com.kwad.components.core.webview.b.i;
import com.kwad.components.core.webview.jshandler.ae;
import com.kwad.components.core.webview.jshandler.q;
import com.kwad.sdk.core.response.model.AdTemplate;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public final class d extends h implements r, q.b {
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private WeakReference<j> qu;
    private com.kwad.components.ad.reward.c.e xQ;
    private m xR;
    private l xS;
    private n xT;
    private List<AdTemplate> xU;
    private DialogInterface.OnDismissListener xV;

    public d(j jVar, long j, Context context) {
        super(j, context);
        this.xU = null;
        this.qu = new WeakReference<>(jVar);
    }

    public d(j jVar, long j, Context context, DialogInterface.OnDismissListener onDismissListener) {
        super(-1L, context);
        this.xU = null;
        this.xV = onDismissListener;
        this.qu = new WeakReference<>(jVar);
    }

    @Override // com.kwad.components.core.webview.jshandler.q.b
    public final void A(AdTemplate adTemplate) {
        com.kwad.components.core.i.c cVar = new com.kwad.components.core.i.c(adTemplate, com.kwad.components.core.i.e.AGGREGATION);
        WeakReference<j> weakReference = this.qu;
        j jVar = weakReference != null ? weakReference.get() : null;
        if (jVar != null) {
            jVar.b(cVar);
        }
    }

    @Override // com.kwad.components.core.webview.b.h
    public final void a(Activity activity, AdTemplate adTemplate, i iVar) {
        super.a(activity, adTemplate, iVar);
        WeakReference<j> weakReference = this.qu;
        j jVar = weakReference != null ? weakReference.get() : null;
        if (jVar != null) {
            jVar.a(this);
        }
    }

    @Override // com.kwad.components.core.webview.b.h
    public final void a(com.kwad.sdk.core.webview.b bVar, com.kwad.components.core.e.d.c cVar, com.kwad.sdk.components.l lVar, ViewGroup viewGroup) {
        super.a(bVar, cVar, lVar, viewGroup);
        this.mApkDownloadHelper = cVar;
        lVar.c(new com.kwad.components.ad.reward.j.q(bVar, cVar, null, this.xM, this, this.xV));
        com.kwad.components.ad.reward.c.e eVar = new com.kwad.components.ad.reward.c.e();
        this.xQ = eVar;
        lVar.c(eVar);
        lVar.c(new s(this.mContext, this.qu.get()));
        lVar.c(new o(this.qu.get()));
        m mVar = new m();
        this.xR = mVar;
        lVar.c(mVar);
        l lVar2 = new l();
        this.xS = lVar2;
        lVar.c(lVar2);
        List<AdTemplate> list = this.xU;
        if (list != null) {
            this.xS.e(list);
            this.xU = null;
        }
        q qVar = new q(bVar);
        qVar.a(this);
        lVar.c(qVar);
        n nVar = new n();
        this.xT = nVar;
        lVar.c(nVar);
    }

    @Override // com.kwad.components.ad.reward.j.r
    public final void ab(boolean z) {
        n nVar = this.xT;
        if (nVar != null) {
            nVar.aa(z);
        }
    }

    @Override // com.kwad.components.core.webview.b.h
    public final ae c(com.kwad.sdk.core.webview.b bVar) {
        WeakReference<j> weakReference = this.qu;
        return new p(weakReference != null ? weakReference.get() : null, getTkTemplateId(), this.xM, bVar);
    }

    public final void f(List<AdTemplate> list) {
        this.xU = list;
    }

    public final BackPressHandleResult gC() {
        m mVar = this.xR;
        if (mVar == null) {
            return BackPressHandleResult.NOT_HANDLED;
        }
        mVar.jo();
        return BackPressHandleResult.HANDLED;
    }

    public final com.kwad.components.ad.reward.c.e jv() {
        return this.xQ;
    }

    public final l jw() {
        return this.xS;
    }

    @Override // com.kwad.components.core.webview.b.h
    public final void jx() {
        super.jx();
        WeakReference<j> weakReference = this.qu;
        j jVar = weakReference != null ? weakReference.get() : null;
        if (jVar != null) {
            jVar.b(this);
        }
    }
}
