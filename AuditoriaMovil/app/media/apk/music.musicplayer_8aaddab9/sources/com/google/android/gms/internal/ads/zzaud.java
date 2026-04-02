package com.google.android.gms.internal.ads;

import android.net.Uri;
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
/* loaded from: classes.dex */
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

    public zzaud(String str, zzauz<String> zzauzVar, zzauo<? super zzaud> zzauoVar, int i2, int i3, boolean z, zzauh zzauhVar) {
        zzaup.zzf(str);
        this.zzf = str;
        this.zzh = zzauoVar;
        this.zzg = new zzauh();
        this.zzd = i2;
        this.zze = i3;
    }

    private final void zzf() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
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
            Method dump skipped, instructions count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaud.zza(com.google.android.gms.internal.ads.zzaub):long");
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final int zzb(byte[] bArr, int i2, int i3) throws zzauf {
        try {
            if (this.zzo != this.zzm) {
                byte[] andSet = zzc.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j2 = this.zzo;
                    long j3 = this.zzm;
                    if (j2 == j3) {
                        zzc.set(andSet);
                        break;
                    }
                    int read = this.zzk.read(andSet, 0, (int) Math.min(j3 - j2, andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.zzo += read;
                    zzauo<? super zzaud> zzauoVar = this.zzh;
                    if (zzauoVar != null) {
                        zzauoVar.zzk(this, read);
                    }
                }
            }
            if (i3 == 0) {
                return 0;
            }
            long j4 = this.zzn;
            if (j4 != -1) {
                long j5 = j4 - this.zzp;
                if (j5 != 0) {
                    i3 = (int) Math.min(i3, j5);
                }
                return -1;
            }
            int read2 = this.zzk.read(bArr, i2, i3);
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
        } catch (IOException e2) {
            throw new zzauf(e2, this.zzi, 2);
        }
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
                long j2 = this.zzn;
                if (j2 != -1) {
                    j2 -= this.zzp;
                }
                int i2 = zzave.zza;
                if (i2 == 19 || i2 == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j2 == -1) {
                            if (inputStream.read() != -1) {
                            }
                        } else if (j2 <= 2048) {
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
                } catch (IOException e2) {
                    throw new zzauf(e2, this.zzi, 3);
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
}
