package com.kwad.components.ad.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kwad.sdk.R;
import com.kwad.sdk.m.l;
import java.util.List;
/* loaded from: classes.dex */
public class KsAppTagsView extends LinearLayout {
    private int HC;

    public KsAppTagsView(Context context) {
        super(context);
        this.HC = 3;
    }

    public KsAppTagsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.HC = 3;
    }

    public KsAppTagsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.HC = 3;
    }

    public KsAppTagsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.HC = 3;
    }

    private static void a(LinearLayout linearLayout, String str, int i) {
        TextView textView = (TextView) l.a(linearLayout.getContext(), i, linearLayout, false);
        textView.setText(str);
        linearLayout.addView(textView);
    }

    public final void a(List<String> list, int i) {
        if (list == null) {
            return;
        }
        int i2 = 0;
        for (String str : list) {
            i2++;
            if (i2 > this.HC) {
                return;
            }
            a(this, str, i);
        }
    }

    public void setAppTags(List<String> list) {
        a(list, R.layout.ksad_reward_apk_info_card_tag_item);
    }

    public void setMaxCount(int i) {
        this.HC = i;
    }
}
