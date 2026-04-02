package com.vungle.publisher;

import com.vungle.publisher.cn;
/* loaded from: classes4.dex */
public interface ei<A extends cn> extends gj<Integer> {

    /* loaded from: classes4.dex */
    public enum a {
        aware,
        downloaded,
        ready,
        failed
    }

    /* loaded from: classes4.dex */
    public enum b {
        localVideo,
        postRoll,
        streamingVideo,
        template,
        asset
    }

    void a(a aVar);

    void b(a aVar);

    String d();

    String f();

    a j();

    b o();
}
