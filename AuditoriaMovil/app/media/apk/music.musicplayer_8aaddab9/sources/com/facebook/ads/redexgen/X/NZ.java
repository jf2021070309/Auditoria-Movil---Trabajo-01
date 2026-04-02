package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public final class NZ extends LinearLayout {
    public static final int A03 = (int) (C0739Lm.A00 * 40.0f);
    public static final int A04 = (int) (C0739Lm.A00 * 20.0f);
    public static final int A05 = (int) (C0739Lm.A00 * 10.0f);
    public final C2H A00;
    public final C1046Xo A01;
    public final NJ A02;

    public NZ(C1046Xo c1046Xo, C2H c2h, NJ nj, MT mt) {
        this(c1046Xo, c2h, nj, null, mt);
    }

    public NZ(C1046Xo c1046Xo, C2H c2h, NJ nj, @Nullable String str, MT mt) {
        super(c1046Xo);
        this.A01 = c1046Xo;
        this.A00 = c2h;
        this.A02 = nj;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View A01 = A01(str);
            A01.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            ML.A0M(view, -10459280);
            addView(A01, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(this.A00.A03())) {
            View A00 = A00(mt, this.A00.A03());
            int i2 = A05;
            A00.setPadding(0, i2, 0, i2);
            addView(A00, layoutParams);
        }
        ViewGroup A02 = A02();
        A02.setPadding(0, A05, 0, 0);
        addView(A02, layoutParams);
    }

    private View A00(MT mt, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        int i2 = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(MU.A01(mt));
        TextView textView = new TextView(getContext());
        ML.A0X(textView, true, 14);
        textView.setTextColor(-10459280);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        textView.setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View A01(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(MU.A01(MT.BACK_ARROW));
        int i2 = A05;
        imageView.setPadding(0, i2, i2 * 2, i2);
        int i3 = A03;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
        imageView.setOnClickListener(new NX(this));
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(str);
        ML.A0X(textView, true, 16);
        textView.setTextColor(-14934495);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, A03, 0);
        layoutParams2.gravity = 17;
        LinearLayout header = new LinearLayout(getContext());
        header.setOrientation(0);
        header.addView(imageView, layoutParams);
        header.addView(textView, layoutParams2);
        return header;
    }

    private ViewGroup A02() {
        C0782Nf c0782Nf = new C0782Nf(this.A01);
        for (C2H c2h : this.A00.A05()) {
            NL nl = new NL(this.A01);
            nl.setData(c2h.A04(), null);
            nl.setOnClickListener(new NY(this, nl, c2h));
            c0782Nf.addView(nl);
        }
        return c0782Nf;
    }
}
