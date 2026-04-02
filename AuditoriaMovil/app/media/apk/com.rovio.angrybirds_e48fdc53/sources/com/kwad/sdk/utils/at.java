package com.kwad.sdk.utils;

import android.location.Location;
import com.kwad.sdk.api.KsCustomController;
import com.kwad.sdk.api.SdkConfig;
import com.kwad.sdk.components.DevelopMangerComponents;
import com.kwad.sdk.service.ServiceProvider;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public final class at {
    private static boolean IS() {
        if (com.kwad.framework.a.a.mp.booleanValue()) {
            com.kwad.sdk.components.c.f(DevelopMangerComponents.class);
            return false;
        }
        return false;
    }

    public static boolean IT() {
        KsCustomController ksCustomController;
        if (IS()) {
            return true;
        }
        try {
            SdkConfig HB = ServiceProvider.HB();
            if (HB != null && (ksCustomController = HB.ksCustomController) != null) {
                return !ksCustomController.canReadLocation();
            }
        } catch (Throwable th) {
        }
        return false;
    }

    public static Location IU() {
        KsCustomController ksCustomController;
        try {
            SdkConfig HB = ServiceProvider.HB();
            if (HB == null || (ksCustomController = HB.ksCustomController) == null) {
                return null;
            }
            return ksCustomController.getLocation();
        } catch (Throwable th) {
            return null;
        }
    }

    public static boolean IV() {
        KsCustomController ksCustomController;
        if (IS()) {
            return true;
        }
        try {
            SdkConfig HB = ServiceProvider.HB();
            if (HB != null && (ksCustomController = HB.ksCustomController) != null) {
                return !ksCustomController.canUsePhoneState();
            }
        } catch (Throwable th) {
        }
        return false;
    }

    public static String IW() {
        KsCustomController ksCustomController;
        try {
            SdkConfig HB = ServiceProvider.HB();
            return (HB == null || (ksCustomController = HB.ksCustomController) == null) ? "" : ksCustomController.getImei();
        } catch (Throwable th) {
            return "";
        }
    }

    public static String[] IX() {
        KsCustomController ksCustomController;
        try {
            SdkConfig HB = ServiceProvider.HB();
            if (HB != null && (ksCustomController = HB.ksCustomController) != null) {
                return ksCustomController.getImeis();
            }
        } catch (Throwable th) {
        }
        return new String[]{"", ""};
    }

    public static String IY() {
        KsCustomController ksCustomController;
        try {
            SdkConfig HB = ServiceProvider.HB();
            return (HB == null || (ksCustomController = HB.ksCustomController) == null) ? "" : ksCustomController.getAndroidId();
        } catch (Throwable th) {
            return "";
        }
    }

    public static boolean IZ() {
        KsCustomController ksCustomController;
        if (IS()) {
            return true;
        }
        try {
            SdkConfig HB = ServiceProvider.HB();
            if (HB != null && (ksCustomController = HB.ksCustomController) != null) {
                return !ksCustomController.canUseMacAddress();
            }
        } catch (Throwable th) {
        }
        return false;
    }

    public static String Ja() {
        KsCustomController ksCustomController;
        try {
            SdkConfig HB = ServiceProvider.HB();
            return (HB == null || (ksCustomController = HB.ksCustomController) == null) ? "" : ksCustomController.getMacAddress();
        } catch (Throwable th) {
            return "";
        }
    }

    public static boolean Jb() {
        KsCustomController ksCustomController;
        if (IS()) {
            return true;
        }
        try {
            SdkConfig HB = ServiceProvider.HB();
            if (HB != null && (ksCustomController = HB.ksCustomController) != null) {
                return !ksCustomController.canUseOaid();
            }
        } catch (Throwable th) {
        }
        return false;
    }

    public static String Jc() {
        KsCustomController ksCustomController;
        try {
            SdkConfig HB = ServiceProvider.HB();
            return (HB == null || (ksCustomController = HB.ksCustomController) == null) ? "" : ksCustomController.getOaid();
        } catch (Throwable th) {
            return "";
        }
    }

    public static boolean Jd() {
        KsCustomController ksCustomController;
        if (IS()) {
            return true;
        }
        try {
            SdkConfig HB = ServiceProvider.HB();
            if (HB != null && (ksCustomController = HB.ksCustomController) != null) {
                return !ksCustomController.canUseNetworkState();
            }
        } catch (Throwable th) {
        }
        return false;
    }

    public static boolean Je() {
        KsCustomController ksCustomController;
        if (IS()) {
            return true;
        }
        try {
            SdkConfig HB = ServiceProvider.HB();
            if (HB != null && (ksCustomController = HB.ksCustomController) != null) {
                return !ksCustomController.canUseStoragePermission();
            }
        } catch (Throwable th) {
        }
        return false;
    }

    public static boolean Jf() {
        KsCustomController ksCustomController;
        if (IS()) {
            return true;
        }
        try {
            SdkConfig HB = ServiceProvider.HB();
            if (HB != null && (ksCustomController = HB.ksCustomController) != null) {
                return !ksCustomController.canReadInstalledPackages();
            }
        } catch (Throwable th) {
        }
        return false;
    }

    public static List<String> Jg() {
        KsCustomController ksCustomController;
        try {
            SdkConfig HB = ServiceProvider.HB();
            if (HB != null && (ksCustomController = HB.ksCustomController) != null) {
                return ksCustomController.getInstalledPackages();
            }
        } catch (Throwable th) {
        }
        return new ArrayList();
    }
}
