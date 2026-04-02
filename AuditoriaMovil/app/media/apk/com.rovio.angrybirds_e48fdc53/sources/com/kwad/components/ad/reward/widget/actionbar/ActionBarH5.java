package com.kwad.components.ad.reward.widget.actionbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.kwad.components.core.e.d.a;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.m.l;
import com.kwad.sdk.widget.c;
import com.kwad.sdk.widget.f;
/* loaded from: classes.dex */
public class ActionBarH5 extends FrameLayout implements c {
    private TextView Bo;
    private a Bp;
    private View Bq;
    private TextView dC;
    private AdTemplate mAdTemplate;

    /* loaded from: classes.dex */
    public interface a {
        void O(boolean z);
    }

    public ActionBarH5(Context context) {
        super(context);
        D(context);
    }

    public ActionBarH5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        D(context);
    }

    public ActionBarH5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        D(context);
    }

    private void D(Context context) {
        l.inflate(context, R.layout.ksad_video_actionbar_h5, this);
        this.Bo = (TextView) findViewById(R.id.ksad_h5_ad_desc);
        this.dC = (TextView) findViewById(R.id.ksad_h5_open_btn);
        this.Bq = findViewById(R.id.ksad_download_bar_cover);
    }

    private void b(View view, final boolean z) {
        com.kwad.components.core.e.d.a.a(new a.C0197a(view.getContext()).S(this.mAdTemplate).ao(view == this.Bq ? 1 : 2).a(new a.b() { // from class: com.kwad.components.ad.reward.widget.actionbar.ActionBarH5.1
            @Override // com.kwad.components.core.e.d.a.b
            public final void onAdClicked() {
                if (ActionBarH5.this.Bp != null) {
                    ActionBarH5.this.Bp.O(z);
                }
            }
        }));
    }

    @Override // com.kwad.sdk.widget.c
    public final void a(View view) {
        b(view, true);
    }

    public final void a(AdTemplate adTemplate, a aVar) {
        this.mAdTemplate = adTemplate;
        this.Bp = aVar;
        AdInfo ck = d.ck(adTemplate);
        this.Bo.setText(com.kwad.sdk.core.response.b.a.an(ck));
        this.dC.setText(com.kwad.sdk.core.response.b.a.aw(ck));
        setClickable(true);
        this.Bq.setClickable(true);
        new f(this.Bq, this);
        new f(this, this);
    }

    @Override // com.kwad.sdk.widget.c
    public final void b(View view) {
        if (com.kwad.sdk.core.response.b.c.bZ(this.mAdTemplate)) {
            b(view, false);
        }
    }
}
