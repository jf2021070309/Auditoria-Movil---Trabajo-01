package com.amazon.aps.iva.ga0;

import com.amazon.aps.iva.a0.r;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public final class i extends c {
    public static final ArrayList<String> d;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        d = arrayList;
        r.e(arrayList, "mvrdvcg", "mvrdvmn", "mvrdvnm", "mvrosfm");
        arrayList.add("mvrosve");
        arrayList.add("mvrdvmo");
    }

    public final String f() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        StringBuilder sb = new StringBuilder("CustomerViewerData: ");
        String str6 = "";
        if (a("mvrdvcg") == null) {
            str = "";
        } else {
            str = "\n    muxViewerDeviceCategory: " + a("mvrdvcg");
        }
        sb.append(str);
        if (a("mvrdvmn") == null) {
            str2 = "";
        } else {
            str2 = "\n    muxViewerDeviceManufacturer: " + a("mvrdvmn");
        }
        sb.append(str2);
        if (a("mvrdvnm") == null) {
            str3 = "";
        } else {
            str3 = "\n    muxViewerDeviceName: " + a("mvrdvnm");
        }
        sb.append(str3);
        if (a("mvrosfm") == null) {
            str4 = "";
        } else {
            str4 = "\n    muxViewerOsFamily: " + a("mvrosfm");
        }
        sb.append(str4);
        if (a("mvrosve") == null) {
            str5 = "";
        } else {
            str5 = "\n    muxViewerOsVersion: " + a("mvrosve");
        }
        sb.append(str5);
        if (a("mvrdvmo") != null) {
            str6 = "\n    muxViewerDeviceModel: " + a("mvrdvmo");
        }
        sb.append(str6);
        return sb.toString();
    }

    @Override // com.amazon.aps.iva.ga0.c
    public final void d() {
    }
}
