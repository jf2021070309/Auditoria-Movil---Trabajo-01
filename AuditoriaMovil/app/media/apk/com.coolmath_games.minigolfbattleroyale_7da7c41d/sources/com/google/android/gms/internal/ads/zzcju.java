package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
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
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcju(String str, zzauo<? super zzcju> zzauoVar, int i, int i2, int i3) {
        zzaup.zzf(str);
        this.zzg = str;
        this.zzi = zzauoVar;
        this.zzh = new zzauh();
        this.zze = i;
        this.zzf = i2;
        this.zzr = i3;
    }

    private final void zzi() {
        HttpURLConnection httpURLConnection = this.zzk;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zze.zzg("Unexpected error while disconnecting", e);
            }
            this.zzk = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fd, code lost:
        if (r3 != 0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01dc  */
    @Override // com.google.android.gms.internal.ads.zzatz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zza(com.google.android.gms.internal.ads.zzaub r22) throws com.google.android.gms.internal.ads.zzauf {
        /*
            Method dump skipped, instructions count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcju.zza(com.google.android.gms.internal.ads.zzaub):long");
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
                long j = this.zzo;
                if (j != -1) {
                    j -= this.zzq;
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
                    this.zzl.close();
                } catch (IOException e) {
                    throw new zzauf(e, this.zzj, 3);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzg(int i) {
        this.zzr = i;
        for (Socket socket : this.zzs) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzr);
                } catch (SocketException e) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final int zzb(byte[] bArr, int i, int i2) throws zzauf {
        try {
            if (this.zzp != this.zzn) {
                byte[] andSet = zzc.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j = this.zzp;
                    long j2 = this.zzn;
                    if (j != j2) {
                        int read = this.zzl.read(andSet, 0, (int) Math.min(j2 - j, andSet.length));
                        if (Thread.interrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.zzp += read;
                            zzauo<? super zzcju> zzauoVar = this.zzi;
                            if (zzauoVar != null) {
                                ((zzcki) zzauoVar).zzS(this, read);
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
            long j3 = this.zzo;
            if (j3 != -1) {
                long j4 = j3 - this.zzq;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                }
                return -1;
            }
            int read2 = this.zzl.read(bArr, i, i2);
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
        } catch (IOException e) {
            throw new zzauf(e, this.zzj, 2);
        }
    }
}
