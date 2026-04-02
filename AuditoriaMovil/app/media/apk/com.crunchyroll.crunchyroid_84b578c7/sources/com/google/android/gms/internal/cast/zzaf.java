package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzaf extends com.google.android.gms.cast.framework.zzad {
    public final Set zza = Collections.synchronizedSet(new HashSet());
    private int zzd = zzb;
    private static final Logger zzc = new Logger("AppVisibilityProxy");
    static final int zzb = 1;

    @Override // com.google.android.gms.cast.framework.zzae
    public final IObjectWrapper zzb() {
        return ObjectWrapper.wrap(this);
    }

    @Override // com.google.android.gms.cast.framework.zzae
    public final void zzc() {
        zzc.i("onAppEnteredBackground", new Object[0]);
        this.zzd = 2;
        for (zzae zzaeVar : this.zza) {
            zzaeVar.zza();
        }
    }

    @Override // com.google.android.gms.cast.framework.zzae
    public final void zzd() {
        zzc.i("onAppEnteredForeground", new Object[0]);
        this.zzd = 1;
        for (zzae zzaeVar : this.zza) {
            zzaeVar.zzb();
        }
    }

    public final boolean zze() {
        if (this.zzd == 2) {
            return true;
        }
        return false;
    }
}
