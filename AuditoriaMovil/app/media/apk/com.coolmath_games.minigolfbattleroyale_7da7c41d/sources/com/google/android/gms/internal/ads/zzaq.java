package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaq extends zzag implements zzaw {
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzav zzf;
    private final zzav zzg;
    private zzan zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;

    @Deprecated
    public zzaq() {
        this(null, 8000, 8000, false, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zzaq(String str, String str2, int i, int i2, boolean z, zzav zzavVar, zzfly<String> zzflyVar, boolean z2) {
        this(str, str2, i, i2, z, null, false);
    }

    private final HttpURLConnection zzk(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        String sb;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzc);
        httpURLConnection.setReadTimeout(this.zzd);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.zzf.zza());
        hashMap.putAll(this.zzg.zza());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j == 0 && j2 == -1) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bytes=");
            sb2.append(j);
            sb2.append("-");
            if (j2 != -1) {
                sb2.append((j + j2) - 1);
            }
            sb = sb2.toString();
        }
        if (sb != null) {
            httpURLConnection.setRequestProperty("Range", sb);
        }
        String str = this.zze;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        httpURLConnection.setRequestMethod(zzan.zza(1));
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, String str, zzan zzanVar) throws zzat {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if ("https".equals(protocol) || "http".equals(protocol)) {
                    if (this.zzb || protocol.equals(url.getProtocol())) {
                        return url2;
                    }
                    String protocol2 = url.getProtocol();
                    StringBuilder sb = new StringBuilder(String.valueOf(protocol2).length() + 41 + String.valueOf(protocol).length());
                    sb.append("Disallowed cross-protocol redirect (");
                    sb.append(protocol2);
                    sb.append(" to ");
                    sb.append(protocol);
                    sb.append(")");
                    throw new zzat(sb.toString(), zzanVar, 2001, 1);
                }
                String valueOf = String.valueOf(protocol);
                throw new zzat(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "), zzanVar, 2001, 1);
            } catch (MalformedURLException e) {
                throw new zzat(e, zzanVar, 2001, 1);
            }
        }
        throw new zzat("Null location redirect", zzanVar, 2001, 1);
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzaln.zzb("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzag, com.google.android.gms.internal.ads.zzaj
    public final Map<String, List<String>> zzf() {
        HttpURLConnection httpURLConnection = this.zzi;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.zzah
    public final int zzg(byte[] bArr, int i, int i2) throws zzat {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzm;
            if (j != -1) {
                long j2 = j - this.zzn;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.zzj;
            int i3 = zzamq.zza;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.zzn += read;
            zzd(read);
            return read;
        } catch (IOException e) {
            zzan zzanVar = this.zzh;
            int i4 = zzamq.zza;
            throw zzat.zza(e, zzanVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d2, code lost:
        r5 = 1;
        r2 = new java.lang.StringBuilder(31);
        r2.append("Too many redirects: ");
        r2.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f6, code lost:
        throw new com.google.android.gms.internal.ads.zzat(new java.net.NoRouteToHostException(r2.toString()), r25, 2001, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
        if (r8 != 0) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzh(com.google.android.gms.internal.ads.zzan r25) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaq.zzh(com.google.android.gms.internal.ads.zzan):long");
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final Uri zzi() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final void zzj() throws zzat {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                long j = this.zzm;
                long j2 = j == -1 ? -1L : j - this.zzn;
                HttpURLConnection httpURLConnection = this.zzi;
                try {
                    if (httpURLConnection != null && zzamq.zza >= 19) {
                        if (zzamq.zza <= 20) {
                            try {
                                InputStream inputStream2 = httpURLConnection.getInputStream();
                                if (j2 == -1) {
                                    if (inputStream2.read() != -1) {
                                    }
                                } else if (j2 <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                                }
                                String name = inputStream2.getClass().getName();
                                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                                    Class<? super Object> superclass = inputStream2.getClass().getSuperclass();
                                    if (superclass != null) {
                                        Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                        declaredMethod.setAccessible(true);
                                        declaredMethod.invoke(inputStream2, new Object[0]);
                                    } else {
                                        throw null;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        inputStream.close();
                    }
                    inputStream.close();
                } catch (IOException e) {
                    zzan zzanVar = this.zzh;
                    int i = zzamq.zza;
                    throw new zzat(e, zzanVar, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzm();
            if (this.zzk) {
                this.zzk = false;
                zze();
            }
        }
    }

    private zzaq(String str, int i, int i2, boolean z, zzav zzavVar, zzfly<String> zzflyVar, boolean z2) {
        super(true);
        this.zze = str;
        this.zzc = i;
        this.zzd = i2;
        this.zzb = z;
        this.zzf = zzavVar;
        this.zzg = new zzav();
    }
}
