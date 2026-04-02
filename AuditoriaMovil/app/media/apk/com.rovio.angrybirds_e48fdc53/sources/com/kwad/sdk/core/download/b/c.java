package com.kwad.sdk.core.download.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.kwad.sdk.api.core.IProgressRemoteView;
import com.kwad.sdk.api.core.RemoteViewBuilder;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.service.a.e;
/* loaded from: classes.dex */
public final class c {
    private IProgressRemoteView aoj;

    private c(IProgressRemoteView iProgressRemoteView) {
        this.aoj = iProgressRemoteView;
    }

    public static c a(Context context, int i, boolean z) {
        c cVar;
        try {
            cVar = ((e) ServiceProvider.get(e.class)).getApiVersionCode() >= 3031000 ? new c(RemoteViewBuilder.createProgressView(context, i, z)) : new c(RemoteViewBuilder.createProgressView(context));
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
            cVar = null;
        }
        if (cVar == null) {
            try {
                return new c(RemoteViewBuilder.createProgressView(context));
            } catch (Throwable th2) {
                com.kwad.sdk.core.e.c.printStackTraceOnly(th2);
                return cVar;
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final RemoteViews build() {
        IProgressRemoteView iProgressRemoteView = this.aoj;
        if (iProgressRemoteView != null) {
            return iProgressRemoteView.build();
        }
        return null;
    }

    public final void setControlBtnPaused(boolean z) {
        try {
            IProgressRemoteView iProgressRemoteView = this.aoj;
            if (iProgressRemoteView != null) {
                iProgressRemoteView.setControlBtnPaused(z);
            }
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
        }
    }

    public final void setIcon(Bitmap bitmap) {
        IProgressRemoteView iProgressRemoteView = this.aoj;
        if (iProgressRemoteView != null) {
            iProgressRemoteView.setIcon(bitmap);
        }
    }

    public final void setName(String str) {
        IProgressRemoteView iProgressRemoteView = this.aoj;
        if (iProgressRemoteView != null) {
            iProgressRemoteView.setName(str);
        }
    }

    public final void setPercentNum(String str) {
        IProgressRemoteView iProgressRemoteView = this.aoj;
        if (iProgressRemoteView != null) {
            iProgressRemoteView.setPercentNum(str);
        }
    }

    public final void setProgress(int i, int i2, boolean z) {
        IProgressRemoteView iProgressRemoteView = this.aoj;
        if (iProgressRemoteView != null) {
            iProgressRemoteView.setProgress(100, i2, false);
        }
    }

    public final void setSize(String str) {
        IProgressRemoteView iProgressRemoteView = this.aoj;
        if (iProgressRemoteView != null) {
            iProgressRemoteView.setSize(str);
        }
    }

    public final void setStatus(String str) {
        IProgressRemoteView iProgressRemoteView = this.aoj;
        if (iProgressRemoteView != null) {
            iProgressRemoteView.setStatus(str);
        }
    }
}
