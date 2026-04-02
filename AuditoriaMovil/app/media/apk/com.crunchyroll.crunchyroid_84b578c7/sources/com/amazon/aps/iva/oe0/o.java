package com.amazon.aps.iva.oe0;

import com.amazon.aps.iva.lb0.x;
import java.util.Iterator;
import java.util.List;
/* compiled from: Strings.kt */
/* loaded from: classes4.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<CharSequence, Integer, com.amazon.aps.iva.kb0.j<? extends Integer, ? extends Integer>> {
    public final /* synthetic */ List<String> h;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(List<String> list, boolean z) {
        super(2);
        this.h = list;
        this.i = z;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.j<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
        Object obj;
        com.amazon.aps.iva.kb0.j jVar;
        Object obj2;
        CharSequence charSequence2 = charSequence;
        int intValue = num.intValue();
        com.amazon.aps.iva.yb0.j.f(charSequence2, "$this$$receiver");
        List<String> list = this.h;
        boolean z = this.i;
        if (!z && list.size() == 1) {
            String str = (String) x.O0(list);
            int r0 = q.r0(charSequence2, str, intValue, false, 4);
            if (r0 >= 0) {
                jVar = new com.amazon.aps.iva.kb0.j(Integer.valueOf(r0), str);
            }
            jVar = null;
        } else {
            if (intValue < 0) {
                intValue = 0;
            }
            com.amazon.aps.iva.ec0.j jVar2 = new com.amazon.aps.iva.ec0.j(intValue, charSequence2.length());
            boolean z2 = charSequence2 instanceof String;
            int i = jVar2.d;
            int i2 = jVar2.c;
            if (z2) {
                if ((i > 0 && intValue <= i2) || (i < 0 && i2 <= intValue)) {
                    while (true) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                String str2 = (String) obj2;
                                if (m.c0(0, intValue, str2.length(), str2, (String) charSequence2, z)) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        String str3 = (String) obj2;
                        if (str3 != null) {
                            jVar = new com.amazon.aps.iva.kb0.j(Integer.valueOf(intValue), str3);
                            break;
                        } else if (intValue == i2) {
                            break;
                        } else {
                            intValue += i;
                        }
                    }
                }
                jVar = null;
            } else {
                if ((i > 0 && intValue <= i2) || (i < 0 && i2 <= intValue)) {
                    while (true) {
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                String str4 = (String) obj;
                                if (q.x0(str4, z, 0, charSequence2, intValue, str4.length())) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        String str5 = (String) obj;
                        if (str5 != null) {
                            jVar = new com.amazon.aps.iva.kb0.j(Integer.valueOf(intValue), str5);
                            break;
                        } else if (intValue == i2) {
                            break;
                        } else {
                            intValue += i;
                        }
                    }
                }
                jVar = null;
            }
        }
        if (jVar == null) {
            return null;
        }
        return new com.amazon.aps.iva.kb0.j<>(jVar.b, Integer.valueOf(((String) jVar.c).length()));
    }
}
