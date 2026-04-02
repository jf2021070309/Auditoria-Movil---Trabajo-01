package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfud<P> {
    private final ConcurrentMap<zzfuc, List<zzfua<P>>> zza = new ConcurrentHashMap();
    private zzfua<P> zzb;
    private final Class<P> zzc;

    private zzfud(Class<P> cls) {
        this.zzc = cls;
    }

    public static <P> zzfud<P> zzb(Class<P> cls) {
        return new zzfud<>(cls);
    }

    public final zzfua<P> zza() {
        return this.zzb;
    }

    public final void zzc(zzfua<P> zzfuaVar) {
        if (zzfuaVar.zzc() != 3) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
        List<zzfua<P>> list = this.zza.get(new zzfuc(zzfuaVar.zzb(), null));
        if (list == null) {
            list = Collections.emptyList();
        }
        if (!list.isEmpty()) {
            this.zzb = zzfuaVar;
            return;
        }
        throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
    }

    public final zzfua<P> zzd(P p, zzgbb zzgbbVar) throws GeneralSecurityException {
        byte[] array;
        if (zzgbbVar.zzf() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        int zzg = zzgbbVar.zzg() - 2;
        if (zzg == 1) {
            array = ByteBuffer.allocate(5).put((byte) 1).putInt(zzgbbVar.zzd()).array();
        } else {
            if (zzg != 2) {
                if (zzg == 3) {
                    array = zzfti.zza;
                } else if (zzg != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            array = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgbbVar.zzd()).array();
        }
        zzfua<P> zzfuaVar = new zzfua<>(p, array, zzgbbVar.zzf(), zzgbbVar.zzg(), zzgbbVar.zzd());
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzfuaVar);
        zzfuc zzfucVar = new zzfuc(zzfuaVar.zzb(), null);
        List<zzfua<P>> put = this.zza.put(zzfucVar, Collections.unmodifiableList(arrayList));
        if (put != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(put);
            arrayList2.add(zzfuaVar);
            this.zza.put(zzfucVar, Collections.unmodifiableList(arrayList2));
        }
        return zzfuaVar;
    }

    public final Class<P> zze() {
        return this.zzc;
    }
}
