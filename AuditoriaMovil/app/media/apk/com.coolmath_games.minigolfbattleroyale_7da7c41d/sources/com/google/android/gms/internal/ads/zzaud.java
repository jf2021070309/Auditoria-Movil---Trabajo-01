package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaud implements zzaui {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> zzc = new AtomicReference<>();
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzauh zzg;
    private final zzauo<? super zzaud> zzh;
    private zzaub zzi;
    private HttpURLConnection zzj;
    private InputStream zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;

    public zzaud(String str, zzauz<String> zzauzVar, zzauo<? super zzaud> zzauoVar, int i, int i2, boolean z, zzauh zzauhVar) {
        zzaup.zzf(str);
        this.zzf = str;
        this.zzh = zzauoVar;
        this.zzg = new zzauh();
        this.zzd = i;
        this.zze = i2;
    }

    private final void zzf() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.zzj = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:
        if (r3 != 0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01da  */
    @Override // com.google.android.gms.internal.ads.zzatz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zza(com.google.android.gms.internal.ads.zzaub r21) throws com.google.android.gms.internal.ads.zzauf {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaud.zza(com.google.android.gms.internal.ads.zzaub):long");
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final void zzd() throws zzauf {
        try {
            if (this.zzk != null) {
                HttpURLConnection httpURLConnection = this.zzj;
                long j = this.zzn;
                if (j != -1) {
                    j -= this.zzp;
                }
                if (zzave.zza == 19 || zzave.zza == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j == -1) {
                            if (inputStream.read() != -1) {
                            }
                        } else if (j <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                        }
                        String name = inputStream.getClass().getName();
                        if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                            Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(inputStream, new Object[0]);
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.zzk.close();
                } catch (IOException e) {
                    throw new zzauf(e, this.zzi, 3);
                }
            }
        } finally {
            this.zzk = null;
            zzf();
            if (this.zzl) {
                this.zzl = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final Map<String, List<String>> zze() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final int zzb(byte[] bArr, int i, int i2) throws zzauf {
        try {
            if (this.zzo != this.zzm) {
                byte[] andSet = zzc.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j = this.zzo;
                    long j2 = this.zzm;
                    if (j != j2) {
                        int read = this.zzk.read(andSet, 0, (int) Math.min(j2 - j, andSet.length));
                        if (Thread.interrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.zzo += read;
                            zzauo<? super zzaud> zzauoVar = this.zzh;
                            if (zzauoVar != null) {
                                zzauoVar.zzk(this, read);
                            }
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        zzc.set(andSet);
                        break;
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.zzn;
            if (j3 != -1) {
                long j4 = j3 - this.zzp;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                }
                return -1;
            }
            int read2 = this.zzk.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.zzn == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzp += read2;
            zzauo<? super zzaud> zzauoVar2 = this.zzh;
            if (zzauoVar2 != null) {
                zzauoVar2.zzk(this, read2);
                return read2;
            }
            return read2;
        } catch (IOException e) {
            throw new zzauf(e, this.zzi, 2);
        }
    }
}
