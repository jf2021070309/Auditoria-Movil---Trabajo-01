package com.kwad.components.ad.interstitial.d;

import android.view.OrientationEventListener;
import android.view.View;
import com.kwad.components.ad.interstitial.d.c;
import com.kwad.components.core.widget.ComplianceTextView;
import com.kwad.components.core.widget.KsAutoCloseView;
import com.kwad.sdk.R;
import com.kwad.sdk.utils.ai;
/* loaded from: classes.dex */
public final class a extends b {
    private ComplianceTextView jc;
    private OrientationEventListener jd;
    private KsAutoCloseView je;

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final c cVar) {
        OrientationEventListener orientationEventListener = new OrientationEventListener(cVar.hI.getContext()) { // from class: com.kwad.components.ad.interstitial.d.a.2
            @Override // android.view.OrientationEventListener
            public final void onOrientationChanged(int i) {
                a.this.b(cVar);
            }
        };
        this.jd = orientationEventListener;
        if (orientationEventListener.canDetectOrientation()) {
            this.jd.enable();
        } else {
            this.jd.disable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(c cVar) {
        h(this.jc);
        if (ai.IL()) {
            com.kwad.sdk.d.a.a.b(this.je, 0, com.kwad.sdk.d.a.a.a(getContext(), 25.0f), 0, 0);
        } else {
            com.kwad.sdk.d.a.a.b(this.je, 0, 0, 0, 0);
        }
        this.jc.setVisibility(0);
        this.jc.setAdTemplate(cVar.mAdTemplate);
    }

    private void h(View view) {
        int a = com.kwad.sdk.d.a.a.a(getContext(), 4.0f);
        int a2 = com.kwad.sdk.d.a.a.a(getContext(), 4.0f);
        com.kwad.sdk.d.a.a.b(view, a2, a, a2, 0);
    }

    @Override // com.kwad.components.ad.interstitial.d.b, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        final c cVar = (c) Gh();
        cVar.a(new c.e() { // from class: com.kwad.components.ad.interstitial.d.a.1
            @Override // com.kwad.components.ad.interstitial.d.c.e
            public final void onError() {
                a.this.b(cVar);
                a.this.a(cVar);
            }
        });
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.jc = (ComplianceTextView) findViewById(R.id.ksad_compliance_view);
        this.je = (KsAutoCloseView) findViewById(R.id.ksad_interstitial_auto_close);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        OrientationEventListener orientationEventListener = this.jd;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
    }
}
