package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_for12;

import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.a0;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.l;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.m;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.r;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.s;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.util.List;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class e {
    static {
        Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");
    }

    public static int a(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException e) {
            return i;
        }
    }

    public static int a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static long a(a0 a0Var) {
        return a(a0Var.m());
    }

    public static long a(r rVar) {
        return a(rVar.a(DownloadUtils.CONTENT_LENGTH));
    }

    private static long a(String str) {
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e) {
            }
        }
        return -1L;
    }

    public static void a(m mVar, s sVar, r rVar) {
        if (mVar == m.a) {
            return;
        }
        List<l> a = l.a(sVar, rVar);
        if (a.isEmpty()) {
            return;
        }
        mVar.a(sVar, a);
    }

    public static int b(String str, int i) {
        char charAt;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\t')) {
            i++;
        }
        return i;
    }

    public static boolean b(a0 a0Var) {
        int k;
        return (a0Var.s().e().equals("HEAD") || ((((k = a0Var.k()) >= 100 && k < 200) || k == 204 || k == 304) && a(a0Var) == -1 && !DownloadUtils.VALUE_CHUNKED.equalsIgnoreCase(a0Var.b(DownloadUtils.TRANSFER_ENCODING)))) ? false : true;
    }
}
