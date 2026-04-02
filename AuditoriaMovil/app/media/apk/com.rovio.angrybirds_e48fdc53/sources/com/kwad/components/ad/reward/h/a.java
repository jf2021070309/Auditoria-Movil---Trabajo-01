package com.kwad.components.ad.reward.h;

import android.content.Context;
import com.kwad.components.ad.reward.e.l;
import com.kwad.sdk.R;
import com.kwad.sdk.utils.v;
/* loaded from: classes.dex */
public final class a implements l {
    private Context mContext;

    public a(Context context) {
        this.mContext = context;
    }

    @Override // com.kwad.components.ad.reward.e.l
    public final boolean he() {
        Context context = this.mContext;
        if (context != null) {
            v.c(this.mContext, context.getResources().getString(R.string.ksad_reward_playable_load_error_toast), 0L);
            return true;
        }
        return true;
    }
}
