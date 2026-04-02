package com.kwad.components.ad.reward.m;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.kwad.components.ad.widget.KsPriceView;
import com.kwad.components.core.widget.KSCornerImageView;
import com.kwad.components.core.widget.KsStyledTextButton;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class k extends d implements com.kwad.sdk.widget.c {
    private TextView gS;
    private KSCornerImageView lF;
    private TextView lG;
    private com.kwad.components.ad.reward.j qB;
    private KsStyledTextButton zA;
    private KsStyledTextButton zB;
    private KsPriceView za;
    private TextView zd;
    private TextView ze;
    private View zf;
    private ViewStub zy;
    private ViewGroup zz;

    public k(com.kwad.components.ad.reward.j jVar, ViewGroup viewGroup) {
        this.zz = viewGroup;
        this.qB = jVar;
    }

    public k(com.kwad.components.ad.reward.j jVar, ViewStub viewStub) {
        this.zy = viewStub;
        this.qB = jVar;
    }

    private void a(AdTemplate adTemplate, com.kwad.components.ad.reward.model.a aVar) {
        KSImageLoader.loadAppIcon(this.lF, aVar.gw(), adTemplate, 8);
        this.gS.setText(aVar.getTitle());
        this.lG.setText(aVar.gx());
        int dimensionPixelSize = this.zz.getResources().getDimensionPixelSize(R.dimen.ksad_reward_jinniu_end_origin_text_size);
        this.za.getConfig().ag(dimensionPixelSize).ai(dimensionPixelSize).ah(this.zz.getResources().getColor(R.color.ksad_jinniu_end_origin_color));
        this.za.d(aVar.getPrice(), aVar.getOriginPrice(), true);
        String hh = aVar.hh();
        this.zf.setVisibility(TextUtils.isEmpty(hh) ? 8 : 0);
        if (hh != null) {
            this.zd.setText(hh);
        }
        this.ze.setText(aVar.hi());
    }

    private void d(View view, boolean z) {
        if (view.equals(this.zB)) {
            this.qB.a(2, view.getContext(), z ? 38 : 153, 1);
        } else if (view.equals(this.zA)) {
            this.qB.a(2, view.getContext(), z ? 37 : 153, 1);
        } else if (view.equals(this.zz)) {
            this.qB.a(2, view.getContext(), z ? 2 : 153, 2);
        }
    }

    @Override // com.kwad.sdk.widget.c
    public final void a(View view) {
        d(view, true);
    }

    @Override // com.kwad.components.ad.reward.m.d
    public final void a(r rVar) {
        super.a(rVar);
        a(rVar.getAdTemplate(), com.kwad.components.ad.reward.model.a.x(rVar.getAdTemplate()));
    }

    @Override // com.kwad.sdk.widget.c
    public final void b(View view) {
        if (com.kwad.sdk.core.response.b.c.bZ(this.qB.mAdTemplate)) {
            d(view, false);
        }
    }

    @Override // com.kwad.components.ad.reward.m.d
    public final ViewGroup gS() {
        return this.zz;
    }

    public final void hide() {
        ViewGroup viewGroup = this.zz;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }
}
