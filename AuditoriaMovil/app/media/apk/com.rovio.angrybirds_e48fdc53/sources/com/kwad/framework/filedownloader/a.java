package com.kwad.framework.filedownloader;

import com.kwad.framework.filedownloader.x;
/* loaded from: classes.dex */
public interface a {

    /* renamed from: com.kwad.framework.filedownloader.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0227a {
        boolean aT(int i);

        void free();

        boolean isOver();

        a ti();

        x.a tj();

        int tk();

        void tl();

        boolean tm();

        void tn();

        void to();

        boolean tp();
    }

    /* loaded from: classes.dex */
    public interface b {
        int tq();
    }

    /* loaded from: classes.dex */
    public interface c {
        void onBegin();

        void tr();
    }

    a a(i iVar);

    a aS(int i);

    a aT(boolean z);

    a aU(boolean z);

    a aV(String str);

    a aV(boolean z);

    a aW(String str);

    a b(String str, boolean z);

    boolean cancel();

    a e(Object obj);

    String getFilename();

    int getId();

    String getPath();

    int getSmallFileSoFarBytes();

    int getSmallFileTotalBytes();

    int getSpeed();

    long getStatusUpdateTime();

    Object getTag();

    String getTargetFilePath();

    String getUrl();

    boolean isRunning();

    a m(String str, String str2);

    boolean pause();

    b sR();

    boolean sS();

    boolean sT();

    int sU();

    int sV();

    boolean sW();

    i sX();

    long sY();

    long sZ();

    int start();

    byte ta();

    boolean tb();

    Throwable tc();

    int td();

    int te();

    boolean tf();

    boolean tg();

    boolean th();
}
