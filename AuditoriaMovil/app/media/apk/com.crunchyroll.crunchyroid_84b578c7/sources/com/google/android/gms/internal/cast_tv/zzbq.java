package com.google.android.gms.internal.cast_tv;

import android.content.Intent;
import android.text.TextUtils;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.tv.media.MediaResumeSessionRequestData;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzbq {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = new Logger("ReceiverMediaUtils");

    public static MediaLoadRequestData zza(Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.cast.tv.extra.LOAD_REQUEST_DATA");
        MediaLoadRequestData mediaLoadRequestData = null;
        if (!TextUtils.isEmpty(stringExtra)) {
            try {
                c cVar = new c(stringExtra);
                zzdu.zza(cVar);
                zzdu.zzb(cVar);
                mediaLoadRequestData = MediaLoadRequestData.fromJson(cVar);
            } catch (b e) {
                zzb.e("Malformed load request data", e);
            }
            if (mediaLoadRequestData == null) {
                zzb.w("Unrecognized load intent".concat(intent.toString()), new Object[0]);
            }
            return mediaLoadRequestData;
        }
        zzb.e("The load intent doesn't have the load request data extra", new Object[0]);
        return null;
    }

    public static MediaResumeSessionRequestData zzb(Intent intent) {
        MediaResumeSessionRequestData mediaResumeSessionRequestData = null;
        if (!TextUtils.equals(intent.getAction(), "com.google.android.gms.cast.tv.action.RESUME_SESSION")) {
            zzb.w("The intent is not a Cast resume session intent", new Object[0]);
            return null;
        }
        String stringExtra = intent.getStringExtra("android.cast.extra.RESUME_SESSION_DATA");
        if (!TextUtils.isEmpty(stringExtra)) {
            try {
                c cVar = new c(stringExtra);
                zzdu.zza(cVar);
                c optJSONObject = cVar.optJSONObject("sessionState");
                if (optJSONObject != null) {
                    zzdu.zzb(optJSONObject.optJSONObject("loadRequestData"));
                }
                mediaResumeSessionRequestData = MediaResumeSessionRequestData.zza(cVar);
            } catch (b | zzv e) {
                zzb.e("Malformed resume session request data", e);
            }
            if (mediaResumeSessionRequestData == null) {
                zzb.w("Unrecognized resume session intent".concat(intent.toString()), new Object[0]);
            }
            return mediaResumeSessionRequestData;
        }
        zzb.e("The resume session intent doesn't have the resume session request data extra", new Object[0]);
        return null;
    }
}
