package com.kwad.components.ad.f.b;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.video.l;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public final class h extends com.kwad.components.ad.f.a.a implements View.OnClickListener {
    private ViewGroup ns;
    private TextView nt;

    /* JADX INFO: Access modifiers changed from: private */
    public void eR() {
        this.nt.setText(com.kwad.sdk.core.response.b.a.aw(com.kwad.sdk.core.response.b.d.ck(this.mZ.mAdTemplate)));
        this.ns.setOnClickListener(this);
        this.ns.setVisibility(0);
    }

    private void eT() {
        com.kwad.components.core.e.d.a.a(new a.C0197a(this.ns.getContext()).S(this.mZ.mAdTemplate).ao(2).a(new a.b() { // from class: com.kwad.components.ad.f.b.h.2
            @Override // com.kwad.components.core.e.d.a.b
            public final void onAdClicked() {
                com.kwad.sdk.core.report.a.a(h.this.mZ.mAdTemplate, 2, h.this.mZ.mU.getTouchCoords());
            }
        }));
    }

    private void notifyAdClick() {
        this.mZ.mI.l(this.ns);
    }

    @Override // com.kwad.components.ad.f.a.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.f.b.h.1
            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayCompleted() {
                h.this.eR();
            }
        };
        this.mZ.na.b(this.mVideoPlayStateListener);
        this.ns.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        eT();
        notifyAdClick();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.ns = (ViewGroup) findViewById(R.id.ksad_video_complete_h5_container);
        this.nt = (TextView) findViewById(R.id.ksad_h5_open);
    }
}
