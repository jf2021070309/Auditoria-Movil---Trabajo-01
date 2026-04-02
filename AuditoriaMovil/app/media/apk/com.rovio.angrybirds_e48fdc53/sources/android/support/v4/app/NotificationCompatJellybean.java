package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.facebook.applinks.AppLinkData;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Classes with same name are omitted:
  classes2.dex
 */
/* loaded from: classes.dex */
public class NotificationCompatJellybean {
    static final String EXTRA_ALLOW_GENERATED_REPLIES = "android.support.allowGeneratedReplies";
    static final String EXTRA_DATA_ONLY_REMOTE_INPUTS = "android.support.dataRemoteInputs";
    private static final String KEY_ACTION_INTENT = "actionIntent";
    private static final String KEY_ALLOWED_DATA_TYPES = "allowedDataTypes";
    private static final String KEY_ALLOW_FREE_FORM_INPUT = "allowFreeFormInput";
    private static final String KEY_CHOICES = "choices";
    private static final String KEY_DATA_ONLY_REMOTE_INPUTS = "dataOnlyRemoteInputs";
    private static final String KEY_EXTRAS = "extras";
    private static final String KEY_ICON = "icon";
    private static final String KEY_LABEL = "label";
    private static final String KEY_REMOTE_INPUTS = "remoteInputs";
    private static final String KEY_RESULT_KEY = "resultKey";
    private static final String KEY_SEMANTIC_ACTION = "semanticAction";
    private static final String KEY_SHOWS_USER_INTERFACE = "showsUserInterface";
    private static final String KEY_TITLE = "title";
    public static final String TAG = "NotificationCompat";
    private static Class<?> sActionClass;
    private static Field sActionIconField;
    private static Field sActionIntentField;
    private static Field sActionTitleField;
    private static boolean sActionsAccessFailed;
    private static Field sActionsField;
    private static Field sExtrasField;
    private static boolean sExtrasFieldAccessFailed;
    private static final Object sExtrasLock = new Object();
    private static final Object sActionsLock = new Object();

    public static SparseArray<Bundle> buildActionExtrasMap(List<Bundle> actionExtrasList) {
        SparseArray<Bundle> actionExtrasMap = null;
        int count = actionExtrasList.size();
        for (int i = 0; i < count; i++) {
            Bundle actionExtras = actionExtrasList.get(i);
            if (actionExtras != null) {
                if (actionExtrasMap == null) {
                    actionExtrasMap = new SparseArray<>();
                }
                actionExtrasMap.put(i, actionExtras);
            }
        }
        return actionExtrasMap;
    }

    public static Bundle getExtras(Notification notif) {
        synchronized (sExtrasLock) {
            if (sExtrasFieldAccessFailed) {
                return null;
            }
            try {
                if (sExtrasField == null) {
                    Field extrasField = Notification.class.getDeclaredField(AppLinkData.ARGUMENTS_EXTRAS_KEY);
                    if (!Bundle.class.isAssignableFrom(extrasField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        sExtrasFieldAccessFailed = true;
                        return null;
                    }
                    extrasField.setAccessible(true);
                    sExtrasField = extrasField;
                }
                Bundle extras = (Bundle) sExtrasField.get(notif);
                if (extras == null) {
                    extras = new Bundle();
                    sExtrasField.set(notif, extras);
                }
                return extras;
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                sExtrasFieldAccessFailed = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                sExtrasFieldAccessFailed = true;
                return null;
            }
        }
    }

    public static NotificationCompat.Action readAction(int icon, CharSequence title, PendingIntent actionIntent, Bundle extras) {
        RemoteInput[] remoteInputs;
        RemoteInput[] dataOnlyRemoteInputs;
        boolean allowGeneratedReplies;
        if (extras == null) {
            remoteInputs = null;
            dataOnlyRemoteInputs = null;
            allowGeneratedReplies = false;
        } else {
            RemoteInput[] remoteInputs2 = fromBundleArray(getBundleArrayFromBundle(extras, "android.support.remoteInputs"));
            RemoteInput[] dataOnlyRemoteInputs2 = fromBundleArray(getBundleArrayFromBundle(extras, "android.support.dataRemoteInputs"));
            boolean allowGeneratedReplies2 = extras.getBoolean("android.support.allowGeneratedReplies");
            remoteInputs = remoteInputs2;
            dataOnlyRemoteInputs = dataOnlyRemoteInputs2;
            allowGeneratedReplies = allowGeneratedReplies2;
        }
        return new NotificationCompat.Action(icon, title, actionIntent, extras, remoteInputs, dataOnlyRemoteInputs, allowGeneratedReplies, 0, true);
    }

    public static Bundle writeActionAndGetExtras(Notification.Builder builder, NotificationCompat.Action action) {
        builder.addAction(action.getIcon(), action.getTitle(), action.getActionIntent());
        Bundle actionExtras = new Bundle(action.getExtras());
        if (action.getRemoteInputs() != null) {
            actionExtras.putParcelableArray("android.support.remoteInputs", toBundleArray(action.getRemoteInputs()));
        }
        if (action.getDataOnlyRemoteInputs() != null) {
            actionExtras.putParcelableArray("android.support.dataRemoteInputs", toBundleArray(action.getDataOnlyRemoteInputs()));
        }
        actionExtras.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
        return actionExtras;
    }

    public static int getActionCount(Notification notif) {
        int length;
        synchronized (sActionsLock) {
            Object[] actionObjects = getActionObjectsLocked(notif);
            length = actionObjects != null ? actionObjects.length : 0;
        }
        return length;
    }

    public static NotificationCompat.Action getAction(Notification notif, int actionIndex) {
        Object[] actionObjects;
        SparseArray<Bundle> actionExtrasMap;
        synchronized (sActionsLock) {
            try {
                try {
                    actionObjects = getActionObjectsLocked(notif);
                } catch (IllegalAccessException e) {
                    Log.e("NotificationCompat", "Unable to access notification actions", e);
                    sActionsAccessFailed = true;
                }
                if (actionObjects != null) {
                    Object actionObject = actionObjects[actionIndex];
                    Bundle actionExtras = null;
                    Bundle extras = getExtras(notif);
                    if (extras != null && (actionExtrasMap = extras.getSparseParcelableArray("android.support.actionExtras")) != null) {
                        actionExtras = actionExtrasMap.get(actionIndex);
                    }
                    return readAction(sActionIconField.getInt(actionObject), (CharSequence) sActionTitleField.get(actionObject), (PendingIntent) sActionIntentField.get(actionObject), actionExtras);
                }
                return null;
            } finally {
            }
        }
    }

    private static Object[] getActionObjectsLocked(Notification notif) {
        synchronized (sActionsLock) {
            if (ensureActionReflectionReadyLocked()) {
                try {
                    return (Object[]) sActionsField.get(notif);
                } catch (IllegalAccessException e) {
                    Log.e("NotificationCompat", "Unable to access notification actions", e);
                    sActionsAccessFailed = true;
                    return null;
                }
            }
            return null;
        }
    }

    private static boolean ensureActionReflectionReadyLocked() {
        if (sActionsAccessFailed) {
            return false;
        }
        try {
            if (sActionsField == null) {
                Class<?> cls = Class.forName("android.app.Notification$Action");
                sActionClass = cls;
                sActionIconField = cls.getDeclaredField("icon");
                sActionTitleField = sActionClass.getDeclaredField("title");
                sActionIntentField = sActionClass.getDeclaredField("actionIntent");
                Field declaredField = Notification.class.getDeclaredField("actions");
                sActionsField = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (ClassNotFoundException e) {
            Log.e("NotificationCompat", "Unable to access notification actions", e);
            sActionsAccessFailed = true;
        } catch (NoSuchFieldException e2) {
            Log.e("NotificationCompat", "Unable to access notification actions", e2);
            sActionsAccessFailed = true;
        }
        return !sActionsAccessFailed;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static NotificationCompat.Action getActionFromBundle(Bundle bundle) {
        Bundle extras = bundle.getBundle(AppLinkData.ARGUMENTS_EXTRAS_KEY);
        boolean allowGeneratedReplies = false;
        if (extras != null) {
            allowGeneratedReplies = extras.getBoolean("android.support.allowGeneratedReplies", false);
        }
        return new NotificationCompat.Action(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent) bundle.getParcelable("actionIntent"), bundle.getBundle(AppLinkData.ARGUMENTS_EXTRAS_KEY), fromBundleArray(getBundleArrayFromBundle(bundle, "remoteInputs")), fromBundleArray(getBundleArrayFromBundle(bundle, "dataOnlyRemoteInputs")), allowGeneratedReplies, bundle.getInt(KEY_SEMANTIC_ACTION), bundle.getBoolean(KEY_SHOWS_USER_INTERFACE));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle getBundleForAction(NotificationCompat.Action action) {
        Bundle actionExtras;
        Bundle bundle = new Bundle();
        bundle.putInt("icon", action.getIcon());
        bundle.putCharSequence("title", action.getTitle());
        bundle.putParcelable("actionIntent", action.getActionIntent());
        if (action.getExtras() != null) {
            actionExtras = new Bundle(action.getExtras());
        } else {
            actionExtras = new Bundle();
        }
        actionExtras.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
        bundle.putBundle(AppLinkData.ARGUMENTS_EXTRAS_KEY, actionExtras);
        bundle.putParcelableArray("remoteInputs", toBundleArray(action.getRemoteInputs()));
        bundle.putBoolean(KEY_SHOWS_USER_INTERFACE, action.getShowsUserInterface());
        bundle.putInt(KEY_SEMANTIC_ACTION, action.getSemanticAction());
        return bundle;
    }

    private static RemoteInput fromBundle(Bundle data) {
        ArrayList<String> allowedDataTypesAsList = data.getStringArrayList("allowedDataTypes");
        Set<String> allowedDataTypes = new HashSet<>();
        if (allowedDataTypesAsList != null) {
            Iterator<String> it = allowedDataTypesAsList.iterator();
            while (it.hasNext()) {
                String type = it.next();
                allowedDataTypes.add(type);
            }
        }
        return new RemoteInput(data.getString("resultKey"), data.getCharSequence(TTDownloadField.TT_LABEL), data.getCharSequenceArray("choices"), data.getBoolean("allowFreeFormInput"), data.getBundle(AppLinkData.ARGUMENTS_EXTRAS_KEY), allowedDataTypes);
    }

    private static Bundle toBundle(RemoteInput remoteInput) {
        Bundle data = new Bundle();
        data.putString("resultKey", remoteInput.getResultKey());
        data.putCharSequence(TTDownloadField.TT_LABEL, remoteInput.getLabel());
        data.putCharSequenceArray("choices", remoteInput.getChoices());
        data.putBoolean("allowFreeFormInput", remoteInput.getAllowFreeFormInput());
        data.putBundle(AppLinkData.ARGUMENTS_EXTRAS_KEY, remoteInput.getExtras());
        Set<String> allowedDataTypes = remoteInput.getAllowedDataTypes();
        if (allowedDataTypes != null && !allowedDataTypes.isEmpty()) {
            ArrayList<String> allowedDataTypesAsList = new ArrayList<>(allowedDataTypes.size());
            for (String type : allowedDataTypes) {
                allowedDataTypesAsList.add(type);
            }
            data.putStringArrayList("allowedDataTypes", allowedDataTypesAsList);
        }
        return data;
    }

    private static RemoteInput[] fromBundleArray(Bundle[] bundles) {
        if (bundles == null) {
            return null;
        }
        RemoteInput[] remoteInputs = new RemoteInput[bundles.length];
        for (int i = 0; i < bundles.length; i++) {
            remoteInputs[i] = fromBundle(bundles[i]);
        }
        return remoteInputs;
    }

    private static Bundle[] toBundleArray(RemoteInput[] remoteInputs) {
        if (remoteInputs == null) {
            return null;
        }
        Bundle[] bundles = new Bundle[remoteInputs.length];
        for (int i = 0; i < remoteInputs.length; i++) {
            bundles[i] = toBundle(remoteInputs[i]);
        }
        return bundles;
    }

    private static Bundle[] getBundleArrayFromBundle(Bundle bundle, String key) {
        Parcelable[] array = bundle.getParcelableArray(key);
        if ((array instanceof Bundle[]) || array == null) {
            return (Bundle[]) array;
        }
        Bundle[] typedArray = (Bundle[]) Arrays.copyOf(array, array.length, Bundle[].class);
        bundle.putParcelableArray(key, typedArray);
        return typedArray;
    }

    private NotificationCompatJellybean() {
    }
}
