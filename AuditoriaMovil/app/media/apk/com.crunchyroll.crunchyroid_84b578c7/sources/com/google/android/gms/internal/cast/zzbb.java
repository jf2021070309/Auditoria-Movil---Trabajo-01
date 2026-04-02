package com.google.android.gms.internal.cast;

import android.os.Handler;
import android.os.Looper;
import com.amazon.aps.iva.f8.f0;
import com.amazon.aps.iva.r2.a;
import com.amazon.aps.iva.r2.b;
import com.amazon.aps.iva.r2.d;
import com.amazon.aps.iva.r2.e;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzbb implements f0.e {
    private static final Logger zza = new Logger("MediaRouterOPTListener");
    private final zzbn zzb;
    private final Handler zzc = new zzed(Looper.getMainLooper());

    public zzbb(zzbn zzbnVar) {
        this.zzb = (zzbn) Preconditions.checkNotNull(zzbnVar);
    }

    @Override // com.amazon.aps.iva.f8.f0.e
    public final ListenableFuture onPrepareTransfer(final f0.h hVar, final f0.h hVar2) {
        zza.d("Prepare transfer from Route(%s) to Route(%s)", hVar, hVar2);
        d dVar = new d() { // from class: com.google.android.gms.internal.cast.zzaz
            @Override // com.amazon.aps.iva.r2.d
            public final Object attachCompleter(b bVar) {
                return zzbb.this.zza(hVar, hVar2, bVar);
            }
        };
        b bVar = new b();
        e<T> eVar = new e<>(bVar);
        bVar.b = eVar;
        bVar.a = zzaz.class;
        try {
            Object attachCompleter = dVar.attachCompleter(bVar);
            if (attachCompleter != null) {
                bVar.a = attachCompleter;
            }
        } catch (Exception e) {
            e.a aVar = eVar.c;
            aVar.getClass();
            if (a.g.b(aVar, null, new a.c(e))) {
                a.b(aVar);
            }
        }
        return eVar;
    }

    public final /* synthetic */ Object zza(final f0.h hVar, final f0.h hVar2, final b bVar) throws Exception {
        return Boolean.valueOf(this.zzc.post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzba
            @Override // java.lang.Runnable
            public final void run() {
                zzbb.this.zzb(hVar, hVar2, bVar);
            }
        }));
    }

    public final /* synthetic */ void zzb(f0.h hVar, f0.h hVar2, b bVar) {
        this.zzb.zzl(hVar, hVar2, bVar);
    }
}
