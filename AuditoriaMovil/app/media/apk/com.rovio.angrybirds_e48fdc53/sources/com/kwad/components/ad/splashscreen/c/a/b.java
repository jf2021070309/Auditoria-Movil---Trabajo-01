package com.kwad.components.ad.splashscreen.c.a;

import android.view.View;
import android.widget.TextView;
import com.kwad.components.core.page.AdWebViewActivityProxy;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.utils.bc;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.ad.splashscreen.c.e implements View.OnClickListener {
    private TextView Ek;
    private TextView El;
    private TextView Em;
    private TextView En;
    private AdInfo.DownloadSafeInfo Eo;

    private void initView() {
        this.Ek = (TextView) findViewById(R.id.ksad_ad_endcard_appversion);
        this.El = (TextView) findViewById(R.id.ksad_ad_permission_text);
        this.Em = (TextView) findViewById(R.id.ksad_ad_privacy_text);
        this.En = (TextView) findViewById(R.id.ksad_ad_developer_text);
    }

    private void ly() {
        if (com.kwad.sdk.core.response.b.a.aH(com.kwad.sdk.core.response.b.d.ck(this.CS.mAdTemplate))) {
            StringBuilder sb = new StringBuilder();
            String str = this.Eo.appVersion;
            if (bc.fJ(str)) {
                sb.append("版本号：");
                sb.append(str);
                sb.append("  |  ");
            }
            long j = this.Eo.packageSize;
            if (j > 0) {
                sb.append("应用大小：");
                sb.append(com.kwad.components.core.t.e.a(j, true));
            }
            if (bc.fJ(sb.toString())) {
                this.Ek.setText(sb);
            }
            String str2 = this.Eo.appPermissionInfoUrl;
            String str3 = this.Eo.appPrivacyUrl;
            if (bc.fJ(str2)) {
                this.El.setText("权限信息");
                this.El.setOnClickListener(this);
            }
            StringBuilder sb2 = new StringBuilder();
            if (bc.fJ(str2)) {
                sb2.append(" | ");
            }
            if (bc.fJ(str3)) {
                sb2.append("隐私政策");
                this.Em.setText(sb2);
                this.Em.setOnClickListener(this);
            }
            StringBuilder sb3 = new StringBuilder();
            String str4 = this.Eo.appName;
            if (bc.fJ(str4)) {
                sb3.append("应用名：");
                sb3.append(str4);
                sb3.append("；");
            }
            String str5 = this.Eo.corporationName;
            if (bc.fJ(str5)) {
                sb3.append("开发者：");
                sb3.append(str5);
            }
            if (bc.fJ(sb3.toString())) {
                this.En.setText(sb3);
            }
        }
    }

    @Override // com.kwad.components.ad.splashscreen.c.e, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.Eo = com.kwad.sdk.core.response.b.d.ck(this.CS.mAdTemplate).downloadSafeInfo;
        ly();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.Em) {
            AdWebViewActivityProxy.launch(getContext(), new AdWebViewActivityProxy.a.C0206a().as("隐私政策").at(this.Eo.appPrivacyUrl).ax(true).V(this.CS.mAdTemplate).oE());
        } else if (view == this.El) {
            AdWebViewActivityProxy.launch(getContext(), new AdWebViewActivityProxy.a.C0206a().as("权限信息").ax(true).at(this.Eo.appPermissionInfoUrl).V(this.CS.mAdTemplate).oE());
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
        initView();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
    }
}
