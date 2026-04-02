package com.kwad.components.core.page.b.a;

import android.view.View;
import android.widget.TextView;
import com.kwad.sdk.R;
import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
public final class d extends a {
    private View Ns;
    private TextView Nt;
    private int Nu;
    private Runnable Nv = new Runnable() { // from class: com.kwad.components.core.page.b.a.d.1
        @Override // java.lang.Runnable
        public final void run() {
            if (com.kwad.components.core.r.a.pU().pX()) {
                bj.runOnUiThreadDelay(this, 500L);
            } else if (d.this.Nu <= 0) {
                d.this.Nt.setText("已获得权益");
                bj.runOnUiThreadDelay(new Runnable() { // from class: com.kwad.components.core.page.b.a.d.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.this.Ns.setVisibility(8);
                    }
                }, 500L);
                com.kwad.components.core.r.a.pU().aF(true);
            } else {
                d.this.Nt.setText(String.format("倒计时%d秒", Integer.valueOf(d.this.Nu)));
                d.c(d.this);
                com.kwad.components.core.r.a.pU().aG(d.this.Nu);
                bj.runOnUiThreadDelay(this, 1000L);
            }
        }
    };

    static /* synthetic */ int c(d dVar) {
        int i = dVar.Nu;
        dVar.Nu = i - 1;
        return i;
    }

    private void oT() {
        TextView textView;
        if (this.Ns == null || (textView = this.Nt) == null) {
            return;
        }
        textView.setText(String.format("倒计时%d秒", Integer.valueOf(this.Nu)));
        this.Ns.setVisibility(0);
        bj.runOnUiThreadDelay(this.Nv, 1000L);
    }

    @Override // com.kwad.components.core.page.b.a.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.Nu = com.kwad.sdk.core.response.b.a.aE(com.kwad.sdk.core.response.b.d.ck(this.Nc.mAdTemplate));
        com.kwad.components.core.r.a.pU().aG(this.Nu);
        oT();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        this.Ns = findViewById(R.id.ksad_web_reward_task_layout);
        this.Nt = (TextView) findViewById(R.id.ksad_web_reward_task_text);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        bj.b(this.Nv);
    }
}
