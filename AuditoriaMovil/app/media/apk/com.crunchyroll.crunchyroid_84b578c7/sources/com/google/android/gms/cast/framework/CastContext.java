package com.google.android.gms.cast.framework;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.amazon.aps.iva.f8.e0;
import com.amazon.aps.iva.f8.f0;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.cast.zzbn;
import com.google.android.gms.internal.cast.zzcy;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public class CastContext {
    public static final String OPTIONS_PROVIDER_CLASS_NAME_KEY = "com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME";
    private static final Logger zzb = new Logger("CastContext");
    private static final Object zzc = new Object();
    private static volatile CastContext zzd;
    final com.google.android.gms.internal.cast.zzaf zza;
    private final Context zze;
    private final zzaj zzf;
    private final SessionManager zzg;
    private final zzac zzh;
    private final PrecacheManager zzi;
    private final MediaNotificationManager zzj;
    private final CastOptions zzk;
    private final com.google.android.gms.cast.internal.zzn zzl;
    private final com.google.android.gms.internal.cast.zzbf zzm;
    private final com.google.android.gms.internal.cast.zzay zzn;
    private final List zzo;
    private final zzbn zzp;
    private final zzcy zzq;
    private com.google.android.gms.internal.cast.zzai zzr;
    private CastReasonCodes zzs;

    private CastContext(Context context, CastOptions castOptions, List list, com.google.android.gms.internal.cast.zzbf zzbfVar, final com.google.android.gms.cast.internal.zzn zznVar) throws ModuleUnavailableException {
        this.zze = context;
        this.zzk = castOptions;
        this.zzm = zzbfVar;
        this.zzl = zznVar;
        this.zzo = list;
        com.google.android.gms.internal.cast.zzay zzayVar = new com.google.android.gms.internal.cast.zzay(context);
        this.zzn = zzayVar;
        zzbn zzn = zzbfVar.zzn();
        this.zzp = zzn;
        zzh();
        Map zzg = zzg();
        castOptions.zzb(new zzl(1));
        try {
            zzaj zza = com.google.android.gms.internal.cast.zzag.zza(context, castOptions, zzbfVar, zzg);
            this.zzf = zza;
            try {
                this.zzh = new zzac(zza.zzf());
                try {
                    SessionManager sessionManager = new SessionManager(zza.zzg(), context);
                    this.zzg = sessionManager;
                    this.zzj = new MediaNotificationManager(sessionManager);
                    this.zzi = new PrecacheManager(castOptions, sessionManager, zznVar);
                    if (zzn != null) {
                        zzn.zzj(sessionManager);
                    }
                    this.zzq = new zzcy(context);
                    com.google.android.gms.internal.cast.zzaf zzafVar = new com.google.android.gms.internal.cast.zzaf();
                    this.zza = zzafVar;
                    try {
                        zza.zzh(zzafVar);
                        zzafVar.zza.add(zzayVar.zza);
                        if (!castOptions.zza().isEmpty()) {
                            zzb.i("Setting Route Discovery for appIds: ".concat(String.valueOf(castOptions.zza())), new Object[0]);
                            zzayVar.zza(castOptions.zza());
                        }
                        zznVar.zza(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.cast.framework.zzg
                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            public final void onSuccess(Object obj) {
                                CastContext.zzd(CastContext.this, (Bundle) obj);
                            }
                        });
                        final String[] strArr = {"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"};
                        zznVar.doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.cast.internal.zzh
                            @Override // com.google.android.gms.common.api.internal.RemoteCall
                            public final void accept(Object obj, Object obj2) {
                                ((zzaj) ((zzo) obj).getService()).zzg(new zzm(zzn.this, (TaskCompletionSource) obj2), strArr);
                            }
                        }).setFeatures(com.google.android.gms.cast.zzax.zzh).setAutoResolveMissingFeatures(false).setMethodKey(8427).build()).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.cast.framework.zzh
                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            public final void onSuccess(Object obj) {
                                CastContext.this.zze((Bundle) obj);
                            }
                        });
                    } catch (RemoteException e) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e);
                    }
                } catch (RemoteException e2) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e2);
                }
            } catch (RemoteException e3) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e3);
            }
        } catch (RemoteException e4) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e4);
        }
    }

    public static CastContext getSharedInstance() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return zzd;
    }

    public static CastContext zza(Context context) throws IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        try {
            return getSharedInstance(context);
        } catch (RuntimeException e) {
            zzb.e("Failed to load module from Google Play services. Cast will not work properly. Might due to outdated Google Play services. Ignoring this failure silently.", e);
            return null;
        }
    }

    public static /* synthetic */ CastContext zzb(Context context, CastOptions castOptions, OptionsProvider optionsProvider, com.google.android.gms.internal.cast.zzbf zzbfVar, com.google.android.gms.cast.internal.zzn zznVar) throws Exception {
        synchronized (zzc) {
            if (zzd == null) {
                zzd = new CastContext(context, castOptions, optionsProvider.mo27getAdditionalSessionProviders(context), zzbfVar, zznVar);
            }
        }
        return zzd;
    }

    public static /* synthetic */ void zzd(CastContext castContext, Bundle bundle) {
        if (!com.google.android.gms.internal.cast.zzg.zza) {
            return;
        }
        com.google.android.gms.internal.cast.zzg.zza(castContext.zze, castContext.zzl, castContext.zzg, castContext.zzp, castContext.zza).zzc(bundle);
    }

    private static OptionsProvider zzf(Context context) throws IllegalStateException {
        try {
            Bundle bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                zzb.e("Bundle is null", new Object[0]);
            }
            String string = bundle.getString(OPTIONS_PROVIDER_CLASS_NAME_KEY);
            if (string != null) {
                return (OptionsProvider) Class.forName(string).asSubclass(OptionsProvider.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    private final Map zzg() {
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.cast.zzai zzaiVar = this.zzr;
        if (zzaiVar != null) {
            hashMap.put(zzaiVar.getCategory(), zzaiVar.zza());
        }
        List<SessionProvider> list = this.zzo;
        if (list != null) {
            for (SessionProvider sessionProvider : list) {
                Preconditions.checkNotNull(sessionProvider, "Additional SessionProvider must not be null.");
                String checkNotEmpty = Preconditions.checkNotEmpty(sessionProvider.getCategory(), "Category for SessionProvider must not be null or empty string.");
                Preconditions.checkArgument(!hashMap.containsKey(checkNotEmpty), String.format("SessionProvider for category %s already added", checkNotEmpty));
                hashMap.put(checkNotEmpty, sessionProvider.zza());
            }
        }
        return hashMap;
    }

    private final void zzh() {
        if (!TextUtils.isEmpty(this.zzk.getReceiverApplicationId())) {
            this.zzr = new com.google.android.gms.internal.cast.zzai(this.zze, this.zzk, this.zzm);
        } else {
            this.zzr = null;
        }
    }

    @Deprecated
    public void addAppVisibilityListener(AppVisibilityListener appVisibilityListener) throws IllegalStateException, NullPointerException {
    }

    public void addCastStateListener(CastStateListener castStateListener) throws IllegalStateException, NullPointerException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        Preconditions.checkNotNull(castStateListener);
        this.zzg.zzc(castStateListener);
    }

    public void addSessionTransferCallback(SessionTransferCallback sessionTransferCallback) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        Preconditions.checkNotNull(sessionTransferCallback);
        zzbn zzn = this.zzm.zzn();
        if (zzn != null) {
            zzn.zzm(sessionTransferCallback);
        }
    }

    public CastOptions getCastOptions() throws IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzk;
    }

    public int getCastReasonCodeForCastStatusCode(int i) {
        CastReasonCodes castReasonCodes = this.zzs;
        if (castReasonCodes == null) {
            zzb.w("castReasonCodes hasn't been initialized yet", new Object[0]);
            return 0;
        }
        return castReasonCodes.zza(i);
    }

    public int getCastState() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzg.zza();
    }

    public MediaNotificationManager getMediaNotificationManager() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzj;
    }

    public e0 getMergedSelector() throws IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        try {
            return e0.b(this.zzf.zze());
        } catch (RemoteException e) {
            zzb.d(e, "Unable to call %s on %s.", "getMergedSelectorAsBundle", "zzaj");
            return null;
        }
    }

    public PrecacheManager getPrecacheManager() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzi;
    }

    public SessionManager getSessionManager() throws IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzg;
    }

    @Deprecated
    public boolean isAppVisible() throws IllegalStateException {
        return false;
    }

    @Deprecated
    public boolean onDispatchVolumeKeyEventBeforeJellyBean(KeyEvent keyEvent) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return false;
    }

    @Deprecated
    public void removeAppVisibilityListener(AppVisibilityListener appVisibilityListener) throws IllegalStateException {
    }

    public void removeCastStateListener(CastStateListener castStateListener) throws IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (castStateListener == null) {
            return;
        }
        this.zzg.zzd(castStateListener);
    }

    public void removeSessionTransferCallback(SessionTransferCallback sessionTransferCallback) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        Preconditions.checkNotNull(sessionTransferCallback);
        zzbn zzn = this.zzm.zzn();
        if (zzn != null) {
            zzn.zzn(sessionTransferCallback);
        }
    }

    public void setLaunchCredentialsData(CredentialsData credentialsData) {
        LaunchOptions.Builder builder = new LaunchOptions.Builder(this.zzk.getLaunchOptions());
        builder.setCredentialsData(credentialsData);
        this.zzk.zzc(builder.build());
        zzh();
    }

    public void setReceiverApplicationId(String str) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (TextUtils.equals(str, this.zzk.getReceiverApplicationId())) {
            return;
        }
        this.zzk.zzd(str);
        zzh();
        try {
            this.zzf.zzi(str, zzg());
        } catch (RemoteException e) {
            zzb.d(e, "Unable to call %s on %s.", "setReceiverApplicationId", "zzaj");
        }
        CastButtonFactory.zze(this.zze);
    }

    @ShowFirstParty
    public final zzac zzc() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzh;
    }

    public final /* synthetic */ void zze(Bundle bundle) {
        this.zzs = new CastReasonCodes(bundle);
    }

    public static CastContext getSharedInstance(Context context) throws IllegalStateException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (zzd == null) {
            synchronized (zzc) {
                if (zzd == null) {
                    Context applicationContext = context.getApplicationContext();
                    OptionsProvider zzf = zzf(applicationContext);
                    CastOptions castOptions = zzf.getCastOptions(applicationContext);
                    com.google.android.gms.cast.internal.zzn zznVar = new com.google.android.gms.cast.internal.zzn(applicationContext);
                    try {
                        zzd = new CastContext(applicationContext, castOptions, zzf.mo27getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.zzbf(applicationContext, f0.d(applicationContext), castOptions, zznVar), zznVar);
                    } catch (ModuleUnavailableException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return zzd;
    }

    public static Task<CastContext> getSharedInstance(Context context, Executor executor) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (zzd == null) {
            final Context applicationContext = context.getApplicationContext();
            final OptionsProvider zzf = zzf(applicationContext);
            final CastOptions castOptions = zzf.getCastOptions(applicationContext);
            final com.google.android.gms.cast.internal.zzn zznVar = new com.google.android.gms.cast.internal.zzn(applicationContext);
            final com.google.android.gms.internal.cast.zzbf zzbfVar = new com.google.android.gms.internal.cast.zzbf(applicationContext, f0.d(applicationContext), castOptions, zznVar);
            return Tasks.call(executor, new Callable() { // from class: com.google.android.gms.cast.framework.zzi
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return CastContext.zzb(applicationContext, castOptions, zzf, zzbfVar, zznVar);
                }
            });
        }
        return Tasks.forResult(zzd);
    }
}
