package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.FirebaseApp;
import com.umeng.analytics.pro.cv;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
/* loaded from: classes2.dex */
public final class zzan {
    private final Context a;
    private String b;
    private String c;
    private int d;
    private int e = 0;

    public zzan(Context context) {
        this.a = context;
    }

    public final synchronized int zzac() {
        int i = 0;
        synchronized (this) {
            if (this.e != 0) {
                i = this.e;
            } else {
                PackageManager packageManager = this.a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
                } else {
                    if (!PlatformVersion.isAtLeastO()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.e = 1;
                            i = this.e;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                        this.e = 2;
                        i = this.e;
                    } else {
                        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
                        if (PlatformVersion.isAtLeastO()) {
                            this.e = 2;
                        } else {
                            this.e = 1;
                        }
                        i = this.e;
                    }
                }
            }
        }
        return i;
    }

    public static String zza(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId == null) {
            String applicationId = firebaseApp.getOptions().getApplicationId();
            if (applicationId.startsWith("1:")) {
                String[] split = applicationId.split(":");
                if (split.length < 2) {
                    return null;
                }
                String str = split[1];
                if (str.isEmpty()) {
                    return null;
                }
                return str;
            }
            return applicationId;
        }
        return gcmSenderId;
    }

    public static String zza(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & cv.m) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException e) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public final synchronized String zzad() {
        if (this.b == null) {
            a();
        }
        return this.b;
    }

    public final synchronized String zzae() {
        if (this.c == null) {
            a();
        }
        return this.c;
    }

    public final synchronized int zzaf() {
        PackageInfo a;
        if (this.d == 0 && (a = a("com.google.android.gms")) != null) {
            this.d = a.versionCode;
        }
        return this.d;
    }

    private final synchronized void a() {
        PackageInfo a = a(this.a.getPackageName());
        if (a != null) {
            this.b = Integer.toString(a.versionCode);
            this.c = a.versionName;
        }
    }

    private final PackageInfo a(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            Log.w("FirebaseInstanceId", new StringBuilder(String.valueOf(valueOf).length() + 23).append("Failed to find package ").append(valueOf).toString());
            return null;
        }
    }
}
