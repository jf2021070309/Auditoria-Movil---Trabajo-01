package com.google.android.gms.internal.auth;

import android.net.Uri;
import c.f.a;
/* loaded from: classes.dex */
public final class zzcq {
    private static final a<String, Uri> zza = new a<>();

    public static synchronized Uri zza(String str) {
        Uri orDefault;
        synchronized (zzcq.class) {
            a<String, Uri> aVar = zza;
            orDefault = aVar.getOrDefault("com.google.android.gms.auth_account", null);
            if (orDefault == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.auth_account"));
                orDefault = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                aVar.put("com.google.android.gms.auth_account", orDefault);
            }
        }
        return orDefault;
    }
}
