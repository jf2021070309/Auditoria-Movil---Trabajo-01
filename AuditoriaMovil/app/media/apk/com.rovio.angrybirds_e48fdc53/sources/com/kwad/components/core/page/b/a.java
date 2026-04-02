package com.kwad.components.core.page.b;

import android.view.View;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.widget.FeedVideoView;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.mvp.Presenter;
/* loaded from: classes.dex */
public final class a extends Presenter {
    private int MR;
    private FeedVideoView MS;

    @Override // com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        final com.kwad.components.core.page.recycle.e eVar = (com.kwad.components.core.page.recycle.e) Gh();
        KsAdVideoPlayConfig build = new KsAdVideoPlayConfig.Builder().videoSoundEnable(eVar.adTemplate.mIsAudioEnable).build();
        FeedVideoView feedVideoView = (FeedVideoView) getRootView();
        this.MS = feedVideoView;
        feedVideoView.b(eVar.adTemplate);
        this.MS.a(build, eVar.JN);
        this.MS.setVisibility(0);
        final AdInfo ck = com.kwad.sdk.core.response.b.d.ck(eVar.adTemplate);
        this.MS.setOnEndBtnClickListener(new View.OnClickListener() { // from class: com.kwad.components.core.page.b.a.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (com.kwad.sdk.core.response.b.a.ax(ck)) {
                    if (eVar.JN != null) {
                        com.kwad.components.core.e.d.a.a(new a.C0197a(a.this.getActivity()).al(false).am(false).aq(true).S(eVar.adTemplate).ao(false));
                        com.kwad.sdk.core.report.a.a(eVar.adTemplate, 50, a.this.MS.getTouchCoords());
                    }
                } else if (eVar.On == null || eVar.On.getAdapter() == null || eVar.On.getAdapter().getItemCount() <= 1) {
                } else {
                    eVar.On.scrollToPosition(1);
                    com.kwad.sdk.core.report.a.a(eVar.adTemplate, 50, a.this.MS.getTouchCoords());
                }
            }
        });
        if (com.kwad.sdk.core.response.b.a.ai(ck)) {
            this.MS.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.core.page.b.a.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (com.kwad.sdk.core.response.b.a.ax(ck)) {
                        if (eVar.JN != null) {
                            com.kwad.components.core.e.d.a.a(new a.C0197a(a.this.getActivity()).al(false).am(false).aq(true).S(eVar.adTemplate).ao(false));
                            com.kwad.sdk.core.report.a.a(eVar.adTemplate, 171, a.this.MS.getTouchCoords());
                        }
                    } else if (eVar.On == null || eVar.On.getAdapter() == null || eVar.On.getAdapter().getItemCount() <= 1) {
                    } else {
                        eVar.On.scrollToPosition(1);
                        com.kwad.sdk.core.report.a.a(eVar.adTemplate, 171, a.this.MS.getTouchCoords());
                    }
                }
            });
        }
        this.MS.setWindowFullScreenListener(new FeedVideoView.a() { // from class: com.kwad.components.core.page.b.a.3
            @Override // com.kwad.components.core.widget.FeedVideoView.a
            public final void oK() {
                if (eVar.On != null) {
                    a.this.MR = eVar.On.computeVerticalScrollOffset();
                }
            }

            @Override // com.kwad.components.core.widget.FeedVideoView.a
            public final void oL() {
                if (eVar.On != null) {
                    eVar.On.scrollToPosition(a.this.MR);
                }
            }
        });
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.MS.release();
    }
}
