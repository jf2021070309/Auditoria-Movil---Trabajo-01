package com.kwad.components.ad.interstitial.f;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.kwad.components.core.widget.KSCornerImageView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.report.j;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.core.o.g implements View.OnClickListener {
    private static boolean lK;
    private TextView gS;
    private com.kwad.components.ad.interstitial.d.c jh;
    private KSCornerImageView lF;
    private TextView lG;
    private TextView lH;
    private TextView lI;
    private TextView lJ;
    private AdTemplate mAdTemplate;

    public static void d(com.kwad.components.ad.interstitial.d.c cVar) {
        if (lK) {
            return;
        }
        lK = true;
        b bVar = new b();
        Bundle bundle = new Bundle();
        bundle.putString("KEY_TEMPLATE", cVar.mAdTemplate.toJson().toString());
        bVar.setArguments(bundle);
        bVar.e(cVar);
        bVar.show(cVar.hI.getOwnerActivity().getFragmentManager(), "interstitialCloseDialog");
    }

    private void e(com.kwad.components.ad.interstitial.d.c cVar) {
        this.jh = cVar;
    }

    private void i(View view) {
        this.lF = (KSCornerImageView) view.findViewById(R.id.ksad_interstitial_intercept_app_icon);
        this.gS = (TextView) view.findViewById(R.id.ksad_interstitial_intercept_app_title);
        this.lG = (TextView) view.findViewById(R.id.ksad_interstitial_intercept_dialog_desc);
        this.lH = (TextView) view.findViewById(R.id.ksad_interstitial_intercept_dialog_detail);
        this.lI = (TextView) view.findViewById(R.id.ksad_interstitial_intercept_dialog_btn_continue);
        TextView textView = (TextView) view.findViewById(R.id.ksad_interstitial_intercept_dialog_btn_deny);
        this.lJ = textView;
        com.kwad.sdk.d.a.a.a(this, this.lF, this.gS, this.lG, this.lH, this.lI, textView);
    }

    private void initData() {
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate);
        KSImageLoader.loadAppIcon(this.lF, com.kwad.sdk.core.response.b.a.bQ(ck), this.mAdTemplate, 12);
        this.gS.setText(com.kwad.sdk.core.response.b.a.bO(ck));
        this.lG.setText(com.kwad.sdk.core.response.b.a.an(ck));
        if (com.kwad.sdk.core.response.b.a.aR(this.mAdTemplate)) {
            this.lH.setText(com.kwad.sdk.core.response.b.a.aw(ck));
        }
    }

    @Override // com.kwad.components.core.o.g
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String string = getArguments().getString("KEY_TEMPLATE");
        try {
            AdTemplate adTemplate = new AdTemplate();
            this.mAdTemplate = adTemplate;
            adTemplate.parseJson(new JSONObject(string));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        View inflate = layoutInflater.inflate(R.layout.ksad_interstitial_exit_intercept_dialog, viewGroup);
        i(inflate);
        initData();
        return inflate;
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
        setCancelable(false);
        com.kwad.components.ad.interstitial.d.c cVar = this.jh;
        if (cVar != null) {
            com.kwad.sdk.core.report.a.d(cVar.mAdTemplate, new JSONObject(), new j().ci(149).ck(9));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.kwad.components.ad.interstitial.d.c cVar;
        Context context;
        int i;
        if (this.jh != null) {
            if (view.equals(this.lF)) {
                cVar = this.jh;
                context = cVar.hI.getContext();
                i = 127;
            } else if (view.equals(this.gS)) {
                cVar = this.jh;
                context = cVar.hI.getContext();
                i = 128;
            } else if (view.equals(this.lG)) {
                cVar = this.jh;
                context = cVar.hI.getContext();
                i = 129;
            } else if (view.equals(this.lH)) {
                cVar = this.jh;
                context = cVar.hI.getContext();
                i = 131;
            } else if (view.equals(this.lI)) {
                com.kwad.sdk.core.report.a.c(this.jh.mAdTemplate, (JSONObject) null, new j().ck(9));
            } else if (view.equals(this.lJ)) {
                com.kwad.components.ad.interstitial.d.c cVar2 = this.jh;
                cVar2.a(false, -1, cVar2.ex);
                this.jh.hI.dismiss();
                com.kwad.sdk.core.report.a.a(this.jh.mAdTemplate, new j().ci(151).ck(9));
            }
            cVar.a(context, i, 2, 9);
        }
        dismiss();
        lK = false;
    }
}
