package com.kwad.components.ad.draw.b;

import com.kwad.components.core.widget.ComplianceTextView;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public final class a extends com.kwad.components.ad.draw.a.a {
    private ComplianceTextView bZ;

    @Override // com.kwad.components.ad.draw.a.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.bZ.setVisibility(0);
        this.bZ.setAdTemplate(this.bE.mAdTemplate);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.bZ = (ComplianceTextView) findViewById(R.id.ksad_compliance_view);
    }
}
