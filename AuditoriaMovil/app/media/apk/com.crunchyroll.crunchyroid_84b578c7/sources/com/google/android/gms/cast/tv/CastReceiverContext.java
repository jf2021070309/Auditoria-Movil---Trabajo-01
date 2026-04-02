package com.google.android.gms.cast.tv;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.tv.CastReceiverContext;
import com.google.android.gms.cast.tv.SenderDisconnectedEventInfo;
import com.google.android.gms.cast.tv.auth.CastDeviceAuthManager;
import com.google.android.gms.cast.tv.internal.zzai;
import com.google.android.gms.cast.tv.internal.zzaj;
import com.google.android.gms.cast.tv.internal.zzaq;
import com.google.android.gms.cast.tv.media.MediaManager;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.cast_tv.zzbx;
import com.google.android.gms.internal.cast_tv.zzbz;
import com.google.android.gms.internal.cast_tv.zzca;
import com.google.android.gms.internal.cast_tv.zzcb;
import com.google.android.gms.internal.cast_tv.zzce;
import com.google.android.gms.internal.cast_tv.zzcf;
import com.google.android.gms.internal.cast_tv.zzdu;
import com.google.android.gms.internal.cast_tv.zzdx;
import com.google.android.gms.internal.cast_tv.zzeq;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public class CastReceiverContext {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = new Logger("CastRcvrContext");
    private static CastReceiverContext zzc;
    private static MediaManager zzd;
    private static com.google.android.gms.cast.tv.cac.zzc zze;
    private static CastDeviceAuthManager zzf;
    private final Context zzg;
    private final CastReceiverOptions zzh;
    private zzaq zzl;
    private com.google.android.gms.cast.tv.internal.zza zzm;
    private boolean zzn;
    private long zzo;
    private final Map zzi = new HashMap();
    private final List zzj = new ArrayList();
    private final Map zzk = new HashMap();
    private final zzca zzp = new zzca(new zzbz() { // from class: com.google.android.gms.cast.tv.zzh
        @Override // com.google.android.gms.internal.cast_tv.zzbz
        public final void zza(zzdx zzdxVar) {
            CastReceiverContext.this.zzq(zzdxVar);
        }
    });

    /* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
    /* loaded from: classes2.dex */
    public static abstract class EventCallback {
        public void onSenderConnected(SenderInfo senderInfo) {
        }

        public void onSenderDisconnected(SenderDisconnectedEventInfo senderDisconnectedEventInfo) {
        }

        public void onStopApplication() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
    /* loaded from: classes2.dex */
    public interface MessageReceivedListener {
        void onMessageReceived(String str, String str2, String str3);
    }

    private CastReceiverContext(Context context, CastReceiverOptions castReceiverOptions) {
        this.zzg = context;
        this.zzh = castReceiverOptions;
        try {
            com.google.android.gms.cast.tv.internal.zzc.zze().zzh(context);
            com.google.android.gms.cast.tv.internal.zzc.zze().zzj(new zzk(this, null));
        } catch (com.google.android.gms.cast.tv.internal.zzb e) {
            zzb.e(e, "Failed to initialize CastReceiverContext. Cast SDK will not function properly", new Object[0]);
        }
    }

    public static CastReceiverContext getInstance() {
        return zzc;
    }

    public static void initInstance(Context context) {
        if (zzc == null) {
            Context applicationContext = context.getApplicationContext();
            CastReceiverOptions options = zzo(applicationContext).getOptions(applicationContext);
            if (zzc == null) {
                zzc = new CastReceiverContext(applicationContext, options);
                final MediaManager mediaManager = new MediaManager(applicationContext, new zzcb() { // from class: com.google.android.gms.cast.tv.zzb
                    @Override // com.google.android.gms.internal.cast_tv.zzcb
                    public final void zza(String str, String str2) {
                        CastReceiverContext.zzc.sendMessage("urn:x-cast:com.google.cast.media", str, str2);
                    }
                }, options);
                zzd = mediaManager;
                zzc.zzn("urn:x-cast:com.google.cast.media", new zzi() { // from class: com.google.android.gms.cast.tv.zzc
                    @Override // com.google.android.gms.cast.tv.zzi
                    public final void zza(String str, String str2, String str3, zzeq zzeqVar) {
                        MediaManager.this.zzc(str, str2, str3, zzeqVar);
                    }
                });
                final com.google.android.gms.cast.tv.cac.zzc zzcVar = new com.google.android.gms.cast.tv.cac.zzc(zzd.zza(), new zzcb() { // from class: com.google.android.gms.cast.tv.zzd
                    @Override // com.google.android.gms.internal.cast_tv.zzcb
                    public final void zza(String str, String str2) {
                        CastReceiverContext.zzc.sendMessage("urn:x-cast:com.google.cast.cac", str, str2);
                    }
                });
                zze = zzcVar;
                zzc.zzn("urn:x-cast:com.google.cast.cac", new zzi() { // from class: com.google.android.gms.cast.tv.zze
                    @Override // com.google.android.gms.cast.tv.zzi
                    public final void zza(String str, String str2, String str3, zzeq zzeqVar) {
                        com.google.android.gms.cast.tv.cac.zzc.this.zza(str, str2, str3, zzeqVar);
                    }
                });
                zzf = new CastDeviceAuthManager(zzf.zza);
            }
        }
    }

    public static /* synthetic */ Task zza(URL url) {
        com.google.android.gms.cast.tv.internal.zza zzaVar = zzc.zzm;
        if (zzaVar == null) {
            return Tasks.forException(new ApiException(zzai.zzd));
        }
        return zzaVar.zza(url);
    }

    private static ReceiverOptionsProvider zzo(Context context) {
        String str;
        try {
            Bundle bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                str = bundle.getString("com.google.android.gms.cast.tv.RECEIVER_OPTIONS_PROVIDER_CLASS_NAME");
            } else {
                str = null;
            }
            if (str != null) {
                return (ReceiverOptionsProvider) Class.forName(str).asSubclass(ReceiverOptionsProvider.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of ReceiverOptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.tv.RECEIVER_OPTIONS_PROVIDER_CLASS_NAME");
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            throw new IllegalStateException("Failed to initialize CastReceiverContext.", e);
        }
    }

    private final void zzp() {
        com.google.android.gms.cast.tv.internal.zzc.zze().zzg(this.zzg, this.zzo);
    }

    public final void zzq(zzdx zzdxVar) {
        com.google.android.gms.cast.tv.internal.zza zzaVar = this.zzm;
        if (zzaVar == null) {
            return;
        }
        zzaVar.zzb(zzdxVar);
    }

    @ShowFirstParty
    @KeepForSdk
    public CastDeviceAuthManager getCastDeviceAuthManager() {
        return zzf;
    }

    public MediaManager getMediaManager() {
        return zzd;
    }

    public CastReceiverOptions getReceiverOptions() {
        return this.zzh;
    }

    public SenderInfo getSender(String str) {
        return (SenderInfo) this.zzi.get(str);
    }

    public Collection<SenderInfo> getSenders() {
        return this.zzi.values();
    }

    public void registerEventCallback(EventCallback eventCallback) {
        this.zzj.add(eventCallback);
    }

    public void removeMessageReceivedListener(String str) {
        this.zzk.remove(str);
    }

    public void sendMessage(String str, String str2, String str3) {
        com.google.android.gms.cast.tv.internal.zza zzaVar = this.zzm;
        if (zzaVar == null) {
            return;
        }
        zzaVar.zze(str, str2, str3);
    }

    public void setMessageReceivedListener(String str, final MessageReceivedListener messageReceivedListener) {
        CastUtils.throwIfInvalidNamespace(str);
        Preconditions.checkNotNull(messageReceivedListener);
        zzn(str, new zzi() { // from class: com.google.android.gms.cast.tv.zzg
            @Override // com.google.android.gms.cast.tv.zzi
            public final void zza(String str2, String str3, String str4, zzeq zzeqVar) {
                CastReceiverContext.MessageReceivedListener messageReceivedListener2 = CastReceiverContext.MessageReceivedListener.this;
                int i = CastReceiverContext.zza;
                messageReceivedListener2.onMessageReceived(str2, str3, str4);
                zzdu.zzc(zzeqVar, 2);
            }
        });
    }

    public void start() {
        int i = zzaj.zza;
        if (!PlatformVersion.isAtLeastM()) {
            return;
        }
        this.zzn = true;
        this.zzo = SystemClock.elapsedRealtime();
        zzp();
        com.google.android.gms.cast.tv.internal.zza zzaVar = this.zzm;
        if (zzaVar != null) {
            zzaVar.zzc(this.zzn);
        }
        if (this.zzl == null && PlatformVersion.isAtLeastKitKat()) {
            this.zzl = new zzaq(this);
            zzbx.zza(this.zzg, this.zzl, new IntentFilter("com.google.android.gms.cast.tv.ACTION_WARG_STARTED"), null, zzaj.zza());
        }
    }

    public void stop() {
        this.zzn = false;
        com.google.android.gms.cast.tv.internal.zza zzaVar = this.zzm;
        if (zzaVar != null) {
            zzaVar.zzc(false);
        }
        zzaq zzaqVar = this.zzl;
        if (zzaqVar == null) {
            return;
        }
        this.zzg.unregisterReceiver(zzaqVar);
        this.zzl = null;
    }

    public void unregisterEventCallback(EventCallback eventCallback) {
        this.zzj.remove(eventCallback);
    }

    public final void zzf(String str, String str2, String str3, zzeq zzeqVar) {
        zzi zziVar = (zzi) this.zzk.get(str);
        if (zziVar != null) {
            zziVar.zza(str, str2, str3, zzeqVar);
        } else {
            zzdu.zzc(zzeqVar, 6);
        }
    }

    public final void zzg(SenderInfo senderInfo) {
        this.zzi.put(senderInfo.getSenderId(), senderInfo);
        for (EventCallback eventCallback : this.zzj) {
            eventCallback.onSenderConnected(senderInfo);
        }
    }

    public final void zzh(String str, @SenderDisconnectedEventInfo.DisconnectReason int i) {
        SenderInfo senderInfo = (SenderInfo) this.zzi.remove(str);
        if (senderInfo == null) {
            return;
        }
        for (EventCallback eventCallback : this.zzj) {
            eventCallback.onSenderDisconnected(new SenderDisconnectedEventInfo(senderInfo, i));
        }
    }

    public final void zzi() {
        stop();
        for (EventCallback eventCallback : this.zzj) {
            eventCallback.onStopApplication();
        }
    }

    public final void zzj(com.google.android.gms.cast.tv.internal.zza zzaVar) {
        this.zzm = zzaVar;
        zzce zza2 = zzcf.zza();
        zza2.zze(this.zzh.getVersionCode());
        zza2.zza(this.zzh.getCustomNamespaces());
        zza2.zzc(1);
        zza2.zzf(2);
        String statusText = this.zzh.getStatusText();
        if (statusText != null) {
            zza2.zzd(statusText);
        }
        String zza3 = this.zzh.zza();
        if (zza3 != null) {
            zza2.zzb(zza3);
        }
        zzaVar.zzd((zzcf) zza2.zzi());
        zzaVar.zzc(this.zzn);
    }

    public final void zzk() {
        this.zzm = null;
    }

    public final void zzl() {
        long j;
        zzca zzcaVar = this.zzp;
        String[] split = "21.0.0".split("\\.");
        long j2 = 0;
        for (int i = 0; i < Math.min(split.length, 3); i++) {
            try {
                j = Long.parseLong(split[i]);
            } catch (NumberFormatException unused) {
                j = WebSocketProtocol.PAYLOAD_SHORT_MAX;
            }
            int i2 = 3 - i;
            j2 |= j << ((i2 + i2) * 8);
        }
        zzcaVar.zzd("Cast.AtvReceiver.Version", j2);
        this.zzp.zza("Cast.AtvReceiver.DynamiteModuleIsLocal", com.google.android.gms.cast.tv.internal.zzc.zzk(this.zzg));
        this.zzp.zzc("Cast.AtvReceiver.PackageName", this.zzg.getPackageName());
        com.google.android.gms.cast.tv.internal.zzc.zze().zzi();
    }

    public final void zzm() {
        if (this.zzn) {
            zzp();
        }
    }

    public final void zzn(String str, zzi zziVar) {
        CastUtils.throwIfInvalidNamespace(str);
        Preconditions.checkNotNull(zziVar);
        this.zzk.put(str, zziVar);
    }
}
