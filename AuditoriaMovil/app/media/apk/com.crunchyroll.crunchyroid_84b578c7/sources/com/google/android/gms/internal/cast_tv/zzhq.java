package com.google.android.gms.internal.cast_tv;

import com.google.android.gms.internal.cast_tv.zzhq;
import com.google.android.gms.internal.cast_tv.zzht;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public class zzhq<MessageType extends zzht<MessageType, BuilderType>, BuilderType extends zzhq<MessageType, BuilderType>> extends zzgb<MessageType, BuilderType> {
    protected zzht zza;
    private final zzht zzb;

    public zzhq(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzD()) {
            this.zza = messagetype.zzs();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    @Override // com.google.android.gms.internal.cast_tv.zzgb
    /* renamed from: zzh */
    public final zzhq zzg() {
        zzhq zzhqVar = (zzhq) this.zzb.zzi(5, null, null);
        zzhqVar.zza = zzk();
        return zzhqVar;
    }

    public final MessageType zzi() {
        MessageType zzk = zzk();
        if (zzk.zzC()) {
            return zzk;
        }
        throw new zzkd(zzk);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzjb
    /* renamed from: zzj */
    public MessageType zzk() {
        if (!this.zza.zzD()) {
            return (MessageType) this.zza;
        }
        this.zza.zzy();
        return (MessageType) this.zza;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzjd
    public final /* bridge */ /* synthetic */ zzjc zzl() {
        throw null;
    }

    public final void zzm() {
        if (!this.zza.zzD()) {
            zzn();
        }
    }

    public void zzn() {
        zzht zzs = this.zzb.zzs();
        zzjk.zza().zzb(zzs.getClass()).zzg(zzs, this.zza);
        this.zza = zzs;
    }
}
