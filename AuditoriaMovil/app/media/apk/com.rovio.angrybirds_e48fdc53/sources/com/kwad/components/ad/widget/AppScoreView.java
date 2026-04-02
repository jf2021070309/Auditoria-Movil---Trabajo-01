package com.kwad.components.ad.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public class AppScoreView extends LinearLayout {
    private ImageView Hr;
    private ImageView Hs;

    public AppScoreView(Context context) {
        this(context, null);
    }

    public AppScoreView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppScoreView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView();
    }

    private void initView() {
        inflate(getContext(), R.layout.ksad_app_score, this);
        this.Hr = (ImageView) findViewById(R.id.ksad_score_fourth);
        this.Hs = (ImageView) findViewById(R.id.ksad_score_fifth);
    }

    public void setScore(float f) {
        ImageView imageView;
        int i;
        ImageView imageView2;
        int i2;
        double d = f;
        if (d > 4.5d) {
            this.Hr.setImageResource(R.drawable.ksad_star_checked);
            imageView2 = this.Hs;
            i2 = R.drawable.ksad_star_checked;
        } else if (d > 4.0d) {
            this.Hr.setImageResource(R.drawable.ksad_star_checked);
            imageView2 = this.Hs;
            i2 = R.drawable.ksad_star_half;
        } else {
            if (d > 3.5d) {
                imageView = this.Hr;
                i = R.drawable.ksad_star_checked;
            } else {
                int i3 = (d > 3.0d ? 1 : (d == 3.0d ? 0 : -1));
                if (i3 <= 0) {
                    if (i3 == 0) {
                        this.Hr.setImageResource(R.drawable.ksad_star_unchecked);
                        this.Hs.setImageResource(R.drawable.ksad_star_unchecked);
                        return;
                    }
                    return;
                }
                imageView = this.Hr;
                i = R.drawable.ksad_star_half;
            }
            imageView.setImageResource(i);
            imageView2 = this.Hs;
            i2 = R.drawable.ksad_star_unchecked;
        }
        imageView2.setImageResource(i2);
    }
}
