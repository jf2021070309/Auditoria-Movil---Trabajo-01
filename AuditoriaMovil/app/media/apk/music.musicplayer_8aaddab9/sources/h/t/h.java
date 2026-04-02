package h.t;

import h.o.b.p;
import h.o.c.j;
import h.o.c.k;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class h extends k implements p<CharSequence, Integer, h.f<? extends Integer, ? extends Integer>> {
    public final /* synthetic */ List<String> a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f8967b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(List<String> list, boolean z) {
        super(2);
        this.a = list;
        this.f8967b = z;
    }

    @Override // h.o.b.p
    public h.f<? extends Integer, ? extends Integer> i(CharSequence charSequence, Integer num) {
        Object obj;
        h.f fVar;
        Object obj2;
        CharSequence charSequence2 = charSequence;
        int intValue = num.intValue();
        j.e(charSequence2, "$this$$receiver");
        List<String> list = this.a;
        boolean z = this.f8967b;
        if (z || list.size() != 1) {
            if (intValue < 0) {
                intValue = 0;
            }
            h.q.c cVar = new h.q.c(intValue, charSequence2.length());
            if (charSequence2 instanceof String) {
                int i2 = cVar.f8950b;
                int i3 = cVar.f8951c;
                if ((i3 > 0 && intValue <= i2) || (i3 < 0 && i2 <= intValue)) {
                    while (true) {
                        int i4 = intValue + i3;
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str = (String) obj2;
                            if (g.l(str, 0, (String) charSequence2, intValue, str.length(), z)) {
                                break;
                            }
                        }
                        String str2 = (String) obj2;
                        if (str2 != null) {
                            fVar = new h.f(Integer.valueOf(intValue), str2);
                            break;
                        } else if (intValue == i2) {
                            break;
                        } else {
                            intValue = i4;
                        }
                    }
                }
                fVar = null;
            } else {
                int i5 = cVar.f8950b;
                int i6 = cVar.f8951c;
                if ((i6 > 0 && intValue <= i5) || (i6 < 0 && i5 <= intValue)) {
                    int i7 = intValue;
                    while (true) {
                        int i8 = i7 + i6;
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String str3 = (String) obj;
                            if (g.m(str3, 0, charSequence2, i7, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 != null) {
                            fVar = new h.f(Integer.valueOf(i7), str4);
                            break;
                        } else if (i7 == i5) {
                            break;
                        } else {
                            i7 = i8;
                        }
                    }
                }
                fVar = null;
            }
        } else {
            j.e(list, "<this>");
            j.e(list, "<this>");
            int size = list.size();
            if (size == 0) {
                throw new NoSuchElementException("List is empty.");
            }
            if (size != 1) {
                throw new IllegalArgumentException("List has more than one element.");
            }
            String str5 = list.get(0);
            int h2 = g.h(charSequence2, str5, intValue, false, 4);
            if (h2 >= 0) {
                fVar = new h.f(Integer.valueOf(h2), str5);
            }
            fVar = null;
        }
        if (fVar == null) {
            return null;
        }
        return new h.f<>(fVar.a, Integer.valueOf(((String) fVar.f8925b).length()));
    }
}
