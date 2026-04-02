package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes.dex */
public final class zzcll extends zzag implements zzaw {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> zzc = new AtomicReference<>();
    private final SSLSocketFactory zzd;
    private final int zze;
    private final int zzf;
    private final String zzg;
    private final zzav zzh;
    private zzan zzi;
    private HttpURLConnection zzj;
    private InputStream zzk;
    private boolean zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private final Set<Socket> zzs;

    public zzcll(String str, zzay zzayVar, int i2, int i3, int i4) {
        super(true);
        this.zzd = new zzclk(this);
        this.zzs = new HashSet();
        zzakt.zzf(str);
        this.zzg = str;
        this.zzh = new zzav();
        this.zze = i2;
        this.zzf = i3;
        this.zzr = i4;
        if (zzayVar != null) {
            zza(zzayVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                zzcgt.zzg("Unexpected error while disconnecting", e2);
            }
            this.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzag, com.google.android.gms.internal.ads.zzaj
    public final Map<String, List<String>> zzf() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.zzah
    public final int zzg(byte[] bArr, int i2, int i3) throws zzat {
        try {
            if (this.zzp != this.zzn) {
                byte[] andSet = zzc.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j2 = this.zzp;
                    long j3 = this.zzn;
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
                    this.zzp += read;
                    zzd(read);
                }
            }
            if (i3 == 0) {
                return 0;
            }
            long j4 = this.zzo;
            if (j4 != -1) {
                long j5 = j4 - this.zzq;
                if (j5 != 0) {
                    i3 = (int) Math.min(i3, j5);
                }
                return -1;
            }
            int read2 = this.zzk.read(bArr, i2, i3);
            if (read2 == -1) {
                if (this.zzo == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzq += read2;
            zzd(read2);
            return read2;
        } catch (IOException e2) {
            throw new zzat(e2, this.zzi, 2000, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x010b, code lost:
        if (r2 != 0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f3  */
    @Override // com.google.android.gms.internal.ads.zzaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzh(com.google.android.gms.internal.ads.zzan r22) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcll.zzh(com.google.android.gms.internal.ads.zzan):long");
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final Uri zzi() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final void zzj() throws zzat {
        try {
            if (this.zzk != null) {
                HttpURLConnection httpURLConnection = this.zzj;
                long j2 = this.zzo;
                if (j2 != -1) {
                    j2 -= this.zzq;
                }
                int i2 = zzamq.zza;
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
                    throw new zzat(e2, this.zzi, 2000, 3);
                }
            }
        } finally {
            this.zzk = null;
            zzn();
            if (this.zzl) {
                this.zzl = false;
                zze();
            }
            this.zzs.clear();
        }
    }

    public final void zzl(int i2) {
        this.zzr = i2;
        for (Socket socket : this.zzs) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzr);
                } catch (SocketException e2) {
                    zzcgt.zzj("Failed to update receive buffer size.", e2);
                }
            }
        }
    }
}
