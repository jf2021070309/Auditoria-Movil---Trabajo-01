package com.amazon.aps.iva.x40;

import java.util.Collection;
import java.util.Set;
import java.util.regex.Pattern;
/* compiled from: AppValidationInteractor.kt */
/* loaded from: classes2.dex */
public final class e implements d {
    public final String a = "3.46.2";
    public final Set<String> b;

    public e(Set set) {
        this.b = set;
    }

    @Override // com.amazon.aps.iva.x40.d
    public final boolean a() {
        boolean z;
        if (!Pattern.compile("\\d+\\.\\d+\\.\\d+").matcher(this.a).matches()) {
            return false;
        }
        Set<String> set = this.b;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            for (String str : set) {
                if (com.amazon.aps.iva.oe0.q.i0(str, "appcloner", false)) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (!z) {
            return false;
        }
        return true;
    }
}
