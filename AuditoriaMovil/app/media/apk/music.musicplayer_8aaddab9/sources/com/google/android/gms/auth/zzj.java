package com.google.android.gms.auth;
/* loaded from: classes.dex */
public final class zzj implements zzk<Boolean> {
    public final /* synthetic */ String zza;

    public zzj(String str) {
        this.zza = str;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.google.android.gms.auth.zzl.zzd(java.lang.Object):java.lang.Object
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
        Caused by: java.lang.NullPointerException
        	at jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(RegisterArg.java:173)
        	at jadx.core.dex.instructions.args.InsnArg.isSameVar(InsnArg.java:269)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:118)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:65)
        	... 1 more
        */
    @Override // com.google.android.gms.auth.zzk
    public final /* bridge */ /* synthetic */ java.lang.Boolean zza(android.os.IBinder r8) throws android.os.RemoteException, java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        /*
            r7 = this;
            com.google.android.gms.internal.auth.zzf r8 = com.google.android.gms.internal.auth.zze.zzb(r8)
            java.lang.String r0 = r7.zza
            android.os.Bundle r8 = r8.zzg(r0)
            com.google.android.gms.auth.zzl.zzd(r8)
            java.lang.String r0 = "Error"
            java.lang.String r0 = r8.getString(r0)
            java.lang.String r1 = "userRecoveryIntent"
            android.os.Parcelable r8 = r8.getParcelable(r1)
            android.content.Intent r8 = (android.content.Intent) r8
            com.google.android.gms.internal.auth.zzby r1 = com.google.android.gms.internal.auth.zzby.zza(r0)
            com.google.android.gms.internal.auth.zzby r2 = com.google.android.gms.internal.auth.zzby.SUCCESS
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L2a
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        L2a:
            boolean r2 = com.google.android.gms.internal.auth.zzby.zzb(r1)
            if (r2 == 0) goto L5a
            com.google.android.gms.common.logging.Logger r2 = com.google.android.gms.auth.zzl.zzc()
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 31
            r5.<init>(r4)
            java.lang.String r4 = "isUserRecoverableError status: "
            r6 = 0
            java.lang.String r1 = e.a.d.a.a.r(r5, r4, r1)
            r3[r6] = r1
            java.lang.String r1 = "GoogleAuthUtil"
            r2.w(r1, r3)
            com.google.android.gms.auth.UserRecoverableAuthException r1 = new com.google.android.gms.auth.UserRecoverableAuthException
            r1.<init>(r0, r8)
            throw r1
        L5a:
            com.google.android.gms.auth.GoogleAuthException r8 = new com.google.android.gms.auth.GoogleAuthException
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.zzj.zza(android.os.IBinder):java.lang.Object");
    }
}
