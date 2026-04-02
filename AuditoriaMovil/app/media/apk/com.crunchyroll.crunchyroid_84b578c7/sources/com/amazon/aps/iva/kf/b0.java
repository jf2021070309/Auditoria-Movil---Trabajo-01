package com.amazon.aps.iva.kf;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.crunchyroll.crunchyroid.R;
/* compiled from: ThirdPartyAppItemLayout.kt */
/* loaded from: classes.dex */
public final class b0 extends com.amazon.aps.iva.wy.g {
    public static final /* synthetic */ int c = 0;
    public final com.amazon.aps.iva.lf.b b;

    public b0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_third_party_app_item, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.third_party_app_cta_button;
        TextView textView = (TextView) com.amazon.aps.iva.e.z.u(R.id.third_party_app_cta_button, inflate);
        if (textView != null) {
            i2 = R.id.third_party_app_description;
            TextView textView2 = (TextView) com.amazon.aps.iva.e.z.u(R.id.third_party_app_description, inflate);
            if (textView2 != null) {
                i2 = R.id.third_party_app_name;
                TextView textView3 = (TextView) com.amazon.aps.iva.e.z.u(R.id.third_party_app_name, inflate);
                if (textView3 != null) {
                    i2 = R.id.third_party_connected_state;
                    ImageView imageView = (ImageView) com.amazon.aps.iva.e.z.u(R.id.third_party_connected_state, inflate);
                    if (imageView != null) {
                        i2 = R.id.third_party_icon;
                        ImageView imageView2 = (ImageView) com.amazon.aps.iva.e.z.u(R.id.third_party_icon, inflate);
                        if (imageView2 != null) {
                            this.b = new com.amazon.aps.iva.lf.b(imageView, imageView2, textView, textView2, textView3, (ConstraintLayout) inflate);
                            setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
