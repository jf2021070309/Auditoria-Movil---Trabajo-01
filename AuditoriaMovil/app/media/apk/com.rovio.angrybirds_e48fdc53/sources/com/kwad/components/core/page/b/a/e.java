package com.kwad.components.core.page.b.a;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.webview.KsAdWebView;
/* loaded from: classes.dex */
public final class e extends a {
    private LinearLayout MA;
    private TextView MB;
    private ImageView MC;

    private void oU() {
        this.MA = (LinearLayout) findViewById(R.id.ksad_web_tip_bar);
        if (!TextUtils.isEmpty(this.Nc.mPageTitle)) {
            this.MA.setVisibility(8);
            return;
        }
        this.MB = (TextView) findViewById(R.id.ksad_web_tip_bar_textview);
        ImageView imageView = (ImageView) findViewById(R.id.ksad_web_tip_close_btn);
        this.MC = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.core.page.b.a.e.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.this.MA.setVisibility(8);
            }
        });
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.Nc.mAdTemplate);
        boolean bn = com.kwad.sdk.core.response.b.a.bn(ck);
        String bj = com.kwad.sdk.core.response.b.a.bj(ck);
        if (bn) {
            this.MA.setVisibility(0);
            this.MB.setText(bj);
            this.MB.setSelected(true);
        } else {
            this.MA.setVisibility(8);
        }
        this.Nc.a(oV());
    }

    private KsAdWebView.c oV() {
        return new KsAdWebView.c() { // from class: com.kwad.components.core.page.b.a.e.2
            @Override // com.kwad.sdk.core.webview.KsAdWebView.c
            public final void oW() {
                if (e.this.Nc.oC() && e.this.MA.getVisibility() == 0) {
                    e.this.MA.setVisibility(8);
                }
            }
        };
    }

    @Override // com.kwad.components.core.page.b.a.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        oU();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
    }
}
