package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaas {
    private static final String[] zzc = {"/aclk", "/pcs/click", "/dbm/clk"};
    private final String zza = "ad.doubleclick.net";
    private final String[] zzb = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private final zzaao zzd;

    @Deprecated
    public zzaas(zzaao zzaaoVar) {
        this.zzd = zzaaoVar;
    }

    @Deprecated
    public final zzaao zzb() {
        return this.zzd;
    }

    @Deprecated
    public final Uri zzc(Uri uri, Context context) throws zzaat {
        return zzg(uri, this.zzd.zzp(context));
    }

    @Deprecated
    public final void zzd(MotionEvent motionEvent) {
        this.zzd.zzj(motionEvent);
    }

    @Deprecated
    public final Uri zze(Uri uri, Context context, View view, Activity activity) throws zzaat {
        try {
            return zzg(uri, this.zzd.zzl(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzaat("Provided Uri is not in a valid state");
        }
    }

    public final boolean zzf(Uri uri) {
        if (zza(uri)) {
            String[] strArr = zzc;
            for (int i = 0; i < 3; i++) {
                if (uri.getPath().endsWith(strArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    private final Uri zzg(Uri uri, String str) throws zzaat {
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals(this.zza)) {
                    if (!uri.toString().contains("dc_ms=")) {
                        String uri2 = uri.toString();
                        int indexOf = uri2.indexOf(";adurl");
                        if (indexOf != -1) {
                            int i = indexOf + 1;
                            return Uri.parse(uri2.substring(0, i) + "dc_ms=" + str + ";" + uri2.substring(i));
                        }
                        String encodedPath = uri.getEncodedPath();
                        int indexOf2 = uri2.indexOf(encodedPath);
                        return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                    }
                    throw new zzaat("Parameter already exists: dc_ms");
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") == null) {
                String uri3 = uri.toString();
                int indexOf3 = uri3.indexOf("&adurl");
                if (indexOf3 == -1) {
                    indexOf3 = uri3.indexOf("?adurl");
                }
                if (indexOf3 != -1) {
                    int i2 = indexOf3 + 1;
                    return Uri.parse(uri3.substring(0, i2) + "ms=" + str + "&" + uri3.substring(i2));
                }
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            throw new zzaat("Query parameter already exists: ms");
        } catch (UnsupportedOperationException unused2) {
            throw new zzaat("Provided Uri is not in a valid state");
        }
    }

    public final boolean zza(Uri uri) {
        if (uri == null) {
            throw null;
        }
        try {
            String host = uri.getHost();
            String[] strArr = this.zzb;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
