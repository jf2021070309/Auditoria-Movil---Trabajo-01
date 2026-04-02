package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzfd {
    final /* synthetic */ zzfi zza;
    private final String zzb;
    private final Bundle zzc;
    private Bundle zzd;

    public zzfd(zzfi zzfiVar, String str, Bundle bundle) {
        this.zza = zzfiVar;
        Preconditions.checkNotEmpty("default_event_parameters");
        this.zzb = "default_event_parameters";
        this.zzc = new Bundle();
    }

    public final Bundle zza() {
        char c;
        if (this.zzd == null) {
            String string = this.zza.zza().getString(this.zzb, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    a aVar = new a(string);
                    for (int i = 0; i < aVar.e(); i++) {
                        try {
                            c b = aVar.b(i);
                            String string2 = b.getString("n");
                            String string3 = b.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode != 100) {
                                if (hashCode != 108) {
                                    if (hashCode == 115 && string3.equals("s")) {
                                        c = 0;
                                    }
                                    c = 65535;
                                } else {
                                    if (string3.equals("l")) {
                                        c = 2;
                                    }
                                    c = 65535;
                                }
                            } else {
                                if (string3.equals("d")) {
                                    c = 1;
                                }
                                c = 65535;
                            }
                            if (c != 0) {
                                if (c != 1) {
                                    if (c != 2) {
                                        this.zza.zzt.zzaA().zzd().zzb("Unrecognized persisted bundle type. Type", string3);
                                    } else {
                                        bundle.putLong(string2, Long.parseLong(b.getString("v")));
                                    }
                                } else {
                                    bundle.putDouble(string2, Double.parseDouble(b.getString("v")));
                                }
                            } else {
                                bundle.putString(string2, b.getString("v"));
                            }
                        } catch (b | NumberFormatException unused) {
                            this.zza.zzt.zzaA().zzd().zza("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.zzd = bundle;
                } catch (b unused2) {
                    com.amazon.aps.iva.m80.a.a(this.zza.zzt, "Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.zzd == null) {
                this.zzd = this.zzc;
            }
        }
        return this.zzd;
    }

    public final void zzb(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.zza.zza().edit();
        if (bundle.size() == 0) {
            edit.remove(this.zzb);
        } else {
            String str = this.zzb;
            a aVar = new a();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        c cVar = new c();
                        cVar.put("n", str2);
                        cVar.put("v", obj.toString());
                        if (obj instanceof String) {
                            cVar.put("t", "s");
                        } else if (obj instanceof Long) {
                            cVar.put("t", "l");
                        } else if (obj instanceof Double) {
                            cVar.put("t", "d");
                        } else {
                            this.zza.zzt.zzaA().zzd().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        aVar.put(cVar);
                    } catch (b e) {
                        this.zza.zzt.zzaA().zzd().zzb("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            edit.putString(str, aVar.toString());
        }
        edit.apply();
        this.zzd = bundle;
    }
}
