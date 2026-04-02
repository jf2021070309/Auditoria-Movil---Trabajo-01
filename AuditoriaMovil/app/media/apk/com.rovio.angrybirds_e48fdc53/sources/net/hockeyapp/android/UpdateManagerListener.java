package net.hockeyapp.android;

import java.util.Date;
import org.json.JSONArray;
/* loaded from: classes4.dex */
public abstract class UpdateManagerListener {
    public Class<? extends UpdateActivity> getUpdateActivityClass() {
        return UpdateActivity.class;
    }

    public Class<? extends UpdateFragment> getUpdateFragmentClass() {
        return UpdateFragment.class;
    }

    public void onNoUpdateAvailable() {
    }

    public void onUpdateAvailable() {
    }

    public void onCancel() {
    }

    public void onUpdateAvailable(JSONArray jSONArray, String str) {
        onUpdateAvailable();
    }

    public Date getExpiryDate() {
        return null;
    }

    public boolean onBuildExpired() {
        return true;
    }

    public boolean canUpdateInMarket() {
        return false;
    }

    public void onUpdatePermissionsNotGranted() {
    }
}
