package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.internal.view.p;
import com.facebook.ads.internal.view.r;
/* loaded from: classes2.dex */
public class b extends LinearLayout {
    private r a;
    private int b;

    public b(Context context, com.facebook.ads.internal.n.e eVar, com.facebook.ads.internal.n.h hVar) {
        super(context);
        setOrientation(1);
        setVerticalGravity(16);
        this.a = new r(getContext(), 2);
        this.a.setMinTextSize(hVar.h() - 2);
        this.a.setText(eVar.l());
        p.a(this.a, hVar);
        this.a.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(this.a);
        this.b = eVar.l() != null ? Math.min(eVar.l().length(), 21) : 21;
        addView(p.a(context, eVar, hVar));
    }

    public int getMinVisibleTitleCharacters() {
        return this.b;
    }

    public TextView getTitleTextView() {
        return this.a;
    }
}
