package com.amazon.aps.iva.o0;

import android.content.Context;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SlotTable.kt */
/* loaded from: classes.dex */
public final class d2 implements com.amazon.aps.iva.o6.i0 {
    public final Object b;

    public d2(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.b = context;
    }

    public final void a(int i) {
        Object obj = this.b;
        if ((!((List) obj).isEmpty()) && (((Number) ((List) obj).get(0)).intValue() == i || ((Number) ((List) obj).get(((List) obj).size() - 1)).intValue() == i)) {
            return;
        }
        int size = ((List) obj).size();
        ((List) obj).add(Integer.valueOf(i));
        while (size > 0) {
            int i2 = ((size + 1) >>> 1) - 1;
            int intValue = ((Number) ((List) obj).get(i2)).intValue();
            if (i <= intValue) {
                break;
            }
            ((List) obj).set(size, Integer.valueOf(intValue));
            size = i2;
        }
        ((List) obj).set(size, Integer.valueOf(i));
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final long c() {
        long j = Long.MAX_VALUE;
        for (com.amazon.aps.iva.o6.i0 i0Var : (com.amazon.aps.iva.o6.i0[]) this.b) {
            long c = i0Var.c();
            if (c != Long.MIN_VALUE) {
                j = Math.min(j, c);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final com.amazon.aps.iva.g70.g d() {
        Context context = (Context) this.b;
        return new com.amazon.aps.iva.g70.g(0, context.getText(R.string.email_verification_reminder_please_verify_email), context.getText(R.string.email_verification_reminder_then_you_can_enjoy_crunchyroll), context.getText(R.string.email_verification_reminder_verify_email), "positive_button_result", context.getText(R.string.email_verification_reminder_no_thanks), 1);
    }

    public final int g() {
        boolean z;
        int intValue;
        List list = (List) this.b;
        if (list.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int intValue2 = ((Number) list.get(0)).intValue();
            while ((!list.isEmpty()) && ((Number) list.get(0)).intValue() == intValue2) {
                list.set(0, com.amazon.aps.iva.lb0.x.D0(list));
                list.remove(list.size() - 1);
                int size = list.size();
                int size2 = list.size() >>> 1;
                int i = 0;
                while (i < size2) {
                    int intValue3 = ((Number) list.get(i)).intValue();
                    int i2 = (i + 1) * 2;
                    int i3 = i2 - 1;
                    int intValue4 = ((Number) list.get(i3)).intValue();
                    if (i2 < size && (intValue = ((Number) list.get(i2)).intValue()) > intValue4) {
                        if (intValue > intValue3) {
                            list.set(i, Integer.valueOf(intValue));
                            list.set(i2, Integer.valueOf(intValue3));
                            i = i2;
                        }
                    } else if (intValue4 > intValue3) {
                        list.set(i, Integer.valueOf(intValue4));
                        list.set(i3, Integer.valueOf(intValue3));
                        i = i3;
                    }
                }
            }
            return intValue2;
        }
        e0.c("Set is empty".toString());
        throw null;
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final boolean isLoading() {
        for (com.amazon.aps.iva.o6.i0 i0Var : (com.amazon.aps.iva.o6.i0[]) this.b) {
            if (i0Var.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final boolean p(long j) {
        com.amazon.aps.iva.o6.i0[] i0VarArr;
        boolean z;
        boolean z2;
        boolean z3 = false;
        do {
            long c = c();
            if (c == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (com.amazon.aps.iva.o6.i0 i0Var : (com.amazon.aps.iva.o6.i0[]) this.b) {
                long c2 = i0Var.c();
                if (c2 != Long.MIN_VALUE && c2 <= j) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c2 == c || z2) {
                    z |= i0Var.p(j);
                }
            }
            z3 |= z;
        } while (z);
        return z3;
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final long s() {
        long j = Long.MAX_VALUE;
        for (com.amazon.aps.iva.o6.i0 i0Var : (com.amazon.aps.iva.o6.i0[]) this.b) {
            long s = i0Var.s();
            if (s != Long.MIN_VALUE) {
                j = Math.min(j, s);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final void v(long j) {
        for (com.amazon.aps.iva.o6.i0 i0Var : (com.amazon.aps.iva.o6.i0[]) this.b) {
            i0Var.v(j);
        }
    }

    public d2(com.amazon.aps.iva.zj.e eVar) {
        this.b = eVar;
    }

    public d2(com.amazon.aps.iva.o6.i0[] i0VarArr) {
        this.b = i0VarArr;
    }

    public d2() {
        this.b = new ArrayList();
    }
}
