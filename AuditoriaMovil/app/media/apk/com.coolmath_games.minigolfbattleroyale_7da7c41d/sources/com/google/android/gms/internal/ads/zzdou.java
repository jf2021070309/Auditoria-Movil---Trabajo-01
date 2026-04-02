package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdou {
    private final com.google.android.gms.ads.internal.util.zzbr zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdou(com.google.android.gms.ads.internal.util.zzbr zzbrVar, Clock clock, Executor executor) {
        this.zza = zzbrVar;
        this.zzb = clock;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Bitmap zzb(zzdou zzdouVar, byte[] bArr, double d, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzeu)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzdouVar.zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) zzbet.zzc().zzc(zzbjl.zzev)).intValue())) / 2);
            }
        }
        return zzdouVar.zzc(bArr, options);
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        long elapsedRealtime = this.zzb.elapsedRealtime();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = this.zzb.elapsedRealtime();
        if (Build.VERSION.SDK_INT >= 19 && decodeByteArray != null) {
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            long j = elapsedRealtime2 - elapsedRealtime;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(108);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j);
            sb.append(" on ui thread: ");
            sb.append(z);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        return decodeByteArray;
    }

    public final zzfsm<Bitmap> zza(String str, double d, boolean z) {
        return zzfsd.zzj(this.zza.zza(str), new zzdot(this, d, z), this.zzc);
    }
}
