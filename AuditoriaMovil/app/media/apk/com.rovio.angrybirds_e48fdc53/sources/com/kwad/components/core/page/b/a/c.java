package com.kwad.components.core.page.b.a;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.appevents.AppEventsConstants;
import com.kwad.sdk.R;
import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
public final class c extends a {
    private LinearLayout Nj;
    private TextView Nk;
    private TextView Nl;
    private TextView Nm;
    private TextView Nn;
    private int No;
    private boolean counterPaused = false;
    private boolean Np = false;
    private Runnable Nq = new Runnable() { // from class: com.kwad.components.core.page.b.a.c.1
        @Override // java.lang.Runnable
        public final void run() {
            if (c.this.counterPaused) {
                bj.runOnUiThreadDelay(this, 500L);
                return;
            }
            if (c.this.No <= 0) {
                c.this.Nk.setText("任务已完成");
                c.this.Nl.setVisibility(8);
                c.this.Nm.setVisibility(8);
                c.this.Nn.setVisibility(8);
                com.kwad.components.ad.b.g gVar = (com.kwad.components.ad.b.g) com.kwad.sdk.components.c.f(com.kwad.components.ad.b.g.class);
                if (gVar != null && !c.this.Np) {
                    gVar.notifyRewardVerify();
                }
            } else {
                c.this.oQ();
                bj.runOnUiThreadDelay(this, 1000L);
            }
            c.i(c.this);
        }
    };
    private final com.kwad.sdk.core.c.c xn = new com.kwad.sdk.core.c.d() { // from class: com.kwad.components.core.page.b.a.c.2
        @Override // com.kwad.sdk.core.c.d, com.kwad.sdk.core.c.c
        /* renamed from: onActivityPaused */
        public final void b(Activity activity) {
            super.b(activity);
            c.this.counterPaused = true;
        }

        @Override // com.kwad.sdk.core.c.d, com.kwad.sdk.core.c.c
        /* renamed from: onActivityResumed */
        public final void c(Activity activity) {
            super.c(activity);
            c.this.counterPaused = false;
        }
    };

    static /* synthetic */ int i(c cVar) {
        int i = cVar.No;
        cVar.No = i - 1;
        return i;
    }

    private void oP() {
        this.Nj.setVisibility(0);
        if (!this.Nc.mAdTemplate.mRewardVerifyCalled) {
            oQ();
            bj.runOnUiThreadDelay(this.Nq, 1000L);
            return;
        }
        this.Nk.setText("任务已完成");
        this.Nl.setVisibility(8);
        this.Nm.setVisibility(8);
        this.Nn.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oQ() {
        this.Nl.setText(oR());
        this.Nn.setText(oS());
    }

    private String oR() {
        int i = this.No / 60;
        StringBuilder sb = i >= 10 ? new StringBuilder() : new StringBuilder(AppEventsConstants.EVENT_PARAM_VALUE_NO);
        sb.append(i);
        return sb.toString();
    }

    private String oS() {
        int i = this.No % 60;
        StringBuilder sb = i >= 10 ? new StringBuilder() : new StringBuilder(AppEventsConstants.EVENT_PARAM_VALUE_NO);
        sb.append(i);
        return sb.toString();
    }

    @Override // com.kwad.components.core.page.b.a.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        com.kwad.sdk.core.c.b.AT();
        com.kwad.sdk.core.c.b.a(this.xn);
        this.No = com.kwad.sdk.core.config.d.zB();
        oP();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.Nj = (LinearLayout) findViewById(R.id.ksad_reward_land_page_open_tip);
        this.Nk = (TextView) findViewById(R.id.ksad_reward_land_page_open_desc);
        this.Nl = (TextView) findViewById(R.id.ksad_reward_land_page_open_minute);
        this.Nm = (TextView) findViewById(R.id.ksad_reward_land_page_open_colon);
        this.Nn = (TextView) findViewById(R.id.ksad_reward_land_page_open_second);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        com.kwad.sdk.core.c.b.AT();
        com.kwad.sdk.core.c.b.b(this.xn);
        bj.b(this.Nq);
    }
}
