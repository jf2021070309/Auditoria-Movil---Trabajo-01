package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzmu extends zzmx {
    private final zzjl zza;
    private final zzjs zzb;

    public zzmu(Context context, Executor executor, zzm zzmVar) {
        zzjp zzjpVar = new zzjp(context, executor, zzmVar);
        this.zza = zzjpVar;
        this.zzb = new zzjs(zzjpVar);
    }

    @Deprecated
    private final IObjectWrapper zzt(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, boolean z) {
        Uri zza;
        try {
            Uri uri = (Uri) ObjectWrapper.unwrap(iObjectWrapper);
            Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper2);
            if (z) {
                zza = this.zzb.zzb(uri, context);
            } else {
                zza = this.zzb.zza(uri, context, null, null);
            }
            return ObjectWrapper.wrap(zza);
        } catch (zzjt unused) {
            return null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final int zzb() {
        zzjl zzjlVar = this.zza;
        if (!(zzjlVar instanceof zzjp)) {
            return -1;
        }
        zzjl zza = ((zzjp) zzjlVar).zza();
        if (zza instanceof zzjr) {
            return 1;
        }
        if (!(zza instanceof zzji)) {
            return -1;
        }
        return 2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final IObjectWrapper zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return zzt(iObjectWrapper, iObjectWrapper2, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final IObjectWrapper zzd(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return zzt(iObjectWrapper, iObjectWrapper2, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final String zze(IObjectWrapper iObjectWrapper, String str) {
        return ((zzjp) this.zza).zze((Context) ObjectWrapper.unwrap(iObjectWrapper), str, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final String zzf(IObjectWrapper iObjectWrapper) {
        return zzg(iObjectWrapper, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final String zzg(IObjectWrapper iObjectWrapper, byte[] bArr) {
        return this.zza.zzg((Context) ObjectWrapper.unwrap(iObjectWrapper), bArr);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final String zzh(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3, IObjectWrapper iObjectWrapper4) {
        return this.zza.zze((Context) ObjectWrapper.unwrap(iObjectWrapper), (String) ObjectWrapper.unwrap(iObjectWrapper2), (View) ObjectWrapper.unwrap(iObjectWrapper3), (Activity) ObjectWrapper.unwrap(iObjectWrapper4));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final String zzi(IObjectWrapper iObjectWrapper) {
        return ((zzjp) this.zza).zzg((Context) ObjectWrapper.unwrap(iObjectWrapper), null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final String zzj() {
        return "ms";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final String zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return this.zza.zzh((Context) ObjectWrapper.unwrap(iObjectWrapper), (View) ObjectWrapper.unwrap(iObjectWrapper2), (Activity) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final void zzl(IObjectWrapper iObjectWrapper) {
        this.zzb.zzc((MotionEvent) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final void zzm(IObjectWrapper iObjectWrapper) {
        this.zza.zzn((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final void zzn(String str, String str2) {
        this.zzb.zzd(str, str2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final void zzo(String str) {
        this.zzb.zze(str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final boolean zzp(IObjectWrapper iObjectWrapper) {
        return this.zzb.zzg((Uri) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final boolean zzq(IObjectWrapper iObjectWrapper) {
        return this.zzb.zzf((Uri) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final boolean zzr() {
        return this.zza.zzq();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final boolean zzs() {
        return this.zza.zzs();
    }
}
