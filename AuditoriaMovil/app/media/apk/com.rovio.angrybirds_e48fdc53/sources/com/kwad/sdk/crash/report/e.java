package com.kwad.sdk.crash.report;

import com.kwad.sdk.crash.model.message.ExceptionMessage;
import java.io.File;
import java.util.concurrent.CountDownLatch;
/* loaded from: classes.dex */
public interface e {
    File Ex();

    void a(ExceptionMessage exceptionMessage, CountDownLatch countDownLatch);
}
