package com.applovin.impl.mediation.debugger.ui.a;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import ch.qos.logback.classic.Level;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
/* loaded from: classes.dex */
public class d extends Dialog {
    private ViewGroup a;

    /* renamed from: b  reason: collision with root package name */
    private AppLovinSdkUtils.Size f3559b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f3560c;

    /* renamed from: d  reason: collision with root package name */
    private RelativeLayout f3561d;

    public d(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, 16973840);
        this.a = viewGroup;
        this.f3559b = size;
        this.f3560c = activity;
        requestWindowFeature(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f3561d.removeView(this.a);
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f3560c, this.f3559b.getWidth()), AppLovinSdkUtils.dpToPx(this.f3560c, this.f3559b.getHeight()));
        layoutParams.addRule(13);
        this.a.setLayoutParams(layoutParams);
        int dpToPx = AppLovinSdkUtils.dpToPx(this.f3560c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f3560c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f3560c.getResources().getDrawable(R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.d.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                d.this.dismiss();
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f3560c);
        this.f3561d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f3561d.setBackgroundColor(Level.ALL_INT);
        this.f3561d.addView(imageButton);
        this.f3561d.addView(this.a);
        this.f3561d.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.d.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                d.this.dismiss();
            }
        });
        setContentView(this.f3561d);
    }
}
