package com.kwad.components.ad.reward.widget.tailframe;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.components.ad.reward.j;
import com.kwad.components.core.page.widget.TextProgressBar;
import com.kwad.components.core.widget.KsLogoView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.m.l;
import com.kwad.sdk.widget.c;
import com.kwad.sdk.widget.f;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class a implements c {
    protected View Bs;
    protected ImageView Bt;
    private com.kwad.components.ad.widget.tailframe.appbar.a Bu;
    private TailFrameBarH5View Bv;
    private b Bw;
    private TextProgressBar Bx;
    private View By;
    private int Bz;
    private TextView dC;
    protected AdInfo mAdInfo;
    protected AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    protected KsLogoView mLogoView;
    private JSONObject mReportExtData;
    private j qB;

    public a(int i) {
        this.Bz = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        r1 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(android.view.View r6, final boolean r7) {
        /*
            r5 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r5.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.d.u(r0)
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L21
            if (r7 == 0) goto Le
            r7 = r2
            goto L10
        Le:
            r7 = 153(0x99, float:2.14E-43)
        L10:
            com.kwad.components.ad.reward.j r0 = r5.qB
            android.view.View r3 = r5.Bs
            android.content.Context r3 = r3.getContext()
            android.view.View r4 = r5.By
            if (r6 != r4) goto L1d
            r1 = r2
        L1d:
            r0.a(r2, r3, r7, r1)
            return
        L21:
            com.kwad.sdk.core.response.model.AdInfo r0 = r5.mAdInfo
            boolean r0 = com.kwad.sdk.core.response.b.a.ax(r0)
            if (r0 == 0) goto L2f
            com.kwad.components.core.page.widget.TextProgressBar r0 = r5.Bx
            if (r6 != r0) goto L34
        L2d:
            r1 = r2
            goto L34
        L2f:
            android.widget.TextView r0 = r5.dC
            if (r6 != r0) goto L34
            goto L2d
        L34:
            com.kwad.components.core.e.d.a$a r0 = new com.kwad.components.core.e.d.a$a
            android.content.Context r3 = r6.getContext()
            r0.<init>(r3)
            com.kwad.sdk.core.response.model.AdTemplate r3 = r5.mAdTemplate
            com.kwad.components.core.e.d.a$a r0 = r0.S(r3)
            com.kwad.components.core.e.d.c r3 = r5.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r0 = r0.b(r3)
            r3 = 0
            if (r1 != r2) goto L4e
            r4 = r2
            goto L4f
        L4e:
            r4 = r3
        L4f:
            com.kwad.components.core.e.d.a$a r0 = r0.an(r4)
            com.kwad.components.core.e.d.a$a r0 = r0.am(r2)
            com.kwad.components.core.page.widget.TextProgressBar r4 = r5.Bx
            if (r6 != r4) goto L5c
            goto L5d
        L5c:
            r2 = r3
        L5d:
            com.kwad.components.core.e.d.a$a r6 = r0.al(r2)
            com.kwad.components.core.e.d.a$a r6 = r6.ao(r1)
            com.kwad.components.ad.reward.widget.tailframe.a$2 r0 = new com.kwad.components.ad.reward.widget.tailframe.a$2
            r0.<init>()
            com.kwad.components.core.e.d.a$a r6 = r6.a(r0)
            com.kwad.components.core.e.d.a.a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.components.ad.reward.widget.tailframe.a.b(android.view.View, boolean):void");
    }

    private void bindDownloadListener() {
        this.mApkDownloadHelper = new com.kwad.components.core.e.d.c(this.mAdTemplate, this.mReportExtData, new com.kwad.sdk.core.download.a.a() { // from class: com.kwad.components.ad.reward.widget.tailframe.a.1
            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onDownloadFailed() {
                a.this.Bu.z(a.this.mAdInfo);
                a.this.Bx.e(com.kwad.sdk.core.response.b.a.aw(a.this.mAdInfo), 0);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onDownloadFinished() {
                a.this.Bu.z(a.this.mAdInfo);
                a.this.Bx.e(com.kwad.sdk.core.response.b.a.aQ(a.this.mAdTemplate), 0);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onIdle() {
                a.this.Bu.z(a.this.mAdInfo);
                a.this.Bx.e(com.kwad.sdk.core.response.b.a.aw(a.this.mAdInfo), 0);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onInstalled() {
                a.this.Bu.z(a.this.mAdInfo);
                a.this.Bx.e(com.kwad.sdk.core.response.b.a.U(a.this.mAdInfo), 0);
            }

            @Override // com.kwad.sdk.core.download.a.a
            public final void onPaused(int i) {
                a.this.Bu.z(a.this.mAdInfo);
                a.this.Bx.e(com.kwad.sdk.core.response.b.a.cw(i), i);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onProgressUpdate(int i) {
                a.this.Bu.z(a.this.mAdInfo);
                a.this.Bx.e(com.kwad.sdk.core.response.b.a.cv(i), i);
            }
        });
    }

    private void ko() {
        this.Bs.setOnClickListener(null);
        this.mApkDownloadHelper = null;
    }

    private void kq() {
        if (!com.kwad.sdk.core.response.b.a.ax(this.mAdInfo) && !d.u(this.mAdTemplate)) {
            this.Bv.b(this.mAdTemplate);
            TextView h5OpenBtn = this.Bv.getH5OpenBtn();
            this.dC = h5OpenBtn;
            h5OpenBtn.setClickable(true);
            this.Bv.setVisibility(0);
            new f(this.dC, this);
            return;
        }
        this.Bu.b(this.mAdTemplate);
        this.Bu.setVisibility(0);
        this.Bx = this.Bu.getTextProgressBar();
        if (!d.u(this.mAdTemplate)) {
            this.Bx.setClickable(true);
            new f(this.Bx, this);
            bindDownloadListener();
            return;
        }
        View btnInstallContainer = this.Bu.getBtnInstallContainer();
        this.By = btnInstallContainer;
        btnInstallContainer.setClickable(true);
        new f(this.By, this);
    }

    public void D(Context context) {
        View a = l.a(context, this.Bz, null, false);
        this.Bs = a;
        this.Bt = (ImageView) a.findViewById(R.id.ksad_video_thumb_img);
        this.mLogoView = (KsLogoView) this.Bs.findViewById(R.id.ksad_video_tf_logo);
        this.Bu = (com.kwad.components.ad.widget.tailframe.appbar.a) this.Bs.findViewById(R.id.ksad_video_app_tail_frame);
        this.Bv = (TailFrameBarH5View) this.Bs.findViewById(R.id.ksad_video_h5_tail_frame);
    }

    @Override // com.kwad.sdk.widget.c
    public final void a(View view) {
        b(view, true);
    }

    public void a(AdTemplate adTemplate, JSONObject jSONObject, b bVar) {
        this.mAdTemplate = adTemplate;
        this.mAdInfo = d.ck(adTemplate);
        this.mReportExtData = jSONObject;
        this.Bw = bVar;
        this.mLogoView.ad(this.mAdTemplate);
        kq();
        this.Bs.setClickable(true);
        new f(this.Bs, this);
    }

    @Override // com.kwad.sdk.widget.c
    public final void b(View view) {
        if (com.kwad.sdk.core.response.b.c.bZ(this.mAdTemplate)) {
            b(view, false);
        }
    }

    public final void d(boolean z, boolean z2) {
        this.Bv.e(z, z2);
    }

    public final void destroy() {
        com.kwad.components.ad.widget.tailframe.appbar.a aVar = this.Bu;
        if (aVar != null) {
            aVar.ks();
            this.Bu.setVisibility(8);
        }
        TailFrameBarH5View tailFrameBarH5View = this.Bv;
        if (tailFrameBarH5View != null) {
            tailFrameBarH5View.ks();
            this.Bv.setVisibility(8);
        }
        ko();
    }

    public final void jX() {
        com.kwad.components.ad.widget.tailframe.appbar.a aVar = this.Bu;
        if (aVar != null) {
            aVar.ks();
        }
        TailFrameBarH5View tailFrameBarH5View = this.Bv;
        if (tailFrameBarH5View != null) {
            tailFrameBarH5View.ks();
        }
    }

    public final View kp() {
        return this.Bs;
    }

    public final void setCallerContext(j jVar) {
        this.qB = jVar;
    }
}
