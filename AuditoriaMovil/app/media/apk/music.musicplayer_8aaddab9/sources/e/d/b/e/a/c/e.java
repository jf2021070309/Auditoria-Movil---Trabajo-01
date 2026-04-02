package e.d.b.e.a.c;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
/* loaded from: classes2.dex */
public final class e {
    public final String a;

    public e(String str) {
        StringBuilder w = e.a.d.a.a.w(39, "UID: [", Process.myUid(), "]  PID: [", Process.myPid());
        w.append("] ");
        String valueOf = String.valueOf(w.toString());
        this.a = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    public static String b(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e2) {
                String valueOf = String.valueOf(str2);
                Log.e("PlayCore", valueOf.length() != 0 ? "Unable to format ".concat(valueOf) : new String("Unable to format "), e2);
                String join = TextUtils.join(", ", objArr);
                str2 = e.a.d.a.a.t(new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length()), str2, " [", join, "]");
            }
        }
        return e.a.d.a.a.s(new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length()), str, " : ", str2);
    }

    public final int a(int i2, String str, Object[] objArr) {
        if (Log.isLoggable("PlayCore", i2)) {
            return Log.i("PlayCore", b(this.a, str, objArr));
        }
        return 0;
    }

    public final void c(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", b(this.a, str, objArr), th);
        }
    }
}
