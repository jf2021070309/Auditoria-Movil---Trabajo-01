package com.amazon.aps.iva.rs;

import android.content.Context;
import com.amazon.aps.iva.n4.f0;
import com.crunchyroll.crunchyroid.R;
import java.util.concurrent.TimeUnit;
/* compiled from: BillingClientFactory.kt */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.vk.g {
    public final Context a;

    public /* synthetic */ a(Context context) {
        this.a = context;
    }

    @Override // com.amazon.aps.iva.vk.g
    public String a(int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = i;
        long hours = timeUnit.toHours(j);
        long seconds = timeUnit.toSeconds(j) - TimeUnit.HOURS.toSeconds(hours);
        long minutes = TimeUnit.SECONDS.toMinutes(seconds);
        long seconds2 = seconds - TimeUnit.MINUTES.toSeconds(minutes);
        int i2 = (hours > 0L ? 1 : (hours == 0L ? 0 : -1));
        Context context = this.a;
        if (i2 > 0) {
            String string = context.getString(R.string.format_video_player_long_duration, Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds2));
            com.amazon.aps.iva.yb0.j.e(string, "{\n            context.ge…nutes, seconds)\n        }");
            return string;
        }
        String string2 = context.getString(R.string.format_video_player_short_duration, Long.valueOf(minutes), Long.valueOf(seconds2));
        com.amazon.aps.iva.yb0.j.e(string2, "{\n            context.ge…nutes, seconds)\n        }");
        return string2;
    }

    public com.android.billingclient.api.a b(f0 f0Var) {
        Context context = this.a;
        if (context != null) {
            return new com.android.billingclient.api.a(context, f0Var);
        }
        throw new IllegalArgumentException("Please provide a valid Context.");
    }
}
