package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import e.a.d.a.a;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class zzdou {
    private final com.google.android.gms.ads.internal.util.zzbr zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdou(com.google.android.gms.ads.internal.util.zzbr zzbrVar, Clock clock, Executor executor) {
        this.zza = zzbrVar;
        this.zzb = clock;
        this.zzc = executor;
    }

    public static /* synthetic */ Bitmap zzb(zzdou zzdouVar, byte[] bArr, double d2, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d2 * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzeu)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzdouVar.zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i2 = options.outWidth * options.outHeight;
            if (i2 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i2 - 1) / ((Integer) zzbet.zzc().zzc(zzbjl.zzev)).intValue())) / 2);
            }
        }
        return zzdouVar.zzc(bArr, options);
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        long elapsedRealtime = this.zzb.elapsedRealtime();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = this.zzb.elapsedRealtime();
        if (decodeByteArray != null) {
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            long j2 = elapsedRealtime2 - elapsedRealtime;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder w = a.w(108, "Decoded image w: ", width, " h:", height);
            w.append(" bytes: ");
            w.append(allocationByteCount);
            w.append(" time: ");
            w.append(j2);
            w.append(" on ui thread: ");
            w.append(z);
            com.google.android.gms.ads.internal.util.zze.zza(w.toString());
        }
        return decodeByteArray;
    }

    public final zzfsm<Bitmap> zza(String str, double d2, boolean z) {
        return zzfsd.zzj(this.zza.zza(str), new zzdot(this, d2, z), this.zzc);
    }
}
