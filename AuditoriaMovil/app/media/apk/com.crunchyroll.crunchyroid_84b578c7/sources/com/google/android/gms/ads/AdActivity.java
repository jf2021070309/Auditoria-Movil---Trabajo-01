package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbrq;
import com.google.android.gms.internal.ads.zzbzo;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class AdActivity extends Activity {
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private zzbrq zza;

    private final void zza() {
        zzbrq zzbrqVar = this.zza;
        if (zzbrqVar != null) {
            try {
                zzbrqVar.zzw();
            } catch (RemoteException e) {
                zzbzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        try {
            zzbrq zzbrqVar = this.zza;
            if (zzbrqVar != null) {
                zzbrqVar.zzg(i, i2, intent);
            }
        } catch (Exception e) {
            zzbzo.zzl("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbrq zzbrqVar = this.zza;
            if (zzbrqVar != null) {
                if (!zzbrqVar.zzF()) {
                    return;
                }
            }
        } catch (RemoteException e) {
            zzbzo.zzl("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            zzbrq zzbrqVar2 = this.zza;
            if (zzbrqVar2 != null) {
                zzbrqVar2.zzh();
            }
        } catch (RemoteException e2) {
            zzbzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbrq zzbrqVar = this.zza;
            if (zzbrqVar != null) {
                zzbrqVar.zzj(ObjectWrapper.wrap(configuration));
            }
        } catch (RemoteException e) {
            zzbzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzbrq zzo = zzay.zza().zzo(this);
        this.zza = zzo;
        if (zzo != null) {
            try {
                zzo.zzk(bundle);
                return;
            } catch (RemoteException e) {
                zzbzo.zzl("#007 Could not call remote method.", e);
                finish();
                return;
            }
        }
        zzbzo.zzl("#007 Could not call remote method.", null);
        finish();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        try {
            zzbrq zzbrqVar = this.zza;
            if (zzbrqVar != null) {
                zzbrqVar.zzl();
            }
        } catch (RemoteException e) {
            zzbzo.zzl("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        try {
            zzbrq zzbrqVar = this.zza;
            if (zzbrqVar != null) {
                zzbrqVar.zzn();
            }
        } catch (RemoteException e) {
            zzbzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            zzbrq zzbrqVar = this.zza;
            if (zzbrqVar != null) {
                zzbrqVar.zzo(i, strArr, iArr);
            }
        } catch (RemoteException e) {
            zzbzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        try {
            zzbrq zzbrqVar = this.zza;
            if (zzbrqVar != null) {
                zzbrqVar.zzp();
            }
        } catch (RemoteException e) {
            zzbzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            zzbrq zzbrqVar = this.zza;
            if (zzbrqVar != null) {
                zzbrqVar.zzq();
            }
        } catch (RemoteException e) {
            zzbzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbrq zzbrqVar = this.zza;
            if (zzbrqVar != null) {
                zzbrqVar.zzr(bundle);
            }
        } catch (RemoteException e) {
            zzbzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            zzbrq zzbrqVar = this.zza;
            if (zzbrqVar != null) {
                zzbrqVar.zzs();
            }
        } catch (RemoteException e) {
            zzbzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        try {
            zzbrq zzbrqVar = this.zza;
            if (zzbrqVar != null) {
                zzbrqVar.zzt();
            }
        } catch (RemoteException e) {
            zzbzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbrq zzbrqVar = this.zza;
            if (zzbrqVar != null) {
                zzbrqVar.zzu();
            }
        } catch (RemoteException e) {
            zzbzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}
