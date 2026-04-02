package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzig;
import com.google.android.gms.internal.measurement.zzih;
import e.a.d.a.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class zzih<MessageType extends zzih<MessageType, BuilderType>, BuilderType extends zzig<MessageType, BuilderType>> implements zzlc {
    public int zzb = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void zzbq(Iterable<T> iterable, List<? super T> list) {
        zzkf.zze(iterable);
        if (iterable instanceof zzkm) {
            List<?> zzh = ((zzkm) iterable).zzh();
            zzkm zzkmVar = (zzkm) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    int size2 = zzkmVar.size();
                    StringBuilder v = a.v(37, "Element at index ");
                    v.append(size2 - size);
                    v.append(" is null.");
                    String sb = v.toString();
                    int size3 = zzkmVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            break;
                        }
                        zzkmVar.remove(size3);
                    }
                    throw new NullPointerException(sb);
                } else if (obj instanceof zzix) {
                    zzkmVar.zzi((zzix) obj);
                } else {
                    zzkmVar.add((String) obj);
                }
            }
        } else if (iterable instanceof zzlj) {
            list.addAll(iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(iterable.size() + list.size());
            }
            int size4 = list.size();
            for (T t : iterable) {
                if (t == 0) {
                    int size5 = list.size();
                    StringBuilder v2 = a.v(37, "Element at index ");
                    v2.append(size5 - size4);
                    v2.append(" is null.");
                    String sb2 = v2.toString();
                    int size6 = list.size();
                    while (true) {
                        size6--;
                        if (size6 < size4) {
                            break;
                        }
                        list.remove(size6);
                    }
                    throw new NullPointerException(sb2);
                }
                list.add(t);
            }
        }
    }

    public int zzbo() {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final zzix zzbp() {
        try {
            int zzbt = zzbt();
            zzix zzixVar = zzix.zzb;
            byte[] bArr = new byte[zzbt];
            zzje zzC = zzje.zzC(bArr);
            zzbH(zzC);
            zzC.zzD();
            return new zziv(bArr);
        } catch (IOException e2) {
            String name = getClass().getName();
            throw new RuntimeException(a.s(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e2);
        }
    }

    public void zzbr(int i2) {
        throw null;
    }

    public final byte[] zzbs() {
        try {
            byte[] bArr = new byte[zzbt()];
            zzje zzC = zzje.zzC(bArr);
            zzbH(zzC);
            zzC.zzD();
            return bArr;
        } catch (IOException e2) {
            String name = getClass().getName();
            throw new RuntimeException(a.s(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e2);
        }
    }
}
