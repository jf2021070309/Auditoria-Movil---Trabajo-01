package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.dynamic.ObjectWrapper;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class DynamiteModule {
    private static Boolean zzb = null;
    private static String zzc = null;
    private static int zzd = -1;
    private static zzo zzi;
    private static zzp zzj;
    private final Context zzh;
    private static final ThreadLocal<zzk> zze = new ThreadLocal<>();
    private static final ThreadLocal<Long> zzf = new zzb();
    private static final zzm zzg = new zzc();
    public static final VersionPolicy PREFER_REMOTE = new zzd();
    public static final VersionPolicy PREFER_LOCAL = new zze();
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzf();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzg();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzh();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzi();
    public static final VersionPolicy zza = new zzj();

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    /* loaded from: classes.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    /* loaded from: classes.dex */
    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, zzb zzbVar) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, zzb zzbVar) {
            super(str, th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    /* loaded from: classes.dex */
    public interface VersionPolicy {
        zzn zza(Context context, String str, zzm zzmVar) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzh = context;
    }

    public static int getLocalVersion(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!Objects.equal(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
                sb2.append("Module descriptor id '");
                sb2.append(valueOf);
                sb2.append("' didn't match expected id '");
                sb2.append(str);
                sb2.append("'");
                Log.e("DynamiteModule", sb2.toString());
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x02b1, code lost:
        if (r1 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b0, code lost:
        if (r1 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b2, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b5, code lost:
        com.google.android.gms.dynamite.DynamiteModule.zze.set(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ba, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.dynamite.DynamiteModule load(android.content.Context r18, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy r19, java.lang.String r20) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.load(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    public static int zza(Context context, String str, boolean z) {
        Field declaredField;
        ClassLoader zzaVar;
        Throwable th;
        RemoteException e;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzb;
                Cursor cursor = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String valueOf = String.valueOf(e2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(valueOf);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != null) {
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    zze(classLoader);
                                } catch (LoadingException unused) {
                                }
                                bool = Boolean.TRUE;
                            }
                        } else if ("com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        } else {
                            try {
                                int zzb2 = zzb(context, str, z);
                                if (zzc != null && !zzc.isEmpty()) {
                                    if (Build.VERSION.SDK_INT < 29) {
                                        String str2 = zzc;
                                        Preconditions.checkNotNull(str2);
                                        zzaVar = new zza(str2, ClassLoader.getSystemClassLoader());
                                    } else {
                                        String str3 = zzc;
                                        Preconditions.checkNotNull(str3);
                                        zzaVar = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                    }
                                    zze(zzaVar);
                                    declaredField.set(null, zzaVar);
                                    zzb = Boolean.TRUE;
                                    return zzb2;
                                }
                                return zzb2;
                            } catch (LoadingException unused2) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            }
                        }
                        zzb = bool;
                    }
                }
                boolean booleanValue = bool.booleanValue();
                int i = 0;
                if (!booleanValue) {
                    zzo zzf2 = zzf(context);
                    if (zzf2 != null) {
                        try {
                            try {
                                int zzi2 = zzf2.zzi();
                                if (zzi2 >= 3) {
                                    Cursor cursor2 = (Cursor) ObjectWrapper.unwrap(zzf2.zzj(ObjectWrapper.wrap(context), str, z, zzf.get().longValue()));
                                    if (cursor2 != null) {
                                        try {
                                            if (cursor2.moveToFirst()) {
                                                int i2 = cursor2.getInt(0);
                                                if (i2 <= 0 || !zzc(cursor2)) {
                                                    cursor = cursor2;
                                                }
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                i = i2;
                                            }
                                        } catch (RemoteException e3) {
                                            e = e3;
                                            cursor = cursor2;
                                            String valueOf2 = String.valueOf(e.getMessage());
                                            Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf2) : new String("Failed to retrieve remote module version: "));
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            return i;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor = cursor2;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                } else if (zzi2 == 2) {
                                    Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                    i = zzf2.zzh(ObjectWrapper.wrap(context), str, z);
                                } else {
                                    Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                    i = zzf2.zzf(ObjectWrapper.wrap(context), str, z);
                                }
                            } catch (RemoteException e4) {
                                e = e4;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    return i;
                }
                try {
                    return zzb(context, str, z);
                } catch (LoadingException e5) {
                    String valueOf3 = String.valueOf(e5.getMessage());
                    Log.w("DynamiteModule", valueOf3.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf3) : new String("Failed to retrieve remote module version: "));
                    return 0;
                }
            }
        } catch (Throwable th4) {
            CrashUtils.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
        if (zzc(r9) != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int zzb(android.content.Context r9, java.lang.String r10, boolean r11) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            java.lang.ThreadLocal<java.lang.Long> r1 = com.google.android.gms.dynamite.DynamiteModule.zzf     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r9 = "api_force_staging"
            java.lang.String r4 = "api"
            r5 = 1
            if (r5 == r11) goto L19
            r9 = r4
        L19:
            android.net.Uri$Builder r11 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r11.<init>()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r4 = "content"
            android.net.Uri$Builder r11 = r11.scheme(r4)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r11 = r11.authority(r4)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            android.net.Uri$Builder r9 = r11.path(r9)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            android.net.Uri$Builder r9 = r9.appendPath(r10)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r10 = "requestStartTime"
            java.lang.String r11 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            android.net.Uri$Builder r9 = r9.appendQueryParameter(r10, r11)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            android.net.Uri r4 = r9.build()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            if (r9 == 0) goto L81
            boolean r10 = r9.moveToFirst()     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
            if (r10 == 0) goto L81
            r10 = 0
            int r10 = r9.getInt(r10)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
            if (r10 <= 0) goto L7a
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r11 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r11)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
            r1 = 2
            java.lang.String r1 = r9.getString(r1)     // Catch: java.lang.Throwable -> L77
            com.google.android.gms.dynamite.DynamiteModule.zzc = r1     // Catch: java.lang.Throwable -> L77
            java.lang.String r1 = "loaderVersion"
            int r1 = r9.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L77
            if (r1 < 0) goto L6f
            int r1 = r9.getInt(r1)     // Catch: java.lang.Throwable -> L77
            com.google.android.gms.dynamite.DynamiteModule.zzd = r1     // Catch: java.lang.Throwable -> L77
        L6f:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L77
            boolean r11 = zzc(r9)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
            if (r11 == 0) goto L7a
            goto L7b
        L77:
            r10 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L77
            throw r10     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
        L7a:
            r0 = r9
        L7b:
            if (r0 == 0) goto L80
            r0.close()
        L80:
            return r10
        L81:
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r11 = "Failed to retrieve remote module version."
            android.util.Log.w(r10, r11)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r10 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
            java.lang.String r11 = "Failed to connect to dynamite module ContentResolver."
            r10.<init>(r11, r0)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
            throw r10     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
        L90:
            r10 = move-exception
            goto L98
        L92:
            r9 = move-exception
            r10 = r9
            goto La7
        L95:
            r9 = move-exception
            r10 = r9
            r9 = r0
        L98:
            boolean r11 = r10 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch: java.lang.Throwable -> La5
            if (r11 == 0) goto L9d
            throw r10     // Catch: java.lang.Throwable -> La5
        L9d:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> La5
            java.lang.String r1 = "V2 version check failed"
            r11.<init>(r1, r10, r0)     // Catch: java.lang.Throwable -> La5
            throw r11     // Catch: java.lang.Throwable -> La5
        La5:
            r10 = move-exception
            r0 = r9
        La7:
            if (r0 == 0) goto Lac
            r0.close()
        Lac:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean):int");
    }

    private static boolean zzc(Cursor cursor) {
        zzk zzkVar = zze.get();
        if (zzkVar == null || zzkVar.zza != null) {
            return false;
        }
        zzkVar.zza = cursor;
        return true;
    }

    private static DynamiteModule zzd(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static void zze(ClassLoader classLoader) throws LoadingException {
        zzp zzpVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzpVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzp) {
                    zzpVar = (zzp) queryLocalInterface;
                } else {
                    zzpVar = new zzp(iBinder);
                }
            }
            zzj = zzpVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        }
    }

    private static zzo zzf(Context context) {
        zzo zzoVar;
        synchronized (DynamiteModule.class) {
            if (zzi != null) {
                return zzi;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzoVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof zzo) {
                        zzoVar = (zzo) queryLocalInterface;
                    } else {
                        zzoVar = new zzo(iBinder);
                    }
                }
                if (zzoVar != null) {
                    zzi = zzoVar;
                    return zzoVar;
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    public Context getModuleContext() {
        return this.zzh;
    }

    public IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzh.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf(str);
            throw new LoadingException(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e, null);
        }
    }
}
