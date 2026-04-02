package com.google.android.gms.internal.ads;

import com.google.android.gms.games.GamesStatusCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfmg {
    private final zzflk zza;
    private final zzfmf zzb;

    private zzfmg(zzfmf zzfmfVar) {
        zzflj zzfljVar = zzflj.zza;
        this.zzb = zzfmfVar;
        this.zza = zzfljVar;
    }

    public static zzfmg zzb(zzflk zzflkVar) {
        return new zzfmg(new zzfma(zzflkVar));
    }

    public static zzfmg zzc(int i) {
        return new zzfmg(new zzfmc(GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator<String> zzg(CharSequence charSequence) {
        return this.zzb.zza(this, charSequence);
    }

    public final List<String> zzf(CharSequence charSequence) {
        Iterator<String> zzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzg.hasNext()) {
            arrayList.add(zzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Iterable<String> zzd(CharSequence charSequence) {
        if (charSequence != null) {
            return new zzfmd(this, charSequence);
        }
        throw null;
    }
}
