package com.google.android.gms.internal.pal;

import android.os.Handler;
import com.google.ads.interactivemedia.pal.NonceLoaderException;
import com.google.android.gms.cast.MediaError;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutorService;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzbc extends zzbg {
    public zzbc(Handler handler, ExecutorService executorService) {
        super(handler, executorService, zzagc.zzb(2L));
    }

    private static zzkm zzf() throws NonceLoaderException {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL("https://imasdk.googleapis.com/pal/key/public.json").openConnection();
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        } catch (GeneralSecurityException e2) {
            e = e2;
        }
        try {
            try {
                httpURLConnection.setConnectTimeout(com.google.ads.interactivemedia.pal.zzat.zzb);
                httpURLConnection.setReadTimeout(com.google.ads.interactivemedia.pal.zzat.zzc);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 200) {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        zzkm zzb = zzkm.zzb(zzjz.zza(inputStream));
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        httpURLConnection.disconnect();
                        return zzb;
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th3) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                                } catch (Exception unused) {
                                }
                            }
                        }
                        throw th2;
                    }
                }
                httpURLConnection.getResponseCode();
                throw NonceLoaderException.zzb(MediaError.DetailedErrorCode.MEDIAKEYS_UNSUPPORTED);
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        } catch (IOException | GeneralSecurityException e3) {
            e = e3;
            e.toString();
            throw new NonceLoaderException(MediaError.DetailedErrorCode.MEDIAKEYS_WEBCRYPTO, e);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzbg
    public final zzil zza() throws NonceLoaderException {
        try {
            zznn.zza();
            return zzil.zzf(new zzbb((zzjy) zzf().zzc(zzjy.class)));
        } catch (GeneralSecurityException e) {
            throw new NonceLoaderException(MediaError.DetailedErrorCode.MEDIAKEYS_NETWORK, e);
        }
    }
}
