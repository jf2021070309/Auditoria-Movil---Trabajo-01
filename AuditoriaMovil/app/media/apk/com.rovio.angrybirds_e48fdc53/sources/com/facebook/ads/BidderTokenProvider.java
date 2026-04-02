package com.facebook.ads;

import android.content.Context;
import com.facebook.ads.internal.i.c;
/* loaded from: classes2.dex */
public final class BidderTokenProvider {
    public static String getBidderToken(Context context) {
        return new c(context, true).a();
    }
}
