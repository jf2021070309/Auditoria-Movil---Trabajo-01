package com.google.android.gms.internal.cast_tv;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public class zzie extends IOException {
    private zzjc zza;

    public zzie(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    public static zzid zza() {
        return new zzid("Protocol message tag had invalid wire type.");
    }

    public static zzie zzb() {
        return new zzie("Protocol message contained an invalid tag (zero).");
    }

    public static zzie zzc() {
        return new zzie("Protocol message had invalid UTF-8.");
    }

    public static zzie zzd() {
        return new zzie("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzie zze() {
        return new zzie("Failed to parse the message.");
    }

    public static zzie zzg() {
        return new zzie("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzie zzf(zzjc zzjcVar) {
        this.zza = zzjcVar;
        return this;
    }

    public zzie(String str) {
        super(str);
        this.zza = null;
    }
}
