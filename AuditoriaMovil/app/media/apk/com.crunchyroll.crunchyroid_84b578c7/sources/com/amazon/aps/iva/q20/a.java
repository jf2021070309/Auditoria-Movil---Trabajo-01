package com.amazon.aps.iva.q20;

import android.content.res.Resources;
import com.amazon.aps.iva.f20.i;
import com.amazon.aps.iva.yb0.j;
import java.util.LinkedHashMap;
/* compiled from: CrPlusBenefitsDescriptionsProvider.kt */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: CrPlusBenefitsDescriptionsProvider.kt */
    /* renamed from: com.amazon.aps.iva.q20.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0634a {
        public static b a(Resources resources) {
            i iVar = i.a.a;
            if (iVar != null) {
                com.amazon.aps.iva.xb0.a<Boolean> n = iVar.n();
                j.f(n, "shouldAddBentoBenefit");
                return new b(resources, n);
            }
            j.m("dependencies");
            throw null;
        }
    }

    LinkedHashMap<String, String> a(boolean z);
}
