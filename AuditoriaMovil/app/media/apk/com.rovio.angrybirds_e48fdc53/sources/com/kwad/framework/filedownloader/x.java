package com.kwad.framework.filedownloader;

import com.kwad.framework.filedownloader.message.MessageSnapshot;
import com.kwad.framework.filedownloader.s;
/* loaded from: classes.dex */
public interface x extends s.a {

    /* loaded from: classes.dex */
    public interface a {
        boolean a(MessageSnapshot messageSnapshot);

        boolean b(MessageSnapshot messageSnapshot);

        boolean c(MessageSnapshot messageSnapshot);

        boolean d(MessageSnapshot messageSnapshot);

        MessageSnapshot g(Throwable th);

        t ty();
    }

    /* loaded from: classes.dex */
    public interface b {
        void start();
    }

    void free();

    long getStatusUpdateTime();

    long getTotalBytes();

    boolean pause();

    void reset();

    long tA();

    byte ta();

    Throwable tc();

    int te();

    boolean tg();

    void tz();
}
