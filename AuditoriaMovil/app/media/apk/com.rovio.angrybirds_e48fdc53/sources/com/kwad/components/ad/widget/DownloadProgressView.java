package com.kwad.components.ad.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.kwad.components.core.page.widget.TextProgressBar;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsAppDownloadListener;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.m.l;
/* loaded from: classes.dex */
public class DownloadProgressView extends FrameLayout {
    private String HA;
    protected TextView Ht;
    private int Hu;
    private int Hv;
    private int Hw;
    private int Hx;
    private Drawable Hy;
    private Drawable Hz;
    protected TextProgressBar cX;
    private final KsAppDownloadListener cn;
    protected AdInfo mAdInfo;
    protected AdTemplate mAdTemplate;

    public DownloadProgressView(Context context) {
        this(context, null);
    }

    public DownloadProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DownloadProgressView(Context context, AttributeSet attributeSet, int i) {
        super(l.wrapContextIfNeed(context), attributeSet, i);
        this.cn = new com.kwad.sdk.core.download.a.a() { // from class: com.kwad.components.ad.widget.DownloadProgressView.2
            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onDownloadFailed() {
                DownloadProgressView.this.Ht.setText(com.kwad.sdk.core.response.b.a.aw(DownloadProgressView.this.mAdInfo));
                DownloadProgressView.this.Ht.setVisibility(0);
                DownloadProgressView.this.cX.setVisibility(8);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onDownloadFinished() {
                DownloadProgressView.this.Ht.setVisibility(8);
                DownloadProgressView.this.cX.setVisibility(0);
                DownloadProgressView.this.cX.e(com.kwad.sdk.core.response.b.a.aQ(DownloadProgressView.this.mAdTemplate), DownloadProgressView.this.cX.getMax());
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onIdle() {
                DownloadProgressView.this.Ht.setText(com.kwad.sdk.core.response.b.a.aw(DownloadProgressView.this.mAdInfo));
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onInstalled() {
                DownloadProgressView.this.Ht.setVisibility(8);
                DownloadProgressView.this.cX.setVisibility(0);
                DownloadProgressView.this.cX.e(com.kwad.sdk.core.response.b.a.U(DownloadProgressView.this.mAdInfo), DownloadProgressView.this.cX.getMax());
            }

            @Override // com.kwad.sdk.core.download.a.a
            public final void onPaused(int i2) {
                DownloadProgressView.this.Ht.setVisibility(8);
                DownloadProgressView.this.cX.setVisibility(0);
                DownloadProgressView.this.cX.e(com.kwad.sdk.core.response.b.a.Cy(), i2);
            }

            @Override // com.kwad.sdk.api.KsAppDownloadListener
            public final void onProgressUpdate(int i2) {
                DownloadProgressView.this.Ht.setVisibility(8);
                DownloadProgressView.this.cX.setVisibility(0);
                DownloadProgressView.this.cX.e(com.kwad.sdk.core.response.b.a.l(i2, DownloadProgressView.this.HA), i2);
            }
        };
        initAttrs(context, attributeSet);
        initView();
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ksad_DownloadProgressView);
        this.Hu = obtainStyledAttributes.getColor(R.styleable.ksad_DownloadProgressView_ksad_downloadTextColor, -117146);
        this.Hv = obtainStyledAttributes.getColor(R.styleable.ksad_DownloadProgressView_ksad_downloadLeftTextColor, -1);
        this.Hw = obtainStyledAttributes.getColor(R.styleable.ksad_DownloadProgressView_ksad_downloadRightTextColor, -117146);
        this.Hx = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ksad_DownloadProgressView_ksad_downloadTextSize, com.kwad.sdk.d.a.a.a(getContext(), 11.0f));
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.ksad_DownloadProgressView_ksad_progressDrawable);
        this.Hy = drawable;
        if (drawable == null) {
            this.Hy = getResources().getDrawable(R.drawable.ksad_feed_download_progress);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(R.styleable.ksad_DownloadProgressView_ksad_backgroundDrawable);
        this.Hz = drawable2;
        if (drawable2 == null) {
            this.Hz = getResources().getDrawable(R.drawable.ksad_feed_app_download_before_bg);
        }
        String string = obtainStyledAttributes.getString(R.styleable.ksad_DownloadProgressView_ksad_downloadingFormat);
        this.HA = string;
        if (string == null) {
            this.HA = "下载中  %s%%";
        }
        obtainStyledAttributes.recycle();
    }

    private void initView() {
        l.inflate(getContext(), R.layout.ksad_download_progress_layout, this);
        TextProgressBar textProgressBar = (TextProgressBar) findViewById(R.id.ksad_progress_bar);
        this.cX = textProgressBar;
        textProgressBar.setTextDimen(this.Hx);
        this.cX.setTextColor(this.Hv, this.Hw);
        this.cX.setProgressDrawable(this.Hy);
        TextView textView = (TextView) findViewById(R.id.ksad_normal_text);
        this.Ht = textView;
        textView.setTextColor(this.Hu);
        this.Ht.setTextSize(0, this.Hx);
        this.Ht.setVisibility(0);
        this.Ht.setBackground(this.Hz);
        findViewById(R.id.ksad_foreground_cover).setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.widget.DownloadProgressView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadProgressView.this.performClick();
            }
        });
    }

    public final void K(AdTemplate adTemplate) {
        this.mAdTemplate = adTemplate;
        AdInfo ck = d.ck(adTemplate);
        this.mAdInfo = ck;
        this.Ht.setText(com.kwad.sdk.core.response.b.a.aw(ck));
        this.cX.setVisibility(8);
        this.Ht.setVisibility(0);
    }

    public KsAppDownloadListener getAppDownloadListener() {
        return this.cn;
    }
}
