package com.google.android.gms.common.stats;

import ch.qos.logback.classic.net.SyslogAppender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
@KeepForSdk
@Deprecated
/* loaded from: classes.dex */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    @KeepForSdk
    /* loaded from: classes.dex */
    public interface Types {
        @KeepForSdk
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;
        @KeepForSdk
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
    }

    public final String toString() {
        long zzc = zzc();
        int zza = zza();
        long zzb = zzb();
        String zzd = zzd();
        StringBuilder sb = new StringBuilder(zzd.length() + 53);
        sb.append(zzc);
        sb.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        sb.append(zza);
        sb.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        sb.append(zzb);
        sb.append(zzd);
        return sb.toString();
    }

    public abstract int zza();

    public abstract long zzb();

    public abstract long zzc();

    public abstract String zzd();
}
