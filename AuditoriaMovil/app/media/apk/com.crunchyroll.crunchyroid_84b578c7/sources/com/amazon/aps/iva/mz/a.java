package com.amazon.aps.iva.mz;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.xd.d;
import com.crunchyroll.crunchyroid.R;
/* compiled from: PlayableAssetHeaderLayout.kt */
/* loaded from: classes2.dex */
public final class a extends g {
    public final d b;

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_playable_asset_header, (ViewGroup) this, false);
        addView(inflate);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            this.b = new d(textView, textView, 2);
            return;
        }
        throw new NullPointerException("rootView");
    }
}
