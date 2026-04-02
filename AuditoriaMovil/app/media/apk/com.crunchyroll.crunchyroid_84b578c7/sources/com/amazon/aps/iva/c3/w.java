package com.amazon.aps.iva.c3;

import android.os.Bundle;
import android.widget.RemoteViews;
/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public abstract class w {
    CharSequence mBigContentTitle;
    protected s mBuilder;
    CharSequence mSummaryText;
    boolean mSummaryTextSet = false;

    public void addCompatExtras(Bundle bundle) {
        if (this.mSummaryTextSet) {
            bundle.putCharSequence("android.summaryText", this.mSummaryText);
        }
        CharSequence charSequence = this.mBigContentTitle;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String className = getClassName();
        if (className != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", className);
        }
    }

    public String getClassName() {
        return null;
    }

    public RemoteViews makeBigContentView(m mVar) {
        return null;
    }

    public RemoteViews makeContentView(m mVar) {
        return null;
    }

    public RemoteViews makeHeadsUpContentView(m mVar) {
        return null;
    }

    public void setBuilder(s sVar) {
        if (this.mBuilder != sVar) {
            this.mBuilder = sVar;
            if (sVar != null) {
                sVar.h(this);
            }
        }
    }

    public void apply(m mVar) {
    }
}
