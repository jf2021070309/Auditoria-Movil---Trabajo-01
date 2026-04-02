package com.unity.androidnotifications;

import android.app.Activity;
import android.app.NotificationChannel;
import android.content.Context;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class UnityNotificationManagerOreo extends UnityNotificationManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public UnityNotificationManagerOreo(Context context, Activity activity) {
        super(context, activity);
    }

    @Override // com.unity.androidnotifications.UnityNotificationManager
    public void registerNotificationChannel(String str, String str2, int i, String str3, boolean z, boolean z2, boolean z3, boolean z4, long[] jArr, int i2) {
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
        notificationChannel.setDescription(str3);
        notificationChannel.enableLights(z);
        notificationChannel.enableVibration(z2);
        notificationChannel.setBypassDnd(z3);
        notificationChannel.setShowBadge(z4);
        notificationChannel.setVibrationPattern(jArr);
        notificationChannel.setLockscreenVisibility(i2);
        getNotificationManager().createNotificationChannel(notificationChannel);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static NotificationChannelWrapper getOreoNotificationChannel(Context context, String str) {
        new ArrayList();
        for (NotificationChannel notificationChannel : getNotificationManager(context).getNotificationChannels()) {
            if (notificationChannel.getId() == str) {
                return notificationChannelToWrapper(notificationChannel);
            }
        }
        return null;
    }

    protected static NotificationChannelWrapper notificationChannelToWrapper(NotificationChannel notificationChannel) {
        NotificationChannelWrapper notificationChannelWrapper = new NotificationChannelWrapper();
        notificationChannelWrapper.id = notificationChannel.getId();
        notificationChannelWrapper.name = notificationChannel.getName().toString();
        notificationChannelWrapper.importance = notificationChannel.getImportance();
        notificationChannelWrapper.description = notificationChannel.getDescription();
        notificationChannelWrapper.enableLights = notificationChannel.shouldShowLights();
        notificationChannelWrapper.enableVibration = notificationChannel.shouldVibrate();
        notificationChannelWrapper.canBypassDnd = notificationChannel.canBypassDnd();
        notificationChannelWrapper.canShowBadge = notificationChannel.canShowBadge();
        notificationChannelWrapper.vibrationPattern = notificationChannel.getVibrationPattern();
        notificationChannelWrapper.lockscreenVisibility = notificationChannel.getLockscreenVisibility();
        return notificationChannelWrapper;
    }

    @Override // com.unity.androidnotifications.UnityNotificationManager
    public void deleteNotificationChannel(String str) {
        getNotificationManager().deleteNotificationChannel(str);
    }

    @Override // com.unity.androidnotifications.UnityNotificationManager
    public NotificationChannelWrapper[] getNotificationChannels() {
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel notificationChannel : getNotificationManager().getNotificationChannels()) {
            arrayList.add(notificationChannelToWrapper(notificationChannel));
        }
        return (NotificationChannelWrapper[]) arrayList.toArray(new NotificationChannelWrapper[arrayList.size()]);
    }
}
