package com.ironsource.sdk.a;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
/* loaded from: classes2.dex */
public final class f {
    public static a a = new a(2001, a("initsdk"));
    public static a b = new a(2002, a("createcontrollerweb"));
    public static a c = new a(IronSourceConstants.IS_INSTANCE_LOAD_SUCCESS, a("createcontrollernative"));
    public static a d = new a(IronSourceConstants.IS_CALLBACK_LOAD_SUCCESS, a("controllerstageready"));
    public static a e = new a(IronSourceConstants.IS_INSTANCE_OPENED, a("loadad"));
    public static a f = new a(IronSourceConstants.IS_INSTANCE_CLICKED, a("loadadfailed"));
    public static a g = new a(2007, a("initproduct"));
    public static a h = new a(2008, a("initproductfailed"));
    public static a i = new a(2009, a("loadproduct"));
    public static a j = new a(2010, a("parseadmfailed"));
    public static a k = new a(2011, a("loadadsuccess"));
    public static a l = new a(2013, a("controllerfailed"));
    public static a m = new a(2014, a("extractinstalledpackagesfailed"));
    public static a n = new a(2015, a("appendnativefeaturesdatafailed"));
    public static a o = new a(2016, a("adunitcouldnotloadtowebview"));
    public static a p = new a(2017, a("webviewcleanupfailed"));
    public static a q = new a(2018, a("removewebviewfailed"));
    public static a r;
    public static a s;
    public static a t;
    public static a u;
    public static a v;

    /* loaded from: classes2.dex */
    public static class a {
        String a;
        int b;

        a(int i, String str) {
            this.b = i;
            this.a = str;
        }
    }

    static {
        new a(2019, a("adunitcouldnotloadtowebviewbanners"));
        new a(2020, a("banneralreadydestroyed"));
        r = new a(2021, a("fialedregactlifecycle"));
        s = new a(2022, a("loadcontrollerhtml"));
        t = new a(2023, a("controllerhtmlsuccess"));
        u = new a(2024, a("controllerhtmlfailed"));
        v = new a(2025, a("webviewcrashrpg"));
    }

    private static String a(String str) {
        return "n_" + str;
    }
}
