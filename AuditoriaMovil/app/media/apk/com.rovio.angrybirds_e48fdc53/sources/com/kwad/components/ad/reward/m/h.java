package com.kwad.components.ad.reward.m;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.components.ad.widget.KsAppTagsView;
import com.kwad.components.core.widget.KsConvertButton;
import com.kwad.components.core.widget.KsLogoView;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public class h extends s implements View.OnClickListener {
    protected KsLogoView mLogoView;
    protected KsAppTagsView yB;
    protected KsConvertButton yS;
    protected TextView yT;
    protected TextView yU;
    protected TextView yV;
    protected a yW;
    protected int yX = R.layout.ksad_reward_apk_info_card_tag_item;
    protected boolean yY = true;
    protected ImageView yx;

    /* loaded from: classes.dex */
    public interface a {
        void ii();

        void ij();

        void ik();

        void il();

        void im();

        void in();
    }

    private void T(int i) {
        KsConvertButton ksConvertButton = this.yS;
        if (ksConvertButton == null) {
            return;
        }
        if (i == 1) {
            ksConvertButton.getCornerConf().setAllCorner(true);
        } else if (i == 2) {
            ksConvertButton.getCornerConf().bS(false).bV(false).bU(true).bT(true);
        }
        this.yS.postInvalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.kwad.components.ad.reward.model.a r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r6.hn()
            r5.T(r0)
            com.kwad.components.core.widget.KsLogoView r0 = r5.mLogoView
            if (r0 == 0) goto L15
            com.kwad.sdk.core.response.model.AdTemplate r1 = r6.hj()
            r0.ad(r1)
        L15:
            android.widget.TextView r0 = r5.yT
            java.lang.String r1 = r6.getTitle()
            r0.setText(r1)
            android.widget.TextView r0 = r5.yU
            if (r0 == 0) goto L29
            java.lang.String r1 = r6.gx()
            r0.setText(r1)
        L29:
            android.widget.TextView r0 = r5.yV
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L59
            java.lang.String r3 = r6.gx()
            r0.setText(r3)
            java.lang.String r0 = r6.gx()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L44
            r0 = r2
            r3 = r0
            goto L4f
        L44:
            boolean r0 = r6.hm()
            if (r0 == 0) goto L4d
            r3 = r1
            r0 = r2
            goto L4f
        L4d:
            r0 = r1
            r3 = r2
        L4f:
            android.widget.TextView r4 = r5.yU
            if (r4 == 0) goto L56
            r4.setVisibility(r0)
        L56:
            android.widget.TextView r0 = r5.yV
            goto L6a
        L59:
            android.widget.TextView r0 = r5.yU
            if (r0 == 0) goto L6d
            java.lang.String r3 = r6.gx()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L69
            r3 = r2
            goto L6a
        L69:
            r3 = r1
        L6a:
            r0.setVisibility(r3)
        L6d:
            com.kwad.components.ad.widget.KsAppTagsView r0 = r5.yB
            if (r0 == 0) goto L86
            java.util.List r3 = r6.hl()
            int r4 = r5.yX
            r0.a(r3, r4)
            com.kwad.components.ad.widget.KsAppTagsView r0 = r5.yB
            boolean r3 = r6.hm()
            if (r3 == 0) goto L83
            r1 = r2
        L83:
            r0.setVisibility(r1)
        L86:
            com.kwad.components.core.widget.KsConvertButton r0 = r5.yS
            if (r0 == 0) goto L95
            com.kwad.components.core.e.d.c r1 = r6.hk()
            com.kwad.sdk.core.response.model.AdTemplate r2 = r6.hj()
            r0.a(r1, r2)
        L95:
            android.widget.ImageView r0 = r5.yx
            java.lang.String r1 = r6.gw()
            com.kwad.sdk.core.response.model.AdTemplate r6 = r6.hj()
            r2 = 12
            com.kwad.sdk.core.imageloader.KSImageLoader.loadAppIcon(r0, r1, r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.components.ad.reward.m.h.a(com.kwad.components.ad.reward.model.a):void");
    }

    private void g(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        this.mLogoView = (KsLogoView) viewGroup.findViewById(R.id.ksad_common_app_logo);
        this.yx = (ImageView) viewGroup.findViewById(R.id.ksad_common_app_icon);
        this.yT = (TextView) viewGroup.findViewById(R.id.ksad_common_app_name);
        this.yB = (KsAppTagsView) viewGroup.findViewById(R.id.ksad_common_app_tags);
        this.yU = (TextView) viewGroup.findViewById(R.id.ksad_common_app_desc);
        this.yV = (TextView) viewGroup.findViewById(R.id.ksad_common_app_desc2);
        this.yS = (KsConvertButton) viewGroup.findViewById(R.id.ksad_common_app_action);
    }

    private static int kb() {
        return R.id.ksad_common_app_card_root;
    }

    public final void a(a aVar) {
        this.yW = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.components.ad.reward.m.d
    public final void a(r rVar) {
        super.a(rVar);
        a(com.kwad.components.ad.reward.model.a.a(rVar, this.yY));
    }

    public final void f(ViewGroup viewGroup) {
        super.a(viewGroup, ih(), kb());
        g(this.sA);
        if (this.sA != null) {
            this.sA.setOnClickListener(this);
            this.yS.setOnClickListener(this);
            this.yx.setOnClickListener(this);
            this.yT.setOnClickListener(this);
            TextView textView = this.yU;
            if (textView != null) {
                textView.setOnClickListener(this);
            }
            TextView textView2 = this.yV;
            if (textView2 != null) {
                textView2.setOnClickListener(this);
            }
            KsAppTagsView ksAppTagsView = this.yB;
            if (ksAppTagsView != null) {
                ksAppTagsView.setOnClickListener(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int ih() {
        return R.id.ksad_common_app_card_stub;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar;
        if (view.equals(this.yS)) {
            a aVar2 = this.yW;
            if (aVar2 != null) {
                aVar2.ii();
            }
        } else if (view.equals(this.yx)) {
            a aVar3 = this.yW;
            if (aVar3 != null) {
                aVar3.ij();
            }
        } else if (view.equals(this.yT)) {
            a aVar4 = this.yW;
            if (aVar4 != null) {
                aVar4.ik();
            }
        } else if (view.equals(this.yU) || view.equals(this.yV)) {
            a aVar5 = this.yW;
            if (aVar5 != null) {
                aVar5.il();
            }
        } else if (view.equals(this.yB)) {
            a aVar6 = this.yW;
            if (aVar6 != null) {
                aVar6.im();
            }
        } else if (!view.equals(this.sA) || (aVar = this.yW) == null) {
        } else {
            aVar.in();
        }
    }

    public final void show() {
        if (this.sA != null) {
            this.sA.setVisibility(0);
        }
    }
}
