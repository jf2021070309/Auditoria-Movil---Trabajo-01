package com.google.android.gms.internal.play_billing;

import com.amazon.aps.iva.e4.e;
import com.amazon.aps.iva.k.q;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
public final class zzn {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String b;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                b = "null";
            } else {
                try {
                    b = obj.toString();
                } catch (Exception e) {
                    String b2 = q.b(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(b2), (Throwable) e);
                    b = e.b("<", b2, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = b;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
