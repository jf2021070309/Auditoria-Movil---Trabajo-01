package com.vungle.publisher.inject;

import com.vungle.publisher.VungleAdActivity;
import com.vungle.publisher.VunglePubBase;
import com.vungle.publisher.env.AndroidDevice;
import com.vungle.publisher.my;
import com.vungle.publisher.ob;
import com.vungle.publisher.op;
import com.vungle.publisher.qw;
import com.vungle.publisher.sv;
import dagger.Component;
import javax.inject.Singleton;
@Component(modules = {a.class, EndpointModule.class, t.class})
@Singleton
/* loaded from: classes4.dex */
public interface w {
    void a(VungleAdActivity vungleAdActivity);

    void a(VunglePubBase vunglePubBase);

    void a(AndroidDevice androidDevice);

    void a(my myVar);

    void a(ob obVar);

    void a(op opVar);

    void a(qw qwVar);

    void a(sv svVar);
}
