package com.facebook.ads.internal.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.ads.AudienceNetworkActivity;
/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.facebook.ads.internal.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0118a {
        void a(View view);

        void a(String str);

        void a(String str, com.facebook.ads.internal.j.d dVar);
    }

    void a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity);

    void a(Bundle bundle);

    void i();

    void j();

    void onDestroy();

    void setListener(InterfaceC0118a interfaceC0118a);
}
