package com.applovin.impl.communicator;

import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import java.lang.ref.WeakReference;
import java.util.UUID;
/* loaded from: classes.dex */
public abstract class CommunicatorMessageImpl extends Intent {
    private final String a;
    public final Bundle data;
    public final WeakReference<AppLovinCommunicatorPublisher> publisherRef;
    public boolean sticky;

    public CommunicatorMessageImpl(Bundle bundle, String str, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher, boolean z) {
        super(str);
        this.a = UUID.randomUUID().toString();
        this.publisherRef = new WeakReference<>(appLovinCommunicatorPublisher);
        this.sticky = z;
        this.data = bundle;
    }

    public static AppLovinCommunicatorMessage create(Bundle bundle, String str, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher, boolean z) {
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(bundle, str, appLovinCommunicatorPublisher);
        appLovinCommunicatorMessage.sticky = z;
        return appLovinCommunicatorMessage;
    }

    public abstract Bundle getMessageData();

    public abstract String getPublisherId();

    public abstract String getTopic();

    @Override // android.content.Intent
    public String toString() {
        StringBuilder y = e.a.d.a.a.y("AppLovinCommunicatorMessage{publisherId=");
        y.append(getPublisherId());
        y.append(", topic=");
        y.append(getTopic());
        y.append(CoreConstants.SINGLE_QUOTE_CHAR);
        y.append(", uniqueId='");
        e.a.d.a.a.J(y, this.a, CoreConstants.SINGLE_QUOTE_CHAR, ", data=");
        y.append(this.data);
        y.append(", sticky=");
        y.append(this.sticky);
        y.append('}');
        return y.toString();
    }
}
