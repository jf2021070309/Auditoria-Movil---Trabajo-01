package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzjx;
import java.io.IOException;
/* loaded from: classes2.dex */
public class zzjt<MessageType extends zzjx<MessageType, BuilderType>, BuilderType extends zzjt<MessageType, BuilderType>> extends zzig<MessageType, BuilderType> {
    public MessageType zza;
    public boolean zzb = false;
    private final MessageType zzc;

    public zzjt(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (MessageType) messagetype.zzl(4, null, null);
    }

    private static final void zza(MessageType messagetype, MessageType messagetype2) {
        zzlk.zza().zzb(messagetype.getClass()).zzg(messagetype, messagetype2);
    }

    public final MessageType zzaA() {
        MessageType zzaC = zzaC();
        boolean z = true;
        byte byteValue = ((Byte) zzaC.zzl(1, null, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                boolean zzj = zzlk.zza().zzb(zzaC.getClass()).zzj(zzaC);
                zzaC.zzl(2, true != zzj ? null : zzaC, null);
                z = zzj;
            }
        }
        if (z) {
            return zzaC;
        }
        throw new zzma(zzaC);
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    /* renamed from: zzaB */
    public MessageType zzaC() {
        if (this.zzb) {
            return this.zza;
        }
        MessageType messagetype = this.zza;
        zzlk.zza().zzb(messagetype.getClass()).zzf(messagetype);
        this.zzb = true;
        return this.zza;
    }

    public void zzaE() {
        MessageType messagetype = (MessageType) this.zza.zzl(4, null, null);
        zza(messagetype, this.zza);
        this.zza = messagetype;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzig
    public final /* synthetic */ zzig zzar(zzih zzihVar) {
        zzay((zzjx) zzihVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    public final /* bridge */ /* synthetic */ zzig zzas(byte[] bArr, int i2, int i3) throws zzkh {
        zzaz(bArr, 0, i3, zzjj.zza());
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    public final /* bridge */ /* synthetic */ zzig zzat(byte[] bArr, int i2, int i3, zzjj zzjjVar) throws zzkh {
        zzaz(bArr, 0, i3, zzjjVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    /* renamed from: zzax */
    public final BuilderType zzaq() {
        BuilderType buildertype = (BuilderType) this.zzc.zzl(5, null, null);
        buildertype.zzay(zzaC());
        return buildertype;
    }

    public final BuilderType zzay(MessageType messagetype) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zza(this.zza, messagetype);
        return this;
    }

    public final BuilderType zzaz(byte[] bArr, int i2, int i3, zzjj zzjjVar) throws zzkh {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        try {
            zzlk.zza().zzb(this.zza.getClass()).zzh(this.zza, bArr, 0, i3, new zzik(zzjjVar));
            return this;
        } catch (zzkh e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
        } catch (IndexOutOfBoundsException unused) {
            throw zzkh.zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final /* synthetic */ zzlc zzbL() {
        return this.zzc;
    }
}
