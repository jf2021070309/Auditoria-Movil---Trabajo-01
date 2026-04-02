package com.kwad.components.ad.splashscreen.c;

import com.kwad.components.core.widget.ComplianceTextView;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public final class f extends e {
    private ComplianceTextView bZ;

    @Override // com.kwad.components.ad.splashscreen.c.e, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        ComplianceTextView complianceTextView = (ComplianceTextView) this.CS.p(com.kwad.sdk.core.response.b.d.ck(this.CS.mAdTemplate)).findViewById(R.id.ksad_compliance_view);
        this.bZ = complianceTextView;
        complianceTextView.setBackgroundColor(0);
        this.bZ.setVisibility(0);
        this.bZ.setAdTemplate(this.CS.mAdTemplate);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
    }
}
