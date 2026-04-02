package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class DynamiteModule {
    @KeepForSdk
    public static final int LOCAL = -1;
    @KeepForSdk
    public static final int NONE = 0;
    @KeepForSdk
    public static final int NO_SELECTION = 0;
    @KeepForSdk
    public static final int REMOTE = 1;
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static Boolean zzf;
    private static zzq zzk;
    private static zzr zzl;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzf();
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzg();
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
    public static final VersionPolicy zza = new zzl();

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @DynamiteApi
    /* loaded from: classes2.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, zzp zzpVar) {
            super(str, th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes2.dex */
    public interface VersionPolicy {

        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        @KeepForSdk
        /* loaded from: classes2.dex */
        public interface IVersions {
            int zza(Context context, String str);

            int zzb(Context context, String str, boolean z) throws LoadingException;
        }

        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        @KeepForSdk
        /* loaded from: classes2.dex */
        public static class SelectionResult {
            @KeepForSdk
            public int localVersion = 0;
            @KeepForSdk
            public int remoteVersion = 0;
            @KeepForSdk
            public int selection = 0;
        }

        @KeepForSdk
        SelectionResult selectModule(Context context, String str, IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    @KeepForSdk
    public static int getLocalVersion(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!Objects.equal(declaredField.get(null), str)) {
                String.valueOf(declaredField.get(null));
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage()));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    @KeepForSdk
    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        Boolean bool;
        IObjectWrapper zzh2;
        DynamiteModule dynamiteModule;
        zzr zzrVar;
        boolean z;
        Boolean valueOf;
        IObjectWrapper zze2;
        ThreadLocal threadLocal = zzg;
        zzn zznVar = (zzn) threadLocal.get();
        zzn zznVar2 = new zzn(null);
        threadLocal.set(zznVar2);
        ThreadLocal threadLocal2 = zzh;
        long longValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            VersionPolicy.SelectionResult selectModule = versionPolicy.selectModule(context, str, zzi);
            int i = selectModule.localVersion;
            int i2 = selectModule.remoteVersion;
            int i3 = selectModule.selection;
            if (i3 != 0) {
                if (i3 == -1) {
                    if (i != 0) {
                        i3 = -1;
                    }
                }
                if (i3 != 1 || i2 != 0) {
                    if (i3 == -1) {
                        DynamiteModule zzc2 = zzc(context, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = zznVar2.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(zznVar);
                        return zzc2;
                    }
                    try {
                        if (i3 == 1) {
                            try {
                                synchronized (DynamiteModule.class) {
                                    if (zzf(context)) {
                                        bool = zzb;
                                    } else {
                                        throw new LoadingException("Remote loading disabled", null);
                                    }
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        synchronized (DynamiteModule.class) {
                                            zzrVar = zzl;
                                        }
                                        if (zzrVar != null) {
                                            zzn zznVar3 = (zzn) threadLocal.get();
                                            if (zznVar3 != null && zznVar3.zza != null) {
                                                Context applicationContext = context.getApplicationContext();
                                                Cursor cursor2 = zznVar3.zza;
                                                ObjectWrapper.wrap(null);
                                                synchronized (DynamiteModule.class) {
                                                    if (zze >= 2) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    valueOf = Boolean.valueOf(z);
                                                }
                                                if (valueOf.booleanValue()) {
                                                    zze2 = zzrVar.zzf(ObjectWrapper.wrap(applicationContext), str, i2, ObjectWrapper.wrap(cursor2));
                                                } else {
                                                    zze2 = zzrVar.zze(ObjectWrapper.wrap(applicationContext), str, i2, ObjectWrapper.wrap(cursor2));
                                                }
                                                Context context2 = (Context) ObjectWrapper.unwrap(zze2);
                                                if (context2 != null) {
                                                    dynamiteModule = new DynamiteModule(context2);
                                                } else {
                                                    throw new LoadingException("Failed to get module context", null);
                                                }
                                            } else {
                                                throw new LoadingException("No result cursor", null);
                                            }
                                        } else {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                    } else {
                                        zzq zzg2 = zzg(context);
                                        if (zzg2 != null) {
                                            int zze3 = zzg2.zze();
                                            if (zze3 >= 3) {
                                                zzn zznVar4 = (zzn) threadLocal.get();
                                                if (zznVar4 != null) {
                                                    zzh2 = zzg2.zzi(ObjectWrapper.wrap(context), str, i2, ObjectWrapper.wrap(zznVar4.zza));
                                                } else {
                                                    throw new LoadingException("No cached result cursor holder", null);
                                                }
                                            } else if (zze3 == 2) {
                                                zzh2 = zzg2.zzj(ObjectWrapper.wrap(context), str, i2);
                                            } else {
                                                zzh2 = zzg2.zzh(ObjectWrapper.wrap(context), str, i2);
                                            }
                                            Object unwrap = ObjectWrapper.unwrap(zzh2);
                                            if (unwrap != null) {
                                                dynamiteModule = new DynamiteModule((Context) unwrap);
                                            } else {
                                                throw new LoadingException("Failed to load remote module.", null);
                                            }
                                        } else {
                                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                        }
                                    }
                                    if (longValue == 0) {
                                        threadLocal2.remove();
                                    } else {
                                        threadLocal2.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor3 = zznVar2.zza;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal.set(zznVar);
                                    return dynamiteModule;
                                }
                                throw new LoadingException("Failed to determine which loading route to use.", null);
                            } catch (RemoteException e) {
                                throw new LoadingException("Failed to load remote module.", e, null);
                            } catch (LoadingException e2) {
                                throw e2;
                            }
                        }
                        throw new LoadingException("VersionPolicy returned invalid code:" + i3, null);
                    }
                }
            }
            throw new LoadingException("No acceptable module " + str + " found. Local version is " + selectModule.localVersion + " and remote version is " + selectModule.remoteVersion + ".", null);
        } catch (Throwable th) {
            if (longValue == 0) {
                zzh.remove();
            } else {
                zzh.set(Long.valueOf(longValue));
            }
            Cursor cursor4 = zznVar2.zza;
            if (cursor4 != null) {
                cursor4.close();
            }
            zzg.set(zznVar);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0126, code lost:
        if (zze(r11) != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0163 A[Catch: all -> 0x016a, TryCatch #4 {all -> 0x016a, blocks: (B:3:0x0002, B:61:0x00c4, B:63:0x00ca, B:68:0x00d4, B:90:0x012c, B:97:0x0139, B:114:0x0163, B:115:0x0166, B:110:0x015c, B:66:0x00d0, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:59:0x00c1, B:19:0x0046, B:41:0x009a, B:44:0x009d, B:52:0x00b6, B:60:0x00c3, B:58:0x00bc), top: B:127:0x0002, inners: #11 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zza(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
        r10.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int zzb(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzh     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L19
            r10 = r4
        L19:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            r12.<init>()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            android.net.Uri r4 = r10.build()     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lab java.lang.Exception -> Lae
            if (r10 == 0) goto La3
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lbe
            if (r11 == 0) goto La3
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lbe
            if (r12 <= 0) goto L8e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lbe
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.dynamite.DynamiteModule.zzc = r2     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 < 0) goto L6f
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.dynamite.DynamiteModule.zze = r2     // Catch: java.lang.Throwable -> L8b
        L6f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 < 0) goto L82
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L7e
            goto L7f
        L7e:
            r9 = r11
        L7f:
            com.google.android.gms.dynamite.DynamiteModule.zzd = r9     // Catch: java.lang.Throwable -> L8b
            r11 = r9
        L82:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            boolean r1 = zze(r10)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lbe
            if (r1 == 0) goto L8e
            r10 = r0
            goto L8e
        L8b:
            r11 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            throw r11     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lbe
        L8e:
            if (r13 == 0) goto L9d
            if (r11 != 0) goto L93
            goto L9d
        L93:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lbe
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lbe
            throw r11     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lbe
        L9b:
            r11 = move-exception
            goto Lb1
        L9d:
            if (r10 == 0) goto La2
            r10.close()
        La2:
            return r12
        La3:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lbe
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lbe
            throw r11     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> Lbe
        Lab:
            r10 = move-exception
            r11 = r10
            goto Lc0
        Lae:
            r10 = move-exception
            r11 = r10
            r10 = r0
        Lb1:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch: java.lang.Throwable -> Lbe
            if (r12 == 0) goto Lb6
            throw r11     // Catch: java.lang.Throwable -> Lbe
        Lb6:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r12 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r13 = "V2 version check failed"
            r12.<init>(r13, r11, r0)     // Catch: java.lang.Throwable -> Lbe
            throw r12     // Catch: java.lang.Throwable -> Lbe
        Lbe:
            r11 = move-exception
            r0 = r10
        Lc0:
            if (r0 == 0) goto Lc5
            r0.close()
        Lc5:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule zzc(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzr) {
                    zzrVar = (zzr) queryLocalInterface;
                } else {
                    zzrVar = new zzr(iBinder);
                }
            }
            zzl = zzrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zznVar = (zzn) zzg.get();
        if (zznVar != null && zznVar.zza == null) {
            zznVar.zza = cursor;
            return true;
        }
        return false;
    }

    private static boolean zzf(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzf)) {
            return true;
        }
        boolean z = false;
        if (zzf == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            zzf = valueOf;
            z = valueOf.booleanValue();
            if (z && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                zzd = true;
            }
        }
        return z;
    }

    private static zzq zzg(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = zzk;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof zzq) {
                        zzqVar = (zzq) queryLocalInterface;
                    } else {
                        zzqVar = new zzq(iBinder);
                    }
                }
                if (zzqVar != null) {
                    zzk = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e) {
                e.getMessage();
            }
            return null;
        }
    }

    @KeepForSdk
    public Context getModuleContext() {
        return this.zzj;
    }

    @KeepForSdk
    public IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, null);
        }
    }
}
