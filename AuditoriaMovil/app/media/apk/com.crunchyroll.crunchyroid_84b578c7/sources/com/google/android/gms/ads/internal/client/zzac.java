package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbf;
import com.google.android.gms.internal.ads.zzbnt;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzbzs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public final class zzac extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbnt zzb;

    public zzac(zzaw zzawVar, Context context, zzbnt zzbntVar) {
        this.zza = context;
        this.zzb = zzbntVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zza);
        zzbbf.zza(this.zza);
        if (((Boolean) zzba.zzc().zzb(zzbbf.zziI)).booleanValue()) {
            return zzceVar.zzh(wrap, this.zzb, 231004000);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zza);
        zzbbf.zza(this.zza);
        if (!((Boolean) zzba.zzc().zzb(zzbbf.zziI)).booleanValue()) {
            return null;
        }
        try {
            return ((zzdk) zzbzs.zzb(this.zza, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new zzbzq() { // from class: com.google.android.gms.ads.internal.client.zzab
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzq
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    if (queryLocalInterface instanceof zzdk) {
                        return (zzdk) queryLocalInterface;
                    }
                    return new zzdk(obj);
                }
            })).zze(wrap, this.zzb, 231004000);
        } catch (RemoteException | zzbzr | NullPointerException e) {
            zzbst.zza(this.zza).zzf(e, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }
}
