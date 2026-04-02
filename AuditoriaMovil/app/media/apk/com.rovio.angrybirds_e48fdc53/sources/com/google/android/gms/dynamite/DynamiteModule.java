package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes2.dex */
public final class DynamiteModule {
    private static Boolean zzid;
    private static zzi zzie;
    private static zzk zzif;
    private static String zzig;
    private final Context zzim;
    private static int zzih = -1;
    private static final ThreadLocal<zza> zzii = new ThreadLocal<>();
    private static final VersionPolicy.zza zzij = new com.google.android.gms.dynamite.zza();
    public static final VersionPolicy PREFER_REMOTE = new com.google.android.gms.dynamite.zzb();
    private static final VersionPolicy zzik = new zzc();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzd();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zze();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzf();
    private static final VersionPolicy zzil = new zzg();

    /* loaded from: classes2.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* loaded from: classes2.dex */
    public interface VersionPolicy {

        /* loaded from: classes2.dex */
        public interface zza {
            int getLocalVersion(Context context, String str);

            int zza(Context context, String str, boolean z);
        }

        /* loaded from: classes2.dex */
        public static class zzb {
            public int zziq = 0;
            public int zzir = 0;
            public int zzis = 0;
        }

        zzb zza(Context context, String str, zza zzaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class zza {
        public Cursor zzin;

        private zza() {
        }

        /* synthetic */ zza(com.google.android.gms.dynamite.zza zzaVar) {
            this();
        }
    }

    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) {
        zza zzaVar = zzii.get();
        zza zzaVar2 = new zza(null);
        zzii.set(zzaVar2);
        try {
            VersionPolicy.zzb zza2 = versionPolicy.zza(context, str, zzij);
            Log.i("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length()).append("Considering local module ").append(str).append(":").append(zza2.zziq).append(" and remote module ").append(str).append(":").append(zza2.zzir).toString());
            if (zza2.zzis == 0 || ((zza2.zzis == -1 && zza2.zziq == 0) || (zza2.zzis == 1 && zza2.zzir == 0))) {
                throw new LoadingException(new StringBuilder(91).append("No acceptable module found. Local version is ").append(zza2.zziq).append(" and remote version is ").append(zza2.zzir).append(".").toString(), (com.google.android.gms.dynamite.zza) null);
            } else if (zza2.zzis == -1) {
                DynamiteModule zze = zze(context, str);
                if (zzaVar2.zzin != null) {
                    zzaVar2.zzin.close();
                }
                zzii.set(zzaVar);
                return zze;
            } else if (zza2.zzis == 1) {
                try {
                    DynamiteModule zza3 = zza(context, str, zza2.zzir);
                    if (zzaVar2.zzin != null) {
                        zzaVar2.zzin.close();
                    }
                    zzii.set(zzaVar);
                    return zza3;
                } catch (LoadingException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to load remote module: ".concat(valueOf) : new String("Failed to load remote module: "));
                    if (zza2.zziq != 0 && versionPolicy.zza(context, str, new zzb(zza2.zziq, 0)).zzis == -1) {
                        DynamiteModule zze2 = zze(context, str);
                        if (zzaVar2.zzin != null) {
                            zzaVar2.zzin.close();
                        }
                        zzii.set(zzaVar);
                        return zze2;
                    }
                    throw new LoadingException("Remote load failed. No local fallback found.", e, null);
                }
            } else {
                throw new LoadingException(new StringBuilder(47).append("VersionPolicy returned invalid code:").append(zza2.zzis).toString(), (com.google.android.gms.dynamite.zza) null);
            }
        } catch (Throwable th) {
            if (zzaVar2.zzin != null) {
                zzaVar2.zzin.close();
            }
            zzii.set(zzaVar);
            throw th;
        }
    }

    /* loaded from: classes2.dex */
    public static class LoadingException extends Exception {
        private LoadingException(String str) {
            super(str);
        }

        private LoadingException(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ LoadingException(String str, com.google.android.gms.dynamite.zza zzaVar) {
            this(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, com.google.android.gms.dynamite.zza zzaVar) {
            this(str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class zzb implements VersionPolicy.zza {
        private final int zzio;
        private final int zzip = 0;

        public zzb(int i, int i2) {
            this.zzio = i;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zza
        public final int zza(Context context, String str, boolean z) {
            return 0;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zza
        public final int getLocalVersion(Context context, String str) {
            return this.zzio;
        }
    }

    public static int getLocalVersion(Context context, String str) {
        int i;
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass(new StringBuilder(String.valueOf(str).length() + 61).append("com.google.android.gms.dynamite.descriptors.").append(str).append(".ModuleDescriptor").toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!declaredField.get(null).equals(str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                Log.e("DynamiteModule", new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length()).append("Module descriptor id '").append(valueOf).append("' didn't match expected id '").append(str).append("'").toString());
                i = 0;
            } else {
                i = declaredField2.getInt(null);
            }
            return i;
        } catch (ClassNotFoundException e) {
            Log.w("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 45).append("Local module descriptor class for ").append(str).append(" not found.").toString());
            return 0;
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static int zza(Context context, String str, boolean z) {
        Class<?> loadClass;
        Field declaredField;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzid;
                if (bool == null) {
                    try {
                        loadClass = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName());
                        declaredField = loadClass.getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                        String valueOf = String.valueOf(e);
                        Log.w("DynamiteModule", new StringBuilder(String.valueOf(valueOf).length() + 30).append("Failed to load module via V2: ").append(valueOf).toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (loadClass) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != null) {
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    zza(classLoader);
                                } catch (LoadingException e2) {
                                }
                                bool = Boolean.TRUE;
                            }
                        } else if ("com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        } else {
                            try {
                                int zzc = zzc(context, str, z);
                                if (zzig != null && !zzig.isEmpty()) {
                                    zzh zzhVar = new zzh(zzig, ClassLoader.getSystemClassLoader());
                                    zza(zzhVar);
                                    declaredField.set(null, zzhVar);
                                    zzid = Boolean.TRUE;
                                    return zzc;
                                }
                                return zzc;
                            } catch (LoadingException e3) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            }
                        }
                        zzid = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return zzc(context, str, z);
                    } catch (LoadingException e4) {
                        String valueOf2 = String.valueOf(e4.getMessage());
                        Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf2) : new String("Failed to retrieve remote module version: "));
                        return 0;
                    }
                }
                return zzb(context, str, z);
            }
        } catch (Throwable th) {
            CrashUtils.addDynamiteErrorToDropBox(context, th);
            throw th;
        }
    }

    private static int zzb(Context context, String str, boolean z) {
        int zza2;
        zzi zzj = zzj(context);
        if (zzj == null) {
            return 0;
        }
        try {
            if (zzj.zzaj() >= 2) {
                zza2 = zzj.zzb(ObjectWrapper.wrap(context), str, z);
            } else {
                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                zza2 = zzj.zza(ObjectWrapper.wrap(context), str, z);
            }
            return zza2;
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int zzc(android.content.Context r7, java.lang.String r8, boolean r9) {
        /*
            r6 = 0
            android.content.ContentResolver r0 = r7.getContentResolver()     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb3
            if (r9 == 0) goto L6a
            java.lang.String r1 = "api_force_staging"
        L9:
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb3
            int r2 = r2.length()     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb3
            int r2 = r2 + 42
            java.lang.String r3 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb3
            int r3 = r3.length()     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb3
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb3
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb3
            java.lang.String r2 = "content://com.google.android.gms.chimera/"
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb3
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb3
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb3
            java.lang.StringBuilder r1 = r1.append(r8)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb3
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb3
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lb0 java.lang.Exception -> Lb3
            if (r1 == 0) goto L4d
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L63
            if (r0 != 0) goto L6d
        L4d:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r2 = "Failed to retrieve remote module version."
            android.util.Log.w(r0, r2)     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L63
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L63
            java.lang.String r2 = "Failed to connect to dynamite module ContentResolver."
            r3 = 0
            r0.<init>(r2, r3)     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L63
            throw r0     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L63
        L5d:
            r0 = move-exception
        L5e:
            boolean r2 = r0 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto La7
            throw r0     // Catch: java.lang.Throwable -> L63
        L63:
            r0 = move-exception
        L64:
            if (r1 == 0) goto L69
            r1.close()
        L69:
            throw r0
        L6a:
            java.lang.String r1 = "api"
            goto L9
        L6d:
            r0 = 0
            int r2 = r1.getInt(r0)     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L63
            if (r2 <= 0) goto L9e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r3 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r3)     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L63
            r0 = 2
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> La4
            com.google.android.gms.dynamite.DynamiteModule.zzig = r0     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = "loaderVersion"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> La4
            if (r0 < 0) goto L8c
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> La4
            com.google.android.gms.dynamite.DynamiteModule.zzih = r0     // Catch: java.lang.Throwable -> La4
        L8c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La4
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$zza> r0 = com.google.android.gms.dynamite.DynamiteModule.zzii     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L63
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L63
            com.google.android.gms.dynamite.DynamiteModule$zza r0 = (com.google.android.gms.dynamite.DynamiteModule.zza) r0     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L63
            if (r0 == 0) goto L9e
            android.database.Cursor r3 = r0.zzin     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L63
            if (r3 != 0) goto L9e
            r0.zzin = r1     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L63
            r1 = r6
        L9e:
            if (r1 == 0) goto La3
            r1.close()
        La3:
            return r2
        La4:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La4
            throw r0     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L63
        La7:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r2 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = "V2 version check failed"
            r4 = 0
            r2.<init>(r3, r0, r4)     // Catch: java.lang.Throwable -> L63
            throw r2     // Catch: java.lang.Throwable -> L63
        Lb0:
            r0 = move-exception
            r1 = r6
            goto L64
        Lb3:
            r0 = move-exception
            r1 = r6
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzc(android.content.Context, java.lang.String, boolean):int");
    }

    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    private static DynamiteModule zze(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static DynamiteModule zza(Context context, String str, int i) {
        Boolean bool;
        try {
            synchronized (DynamiteModule.class) {
                bool = zzid;
            }
            if (bool == null) {
                throw new LoadingException("Failed to determine which loading route to use.", (com.google.android.gms.dynamite.zza) null);
            }
            return bool.booleanValue() ? zzc(context, str, i) : zzb(context, str, i);
        } catch (Throwable th) {
            CrashUtils.addDynamiteErrorToDropBox(context, th);
            throw th;
        }
    }

    private static DynamiteModule zzb(Context context, String str, int i) {
        IObjectWrapper zza2;
        Log.i("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 51).append("Selected remote version of ").append(str).append(", version >= ").append(i).toString());
        zzi zzj = zzj(context);
        if (zzj == null) {
            throw new LoadingException("Failed to create IDynamiteLoader.", (com.google.android.gms.dynamite.zza) null);
        }
        try {
            if (zzj.zzaj() >= 2) {
                zza2 = zzj.zzb(ObjectWrapper.wrap(context), str, i);
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                zza2 = zzj.zza(ObjectWrapper.wrap(context), str, i);
            }
            if (ObjectWrapper.unwrap(zza2) == null) {
                throw new LoadingException("Failed to load remote module.", (com.google.android.gms.dynamite.zza) null);
            }
            return new DynamiteModule((Context) ObjectWrapper.unwrap(zza2));
        } catch (RemoteException e) {
            throw new LoadingException("Failed to load remote module.", e, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.dynamite.zzi] */
    private static zzi zzj(Context context) {
        zzj zzjVar;
        synchronized (DynamiteModule.class) {
            if (zzie != null) {
                return zzie;
            } else if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context) != 0) {
                return null;
            } else {
                try {
                    IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                    if (iBinder == null) {
                        zzjVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                        if (queryLocalInterface instanceof zzi) {
                            zzjVar = (zzi) queryLocalInterface;
                        } else {
                            zzjVar = new zzj(iBinder);
                        }
                    }
                    if (zzjVar != null) {
                        zzie = zzjVar;
                        return zzjVar;
                    }
                } catch (Exception e) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
                }
                return null;
            }
        }
    }

    public final Context getModuleContext() {
        return this.zzim;
    }

    private static DynamiteModule zzc(Context context, String str, int i) {
        zzk zzkVar;
        Log.i("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 51).append("Selected remote version of ").append(str).append(", version >= ").append(i).toString());
        synchronized (DynamiteModule.class) {
            zzkVar = zzif;
        }
        if (zzkVar == null) {
            throw new LoadingException("DynamiteLoaderV2 was not cached.", (com.google.android.gms.dynamite.zza) null);
        }
        zza zzaVar = zzii.get();
        if (zzaVar == null || zzaVar.zzin == null) {
            throw new LoadingException("No result cursor", (com.google.android.gms.dynamite.zza) null);
        }
        Context zza2 = zza(context.getApplicationContext(), str, i, zzaVar.zzin, zzkVar);
        if (zza2 == null) {
            throw new LoadingException("Failed to get module context", (com.google.android.gms.dynamite.zza) null);
        }
        return new DynamiteModule(zza2);
    }

    private static Boolean zzai() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(zzih >= 2);
        }
        return valueOf;
    }

    private static Context zza(Context context, String str, int i, Cursor cursor, zzk zzkVar) {
        IObjectWrapper zza2;
        try {
            ObjectWrapper.wrap(null);
            if (zzai().booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                zza2 = zzkVar.zzb(ObjectWrapper.wrap(context), str, i, ObjectWrapper.wrap(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                zza2 = zzkVar.zza(ObjectWrapper.wrap(context), str, i, ObjectWrapper.wrap(cursor));
            }
            return (Context) ObjectWrapper.unwrap(zza2);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.toString());
            Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load DynamiteLoader: ".concat(valueOf) : new String("Failed to load DynamiteLoader: "));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.dynamite.zzk] */
    private static void zza(ClassLoader classLoader) {
        zzl zzlVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzlVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzk) {
                    zzlVar = (zzk) queryLocalInterface;
                } else {
                    zzlVar = new zzl(iBinder);
                }
            }
            zzif = zzlVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        }
    }

    public final IBinder instantiate(String str) {
        try {
            return (IBinder) this.zzim.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf(str);
            throw new LoadingException(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e, null);
        }
    }

    private DynamiteModule(Context context) {
        this.zzim = (Context) Preconditions.checkNotNull(context);
    }
}
