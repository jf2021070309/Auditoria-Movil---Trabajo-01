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
public final class zzcju implements zzaui {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> zzc = new AtomicReference<>();
    private final int zze;
    private final int zzf;
    private final String zzg;
    private final zzauh zzh;
    private final zzauo<? super zzcju> zzi;
    private zzaub zzj;
    private HttpURLConnection zzk;
    private InputStream zzl;
    private boolean zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private final SSLSocketFactory zzd = new zzcjt(this);
    private final Set<Socket> zzs = new HashSet();

    public zzcju(String str, zzauo<? super zzcju> zzauoVar, int i2, int i3, int i4) {
        zzaup.zzf(str);
        this.zzg = str;
        this.zzi = zzauoVar;
        this.zzh = new zzauh();
        this.zze = i2;
        this.zzf = i3;
        this.zzr = i4;
    }

    private final void zzi() {
        HttpURLConnection httpURLConnection = this.zzk;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                zzcgt.zzg("Unexpected error while disconnecting", e2);
            }
            this.zzk = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0104, code lost:
        if (r6 != 0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025b A[Catch: IOException -> 0x02b7, TryCatch #0 {IOException -> 0x02b7, blocks: (B:3:0x000e, B:4:0x001e, B:6:0x0024, B:8:0x002e, B:9:0x0036, B:10:0x004e, B:12:0x0054, B:24:0x00b8, B:37:0x00ee, B:96:0x0250, B:98:0x025b, B:100:0x026c, B:102:0x0274, B:104:0x0282, B:106:0x028c, B:107:0x028f, B:105:0x0287, B:109:0x0296, B:110:0x029d, B:19:0x007c, B:21:0x0096, B:23:0x00b3, B:111:0x029e, B:112:0x02b6), top: B:121:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzatz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zza(com.google.android.gms.internal.ads.zzaub r24) throws com.google.android.gms.internal.ads.zzauf {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcju.zza(com.google.android.gms.internal.ads.zzaub):long");
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final int zzb(byte[] bArr, int i2, int i3) throws zzauf {
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
                    int read = this.zzl.read(andSet, 0, (int) Math.min(j3 - j2, andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.zzp += read;
                    zzauo<? super zzcju> zzauoVar = this.zzi;
                    if (zzauoVar != null) {
                        ((zzcki) zzauoVar).zzS(this, read);
                    }
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
            int read2 = this.zzl.read(bArr, i2, i3);
            if (read2 == -1) {
                if (this.zzo == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzq += read2;
            zzauo<? super zzcju> zzauoVar2 = this.zzi;
            if (zzauoVar2 != null) {
                ((zzcki) zzauoVar2).zzS(this, read2);
                return read2;
            }
            return read2;
        } catch (IOException e2) {
            throw new zzauf(e2, this.zzj, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzk;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final void zzd() throws zzauf {
        try {
            if (this.zzl != null) {
                HttpURLConnection httpURLConnection = this.zzk;
                long j2 = this.zzo;
                if (j2 != -1) {
                    j2 -= this.zzq;
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
                    this.zzl.close();
                } catch (IOException e2) {
                    throw new zzauf(e2, this.zzj, 3);
                }
            }
        } finally {
            this.zzl = null;
            zzi();
            if (this.zzm) {
                this.zzm = false;
            }
            this.zzs.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final Map<String, List<String>> zze() {
        HttpURLConnection httpURLConnection = this.zzk;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzg(int i2) {
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
