package com.kwad.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.kwad.sdk.R;
import java.math.BigDecimal;
/* loaded from: classes3.dex */
public class KSRatingBar extends LinearLayout {
    private boolean aMb;
    private boolean aMc;
    private int aMd;
    private int aMe;
    private a aMf;
    private float aMg;
    private float aMh;
    private float aMi;
    private Drawable aMj;
    private Drawable aMk;
    private Drawable aMl;
    private boolean aMm;
    private int y;

    /* loaded from: classes3.dex */
    public interface a {
    }

    public KSRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = 1;
        this.aMm = false;
        setOrientation(0);
        setDividerDrawable(getResources().getDrawable(R.drawable.ksad_reward_apk_stars_divider));
        setShowDividers(2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ksad_KSRatingBar);
        this.aMl = obtainStyledAttributes.getDrawable(R.styleable.ksad_KSRatingBar_ksad_starHalf);
        this.aMj = obtainStyledAttributes.getDrawable(R.styleable.ksad_KSRatingBar_ksad_starEmpty);
        this.aMk = obtainStyledAttributes.getDrawable(R.styleable.ksad_KSRatingBar_ksad_starFill);
        this.aMg = obtainStyledAttributes.getDimension(R.styleable.ksad_KSRatingBar_ksad_starImageWidth, 60.0f);
        this.aMh = obtainStyledAttributes.getDimension(R.styleable.ksad_KSRatingBar_ksad_starImageHeight, 120.0f);
        this.aMi = obtainStyledAttributes.getDimension(R.styleable.ksad_KSRatingBar_ksad_starImagePadding, 15.0f);
        this.aMd = obtainStyledAttributes.getInteger(R.styleable.ksad_KSRatingBar_ksad_totalStarCount, 5);
        this.aMe = obtainStyledAttributes.getInteger(R.styleable.ksad_KSRatingBar_ksad_starCount, 5);
        this.aMb = obtainStyledAttributes.getBoolean(R.styleable.ksad_KSRatingBar_ksad_clickable, true);
        this.aMc = obtainStyledAttributes.getBoolean(R.styleable.ksad_KSRatingBar_ksad_halfstart, false);
        for (int i = 0; i < this.aMd; i++) {
            ImageView w = w(context, this.aMm);
            w.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.sdk.widget.KSRatingBar.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (KSRatingBar.this.aMb) {
                        if (!KSRatingBar.this.aMc) {
                            KSRatingBar kSRatingBar = KSRatingBar.this;
                            kSRatingBar.setStar(kSRatingBar.indexOfChild(view) + 1.0f);
                            if (KSRatingBar.this.aMf != null) {
                                a unused = KSRatingBar.this.aMf;
                                KSRatingBar.this.indexOfChild(view);
                                return;
                            }
                            return;
                        }
                        if (KSRatingBar.this.y % 2 == 0) {
                            KSRatingBar kSRatingBar2 = KSRatingBar.this;
                            kSRatingBar2.setStar(kSRatingBar2.indexOfChild(view) + 1.0f);
                        } else {
                            KSRatingBar kSRatingBar3 = KSRatingBar.this;
                            kSRatingBar3.setStar(kSRatingBar3.indexOfChild(view) + 0.5f);
                        }
                        if (KSRatingBar.this.aMf != null) {
                            int i2 = KSRatingBar.this.y % 2;
                            a unused2 = KSRatingBar.this.aMf;
                            KSRatingBar.this.indexOfChild(view);
                            KSRatingBar.e(KSRatingBar.this);
                        }
                    }
                }
            });
            addView(w);
        }
        setStar(this.aMe);
    }

    static /* synthetic */ int e(KSRatingBar kSRatingBar) {
        int i = kSRatingBar.y;
        kSRatingBar.y = i + 1;
        return i;
    }

    private ImageView w(Context context, boolean z) {
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(Math.round(this.aMg), Math.round(this.aMh)));
        imageView.setPadding(0, 0, Math.round(this.aMi), 0);
        imageView.setImageDrawable(z ? this.aMj : this.aMk);
        return imageView;
    }

    public void setImagePadding(float f) {
        this.aMi = f;
    }

    public void setOnRatingChangeListener(a aVar) {
        this.aMf = aVar;
    }

    public void setStar(float f) {
        int i = (int) f;
        float floatValue = new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Integer.toString(i))).floatValue();
        int i2 = this.aMd;
        float f2 = i > i2 ? i2 : i;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        for (int i3 = 0; i3 < f2; i3++) {
            ((ImageView) getChildAt(i3)).setImageDrawable(this.aMk);
        }
        if (floatValue > 0.0f) {
            ((ImageView) getChildAt(i)).setImageDrawable(this.aMl);
            int i4 = this.aMd;
            while (true) {
                i4--;
                if (i4 < 1.0f + f2) {
                    return;
                }
                ((ImageView) getChildAt(i4)).setImageDrawable(this.aMj);
            }
        } else {
            int i5 = this.aMd;
            while (true) {
                i5--;
                if (i5 < f2) {
                    return;
                }
                ((ImageView) getChildAt(i5)).setImageDrawable(this.aMj);
            }
        }
    }

    public void setStarEmptyDrawable(Drawable drawable) {
        this.aMj = drawable;
    }

    public void setStarFillDrawable(Drawable drawable) {
        this.aMk = drawable;
    }

    public void setStarHalfDrawable(Drawable drawable) {
        this.aMl = drawable;
    }

    public void setStarImageHeight(float f) {
        this.aMh = f;
    }

    public void setStarImageWidth(float f) {
        this.aMg = f;
    }

    public void setTotalStarCount(int i) {
        this.aMd = i;
    }

    public void setmClickable(boolean z) {
        this.aMb = z;
    }
}
