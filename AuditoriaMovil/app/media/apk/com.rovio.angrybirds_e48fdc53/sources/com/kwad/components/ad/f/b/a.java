package com.kwad.components.ad.f.b;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl;
import com.kwad.components.core.video.l;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.utils.ag;
import com.kwad.sdk.utils.bh;
/* loaded from: classes.dex */
public final class a extends com.kwad.components.ad.f.a.a implements View.OnClickListener {
    private KsAdVideoPlayConfig dJ;
    private ViewGroup nd;
    private ImageView ne;
    private TextView nf;

    public a(KsAdVideoPlayConfig ksAdVideoPlayConfig) {
        this.dJ = ksAdVideoPlayConfig;
    }

    private boolean e(AdInfo adInfo) {
        if (ag.isNetworkConnected(getContext())) {
            KsAdVideoPlayConfig ksAdVideoPlayConfig = this.dJ;
            if (ksAdVideoPlayConfig instanceof KSAdVideoPlayConfigImpl) {
                KSAdVideoPlayConfigImpl kSAdVideoPlayConfigImpl = (KSAdVideoPlayConfigImpl) ksAdVideoPlayConfig;
                if (kSAdVideoPlayConfigImpl.getVideoAutoPlayType() == 1) {
                    return true;
                }
                if (kSAdVideoPlayConfigImpl.getVideoAutoPlayType() == 2) {
                    return ag.isWifiConnected(getContext());
                }
                if (kSAdVideoPlayConfigImpl.getVideoAutoPlayType() == 3) {
                    return false;
                }
                if (kSAdVideoPlayConfigImpl.getDataFlowAutoStartValue() != 0) {
                    return ag.isWifiConnected(getContext()) || (kSAdVideoPlayConfigImpl.isDataFlowAutoStart() && ag.isMobileConnected(getContext()));
                }
            }
            if (com.kwad.sdk.core.response.b.a.bI(adInfo)) {
                return true;
            }
            return com.kwad.sdk.core.response.b.a.bJ(adInfo) && ag.isWifiConnected(getContext());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eP() {
        if (this.nd.getVisibility() != 0) {
            return;
        }
        this.nd.setVisibility(8);
    }

    @Override // com.kwad.components.ad.f.a.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        ViewGroup viewGroup;
        int i;
        super.ah();
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.mZ.mAdTemplate);
        if (e(ck)) {
            viewGroup = this.nd;
            i = 8;
        } else {
            this.nf.setText(bh.U(com.kwad.sdk.core.response.b.a.G(ck) * 1000));
            this.ne.setOnClickListener(this);
            this.mZ.mAdTemplate.mVideoPlayerStatus.mVideoPlayerBehavior = 2;
            viewGroup = this.nd;
            i = 0;
        }
        viewGroup.setVisibility(i);
        this.mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.f.b.a.1
            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayStart() {
                super.onMediaPlayStart();
                a.this.eP();
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlaying() {
                super.onMediaPlaying();
                a.this.eP();
            }
        };
        this.mZ.na.b(this.mVideoPlayStateListener);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.ne) {
            this.mZ.na.eX();
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.nd = (ViewGroup) findViewById(R.id.ksad_data_flow_container);
        this.ne = (ImageView) findViewById(R.id.ksad_data_flow_play_btn);
        this.nf = (TextView) findViewById(R.id.ksad_data_flow_play_tip);
    }
}
