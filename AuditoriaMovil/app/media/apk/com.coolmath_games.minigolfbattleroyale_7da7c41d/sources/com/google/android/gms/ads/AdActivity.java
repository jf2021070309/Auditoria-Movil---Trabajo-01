package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzcgt;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes.dex */
public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private zzbzq zza;

    private final void zza() {
        zzbzq zzbzqVar = this.zza;
        if (zzbzqVar != null) {
            try {
                zzbzqVar.zzs();
            } catch (RemoteException e) {
                zzcgt.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        try {
            zzbzq zzbzqVar = this.zza;
            if (zzbzqVar != null) {
                zzbzqVar.zzm(i, i2, intent);
            }
        } catch (Exception e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbzq zzbzqVar = this.zza;
            if (zzbzqVar != null) {
                if (!zzbzqVar.zzg()) {
                    return;
                }
            }
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            zzbzq zzbzqVar2 = this.zza;
            if (zzbzqVar2 != null) {
                zzbzqVar2.zze();
            }
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbzq zzbzqVar = this.zza;
            if (zzbzqVar != null) {
                zzbzqVar.zzn(ObjectWrapper.wrap(configuration));
            }
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzbzq zzp = zzber.zzb().zzp(this);
        this.zza = zzp;
        if (zzp != null) {
            try {
                zzp.zzh(bundle);
                return;
            } catch (RemoteException e) {
                zzcgt.zzl("#007 Could not call remote method.", e);
                finish();
                return;
            }
        }
        zzcgt.zzl("#007 Could not call remote method.", null);
        finish();
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            zzbzq zzbzqVar = this.zza;
            if (zzbzqVar != null) {
                zzbzqVar.zzq();
            }
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            zzbzq zzbzqVar = this.zza;
            if (zzbzqVar != null) {
                zzbzqVar.zzl();
            }
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            zzbzq zzbzqVar = this.zza;
            if (zzbzqVar != null) {
                zzbzqVar.zzi();
            }
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            zzbzq zzbzqVar = this.zza;
            if (zzbzqVar != null) {
                zzbzqVar.zzk();
            }
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbzq zzbzqVar = this.zza;
            if (zzbzqVar != null) {
                zzbzqVar.zzo(bundle);
            }
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            zzbzq zzbzqVar = this.zza;
            if (zzbzqVar != null) {
                zzbzqVar.zzj();
            }
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            zzbzq zzbzqVar = this.zza;
            if (zzbzqVar != null) {
                zzbzqVar.zzp();
            }
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbzq zzbzqVar = this.zza;
            if (zzbzqVar != null) {
                zzbzqVar.zzf();
            }
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
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
