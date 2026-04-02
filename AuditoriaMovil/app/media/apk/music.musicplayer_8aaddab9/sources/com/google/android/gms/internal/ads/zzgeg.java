package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgef;
import com.google.android.gms.internal.ads.zzgeg;
import e.a.d.a.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class zzgeg<MessageType extends zzgeg<MessageType, BuilderType>, BuilderType extends zzgef<MessageType, BuilderType>> implements zzghi {
    public int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void zzar(Iterable<T> iterable, List<? super T> list) {
        zzggk.zza(iterable);
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(iterable.size() + list.size());
        }
        int size = list.size();
        for (T t : iterable) {
            if (t == 0) {
                int size2 = list.size();
                StringBuilder v = a.v(37, "Element at index ");
                v.append(size2 - size);
                v.append(" is null.");
                String sb = v.toString();
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        break;
                    }
                    list.remove(size3);
                }
                throw new NullPointerException(sb);
            }
            list.add(t);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final zzgex zzan() {
        try {
            int zzaw = zzaw();
            zzgex zzgexVar = zzgex.zzb;
            byte[] bArr = new byte[zzaw];
            zzgfh zzu = zzgfh.zzu(bArr);
            zzav(zzu);
            zzu.zzD();
            return new zzget(bArr);
        } catch (IOException e2) {
            String name = getClass().getName();
            throw new RuntimeException(a.s(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final byte[] zzao() {
        try {
            byte[] bArr = new byte[zzaw()];
            zzgfh zzu = zzgfh.zzu(bArr);
            zzav(zzu);
            zzu.zzD();
            return bArr;
        } catch (IOException e2) {
            String name = getClass().getName();
            throw new RuntimeException(a.s(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e2);
        }
    }

    public int zzap() {
        throw null;
    }

    public void zzaq(int i2) {
        throw null;
    }
}
