package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaar extends zzaaq {
    protected zzaar(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static zzaar zzs(String str, Context context, boolean z) {
        zzf(context, false);
        return new zzaar(context, str, false);
    }

    @Deprecated
    public static zzaar zzt(String str, Context context, boolean z, int i) {
        zzf(context, z);
        return new zzaar(context, str, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaaq
    protected final List<Callable<Void>> zzi(zzabr zzabrVar, Context context, zzyj zzyjVar, zzyc zzycVar) {
        if (zzabrVar.zze() == null || !this.zzt) {
            return super.zzi(zzabrVar, context, zzyjVar, null);
        }
        int zzu = zzabrVar.zzu();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zzi(zzabrVar, context, zzyjVar, null));
        arrayList.add(new zzacg(zzabrVar, "NSYe0Ak7CUXd9zFZA3bczJ8pTgBK/kfUu9ICpHR+lQrTNc8+V7Owo49e2WIp0407", "Ux7t0A/7z2bV/IDvLZJgV4tTxr0Vvc1KngWKlG2Szwg=", zzyjVar, zzu, 24));
        return arrayList;
    }
}
