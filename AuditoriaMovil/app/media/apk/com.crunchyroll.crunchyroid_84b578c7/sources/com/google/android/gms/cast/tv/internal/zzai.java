package com.google.android.gms.cast.tv.internal;

import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzai {
    public static final Status zza = new Status((int) CastStatusCodes.ERROR_CAST_PLATFORM_INCOMPATIBLE, "Chromecast built-in is too old to support this API.");
    public static final Status zzb = new Status((int) CastStatusCodes.ERROR_URL_INSEURE, "URL must use Https.");
    public static final Status zzc = new Status((int) CastStatusCodes.ERROR_HOST_NOT_ALLOWED, "The hostname is not allowed");
    public static final Status zzd = new Status((int) CastStatusCodes.ERROR_CAST_PLATFORM_NOT_CONNECTED, "Chromecast built-in is not connected. Please try again later.");
    public static final Status zze = new Status((int) CastStatusCodes.ERROR_NO_CAST_CONFIGURATION, "The app doesn't have a cast app configuration. Please make sure it's launched by a cast sender.");
    public static final Status zzf = new Status((int) CastStatusCodes.ERROR_DEVICE_ID_FLAGS_NOT_SET, "Device ID flags are not set. Please check the cast app configration.");
    public static final Status zzg = new Status(13, "Unknown error.");
}
