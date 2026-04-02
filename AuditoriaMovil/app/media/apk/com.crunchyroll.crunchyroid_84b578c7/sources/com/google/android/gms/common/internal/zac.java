package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.amazon.aps.iva.k3.g;
import com.amazon.aps.iva.x.h;
import com.google.android.gms.base.R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class zac {
    private static final h zaa = new h();
    private static Locale zab;

    public static String zaa(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String zab(Context context) {
        return context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
    }

    public static String zac(Context context, int i) {
        Resources resources = context.getResources();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return resources.getString(17039370);
                }
                return resources.getString(R.string.common_google_play_services_enable_button);
            }
            return resources.getString(R.string.common_google_play_services_update_button);
        }
        return resources.getString(R.string.common_google_play_services_install_button);
    }

    public static String zad(Context context, int i) {
        Resources resources = context.getResources();
        String zaa2 = zaa(context);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 7) {
                            if (i != 9) {
                                if (i != 20) {
                                    switch (i) {
                                        case 16:
                                            return zah(context, "common_google_play_services_api_unavailable_text", zaa2);
                                        case 17:
                                            return zah(context, "common_google_play_services_sign_in_failed_text", zaa2);
                                        case 18:
                                            return resources.getString(R.string.common_google_play_services_updating_text, zaa2);
                                        default:
                                            return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, zaa2);
                                    }
                                }
                                return zah(context, "common_google_play_services_restricted_profile_text", zaa2);
                            }
                            return resources.getString(R.string.common_google_play_services_unsupported_text, zaa2);
                        }
                        return zah(context, "common_google_play_services_network_error_text", zaa2);
                    }
                    return zah(context, "common_google_play_services_invalid_account_text", zaa2);
                }
                return resources.getString(R.string.common_google_play_services_enable_text, zaa2);
            } else if (DeviceProperties.isWearableWithoutPlayStore(context)) {
                return resources.getString(R.string.common_google_play_services_wear_update_text);
            } else {
                return resources.getString(R.string.common_google_play_services_update_text, zaa2);
            }
        }
        return resources.getString(R.string.common_google_play_services_install_text, zaa2);
    }

    public static String zae(Context context, int i) {
        if (i != 6 && i != 19) {
            return zad(context, i);
        }
        return zah(context, "common_google_play_services_resolution_required_text", zaa(context));
    }

    public static String zaf(Context context, int i) {
        String zag;
        if (i == 6) {
            zag = zai(context, "common_google_play_services_resolution_required_title");
        } else {
            zag = zag(context, i);
        }
        if (zag == null) {
            return context.getResources().getString(R.string.common_google_play_services_notification_ticker);
        }
        return zag;
    }

    public static String zag(Context context, int i) {
        Resources resources = context.getResources();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 7) {
                            if (i != 17) {
                                if (i != 20) {
                                    return null;
                                }
                                return zai(context, "common_google_play_services_restricted_profile_title");
                            }
                            return zai(context, "common_google_play_services_sign_in_failed_title");
                        }
                        return zai(context, "common_google_play_services_network_error_title");
                    }
                    return zai(context, "common_google_play_services_invalid_account_title");
                }
                return resources.getString(R.string.common_google_play_services_enable_title);
            }
            return resources.getString(R.string.common_google_play_services_update_title);
        }
        return resources.getString(R.string.common_google_play_services_install_title);
    }

    private static String zah(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String zai = zai(context, str);
        if (zai == null) {
            zai = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, zai, str2);
    }

    private static String zai(Context context, String str) {
        h hVar = zaa;
        synchronized (hVar) {
            Locale locale = g.a(context.getResources().getConfiguration()).get(0);
            if (!locale.equals(zab)) {
                hVar.clear();
                zab = locale;
            }
            String str2 = (String) hVar.getOrDefault(str, null);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            hVar.put(str, string);
            return string;
        }
    }
}
