package com.kwad.components.ad.reward.m;

import android.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kwad.components.ad.reward.k;
import com.kwad.components.core.widget.KSCornerImageView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class j extends d implements View.OnClickListener {
    private AdTemplate adTemplate;
    private TextView gS;
    private KSCornerImageView lF;
    private TextView lG;
    private TextView lH;
    private k.a qe;
    private ViewGroup sA;
    private View vr;
    private DialogFragment zu;
    private TextView zv;
    private View zw;
    private View zx;

    public j(DialogFragment dialogFragment, AdTemplate adTemplate, LayoutInflater layoutInflater, ViewGroup viewGroup, k.a aVar) {
        this.zu = dialogFragment;
        this.adTemplate = adTemplate;
        this.qe = aVar;
        this.sA = (ViewGroup) layoutInflater.inflate(R.layout.ksad_reward_jinniu_dialog, viewGroup, false);
        initView();
    }

    private void initView() {
        this.lF = (KSCornerImageView) this.sA.findViewById(R.id.ksad_reward_jinniu_dialog_icon);
        this.gS = (TextView) this.sA.findViewById(R.id.ksad_reward_jinniu_dialog_title);
        this.lG = (TextView) this.sA.findViewById(R.id.ksad_reward_jinniu_dialog_desc);
        this.zv = (TextView) this.sA.findViewById(R.id.ksad_reward_jinniu_dialog_play_time_tips);
        this.lH = (TextView) this.sA.findViewById(R.id.ksad_reward_jinniu_dialog_detail);
        this.vr = this.sA.findViewById(R.id.ksad_reward_jinniu_dialog_btn_close);
        this.zw = this.sA.findViewById(R.id.ksad_reward_jinniu_dialog_btn_deny);
        this.zx = this.sA.findViewById(R.id.ksad_reward_jinniu_dialog_btn_continue);
        this.vr.setOnClickListener(this);
        this.zw.setOnClickListener(this);
        this.zx.setOnClickListener(this);
        this.lF.setOnClickListener(this);
        this.gS.setOnClickListener(this);
        this.lG.setOnClickListener(this);
        this.lH.setOnClickListener(this);
    }

    public final void a(k.c cVar) {
        KSImageLoader.loadAppIcon(this.lF, cVar.gw(), this.adTemplate, 4);
        this.gS.setText(cVar.getTitle());
        this.lG.setText(cVar.gx());
        this.zv.setText(cVar.gz());
        if (com.kwad.sdk.core.response.b.a.aR(this.adTemplate)) {
            this.lH.setText(String.format("%s >", com.kwad.sdk.core.response.b.a.aw(com.kwad.sdk.core.response.b.d.ck(this.adTemplate))));
        }
    }

    @Override // com.kwad.components.ad.reward.m.d
    public final ViewGroup gS() {
        return this.sA;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k.a aVar;
        if (view.equals(this.vr)) {
            this.zu.dismiss();
            k.a aVar2 = this.qe;
            if (aVar2 != null) {
                aVar2.gr();
            }
        } else if (view.equals(this.zw)) {
            this.zu.dismiss();
            k.a aVar3 = this.qe;
            if (aVar3 != null) {
                aVar3.G(false);
            }
        } else if (view.equals(this.zx)) {
            this.zu.dismiss();
            k.a aVar4 = this.qe;
            if (aVar4 != null) {
                aVar4.gr();
            }
        } else if (view.equals(this.lF)) {
            k.a aVar5 = this.qe;
            if (aVar5 != null) {
                aVar5.g(127, 2);
            }
        } else if (view.equals(this.gS)) {
            k.a aVar6 = this.qe;
            if (aVar6 != null) {
                aVar6.g(128, 2);
            }
        } else if (view.equals(this.lG)) {
            k.a aVar7 = this.qe;
            if (aVar7 != null) {
                aVar7.g(129, 2);
            }
        } else if (!view.equals(this.lH) || (aVar = this.qe) == null) {
        } else {
            aVar.g(131, 2);
        }
    }
}
