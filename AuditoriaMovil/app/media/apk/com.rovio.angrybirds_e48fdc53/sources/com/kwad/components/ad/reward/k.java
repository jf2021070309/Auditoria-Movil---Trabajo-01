package com.kwad.components.ad.reward;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.appevents.AppEventsConstants;
import com.kwad.components.ad.reward.widget.RewardTaskStepView;
import com.kwad.components.core.widget.KSCornerImageView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import com.kwad.sdk.core.response.model.AdProductInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.t;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class k extends com.kwad.components.core.o.g {
    private static String qf = "进阶奖励还差 %s 步到手，\n确认放弃吗？";
    private static String qg = "再观看%ss可获得基础奖励，\n确认放弃吗？";
    private AdTemplate mAdTemplate;
    private a qe;

    /* loaded from: classes.dex */
    public interface a extends com.kwad.components.core.webview.b.e.c {
        void g(int i, int i2);

        void gp();
    }

    /* loaded from: classes.dex */
    public static class b implements a {
        @Override // com.kwad.components.core.webview.b.e.c
        public void G(boolean z) {
        }

        @Override // com.kwad.components.ad.reward.k.a
        public void g(int i, int i2) {
        }

        @Override // com.kwad.components.core.webview.b.e.c
        public void gi() {
        }

        @Override // com.kwad.components.ad.reward.k.a
        public void gp() {
        }

        @Override // com.kwad.components.core.webview.b.e.c
        public void gq() {
        }

        @Override // com.kwad.components.core.webview.b.e.c
        public void gr() {
        }
    }

    /* loaded from: classes.dex */
    public static class c extends com.kwad.sdk.core.response.a.a {
        public com.kwad.components.ad.reward.k.b.a pE;
        public com.kwad.components.ad.reward.k.a.a pF;
        public String ql;
        public String qm;
        public String qn;
        public String qo;
        public String qp;
        public String qq;
        public String qr;
        public String qs;
        public int style;
        public String title;

        private c() {
        }

        static c I(String str) {
            c cVar = new c();
            cVar.style = 0;
            cVar.title = str;
            cVar.ql = "关闭广告";
            cVar.qm = "继续观看";
            return cVar;
        }

        public static c J(String str) {
            c cVar = new c();
            cVar.style = 0;
            cVar.title = str;
            cVar.ql = "奖励不要了";
            cVar.qm = "返回";
            return cVar;
        }

        public static c K(String str) {
            c cVar = new c();
            try {
                cVar.parseJson(new JSONObject(str));
            } catch (JSONException e) {
            }
            return cVar;
        }

        private void L(String str) {
            this.qs = str;
        }

        static c a(com.kwad.components.ad.reward.k.a.a aVar, AdTemplate adTemplate, String str) {
            c cVar = new c();
            cVar.style = 2;
            cVar.pF = aVar;
            cVar.qo = str;
            cVar.qp = com.kwad.sdk.core.response.b.a.bQ(com.kwad.sdk.core.response.b.d.ck(adTemplate));
            return cVar;
        }

        static c a(com.kwad.components.ad.reward.k.b.a aVar, AdTemplate adTemplate, String str) {
            c cVar = new c();
            cVar.style = 1;
            cVar.pE = aVar;
            cVar.qo = str;
            cVar.qp = com.kwad.sdk.core.response.b.a.bQ(com.kwad.sdk.core.response.b.d.ck(adTemplate));
            return cVar;
        }

        public static c a(AdInfo adInfo, long j) {
            c cVar = new c();
            cVar.style = 5;
            AdProductInfo cy = com.kwad.sdk.core.response.b.a.cy(adInfo);
            cVar.qq = com.kwad.sdk.core.response.b.a.an(adInfo);
            String name = cy.getName();
            cVar.title = name;
            if (TextUtils.isEmpty(name)) {
                cVar.title = com.kwad.sdk.core.response.b.a.ap(adInfo);
            }
            cVar.qp = cy.getIcon();
            cVar.L(j > 0 ? String.valueOf(j) : null);
            return cVar;
        }

        static c b(AdTemplate adTemplate, long j) {
            AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
            c cVar = new c();
            cVar.style = 8;
            cVar.qp = com.kwad.sdk.core.response.b.a.bQ(ck);
            cVar.title = String.format("再看%s秒，可获得奖励", Long.valueOf(j));
            cVar.qq = com.kwad.sdk.core.response.b.a.bO(ck);
            cVar.qr = com.kwad.sdk.core.response.b.a.an(ck);
            cVar.ql = "放弃奖励";
            cVar.qm = "继续观看";
            cVar.qn = com.kwad.sdk.core.response.b.a.aw(com.kwad.sdk.core.response.b.d.ck(adTemplate));
            return cVar;
        }

        static c c(AdTemplate adTemplate, long j) {
            AdMatrixInfo.MerchantLiveReservationInfo bP = com.kwad.sdk.core.response.b.b.bP(adTemplate);
            c cVar = new c();
            cVar.style = 8;
            cVar.qp = bP.userHeadUrl;
            cVar.title = String.format("再看%s秒，可获得奖励", Long.valueOf(j));
            cVar.qq = bP.title;
            cVar.ql = "放弃奖励";
            cVar.qm = "继续观看";
            cVar.qn = com.kwad.sdk.core.response.b.a.aw(com.kwad.sdk.core.response.b.d.ck(adTemplate));
            return cVar;
        }

        static c h(AdInfo adInfo) {
            c cVar = new c();
            cVar.style = 4;
            AdProductInfo cy = com.kwad.sdk.core.response.b.a.cy(adInfo);
            cVar.title = com.kwad.sdk.core.response.b.a.an(adInfo);
            cVar.qp = cy.getIcon();
            return cVar;
        }

        static c i(long j) {
            c cVar = new c();
            cVar.style = 6;
            cVar.ql = "残忍离开";
            cVar.qm = "留下看看";
            cVar.L(j > 0 ? String.valueOf(j) : null);
            return cVar;
        }

        @Override // com.kwad.sdk.core.response.a.a
        public void afterParseJson(JSONObject jSONObject) {
            super.afterParseJson(jSONObject);
            JSONObject optJSONObject = jSONObject.optJSONObject("mLaunchAppTask");
            if (optJSONObject != null) {
                if (this.pE == null) {
                    this.pE = new com.kwad.components.ad.reward.k.b.a();
                }
                this.pE.parseJson(optJSONObject);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("mLandPageOpenTask");
            if (optJSONObject2 != null) {
                if (this.pF == null) {
                    this.pF = new com.kwad.components.ad.reward.k.a.a();
                }
                this.pF.parseJson(optJSONObject2);
            }
        }

        @Override // com.kwad.sdk.core.response.a.a
        public void afterToJson(JSONObject jSONObject) {
            super.afterToJson(jSONObject);
            com.kwad.components.ad.reward.k.b.a aVar = this.pE;
            if (aVar != null) {
                t.a(jSONObject, "mLaunchAppTask", aVar);
            }
            com.kwad.components.ad.reward.k.a.a aVar2 = this.pF;
            if (aVar2 != null) {
                t.a(jSONObject, "mLandPageOpenTask", aVar2);
            }
        }

        public final int getStyle() {
            return this.style;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String gs() {
            return TextUtils.isEmpty(this.ql) ? "关闭广告" : this.ql;
        }

        public final String gt() {
            return TextUtils.isEmpty(this.qm) ? "继续观看" : this.qm;
        }

        public final com.kwad.components.ad.reward.k.b.a gu() {
            return this.pE;
        }

        public final com.kwad.components.ad.reward.k.a.a gv() {
            return this.pF;
        }

        public final String gw() {
            return this.qp;
        }

        public final String gx() {
            return this.qq;
        }

        public final String gy() {
            return this.qr;
        }

        public final String gz() {
            return TextUtils.isEmpty(this.qs) ? "" : String.format("再看%s秒，可获得优惠", this.qs);
        }
    }

    public static c H(String str) {
        return c.J(str);
    }

    private static View a(final DialogFragment dialogFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, c cVar, final a aVar) {
        View inflate = layoutInflater.inflate(R.layout.ksad_video_close_dialog, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.ksad_title)).setText(cVar.getTitle());
        TextView textView = (TextView) inflate.findViewById(R.id.ksad_close_btn);
        TextView textView2 = (TextView) inflate.findViewById(R.id.ksad_continue_btn);
        textView.setText(cVar.gs());
        textView2.setText(cVar.gt());
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.reward.k.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogFragment.dismiss();
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.G(false);
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.reward.k.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogFragment.dismiss();
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.gr();
                }
            }
        });
        return inflate;
    }

    private static View a(DialogFragment dialogFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, c cVar, AdTemplate adTemplate, a aVar) {
        return a(cVar.gu(), dialogFragment, layoutInflater, viewGroup, cVar, adTemplate, aVar);
    }

    private static View a(com.kwad.components.ad.reward.k.a aVar, final DialogFragment dialogFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, c cVar, AdTemplate adTemplate, final a aVar2) {
        View inflate = layoutInflater.inflate(R.layout.ksad_reward_task_launch_app_dialog, viewGroup, false);
        if (aVar instanceof com.kwad.components.ad.reward.k.b.a) {
            com.kwad.components.ad.reward.k.b.a.a((com.kwad.components.ad.reward.k.b.a) aVar, inflate.getContext(), adTemplate);
        }
        ((RewardTaskStepView) inflate.findViewById(R.id.ksad_reward_task_dialog_steps)).a(aVar.jy(), cVar.qo);
        KSImageLoader.loadAppIcon((ImageView) inflate.findViewById(R.id.ksad_reward_task_dialog_icon), cVar.gw(), adTemplate, 12);
        TextView textView = (TextView) inflate.findViewById(R.id.ksad_reward_task_dialog_abandon);
        TextView textView2 = (TextView) inflate.findViewById(R.id.ksad_reward_task_dialog_continue);
        TextView textView3 = (TextView) inflate.findViewById(R.id.ksad_reward_task_dialog_title);
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.jz());
        String sb2 = sb.toString();
        String str = cVar.qo;
        boolean equals = AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(str);
        String format = equals ? String.format(qf, sb2) : String.format(qg, str);
        int indexOf = equals ? format.indexOf(sb2) : format.indexOf(str);
        if (indexOf < 0) {
            textView3.setText(format);
        } else {
            int i = equals ? indexOf + 1 : str.length() > 1 ? indexOf + 3 : indexOf + 2;
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(inflate.getContext().getResources().getColor(R.color.ksad_reward_main_color));
            SpannableString spannableString = new SpannableString(format);
            spannableString.setSpan(foregroundColorSpan, indexOf, i, 17);
            textView3.setText(spannableString);
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.reward.k.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogFragment.dismiss();
                a aVar3 = aVar2;
                if (aVar3 != null) {
                    aVar3.G(false);
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.reward.k.8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogFragment.dismiss();
                a aVar3 = aVar2;
                if (aVar3 != null) {
                    aVar3.gr();
                }
            }
        });
        return inflate;
    }

    private View a(final k kVar, LayoutInflater layoutInflater, ViewGroup viewGroup, c cVar, final a aVar) {
        View inflate = layoutInflater.inflate(R.layout.ksad_video_close_extend_dialog, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.ksad_reward_close_extend_dialog_play_time_tips)).setText(e(inflate.getContext(), cVar.qs));
        TextView textView = (TextView) inflate.findViewById(R.id.ksad_reward_close_extend_dialog_btn_deny);
        TextView textView2 = (TextView) inflate.findViewById(R.id.ksad_reward_close_extend_dialog_btn_continue);
        textView.setText(cVar.gs());
        textView2.setText(cVar.gt());
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.reward.k.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kVar.dismiss();
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.G(false);
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.reward.k.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kVar.dismiss();
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.gr();
                }
            }
        });
        return inflate;
    }

    public static c a(j jVar, String str) {
        int i;
        AdTemplate adTemplate = jVar.mAdTemplate;
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        com.kwad.components.ad.reward.k.b.a aVar = jVar.pE;
        com.kwad.components.ad.reward.k.a.a aVar2 = jVar.pF;
        int i2 = jVar.pG;
        boolean f = com.kwad.sdk.core.response.b.d.f(adTemplate, com.kwad.components.ad.reward.a.b.k(com.kwad.sdk.core.response.b.d.ck(adTemplate)));
        int i3 = 0;
        if (f || com.kwad.sdk.core.response.b.d.u(adTemplate)) {
            int V = (int) com.kwad.sdk.core.response.b.a.V(ck);
            int G = com.kwad.sdk.core.response.b.a.G(ck);
            if (V > G) {
                V = G;
            }
            long playDuration = jVar.oZ.getPlayDuration();
            if (playDuration < (V * 1000) - 800 && (i = (int) (V - ((((float) playDuration) / 1000.0f) + 0.5f))) >= 0) {
                i3 = i;
            }
        }
        return (!f || aVar == null) ? (!com.kwad.sdk.core.response.b.d.u(adTemplate) || aVar2 == null) ? com.kwad.components.ad.reward.a.b.i(ck) ? c.h(ck) : (com.kwad.sdk.core.response.b.a.bN(ck) == 1 && com.kwad.components.ad.reward.a.b.gO() == 1) ? c.a(ck, i2) : com.kwad.sdk.core.response.b.a.bK(ck) ? c.J(str) : com.kwad.sdk.core.response.b.a.cw(ck) ? c.b(adTemplate, i2) : com.kwad.sdk.core.response.b.a.aR(adTemplate) ? c.c(adTemplate, i2) : com.kwad.components.ad.reward.a.b.gI() == 1 ? c.i(i2) : c.I(str) : c.a(aVar2, adTemplate, String.valueOf(i3)) : c.a(aVar, adTemplate, String.valueOf(i3));
    }

    public static k a(Activity activity, AdTemplate adTemplate, c cVar, a aVar) {
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putString("key_params_json", cVar.toJson().toString());
        bundle.putString("key_template_json", adTemplate.toJson().toString());
        kVar.setArguments(bundle);
        kVar.a(aVar);
        kVar.show(activity.getFragmentManager(), "videoCloseDialog");
        return kVar;
    }

    private void a(a aVar) {
        this.qe = aVar;
    }

    private static View b(DialogFragment dialogFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, c cVar, AdTemplate adTemplate, a aVar) {
        return a(cVar.gv(), dialogFragment, layoutInflater, viewGroup, cVar, adTemplate, aVar);
    }

    private static View c(final DialogFragment dialogFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, c cVar, AdTemplate adTemplate, final a aVar) {
        View inflate = layoutInflater.inflate(R.layout.ksad_reward_order_dialog, viewGroup, false);
        KSImageLoader.loadImage((KSCornerImageView) inflate.findViewById(R.id.ksad_reward_order_dialog_icon), cVar.qp, adTemplate);
        ((TextView) inflate.findViewById(R.id.ksad_reward_order_dialog_desc)).setText(cVar.getTitle());
        inflate.findViewById(R.id.ksad_reward_order_dialog_btn_close).setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.reward.k.9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogFragment.dismiss();
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.gr();
                }
            }
        });
        inflate.findViewById(R.id.ksad_reward_order_dialog_btn_view_detail).setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.reward.k.10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar2 = a.this;
                if (aVar2 != null) {
                    aVar2.gp();
                }
            }
        });
        inflate.findViewById(R.id.ksad_reward_order_dialog_btn_deny).setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.reward.k.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialogFragment.dismiss();
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.G(false);
                }
            }
        });
        return inflate;
    }

    private static SpannableString e(Context context, String str) {
        SpannableString spannableString = new SpannableString("再看" + str + "秒，即可获得奖励");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(com.kwad.sdk.d.a.a.getColor(context, R.color.ksad_reward_main_color));
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(com.kwad.sdk.d.a.a.getColor(context, R.color.ksad_reward_main_color));
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableString.length();
        spannableString.setSpan(foregroundColorSpan, 2, length - 7, 34);
        spannableString.setSpan(foregroundColorSpan2, length - 2, length, 34);
        spannableString.setSpan(styleSpan, 0, length, 34);
        return spannableString;
    }

    @Override // com.kwad.components.core.o.g
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View a2;
        Bundle arguments = getArguments();
        String string = arguments.getString("key_params_json");
        try {
            String string2 = arguments.getString("key_template_json");
            AdTemplate adTemplate = new AdTemplate();
            this.mAdTemplate = adTemplate;
            adTemplate.parseJson(new JSONObject(string2));
        } catch (Throwable th) {
        }
        c K = c.K(string);
        int style = K.getStyle();
        if (style == 1) {
            a2 = a(this, layoutInflater, viewGroup, K, this.mAdTemplate, this.qe);
        } else if (style == 2) {
            a2 = b(this, layoutInflater, viewGroup, K, this.mAdTemplate, this.qe);
        } else if (style == 4) {
            a2 = c(this, layoutInflater, viewGroup, K, this.mAdTemplate, this.qe);
            com.kwad.components.core.t.g.a(new com.kwad.components.core.widget.e(), (ViewGroup) a2);
        } else if (style == 5) {
            com.kwad.components.ad.reward.m.j jVar = new com.kwad.components.ad.reward.m.j(this, this.mAdTemplate, layoutInflater, viewGroup, this.qe);
            jVar.a(K);
            a2 = jVar.gS();
        } else if (style == 6) {
            a2 = a(this, layoutInflater, viewGroup, K, this.qe);
        } else if (style != 8) {
            a2 = a((DialogFragment) this, layoutInflater, viewGroup, K, this.qe);
        } else {
            com.kwad.components.ad.reward.m.m mVar = new com.kwad.components.ad.reward.m.m(this, this.mAdTemplate, layoutInflater, viewGroup, this.qe);
            mVar.a(K);
            a2 = mVar.gS();
        }
        getDialog().setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.kwad.components.ad.reward.k.1
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return i == 4 && keyEvent.getAction() == 0;
            }
        });
        return a2;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Window window = getDialog().getWindow();
        if (window == null) {
            return;
        }
        getDialog().setCanceledOnTouchOutside(false);
        window.setLayout(-1, -1);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        a aVar = this.qe;
        if (aVar != null) {
            aVar.gi();
        }
    }
}
