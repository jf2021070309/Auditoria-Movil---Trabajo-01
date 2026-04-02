package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzemh implements zzery<zzemi> {
    private final zzfsn zza;
    private final Context zzb;
    private final zzfar zzc;
    private final View zzd;

    public zzemh(zzfsn zzfsnVar, Context context, zzfar zzfarVar, ViewGroup viewGroup) {
        this.zza = zzfsnVar;
        this.zzb = context;
        this.zzc = zzfarVar;
        this.zzd = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzemi> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzemg
            private final zzemh zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzemi zzb() throws Exception {
        Context context = this.zzb;
        zzbdl zzbdlVar = this.zzc.zze;
        ArrayList arrayList = new ArrayList();
        View view = this.zzd;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzemi(context, zzbdlVar, arrayList);
    }
}
