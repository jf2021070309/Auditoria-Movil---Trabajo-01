package com.facebook.ads.internal.view.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
/* loaded from: classes2.dex */
public class e extends LinearLayout {
    private TextView a;
    private TextView b;
    private Drawable c;

    public e(Context context) {
        super(context);
        a();
    }

    private void a() {
        float f = getResources().getDisplayMetrics().density;
        setOrientation(1);
        this.a = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.a.setTextColor(-16777216);
        this.a.setTextSize(2, 20.0f);
        this.a.setEllipsize(TextUtils.TruncateAt.END);
        this.a.setSingleLine(true);
        this.a.setVisibility(8);
        addView(this.a, layoutParams);
        this.b = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        this.b.setAlpha(0.5f);
        this.b.setTextColor(-16777216);
        this.b.setTextSize(2, 15.0f);
        this.b.setCompoundDrawablePadding((int) (f * 5.0f));
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.b.setSingleLine(true);
        this.b.setVisibility(8);
        addView(this.b, layoutParams2);
    }

    private Drawable getPadlockDrawable() {
        if (this.c == null) {
            this.c = com.facebook.ads.internal.q.b.c.a(getContext(), com.facebook.ads.internal.q.b.b.BROWSER_PADLOCK);
        }
        return this.c;
    }

    public void setSubtitle(String str) {
        if (TextUtils.isEmpty(str)) {
            this.b.setText((CharSequence) null);
            this.b.setVisibility(8);
            return;
        }
        Uri parse = Uri.parse(str);
        this.b.setText(parse.getHost());
        this.b.setCompoundDrawablesRelativeWithIntrinsicBounds("https".equals(parse.getScheme()) ? getPadlockDrawable() : null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.b.setVisibility(0);
    }

    public void setTitle(String str) {
        if (TextUtils.isEmpty(str)) {
            this.a.setText((CharSequence) null);
            this.a.setVisibility(8);
            return;
        }
        this.a.setText(str);
        this.a.setVisibility(0);
    }
}
