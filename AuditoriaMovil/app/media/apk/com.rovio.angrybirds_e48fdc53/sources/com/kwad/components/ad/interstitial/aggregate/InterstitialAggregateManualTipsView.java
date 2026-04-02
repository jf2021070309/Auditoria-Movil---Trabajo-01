package com.kwad.components.ad.interstitial.aggregate;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.m.l;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class InterstitialAggregateManualTipsView extends LinearLayout implements View.OnClickListener {
    private TransViewPager hN;
    private ImageView il;
    private ImageView im;
    private ImageView io;
    private int iq;
    private int ir;
    private final ViewPager.OnPageChangeListener is;
    private AdTemplate mAdTemplate;
    private final Context mContext;

    public InterstitialAggregateManualTipsView(Context context) {
        this(context, null);
    }

    public InterstitialAggregateManualTipsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InterstitialAggregateManualTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.is = new ViewPager.SimpleOnPageChangeListener() { // from class: com.kwad.components.ad.interstitial.aggregate.InterstitialAggregateManualTipsView.1
            @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
            public final void onPageSelected(int i2) {
                ImageView imageView;
                float f;
                InterstitialAggregateManualTipsView.this.iq = i2;
                if (InterstitialAggregateManualTipsView.this.iq == InterstitialAggregateManualTipsView.this.ir - 1) {
                    imageView = InterstitialAggregateManualTipsView.this.il;
                    f = 0.5f;
                } else {
                    imageView = InterstitialAggregateManualTipsView.this.il;
                    f = 1.0f;
                }
                imageView.setAlpha(f);
                InterstitialAggregateManualTipsView.this.im.setAlpha(f);
            }
        };
        this.mContext = context;
        initView();
    }

    private void cw() {
        int i = this.iq;
        if (i < this.ir - 1) {
            this.hN.setCurrentItem(i + 1, true);
        }
    }

    private void initView() {
        l.inflate(this.mContext, R.layout.ksad_interstitial_aggregate_manual_tips, this);
        this.il = (ImageView) findViewById(R.id.ksad_interstitial_aggregate_cut);
        this.im = (ImageView) findViewById(R.id.ksad_interstitial_aggregate_refresh);
        ImageView imageView = (ImageView) findViewById(R.id.ksad_interstitial_aggregate_convert);
        this.io = imageView;
        com.kwad.sdk.d.a.a.a(this, this.il, this.im, imageView);
    }

    public final void a(AdTemplate adTemplate, TransViewPager transViewPager) {
        this.mAdTemplate = adTemplate;
        this.hN = transViewPager;
        this.iq = transViewPager.getCurrentItem();
        a aVar = (a) transViewPager.getAdapter();
        if (aVar == null) {
            return;
        }
        this.ir = aVar.getCount();
        new d(this.hN.getContext()).a(this.hN);
        this.hN.addOnPageChangeListener(this.is);
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        String cY = com.kwad.sdk.core.response.b.b.cY(ck);
        String cZ = com.kwad.sdk.core.response.b.b.cZ(ck);
        String da = com.kwad.sdk.core.response.b.b.da(ck);
        if (TextUtils.isEmpty(cY) || TextUtils.isEmpty(cZ) || TextUtils.isEmpty(da)) {
            setVisibility(8);
            return;
        }
        KSImageLoader.loadImage(this.il, cY);
        KSImageLoader.loadImage(this.im, cZ);
        KSImageLoader.loadImage(this.io, da);
        com.kwad.sdk.core.report.a.b(adTemplate, 162, (JSONObject) null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        com.kwad.components.ad.interstitial.f.c x;
        AdTemplate adTemplate;
        int i;
        if (view.equals(this.il)) {
            cw();
            adTemplate = this.mAdTemplate;
            i = 162;
        } else if (!view.equals(this.im)) {
            if (!view.equals(this.io) || (x = this.hN.x(this.iq)) == null) {
                return;
            }
            x.ew();
            return;
        } else {
            cw();
            adTemplate = this.mAdTemplate;
            i = 36;
        }
        com.kwad.sdk.core.report.a.q(adTemplate, i);
    }
}
