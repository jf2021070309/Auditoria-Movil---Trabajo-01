package com.facebook.ads.internal.q.a;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
/* loaded from: classes2.dex */
public class q implements View.OnSystemUiVisibilityChangeListener {
    private final View a;
    private int b;
    private Window c;
    private a d = a.DEFAULT;
    private final Runnable e = new Runnable() { // from class: com.facebook.ads.internal.q.a.q.1
        @Override // java.lang.Runnable
        public void run() {
            q.this.a(false);
        }
    };

    /* loaded from: classes2.dex */
    public enum a {
        DEFAULT,
        FULL_SCREEN
    }

    public q(View view) {
        this.a = view;
        this.a.setOnSystemUiVisibilityChangeListener(this);
    }

    private void a(int i, boolean z) {
        if (this.c == null) {
            return;
        }
        WindowManager.LayoutParams attributes = this.c.getAttributes();
        if (z) {
            attributes.flags |= i;
        } else {
            attributes.flags &= i ^ (-1);
        }
        this.c.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (a.DEFAULT.equals(this.d)) {
            return;
        }
        int i = z ? 3840 : 3847;
        Handler handler = this.a.getHandler();
        if (handler != null && z) {
            handler.removeCallbacks(this.e);
            handler.postDelayed(this.e, 2000L);
        }
        this.a.setSystemUiVisibility(i);
    }

    public void a() {
        this.c = null;
    }

    public void a(Window window) {
        this.c = window;
    }

    public void a(a aVar) {
        this.d = aVar;
        switch (this.d) {
            case FULL_SCREEN:
                a(DownloadExpSwitchCode.BACK_BUGFIX_SIGBUS, true);
                a(DownloadExpSwitchCode.BUGFIX_SIGBUS_24_25, true);
                a(false);
                return;
            default:
                a(DownloadExpSwitchCode.BACK_BUGFIX_SIGBUS, false);
                a(DownloadExpSwitchCode.BUGFIX_SIGBUS_24_25, false);
                this.a.setSystemUiVisibility(0);
                return;
        }
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(int i) {
        this.b = i;
        if (((this.b ^ i) & 2) == 0 || (i & 2) != 0) {
            return;
        }
        a(true);
    }
}
