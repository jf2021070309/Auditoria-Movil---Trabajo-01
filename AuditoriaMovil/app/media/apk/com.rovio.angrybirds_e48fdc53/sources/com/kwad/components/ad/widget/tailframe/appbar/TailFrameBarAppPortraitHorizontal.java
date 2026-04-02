package com.kwad.components.ad.widget.tailframe.appbar;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public class TailFrameBarAppPortraitHorizontal extends a {
    public TailFrameBarAppPortraitHorizontal(Context context) {
        this(context, null);
    }

    public TailFrameBarAppPortraitHorizontal(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TailFrameBarAppPortraitHorizontal(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.kwad.components.ad.widget.tailframe.appbar.a
    public final void b(AdTemplate adTemplate) {
        if (d.u(adTemplate)) {
            this.GH.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.ksad_translucent));
            this.lm.setTextColor(Color.parseColor("#FFFFFF"));
            this.HQ.setTextColor(Color.parseColor("#FFFFFF"));
        } else {
            this.GH.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
        super.b(adTemplate);
    }

    @Override // com.kwad.components.ad.widget.tailframe.appbar.a
    public int getLayoutId() {
        return R.layout.ksad_video_tf_bar_app_portrait_horizontal;
    }
}
