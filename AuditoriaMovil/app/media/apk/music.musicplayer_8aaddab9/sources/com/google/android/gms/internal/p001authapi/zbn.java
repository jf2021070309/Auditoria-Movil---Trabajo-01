package com.google.android.gms.internal.p001authapi;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
/* renamed from: com.google.android.gms.internal.auth-api.zbn  reason: invalid package */
/* loaded from: classes.dex */
public final class zbn {
    public static PendingIntent zba(Context context, Auth.AuthCredentialsOptions authCredentialsOptions, HintRequest hintRequest, String str) {
        Preconditions.checkNotNull(context, "context must not be null");
        Preconditions.checkNotNull(hintRequest, "request must not be null");
        String zba = TextUtils.isEmpty(str) ? zbbb.zba() : (String) Preconditions.checkNotNull(str);
        Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", (String) null);
        putExtra.putExtra("logSessionId", zba);
        SafeParcelableSerializer.serializeToIntentExtra(hintRequest, putExtra, "com.google.android.gms.credentials.HintRequest");
        return zbbc.zba(context, 2000, putExtra, zbbc.zba | 134217728);
    }
}
