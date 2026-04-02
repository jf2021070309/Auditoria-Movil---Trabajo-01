package com.google.android.gms.internal.cast_tv;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.tv.CastReceiverOptions;
import com.google.android.gms.cast.tv.media.EditAudioTracksData;
import com.google.android.gms.cast.tv.media.EditTracksInfoData;
import com.google.android.gms.cast.tv.media.FetchItemsRequestData;
import com.google.android.gms.cast.tv.media.MediaResumeSessionRequestData;
import com.google.android.gms.cast.tv.media.MediaStatusWriter;
import com.google.android.gms.cast.tv.media.QueueInsertRequestData;
import com.google.android.gms.cast.tv.media.QueueRemoveRequestData;
import com.google.android.gms.cast.tv.media.QueueReorderRequestData;
import com.google.android.gms.cast.tv.media.QueueUpdateRequestData;
import com.google.android.gms.cast.tv.media.SeekRequestData;
import com.google.android.gms.cast.tv.media.SetPlaybackRateRequestData;
import com.google.android.gms.cast.tv.media.StoreSessionRequestData;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzbp extends zzfj {
    private static final Logger zze = new Logger("RMCCImpl");
    final zzau zza;
    private final zzo zzf;
    private final zzbl zzg;
    private Map zzh;
    private MediaLoadRequestData zzi;
    private final zzx zzj;
    private final Set zzk;
    private final zzca zzl;
    private final zzw zzm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbp(Context context, zzo zzoVar, CastReceiverOptions castReceiverOptions, zzca zzcaVar) {
        super(context, null);
        Set zzh;
        zzw zzwVar = new zzw(zzcaVar);
        this.zzg = new zzbl(this, null);
        this.zzj = new zzbn(this, null);
        this.zza = new Object() { // from class: com.google.android.gms.internal.cast_tv.zzau
        };
        this.zzf = zzoVar;
        try {
            zzh = new HashSet(zzoVar.zzh());
        } catch (RemoteException unused) {
            zzh = zzfv.zzh();
        }
        this.zzk = zzh;
        this.zzl = zzcaVar;
        this.zzm = zzwVar;
    }

    public final MediaStatus zzU() {
        c zzj = super.zzj();
        if (zzj == null) {
            zze.w("Not generating media status because MediaSession doesn't indicate it has media", new Object[0]);
            return null;
        }
        try {
            MediaStatus mediaStatus = new MediaStatus(zzj);
            zzV(mediaStatus);
            return this.zzf.zzf(mediaStatus);
        } catch (RemoteException | b e) {
            zze.e("Failed to get current media status".concat(String.valueOf(e.getMessage())), new Object[0]);
            return null;
        }
    }

    private static void zzV(MediaStatus mediaStatus) {
        new MediaStatusWriter(mediaStatus).setSupportedMediaCommands(mediaStatus.getSupportedMediaCommands() | 3);
    }

    public final void zzW(String str, MediaError mediaError) {
        this.zzm.zzb(mediaError);
        c json = mediaError.toJson();
        if (json != null) {
            zzI(str, json);
        }
    }

    private static boolean zzX(List list) {
        if (list.size() <= 1) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (hashSet.contains(num)) {
                return true;
            }
            hashSet.add(num);
        }
        return false;
    }

    public static boolean zzY(MediaStatus mediaStatus) {
        if (mediaStatus == null) {
            return false;
        }
        if (mediaStatus.getPlayerState() == 1 && mediaStatus.getLoadingItemId() == 0) {
            return false;
        }
        return true;
    }

    public static /* bridge */ /* synthetic */ MediaStatus zzc(zzbp zzbpVar) {
        c zzj = super.zzj();
        if (zzj == null) {
            zze.w("Not generating media status because MediaSession doesn't indicate it has media", new Object[0]);
            return null;
        }
        try {
            return new MediaStatus(zzj);
        } catch (b e) {
            zze.e("Failed to get current media status".concat(String.valueOf(e.getMessage())), new Object[0]);
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ zzz zzi(zzbp zzbpVar) {
        zzz zzzVar;
        try {
            zzzVar = zzbpVar.zzf.zzg();
        } catch (RemoteException unused) {
            zzzVar = null;
        }
        if (zzzVar != null) {
            return zzzVar;
        }
        return new zzz(new ArrayList(), new ArrayList(), new ArrayList());
    }

    public final /* synthetic */ void zzA(String str, String str2, c cVar, zzeq zzeqVar) throws RemoteException, zzv {
        SeekRequestData zza = SeekRequestData.zza(cVar);
        zza.zzd(new zzbe(this, cVar, str));
        this.zzf.zzw(str, zza, zzeqVar);
    }

    public final /* synthetic */ void zzB(String str, String str2, c cVar, zzeq zzeqVar) throws RemoteException, zzv {
        double d;
        SetPlaybackRateRequestData zza = SetPlaybackRateRequestData.zza(cVar);
        Double playbackRate = zza.getPlaybackRate();
        Double relativePlaybackRate = zza.getRelativePlaybackRate();
        if (playbackRate == null && relativePlaybackRate != null) {
            MediaStatus zzU = zzU();
            if (zzU != null) {
                d = zzU.getPlaybackRate();
            } else {
                d = 1.0d;
            }
            zza.zzd(Double.valueOf(relativePlaybackRate.doubleValue() * d));
            zza.zze(null);
        }
        zza.zzb(new zzbe(this, cVar, str));
        this.zzf.zzy(str, zza, zzeqVar);
    }

    public final /* synthetic */ void zzC(String str, String str2, c cVar, zzeq zzeqVar) throws RemoteException, zzv {
        com.google.android.gms.cast.tv.media.zzz zza = com.google.android.gms.cast.tv.media.zzz.zza(cVar);
        zza.zzb(new zzbe(this, cVar, str));
        this.zzf.zzA(str, zza, zzeqVar);
    }

    public final /* synthetic */ void zzD(String str, String str2, c cVar, zzeq zzeqVar) throws RemoteException, zzv {
        EditAudioTracksData zza = EditAudioTracksData.zza(cVar);
        zza.zzb(new zzbj(this, str, zza));
        this.zzf.zzi(str, zza, zzeqVar);
    }

    public final /* synthetic */ void zzE(String str, String str2, c cVar, zzeq zzeqVar) throws RemoteException, zzv {
        EditTracksInfoData zza = EditTracksInfoData.zza(cVar);
        zza.zzb(new zzbi(this, str, zza));
        this.zzf.zzj(str, zza, zzeqVar);
    }

    public final /* synthetic */ void zzF(String str, String str2, c cVar, zzeq zzeqVar) throws RemoteException, zzv {
        QueueInsertRequestData zza = QueueInsertRequestData.zza(cVar);
        zzv zzvVar = new zzv("INVALID_REQUEST");
        List<MediaQueueItem> items = zza.getItems();
        if (!items.isEmpty()) {
            Integer currentItemIndex = zza.getCurrentItemIndex();
            Integer currentItemId = zza.getCurrentItemId();
            if (currentItemIndex != null && (currentItemIndex.intValue() < 0 || currentItemIndex.intValue() >= items.size())) {
                zze.w("currentItemIndex is out of bounds for queue insert", new Object[0]);
                throw zzvVar;
            } else if (currentItemIndex != null && currentItemId != null) {
                zze.w("currentItemIndex and currentItemId are both defined for queue insert", new Object[0]);
                throw zzvVar;
            } else {
                zza.zzb(new zzbe(this, cVar, str));
                this.zzf.zzr(str, zza, zzeqVar);
                return;
            }
        }
        zze.w("queue insert has no items to add", new Object[0]);
        throw zzvVar;
    }

    public final /* synthetic */ void zzG(String str, String str2, c cVar, zzeq zzeqVar) throws RemoteException, zzv {
        QueueRemoveRequestData zza = QueueRemoveRequestData.zza(cVar);
        zzv zzvVar = new zzv("INVALID_REQUEST");
        List<Integer> itemIds = zza.getItemIds();
        if (!itemIds.isEmpty()) {
            if (!zzX(itemIds)) {
                zza.zzb(new zzbe(this, cVar, str));
                this.zzf.zzs(str, zza, zzeqVar);
                return;
            }
            zze.w("queue remove has duplicate itemIds", new Object[0]);
            throw zzvVar;
        }
        zze.w("queue remove has empty itemIds", new Object[0]);
        throw zzvVar;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzfj
    public final void zzH(String str, c cVar, zzeq zzeqVar) {
        String optString = cVar.optString("type");
        if (!TextUtils.isEmpty(optString)) {
            this.zzl.zzb("Cast.Receiver.Message.".concat(String.valueOf(optString)));
        }
        super.zzH(str, cVar, zzeqVar);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzfj
    public final void zzI(String str, c cVar) {
        try {
            String optString = cVar.optString("type");
            if (!TextUtils.isEmpty(optString)) {
                this.zzl.zzb("Cast.Receiver.OutMessage.".concat(String.valueOf(optString)));
            }
            this.zzf.zzD(str, cVar.toString());
        } catch (RemoteException unused) {
            zze.e("Failed to send message back to the sender", new Object[0]);
        }
    }

    public final zzr zzg() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzfj
    public final c zzj() {
        c zzj = super.zzj();
        if (zzj == null) {
            zze.w("Not generating media status because MediaSession doesn't indicate it has media", new Object[0]);
            this.zzm.zzc(null);
            return null;
        }
        try {
            MediaStatus mediaStatus = new MediaStatus(zzj);
            zzV(mediaStatus);
            MediaStatus zze2 = this.zzf.zze(this.zzf.zzf(mediaStatus));
            this.zzm.zzc(zze2);
            return zze2.toJson();
        } catch (RemoteException | b e) {
            zze.e("Failed to inject media status".concat(String.valueOf(e.getMessage())), new Object[0]);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzfj
    public final void zzn(String str, c cVar, zzeq zzeqVar) {
        String optString = cVar.optString("type");
        if (this.zzh == null) {
            this.zzh = new HashMap();
            if (this.zzk.contains(1)) {
                this.zzh.put("PLAY", new zzbo() { // from class: com.google.android.gms.internal.cast_tv.zzak
                    @Override // com.google.android.gms.internal.cast_tv.zzbo
                    public final void zza(String str2, String str3, c cVar2, zzeq zzeqVar2) {
                        zzbp.this.zzo(str2, str3, cVar2, zzeqVar2);
                    }
                });
            }
            if (this.zzk.contains(2)) {
                this.zzh.put("PAUSE", new zzbo() { // from class: com.google.android.gms.internal.cast_tv.zzal
                    @Override // com.google.android.gms.internal.cast_tv.zzbo
                    public final void zza(String str2, String str3, c cVar2, zzeq zzeqVar2) {
                        zzbp.this.zzp(str2, str3, cVar2, zzeqVar2);
                    }
                });
            }
            if (this.zzk.contains(3)) {
                this.zzh.put("STOP", new zzbo() { // from class: com.google.android.gms.internal.cast_tv.zzam
                    @Override // com.google.android.gms.internal.cast_tv.zzbo
                    public final void zza(String str2, String str3, c cVar2, zzeq zzeqVar2) {
                        zzbp.this.zzz(str2, str3, cVar2, zzeqVar2);
                    }
                });
            }
            if (this.zzk.contains(4)) {
                this.zzh.put("SEEK", new zzbo() { // from class: com.google.android.gms.internal.cast_tv.zzan
                    @Override // com.google.android.gms.internal.cast_tv.zzbo
                    public final void zza(String str2, String str3, c cVar2, zzeq zzeqVar2) {
                        zzbp.this.zzA(str2, str3, cVar2, zzeqVar2);
                    }
                });
            }
            if (this.zzk.contains(21)) {
                this.zzh.put("SET_PLAYBACK_RATE", new zzbo() { // from class: com.google.android.gms.internal.cast_tv.zzao
                    @Override // com.google.android.gms.internal.cast_tv.zzbo
                    public final void zza(String str2, String str3, c cVar2, zzeq zzeqVar2) {
                        zzbp.this.zzB(str2, str3, cVar2, zzeqVar2);
                    }
                });
            }
            if (this.zzk.contains(5)) {
                this.zzh.put("SKIP_AD", new zzbo() { // from class: com.google.android.gms.internal.cast_tv.zzap
                    @Override // com.google.android.gms.internal.cast_tv.zzbo
                    public final void zza(String str2, String str3, c cVar2, zzeq zzeqVar2) {
                        zzbp.this.zzC(str2, str3, cVar2, zzeqVar2);
                    }
                });
            }
            if (this.zzk.contains(6)) {
                this.zzh.put("EDIT_AUDIO_TRACKS", new zzbo() { // from class: com.google.android.gms.internal.cast_tv.zzaq
                    @Override // com.google.android.gms.internal.cast_tv.zzbo
                    public final void zza(String str2, String str3, c cVar2, zzeq zzeqVar2) {
                        zzbp.this.zzD(str2, str3, cVar2, zzeqVar2);
                    }
                });
            }
            if (this.zzk.contains(7)) {
                this.zzh.put("EDIT_TRACKS_INFO", new zzbo() { // from class: com.google.android.gms.internal.cast_tv.zzar
                    @Override // com.google.android.gms.internal.cast_tv.zzbo
                    public final void zza(String str2, String str3, c cVar2, zzeq zzeqVar2) {
                        zzbp.this.zzE(str2, str3, cVar2, zzeqVar2);
                    }
                });
            }
            if (this.zzk.contains(8)) {
                this.zzh.put("QUEUE_INSERT", new zzbo() { // from class: com.google.android.gms.internal.cast_tv.zzas
                    @Override // com.google.android.gms.internal.cast_tv.zzbo
                    public final void zza(String str2, String str3, c cVar2, zzeq zzeqVar2) {
                        zzbp.this.zzF(str2, str3, cVar2, zzeqVar2);
                    }
                });
            }
            if (this.zzk.contains(9)) {
                this.zzh.put("QUEUE_REMOVE", new zzbo() { // from class: com.google.android.gms.internal.cast_tv.zzat
                    @Override // com.google.android.gms.internal.cast_tv.zzbo
                    public final void zza(String str2, String str3, c cVar2, zzeq zzeqVar2) {
                        zzbp.this.zzG(str2, str3, cVar2, zzeqVar2);
                    }
                });
            }
            if (this.zzk.contains(10)) {
                this.zzh.put("QUEUE_REORDER", new zzbo() { // from class: com.google.android.gms.internal.cast_tv.zzav
                    @Override // com.google.android.gms.internal.cast_tv.zzbo
                    public final void zza(String str2, String str3, c cVar2, zzeq zzeqVar2) {
                        zzbp.this.zzq(str2, str3, cVar2, zzeqVar2);
                    }
                });
            }
            if (this.zzk.contains(11)) {
                this.zzh.put("QUEUE_UPDATE", new zzbo() { // from class: com.google.android.gms.internal.cast_tv.zzaw
                    @Override // com.google.android.gms.internal.cast_tv.zzbo
                    public final void zza(String str2, String str3, c cVar2, zzeq zzeqVar2) {
                        zzbp.this.zzr(str2, str3, cVar2, zzeqVar2);
                    }
                });
            }
            if (this.zzk.contains(12)) {
                this.zzh.put("QUEUE_GET_ITEM_IDS", new zzbo() { // from class: com.google.android.gms.internal.cast_tv.zzax
                    @Override // com.google.android.gms.internal.cast_tv.zzbo
                    public final void zza(String str2, String str3, c cVar2, zzeq zzeqVar2) {
                        zzbp.this.zzs(str2, str3, cVar2, zzeqVar2);
                    }
                });
            }
            if (this.zzk.contains(13)) {
                this.zzh.put("QUEUE_GET_ITEMS", new zzbo() { // from class: com.google.android.gms.internal.cast_tv.zzay
                    @Override // com.google.android.gms.internal.cast_tv.zzbo
                    public final void zza(String str2, String str3, c cVar2, zzeq zzeqVar2) {
                        zzbp.this.zzt(str2, str3, cVar2, zzeqVar2);
                    }
                });
            }
            if (this.zzk.contains(14)) {
                this.zzh.put("QUEUE_GET_ITEM_RANGE", new zzbo() { // from class: com.google.android.gms.internal.cast_tv.zzaz
                    @Override // com.google.android.gms.internal.cast_tv.zzbo
                    public final void zza(String str2, String str3, c cVar2, zzeq zzeqVar2) {
                        zzbp.this.zzu(str2, str3, cVar2, zzeqVar2);
                    }
                });
            }
            if (this.zzk.contains(15)) {
                this.zzh.put("LOAD", new zzbo() { // from class: com.google.android.gms.internal.cast_tv.zzba
                    @Override // com.google.android.gms.internal.cast_tv.zzbo
                    public final void zza(String str2, String str3, c cVar2, zzeq zzeqVar2) {
                        zzbp.this.zzv(str2, str3, cVar2, zzeqVar2);
                    }
                });
            }
            if (this.zzk.contains(16)) {
                this.zzh.put("RESUME_SESSION", new zzbo() { // from class: com.google.android.gms.internal.cast_tv.zzbb
                    @Override // com.google.android.gms.internal.cast_tv.zzbo
                    public final void zza(String str2, String str3, c cVar2, zzeq zzeqVar2) {
                        zzbp.this.zzw(str2, str3, cVar2, zzeqVar2);
                    }
                });
            }
            if (this.zzk.contains(17)) {
                this.zzh.put("PLAY_AGAIN", new zzbo() { // from class: com.google.android.gms.internal.cast_tv.zzbc
                    @Override // com.google.android.gms.internal.cast_tv.zzbo
                    public final void zza(String str2, String str3, c cVar2, zzeq zzeqVar2) {
                        zzbp.this.zzx(str2, str3, cVar2, zzeqVar2);
                    }
                });
            }
            if (this.zzk.contains(18)) {
                this.zzh.put("STORE_SESSION", new zzbo() { // from class: com.google.android.gms.internal.cast_tv.zzbd
                    @Override // com.google.android.gms.internal.cast_tv.zzbo
                    public final void zza(String str2, String str3, c cVar2, zzeq zzeqVar2) {
                        zzbp.this.zzy(str2, str3, cVar2, zzeqVar2);
                    }
                });
            }
        }
        Preconditions.checkNotNull(this.zzh);
        zzbo zzboVar = (zzbo) this.zzh.get(optString);
        if (zzboVar == null) {
            zzdu.zzc(zzeqVar, zzT(str, cVar));
            return;
        }
        try {
            zzboVar.zza(str, optString, cVar, zzeqVar);
        } catch (RemoteException e) {
            zze.e(e, "Failed to handle command on the client side", new Object[0]);
            zzdu.zzc(zzeqVar, 3);
        } catch (zzv e2) {
            zze.e(e2, "Request is invalid".concat(String.valueOf(e2.getMessage())), new Object[0]);
            zzW(str, new MediaError.Builder().setType("INVALID_REQUEST").setRequestId(cVar.optLong("requestId")).build());
            zzdu.zzc(zzeqVar, 3);
        }
    }

    public final /* synthetic */ void zzo(String str, String str2, c cVar, zzeq zzeqVar) throws RemoteException, zzv {
        com.google.android.gms.cast.tv.media.zzz zza = com.google.android.gms.cast.tv.media.zzz.zza(cVar);
        zza.zzb(new zzbe(this, cVar, str));
        this.zzf.zzm(str, zza, zzeqVar);
    }

    public final /* synthetic */ void zzp(String str, String str2, c cVar, zzeq zzeqVar) throws RemoteException, zzv {
        com.google.android.gms.cast.tv.media.zzz zza = com.google.android.gms.cast.tv.media.zzz.zza(cVar);
        zza.zzb(new zzbe(this, cVar, str));
        this.zzf.zzl(str, zza, zzeqVar);
    }

    public final /* synthetic */ void zzq(String str, String str2, c cVar, zzeq zzeqVar) throws RemoteException, zzv {
        QueueReorderRequestData zza = QueueReorderRequestData.zza(cVar);
        zzv zzvVar = new zzv("INVALID_REQUEST");
        List<Integer> itemIds = zza.getItemIds();
        Integer insertBefore = zza.getInsertBefore();
        if (!itemIds.isEmpty()) {
            if (!zzX(itemIds)) {
                if (insertBefore != null && itemIds.contains(insertBefore)) {
                    zze.w("the itemIds to reorder contains insertBefore", new Object[0]);
                    throw zzvVar;
                }
                zza.zzb(new zzbe(this, cVar, str));
                this.zzf.zzt(str, zza, zzeqVar);
                return;
            }
            zze.w("queue reorder has duplicate itemIds", new Object[0]);
            throw zzvVar;
        }
        zze.w("queue reorder has empty itemIds", new Object[0]);
        throw zzvVar;
    }

    public final /* synthetic */ void zzr(String str, String str2, c cVar, zzeq zzeqVar) throws RemoteException, zzv {
        QueueUpdateRequestData zza = QueueUpdateRequestData.zza(cVar);
        zzv zzvVar = new zzv("INVALID_REQUEST");
        List<MediaQueueItem> items = zza.getItems();
        if (items != null && items.size() > 1) {
            HashSet hashSet = new HashSet();
            for (MediaQueueItem mediaQueueItem : items) {
                Integer valueOf = Integer.valueOf(mediaQueueItem.getItemId());
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(valueOf);
                } else {
                    zze.w("queue update has duplicate queue items", new Object[0]);
                    throw zzvVar;
                }
            }
        }
        zza.zzb(new zzbe(this, cVar, str));
        this.zzf.zzu(str, zza, zzeqVar);
    }

    public final /* synthetic */ void zzs(String str, String str2, c cVar, zzeq zzeqVar) throws RemoteException, zzv {
        com.google.android.gms.cast.tv.media.zzz zza = com.google.android.gms.cast.tv.media.zzz.zza(cVar);
        zza.zzb(new zzbe(this, cVar, str));
        this.zzf.zzo(str, zza, zzeqVar);
    }

    public final /* synthetic */ void zzt(String str, String str2, c cVar, zzeq zzeqVar) throws RemoteException, zzv {
        com.google.android.gms.cast.tv.media.zze zza = com.google.android.gms.cast.tv.media.zze.zza(cVar);
        zza.zzd(new zzbe(this, cVar, str));
        this.zzf.zzq(str, zza, zzeqVar);
    }

    public final /* synthetic */ void zzu(String str, String str2, c cVar, zzeq zzeqVar) throws RemoteException, zzv {
        FetchItemsRequestData zza = FetchItemsRequestData.zza(cVar);
        zza.zzb(new zzbe(this, cVar, str));
        this.zzf.zzp(str, zza, zzeqVar);
    }

    public final /* synthetic */ void zzv(String str, String str2, c cVar, zzeq zzeqVar) throws RemoteException, zzv {
        MediaLoadRequestData fromJson = MediaLoadRequestData.fromJson(cVar);
        this.zzi = null;
        zzQ("INTERRUPTED");
        this.zzm.zza(fromJson);
        this.zzf.zzk(str, fromJson, zzeqVar);
    }

    public final /* synthetic */ void zzw(String str, String str2, c cVar, zzeq zzeqVar) throws RemoteException, zzv {
        MediaResumeSessionRequestData zza = MediaResumeSessionRequestData.zza(cVar);
        this.zzi = null;
        zzQ("INTERRUPTED");
        this.zzf.zzv(str, zza, zzeqVar);
    }

    public final /* synthetic */ void zzx(String str, String str2, c cVar, zzeq zzeqVar) throws RemoteException, zzv {
        zzl zzbhVar;
        com.google.android.gms.cast.tv.media.zzz zza = com.google.android.gms.cast.tv.media.zzz.zza(cVar);
        if (zzY(zzU())) {
            c zzb = new SeekRequestData(zza.getRequestId(), null, 1, 0L, null).zzb();
            try {
                zzb.put("type", "SEEK");
            } catch (b unused) {
            }
            zzbhVar = new zzbg(this, str, zzb);
        } else {
            zzbhVar = new zzbh(this, zza, str);
        }
        zza.zzb(zzbhVar);
        this.zzf.zzn(str, zza, zzeqVar);
    }

    public final /* synthetic */ void zzy(String str, String str2, c cVar, zzeq zzeqVar) throws RemoteException, zzv {
        StoreSessionRequestData zza = StoreSessionRequestData.zza(cVar);
        zza.zzd(new zzbf(this, zza));
        this.zzf.zzC(str, zza, zzeqVar);
    }

    public final /* synthetic */ void zzz(String str, String str2, c cVar, zzeq zzeqVar) throws RemoteException, zzv {
        com.google.android.gms.cast.tv.media.zzz zza = com.google.android.gms.cast.tv.media.zzz.zza(cVar);
        zza.zzb(new zzbe(this, cVar, str));
        this.zzf.zzB(str, zza, zzeqVar);
    }
}
