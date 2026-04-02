package com.kwad.components.ad.reward.m;

import android.app.DialogFragment;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.components.ad.reward.k;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class m extends d implements View.OnClickListener {
    private ImageView eZ;
    private TextView gS;
    private k.a qe;
    private ViewGroup zM;
    private View zN;
    private TextView zO;
    private TextView zP;
    private TextView zQ;
    private View zR;
    private DialogFragment zu;
    private View zx;

    public m(DialogFragment dialogFragment, AdTemplate adTemplate, LayoutInflater layoutInflater, ViewGroup viewGroup, k.a aVar) {
        this.zu = dialogFragment;
        this.qe = aVar;
        if (com.kwad.sdk.core.response.b.a.cw(com.kwad.sdk.core.response.b.d.ck(adTemplate))) {
            this.zM = (ViewGroup) layoutInflater.inflate(R.layout.ksad_live_origin_dialog, viewGroup, false);
            s(true);
            return;
        }
        this.zM = (ViewGroup) layoutInflater.inflate(R.layout.ksad_live_subscribe_dialog, viewGroup, false);
        s(false);
    }

    private void s(boolean z) {
        this.zN = this.zM.findViewById(R.id.ksad_live_subscribe_dialog_btn_close);
        this.gS = (TextView) this.zM.findViewById(R.id.ksad_live_subscribe_dialog_title);
        this.eZ = (ImageView) this.zM.findViewById(R.id.ksad_live_subscribe_dialog_icon);
        this.zP = (TextView) this.zM.findViewById(R.id.ksad_live_subscribe_dialog_content_txt);
        this.zO = (TextView) this.zM.findViewById(R.id.ksad_live_subscribe_dialog_content);
        this.zx = this.zM.findViewById(R.id.ksad_live_subscribe_dialog_btn_continue);
        this.zR = this.zM.findViewById(R.id.ksad_live_subscribe_dialog_btn_deny);
        this.zQ = (TextView) this.zM.findViewById(R.id.ksad_live_subscribe_dialog_vide_detail);
        if (z) {
            this.zN.setVisibility(8);
        }
        this.zN.setOnClickListener(this);
        this.zx.setOnClickListener(this);
        this.zR.setOnClickListener(this);
        this.zQ.setOnClickListener(this);
    }

    public final void a(k.c cVar) {
        KSImageLoader.loadCircleIcon(this.eZ, cVar.gw(), this.zM.getContext().getResources().getDrawable(R.drawable.ksad_ic_default_user_avatar));
        String title = cVar.getTitle();
        if (this.gS != null && title != null) {
            SpannableString spannableString = new SpannableString(title);
            int color = gS().getResources().getColor(R.color.ksad_reward_main_color);
            spannableString.setSpan(new ForegroundColorSpan(color), "再看%s秒，可获得奖励".indexOf("再看") + 2, "再看%s秒，可获得奖励".indexOf("秒"), 18);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color);
            int length = title.length();
            spannableString.setSpan(foregroundColorSpan, length - 2, length, 18);
            this.gS.setText(spannableString);
        }
        this.zO.setText(cVar.gx());
        this.zP.setText(cVar.gy());
        this.zQ.setText(String.format("%s", cVar.qn));
    }

    @Override // com.kwad.components.ad.reward.m.d
    public final ViewGroup gS() {
        return this.zM;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k.a aVar;
        if (view.equals(this.zN)) {
            this.zu.dismiss();
            k.a aVar2 = this.qe;
            if (aVar2 != null) {
                aVar2.gr();
            }
        } else if (view.equals(this.zx)) {
            this.zu.dismiss();
            k.a aVar3 = this.qe;
            if (aVar3 != null) {
                aVar3.gr();
            }
        } else if (!view.equals(this.zR)) {
            if (!view.equals(this.zQ) || (aVar = this.qe) == null) {
                return;
            }
            aVar.g(131, 2);
        } else {
            this.zu.dismiss();
            k.a aVar4 = this.qe;
            if (aVar4 != null) {
                aVar4.G(false);
            }
        }
    }
}
