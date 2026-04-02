package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzaas {
    private static final String[] zzc = {"/aclk", "/pcs/click", "/dbm/clk"};
    private final String zza = "ad.doubleclick.net";
    private final String[] zzb = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private final zzaao zzd;

    @Deprecated
    public zzaas(zzaao zzaaoVar) {
        this.zzd = zzaaoVar;
    }

    private final Uri zzg(Uri uri, String str) throws zzaat {
        Objects.requireNonNull(uri);
        try {
            try {
                if (uri.getHost().equals(this.zza)) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new zzaat("Parameter already exists: dc_ms");
                    }
                    String uri2 = uri.toString();
                    int indexOf = uri2.indexOf(";adurl");
                    if (indexOf != -1) {
                        int i2 = indexOf + 1;
                        return Uri.parse(uri2.substring(0, i2) + "dc_ms=" + str + ";" + uri2.substring(i2));
                    }
                    String encodedPath = uri.getEncodedPath();
                    int indexOf2 = uri2.indexOf(encodedPath);
                    return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                }
            } catch (UnsupportedOperationException unused) {
                throw new zzaat("Provided Uri is not in a valid state");
            }
        } catch (NullPointerException unused2) {
        }
        if (uri.getQueryParameter("ms") == null) {
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 != -1) {
                int i3 = indexOf3 + 1;
                return Uri.parse(uri3.substring(0, i3) + "ms=" + str + "&" + uri3.substring(i3));
            }
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        throw new zzaat("Query parameter already exists: ms");
    }

    public final boolean zza(Uri uri) {
        Objects.requireNonNull(uri);
        try {
            String host = uri.getHost();
            String[] strArr = this.zzb;
            for (int i2 = 0; i2 < 3; i2++) {
                if (host.endsWith(strArr[i2])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
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
            for (int i2 = 0; i2 < 3; i2++) {
                if (uri.getPath().endsWith(strArr[i2])) {
                    return true;
                }
            }
        }
        return false;
    }
}
