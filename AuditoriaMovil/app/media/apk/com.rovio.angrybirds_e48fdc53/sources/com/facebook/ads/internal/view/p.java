package com.facebook.ads.internal.view;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
/* loaded from: classes2.dex */
public abstract class p {
    public static LinearLayout a(Context context, com.facebook.ads.internal.n.e eVar, com.facebook.ads.internal.n.h hVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        s sVar = new s(context);
        sVar.setText(eVar.q());
        b(sVar, hVar);
        linearLayout.addView(sVar);
        return linearLayout;
    }

    public static void a(TextView textView, com.facebook.ads.internal.n.h hVar) {
        textView.setTextColor(hVar.c());
        textView.setTextSize(hVar.h());
        textView.setTypeface(hVar.a(), 1);
    }

    public static void b(TextView textView, com.facebook.ads.internal.n.h hVar) {
        textView.setTextColor(hVar.d());
        textView.setTextSize(hVar.i());
        textView.setTypeface(hVar.a());
    }
}
