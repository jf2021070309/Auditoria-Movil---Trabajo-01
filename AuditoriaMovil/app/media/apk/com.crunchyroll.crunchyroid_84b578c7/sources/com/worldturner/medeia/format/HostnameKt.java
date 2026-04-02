package com.worldturner.medeia.format;

import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.yb0.j;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: hostname.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, d2 = {"isHostname", "", "", "isHostnameLabel", "medeia-validator-core"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class HostnameKt {
    public static final boolean isHostname(String str) {
        boolean z;
        int size;
        boolean z2;
        j.g(str, "receiver$0");
        if (str.length() > 255) {
            return false;
        }
        List D0 = q.D0(str, new char[]{'.'});
        List<String> list = D0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (String str2 : list) {
                if (!isHostnameLabel(str2)) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (!z) {
            return false;
        }
        if (D0.size() == 1) {
            size = 1;
        } else {
            size = D0.size() - 1;
        }
        for (int i = 0; i < size; i++) {
            if (((CharSequence) D0.get(i)).length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isHostnameLabel(String str) {
        j.g(str, "receiver$0");
        int length = str.length();
        if (length > 63) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                char charAt = str.charAt(i);
                if (('a' > charAt || 'z' < charAt) && ('A' > charAt || 'Z' < charAt)) {
                    return false;
                }
            } else if (i == length - 1) {
                char charAt2 = str.charAt(i);
                if (('0' > charAt2 || '9' < charAt2) && (('a' > charAt2 || 'z' < charAt2) && ('A' > charAt2 || 'Z' < charAt2))) {
                    return false;
                }
            } else {
                char charAt3 = str.charAt(i);
                if (('0' > charAt3 || '9' < charAt3) && (('a' > charAt3 || 'z' < charAt3) && (('A' > charAt3 || 'Z' < charAt3) && charAt3 != '-'))) {
                    return false;
                }
            }
        }
        return true;
    }
}
