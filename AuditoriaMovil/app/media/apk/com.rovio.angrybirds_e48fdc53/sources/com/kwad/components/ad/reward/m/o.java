package com.kwad.components.ad.reward.m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kwad.components.ad.reward.widget.KsAuthorIconView;
import com.kwad.components.core.widget.KsLogoView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.ai;
/* loaded from: classes.dex */
public final class o extends s implements View.OnClickListener {
    private KsLogoView Ad;
    private KsLogoView Ae;
    private KsAuthorIconView Af;
    private RelativeLayout Ag;
    private String Ai;
    private TextView lG;
    private com.kwad.components.ad.reward.j qB;
    private TextView zD;
    private TextView zE;
    private boolean Ah = false;
    private Runnable Aj = new Runnable() { // from class: com.kwad.components.ad.reward.m.o.2
        @Override // java.lang.Runnable
        public final void run() {
            try {
                com.kwad.sdk.d.a.a.a(o.this.lG, o.this.Ai, KsLogoView.a(o.this.Ad));
            } catch (Exception e) {
                com.kwad.sdk.core.e.c.printStackTraceOnly(e);
                o.this.lG.setText(o.this.Ai);
                o.this.lG.setVisibility(0);
            }
        }
    };

    public o(com.kwad.components.ad.reward.j jVar) {
        this.qB = jVar;
    }

    private void b(AdTemplate adTemplate) {
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        this.zD.setText(com.kwad.sdk.core.response.b.a.bO(ck));
        com.kwad.components.core.widget.e eVar = new com.kwad.components.core.widget.e();
        this.Af.setVisibility(0);
        this.Af.b(adTemplate);
        this.Af.a(eVar);
        this.zE.setText(com.kwad.sdk.core.response.b.a.aw(ck));
        if (com.kwad.sdk.core.response.b.a.aX(ck) == 8) {
            this.Ae.setVisibility(0);
            this.Ae.ad(adTemplate);
            this.lG.setText(com.kwad.sdk.core.response.b.a.an(ck));
            return;
        }
        this.Ai = com.kwad.sdk.core.response.b.a.an(ck);
        KsLogoView ksLogoView = new KsLogoView(this.sA.getContext(), false);
        this.Ad = ksLogoView;
        ksLogoView.setLogoLoadFinishListener(new KsLogoView.a() { // from class: com.kwad.components.ad.reward.m.o.1
            @Override // com.kwad.components.core.widget.KsLogoView.a
            public final void kj() {
                o.this.lG.post(o.this.Aj);
            }
        });
        this.Ad.ad(adTemplate);
        this.Ae.setVisibility(8);
    }

    private static void h(View view, int i) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 85;
            layoutParams2.bottomMargin = com.kwad.sdk.d.a.a.a(view.getContext(), 20.0f);
            view.requestLayout();
        }
    }

    private void initView() {
        if (this.sA == null) {
            return;
        }
        this.Af = (KsAuthorIconView) this.sA.findViewById(R.id.ksad_live_author_icon);
        this.zD = (TextView) this.sA.findViewById(R.id.kwad_actionbar_title);
        this.lG = (TextView) this.sA.findViewById(R.id.kwad_actionbar_des_text);
        this.zE = (TextView) this.sA.findViewById(R.id.ksad_live_actionbar_btn);
        this.Ae = (KsLogoView) this.sA.findViewById(R.id.ksad_reward_live_kwai_logo);
        if (!this.Ah) {
            this.Ag = (RelativeLayout) this.sA.findViewById(R.id.ksad_reward_origin_live_relative);
        }
        this.sA.setOnClickListener(this);
        this.zE.setOnClickListener(this);
        this.Af.setOnClickListener(this);
        this.lG.setOnClickListener(this);
        this.zD.setOnClickListener(this);
    }

    public final void a(ViewGroup viewGroup, int i) {
        boolean z;
        if (i == 8) {
            super.a(viewGroup, R.id.ksad_reward_origin_live_shop_stub, R.id.ksad_reward_origin_live_root);
            z = true;
        } else {
            super.a(viewGroup, R.id.ksad_reward_origin_live_base_stub, R.id.ksad_reward_origin_live_root);
            z = false;
        }
        this.Ah = z;
        initView();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.components.ad.reward.m.d
    public final void a(r rVar) {
        super.a(rVar);
        b(rVar.getAdTemplate());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.components.ad.reward.m.d
    public final void ac(boolean z) {
        super.ac(z);
        Context context = this.sA.getContext();
        if (ai.IK()) {
            return;
        }
        if (this.Ah) {
            ViewGroup.LayoutParams layoutParams = this.sA.getLayoutParams();
            layoutParams.width = context.getResources().getDimensionPixelSize(R.dimen.ksad_live_subscribe_card_width_horizontal);
            this.sA.setLayoutParams(layoutParams);
            h(this.sA, 85);
            return;
        }
        this.sA.findViewById(R.id.ksad_reward_origin_live_base1).setVisibility(0);
        ViewGroup.LayoutParams layoutParams2 = this.Ag.getLayoutParams();
        layoutParams2.width = context.getResources().getDimensionPixelSize(R.dimen.ksad_live_subscribe_card_width_horizontal);
        this.Ag.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.zE.getLayoutParams();
        layoutParams3.width = context.getResources().getDimensionPixelSize(R.dimen.ksad_live_subscribe_card_width_horizontal);
        this.zE.setLayoutParams(layoutParams3);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.kwad.components.ad.reward.j jVar;
        Context context;
        int i;
        if (view.equals(this.zE)) {
            jVar = this.qB;
            context = view.getContext();
            i = 29;
        } else if (view.equals(this.Af)) {
            jVar = this.qB;
            context = view.getContext();
            i = 30;
        } else if (view.equals(this.lG)) {
            jVar = this.qB;
            context = view.getContext();
            i = 32;
        } else if (!view.equals(this.zD)) {
            if (view.equals(this.sA)) {
                this.qB.a(1, view.getContext(), 53, 2);
                return;
            }
            return;
        } else {
            jVar = this.qB;
            context = view.getContext();
            i = 31;
        }
        jVar.a(1, context, i, 1);
    }
}
