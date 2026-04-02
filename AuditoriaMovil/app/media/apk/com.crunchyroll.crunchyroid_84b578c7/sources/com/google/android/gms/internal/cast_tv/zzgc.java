package com.google.android.gms.internal.cast_tv;

import com.amazon.aps.iva.c80.a;
import com.google.android.gms.internal.cast_tv.zzgb;
import com.google.android.gms.internal.cast_tv.zzgc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public abstract class zzgc<MessageType extends zzgc<MessageType, BuilderType>, BuilderType extends zzgb<MessageType, BuilderType>> implements zzjc {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void zzm(Iterable iterable, List list) {
        byte[] bArr = zzic.zzd;
        iterable.getClass();
        if (iterable instanceof zzij) {
            List zzh = ((zzij) iterable).zzh();
            zzij zzijVar = (zzij) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    String d = a.d("Element at index ", zzijVar.size() - size, " is null.");
                    int size2 = zzijVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        }
                        zzijVar.remove(size2);
                    }
                    throw new NullPointerException(d);
                } else if (obj instanceof zzgu) {
                    zzijVar.zzi((zzgu) obj);
                } else {
                    zzijVar.add((String) obj);
                }
            }
        } else if (!(iterable instanceof zzjj)) {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(iterable.size() + list.size());
            }
            int size3 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    String d2 = a.d("Element at index ", list.size() - size3, " is null.");
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 < size3) {
                            break;
                        }
                        list.remove(size4);
                    }
                    throw new NullPointerException(d2);
                }
                list.add(obj2);
            }
        } else {
            list.addAll(iterable);
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzjc
    public final zzgu zzG() {
        try {
            int zzp = zzp();
            zzgu zzguVar = zzgu.zzb;
            byte[] bArr = new byte[zzp];
            zzhc zzA = zzhc.zzA(bArr, 0, zzp);
            zzF(zzA);
            return zzgp.zza(zzA, bArr);
        } catch (IOException e) {
            throw new RuntimeException(e.e("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public int zzk(zzjn zzjnVar) {
        throw null;
    }

    public final byte[] zzn() {
        try {
            int zzp = zzp();
            byte[] bArr = new byte[zzp];
            zzhc zzA = zzhc.zzA(bArr, 0, zzp);
            zzF(zzA);
            zzA.zzB();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(e.e("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
