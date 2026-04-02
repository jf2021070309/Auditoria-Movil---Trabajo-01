package e.d.b.e.a.f;

import android.content.Context;
import android.os.Process;
/* loaded from: classes2.dex */
public final class a {
    static {
        StringBuilder w = e.a.d.a.a.w(39, "UID: [", Process.myUid(), "]  PID: [", Process.myPid());
        w.append("] ");
        String valueOf = String.valueOf(w.toString());
        if ("SplitInstallInfoProvider".length() != 0) {
            valueOf.concat("SplitInstallInfoProvider");
        } else {
            new String(valueOf);
        }
    }

    public a(Context context) {
        context.getPackageName();
    }
}
