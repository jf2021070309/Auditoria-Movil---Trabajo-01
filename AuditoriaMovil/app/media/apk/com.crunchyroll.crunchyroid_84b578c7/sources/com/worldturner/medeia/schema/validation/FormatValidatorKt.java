package com.worldturner.medeia.schema.validation;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.oe0.q;
import com.worldturner.medeia.api.FormatValidation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: FormatValidator.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0002H\u0002\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0002H\u0002\u001a\f\u0010\t\u001a\u00020\u0007*\u00020\u0002H\u0002\u001a\f\u0010\n\u001a\u00020\u0007*\u00020\u0002H\u0002\"\u001d\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"formats", "", "", "Lcom/worldturner/medeia/api/FormatValidation;", "getFormats", "()Ljava/util/Map;", "isDecbyte", "", "isIpv4", "isIpv6", "isIpv6Hex", "medeia-validator-core"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class FormatValidatorKt {
    private static final Map<String, FormatValidation> formats = a0.b;

    public static final /* synthetic */ boolean access$isIpv4(String str) {
        return isIpv4(str);
    }

    public static final /* synthetic */ boolean access$isIpv6(String str) {
        return isIpv6(str);
    }

    public static final Map<String, FormatValidation> getFormats() {
        return formats;
    }

    private static final boolean isDecbyte(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('0' > charAt || '9' < charAt) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isIpv4(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        List D0 = q.D0(str, new char[]{'.'});
        if (D0.size() != 4) {
            return false;
        }
        List<String> list = D0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (String str2 : list) {
                if (!isDecbyte(str2)) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (!z) {
            return false;
        }
        ArrayList arrayList = new ArrayList(r.Y(list));
        for (String str3 : list) {
            arrayList.add(Integer.valueOf(Integer.parseInt(str3)));
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (intValue >= 0 && 255 >= intValue) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (!z3) {
                    z2 = false;
                    break;
                }
            }
        }
        z2 = true;
        if (z2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isIpv6(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int parseInt;
        List D0 = q.D0(str, new char[]{':'});
        if (D0.size() > 8) {
            return false;
        }
        List<String> list = D0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (String str2 : list) {
                if (!isIpv6Hex(str2)) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (!z) {
            return false;
        }
        ArrayList arrayList = new ArrayList(r.Y(list));
        for (String str3 : list) {
            if (str3.length() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                parseInt = 0;
            } else {
                x.x(16);
                parseInt = Integer.parseInt(str3, 16);
            }
            arrayList.add(Integer.valueOf(parseInt));
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (intValue >= 0 && 65535 >= intValue) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (!z3) {
                    z2 = false;
                    break;
                }
            }
        }
        z2 = true;
        if (z2) {
            return true;
        }
        return false;
    }

    private static final boolean isIpv6Hex(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (('0' > charAt || '9' < charAt) && (('a' > charAt || 'f' < charAt) && ('A' > charAt || 'F' < charAt))) {
                return false;
            }
        }
        return true;
    }
}
