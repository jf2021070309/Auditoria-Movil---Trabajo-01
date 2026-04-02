package com.applovin.impl.mediation.debugger.ui.a;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
/* loaded from: classes.dex */
public class d extends Dialog {
    private MaxAdView a;
    private MaxAdFormat b;
    private Activity c;
    private RelativeLayout d;

    public d(MaxAdView maxAdView, MaxAdFormat maxAdFormat, Activity activity) {
        super(activity, 16973840);
        this.a = maxAdView;
        this.b = maxAdFormat;
        this.c = activity;
        requestWindowFeature(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.d.removeView(this.a);
        super.dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.c, this.b.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this.c, this.b.getSize().getHeight()));
        layoutParams.addRule(13);
        this.a.setLayoutParams(layoutParams);
        int dpToPx = AppLovinSdkUtils.dpToPx(this.c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.c.getResources().getDrawable(R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.d.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                d.this.dismiss();
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.c);
        this.d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.d.setBackgroundColor(Integer.MIN_VALUE);
        this.d.addView(imageButton);
        this.d.addView(this.a);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.d.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                d.this.dismiss();
            }
        });
        setContentView(this.d);
    }
}
