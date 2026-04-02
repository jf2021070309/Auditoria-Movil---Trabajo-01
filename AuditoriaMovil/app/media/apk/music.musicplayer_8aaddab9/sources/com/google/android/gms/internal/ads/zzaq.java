package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.ads.AdError;
import e.a.d.a.a;
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
import java.util.Objects;
/* loaded from: classes.dex */
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

    private zzaq(String str, int i2, int i3, boolean z, zzav zzavVar, zzfly<String> zzflyVar, boolean z2) {
        super(true);
        this.zze = str;
        this.zzc = i2;
        this.zzd = i3;
        this.zzb = z;
        this.zzf = zzavVar;
        this.zzg = new zzav();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zzaq(String str, String str2, int i2, int i3, boolean z, zzav zzavVar, zzfly<String> zzflyVar, boolean z2) {
        this(str, str2, i2, i3, z, null, false);
    }

    private final HttpURLConnection zzk(URL url, int i2, byte[] bArr, long j2, long j3, boolean z, boolean z2, Map<String, String> map) throws IOException {
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
        if (j2 == 0 && j3 == -1) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bytes=");
            sb2.append(j2);
            sb2.append("-");
            if (j3 != -1) {
                sb2.append((j2 + j3) - 1);
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
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    String valueOf = String.valueOf(protocol);
                    throw new zzat(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "), zzanVar, (int) AdError.INTERNAL_ERROR_CODE, 1);
                } else if (this.zzb || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    String protocol2 = url.getProtocol();
                    StringBuilder sb = new StringBuilder(String.valueOf(protocol2).length() + 41 + protocol.length());
                    a.M(sb, "Disallowed cross-protocol redirect (", protocol2, " to ", protocol);
                    sb.append(")");
                    throw new zzat(sb.toString(), zzanVar, (int) AdError.INTERNAL_ERROR_CODE, 1);
                }
            } catch (MalformedURLException e2) {
                throw new zzat(e2, zzanVar, (int) AdError.INTERNAL_ERROR_CODE, 1);
            }
        }
        throw new zzat("Null location redirect", zzanVar, (int) AdError.INTERNAL_ERROR_CODE, 1);
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                zzaln.zzb("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
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
    public final int zzg(byte[] bArr, int i2, int i3) throws zzat {
        if (i3 == 0) {
            return 0;
        }
        try {
            long j2 = this.zzm;
            if (j2 != -1) {
                long j3 = j2 - this.zzn;
                if (j3 == 0) {
                    return -1;
                }
                i3 = (int) Math.min(i3, j3);
            }
            InputStream inputStream = this.zzj;
            int i4 = zzamq.zza;
            int read = inputStream.read(bArr, i2, i3);
            if (read == -1) {
                return -1;
            }
            this.zzn += read;
            zzd(read);
            return read;
        } catch (IOException e2) {
            zzan zzanVar = this.zzh;
            int i5 = zzamq.zza;
            throw zzat.zza(e2, zzanVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ca, code lost:
        r5 = 1;
        r2 = new java.lang.StringBuilder(31);
        r2.append("Too many redirects: ");
        r2.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ee, code lost:
        throw new com.google.android.gms.internal.ads.zzat(new java.net.NoRouteToHostException(r2.toString()), r25, (int) com.facebook.ads.AdError.INTERNAL_ERROR_CODE, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
        if (r8 != 0) goto L15;
     */
    @Override // com.google.android.gms.internal.ads.zzaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzh(com.google.android.gms.internal.ads.zzan r25) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 509
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
                long j2 = this.zzm;
                long j3 = j2 == -1 ? -1L : j2 - this.zzn;
                HttpURLConnection httpURLConnection = this.zzi;
                try {
                    if (httpURLConnection != null) {
                        int i2 = zzamq.zza;
                        if (i2 >= 19) {
                            if (i2 <= 20) {
                                try {
                                    InputStream inputStream2 = httpURLConnection.getInputStream();
                                    if (j3 == -1) {
                                        if (inputStream2.read() != -1) {
                                        }
                                    } else if (j3 <= 2048) {
                                    }
                                    String name = inputStream2.getClass().getName();
                                    if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                                        Class<? super Object> superclass = inputStream2.getClass().getSuperclass();
                                        Objects.requireNonNull(superclass);
                                        Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                        declaredMethod.setAccessible(true);
                                        declaredMethod.invoke(inputStream2, new Object[0]);
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            inputStream.close();
                        }
                    }
                    inputStream.close();
                } catch (IOException e2) {
                    zzan zzanVar = this.zzh;
                    int i3 = zzamq.zza;
                    throw new zzat(e2, zzanVar, 2000, 3);
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
}
