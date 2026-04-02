package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12;

import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.f;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.api.reward.RewardItem;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class c {
    /* JADX INFO: Access modifiers changed from: protected */
    public static List<k> a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar, String str) {
        if (cVar == null || TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        f e = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().e(str);
        if (e != null) {
            double e2 = e.e();
            double b = e.b();
            double a = b.d().a(3, str, e.a());
            if (!e.f() && a > PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                if (e.d() == 1) {
                    a(a, e2, b, cVar, arrayList);
                } else if (e.d() == 2) {
                    b(a, e2, b, cVar, arrayList);
                }
                List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.e> d = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().d(String.valueOf(cVar.w()));
                if (d != null) {
                    Iterator<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.e> it = d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.e next = it.next();
                        if (a > next.d() && a <= next.f()) {
                            cVar.h().put("user_label_value", next);
                            break;
                        }
                    }
                }
            }
            cVar.h().put("rule_id", e.c());
            cVar.h().put(RewardItem.KEY_ECPM, Double.valueOf(a));
            cVar.h().put("rule_in_use", Integer.valueOf(arrayList.size() == 0 ? 0 : 1));
            cVar.h().put("group_type", Integer.valueOf(cVar.i()));
        }
        if (Logger.isDebug()) {
            if (arrayList.size() != 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    Logger.d("DynamicRuleCalculate", "rit：" + ((k) arrayList.get(i)).d() + ",level：" + ((k) arrayList.get(i)).p());
                }
            } else {
                Logger.d("DynamicRuleCalculate", "走原waterfall，inUse ： 不生效");
            }
        }
        return arrayList.size() == 0 ? cVar.F() : arrayList;
    }

    private static void a(double d, double d2, double d3, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar, List<k> list) {
        if (d2 < d3 || d2 <= PangleAdapterUtils.CPM_DEFLAUT_VALUE || d < cVar.g()) {
            return;
        }
        if (d > cVar.f() && d3 <= PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            list.addAll(cVar.F());
            return;
        }
        double doubleValue = BigDecimal.valueOf(d * d2).setScale(2, RoundingMode.HALF_UP).doubleValue();
        double doubleValue2 = BigDecimal.valueOf(d * d3).setScale(2, RoundingMode.HALF_UP).doubleValue();
        List<k> F = cVar.F();
        double d4 = -1.0d;
        double d5 = -1.0d;
        for (int i = 0; i < F.size(); i++) {
            k kVar = F.get(i);
            if (kVar.f() == 0) {
                double doubleValue3 = BigDecimal.valueOf(kVar.i()).setScale(2, RoundingMode.HALF_UP).doubleValue();
                if (doubleValue3 <= doubleValue && doubleValue3 >= doubleValue2) {
                    if (d4 == -1.0d || d4 < kVar.i()) {
                        d4 = kVar.i();
                    }
                    if (d5 == -1.0d || d5 > kVar.i()) {
                        d5 = kVar.i();
                    }
                }
            }
            list.add(kVar);
        }
        cVar.h().put("max_ecpm", Double.valueOf(d4));
        cVar.h().put("min_ecpm", Double.valueOf(d5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r7 = java.lang.Math.min(r7, r2 - 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c r19, double r20, double r22, double r24, java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> r26) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.c.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c, double, double, double, java.util.List):void");
    }

    private static void b(double d, double d2, double d3, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c cVar, List<k> list) {
        if (cVar == null || d2 == PangleAdapterUtils.CPM_DEFLAUT_VALUE || d < cVar.g()) {
            return;
        }
        if (d <= cVar.f() || d3 > PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            a(cVar, d, d2, d3, list);
        } else {
            list.addAll(cVar.F());
        }
    }
}
