package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.firebase_messaging.zzc;
import com.umeng.analytics.pro.as;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class aq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public final ar a(Context context, String str) {
        ar c = c(context, str);
        return c != null ? c : b(context, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ar b(Context context, String str) {
        ar arVar = new ar(zza.zzb(), System.currentTimeMillis());
        ar a = a(context, str, arVar, true);
        if (a != null && !a.equals(arVar)) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Loaded key after generating new one, using loaded one");
                return a;
            }
            return a;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Generated new key");
        }
        a(context, str, arVar);
        return arVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context) {
        File[] listFiles;
        for (File file : b(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    private final ar c(Context context, String str) {
        a aVar;
        ar a;
        ar d;
        try {
            d = d(context, str);
        } catch (a e) {
            aVar = e;
        }
        if (d != null) {
            a(context, str, d);
            return d;
        }
        aVar = null;
        try {
            a = a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
        } catch (a e2) {
            e = e2;
        }
        if (a != null) {
            a(context, str, a, false);
            return a;
        }
        e = aVar;
        if (e != null) {
            throw e;
        }
        return null;
    }

    private static KeyPair a(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                return new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(decode)), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                Log.w("FirebaseInstanceId", new StringBuilder(String.valueOf(valueOf).length() + 19).append("Invalid key stored ").append(valueOf).toString());
                throw new a(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new a(e2);
        }
    }

    private final ar d(Context context, String str) {
        File e = e(context, str);
        if (!e.exists()) {
            return null;
        }
        try {
            return a(e);
        } catch (a | IOException e2) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e2);
                Log.d("FirebaseInstanceId", new StringBuilder(String.valueOf(valueOf).length() + 40).append("Failed to read key from file, retrying: ").append(valueOf).toString());
            }
            try {
                return a(e);
            } catch (IOException e3) {
                String valueOf2 = String.valueOf(e3);
                Log.w("FirebaseInstanceId", new StringBuilder(String.valueOf(valueOf2).length() + 45).append("IID file exists, but failed to read from it: ").append(valueOf2).toString());
                throw new a(e3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0074 A[Catch: Throwable -> 0x00db, TryCatch #6 {Throwable -> 0x00db, blocks: (B:8:0x0049, B:10:0x004e, B:14:0x0058, B:22:0x006b, B:24:0x0074, B:25:0x009a), top: B:57:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3 A[Catch: Throwable -> 0x00e7, TRY_ENTER, TryCatch #5 {IOException -> 0x00b2, blocks: (B:6:0x003b, B:19:0x0066, B:30:0x00ae, B:7:0x0045, B:17:0x0062, B:39:0x00e3, B:40:0x00e6, B:28:0x00aa), top: B:59:0x003b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.firebase.iid.ar a(android.content.Context r12, java.lang.String r13, com.google.firebase.iid.ar r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.aq.a(android.content.Context, java.lang.String, com.google.firebase.iid.ar, boolean):com.google.firebase.iid.ar");
    }

    private static File b(Context context) {
        File noBackupFilesDir = ContextCompat.getNoBackupFilesDir(context);
        if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
            Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
            return context.getFilesDir();
        }
        return noBackupFilesDir;
    }

    private static File e(Context context, String str) {
        String sb;
        if (TextUtils.isEmpty(str)) {
            sb = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                sb = new StringBuilder(String.valueOf(encodeToString).length() + 33).append("com.google.InstanceId_").append(encodeToString).append(".properties").toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(b(context), sb);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private final com.google.firebase.iid.ar a(java.io.File r11) {
        /*
            r10 = this;
            r7 = 0
            java.io.FileInputStream r8 = new java.io.FileInputStream
            r8.<init>(r11)
            java.nio.channels.FileChannel r1 = r8.getChannel()     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 1
            r1.lock(r2, r4, r6)     // Catch: java.lang.Throwable -> L23
            com.google.firebase.iid.ar r0 = a(r1)     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L1f
            r2 = 0
            a(r2, r1)     // Catch: java.lang.Throwable -> L2f
        L1f:
            a(r7, r8)
            return r0
        L23:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L25
        L25:
            r2 = move-exception
            r9 = r2
            r2 = r0
            r0 = r9
        L29:
            if (r1 == 0) goto L2e
            a(r2, r1)     // Catch: java.lang.Throwable -> L2f
        L2e:
            throw r0     // Catch: java.lang.Throwable -> L2f
        L2f:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L31
        L31:
            r1 = move-exception
            r7 = r0
            r0 = r1
        L34:
            a(r7, r8)
            throw r0
        L38:
            r0 = move-exception
            goto L34
        L3a:
            r0 = move-exception
            r2 = r7
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.aq.a(java.io.File):com.google.firebase.iid.ar");
    }

    private static ar a(FileChannel fileChannel) {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty(as.r);
        if (property == null || property2 == null) {
            throw new a("Invalid properties file");
        }
        try {
            return new ar(a(property, property2), Long.parseLong(properties.getProperty("cre")));
        } catch (NumberFormatException e) {
            throw new a(e);
        }
    }

    private static ar a(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(t.a(str, "|P|"), null);
        String string2 = sharedPreferences.getString(t.a(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        return new ar(a(string, string2), b(sharedPreferences, str));
    }

    private final void a(Context context, String str, ar arVar) {
        String c;
        String d;
        long j;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (arVar.equals(a(sharedPreferences, str))) {
                return;
            }
        } catch (a e) {
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to shared preferences");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String a = t.a(str, "|P|");
        c = arVar.c();
        edit.putString(a, c);
        String a2 = t.a(str, "|K|");
        d = arVar.d();
        edit.putString(a2, d);
        String a3 = t.a(str, "cre");
        j = arVar.b;
        edit.putString(a3, String.valueOf(j));
        edit.commit();
    }

    private static long b(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(t.a(str, "cre"), null);
        if (string != null) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException e) {
            }
        }
        return 0L;
    }

    private static /* synthetic */ void a(Throwable th, FileChannel fileChannel) {
        if (th == null) {
            fileChannel.close();
            return;
        }
        try {
            fileChannel.close();
        } catch (Throwable th2) {
            zzc.zza(th, th2);
        }
    }

    private static /* synthetic */ void a(Throwable th, RandomAccessFile randomAccessFile) {
        if (th == null) {
            randomAccessFile.close();
            return;
        }
        try {
            randomAccessFile.close();
        } catch (Throwable th2) {
            zzc.zza(th, th2);
        }
    }

    private static /* synthetic */ void a(Throwable th, FileInputStream fileInputStream) {
        if (th == null) {
            fileInputStream.close();
            return;
        }
        try {
            fileInputStream.close();
        } catch (Throwable th2) {
            zzc.zza(th, th2);
        }
    }
}
