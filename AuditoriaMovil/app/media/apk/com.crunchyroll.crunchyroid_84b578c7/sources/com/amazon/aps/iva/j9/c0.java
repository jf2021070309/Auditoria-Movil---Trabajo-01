package com.amazon.aps.iva.j9;

import com.amazon.aps.iva.i9.g;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
/* compiled from: WebMessageListenerAdapter.java */
/* loaded from: classes.dex */
public final class c0 implements WebMessageListenerBoundaryInterface {
    public final g.b a;

    public c0(g.b bVar) {
        this.a = bVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPostMessage(android.webkit.WebView r9, java.lang.reflect.InvocationHandler r10, android.net.Uri r11, boolean r12, java.lang.reflect.InvocationHandler r13) {
        /*
            r8 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebMessageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class
            java.lang.Object r10 = com.amazon.aps.iva.hf0.a.a(r0, r10)
            org.chromium.support_lib_boundary.WebMessageBoundaryInterface r10 = (org.chromium.support_lib_boundary.WebMessageBoundaryInterface) r10
            java.lang.reflect.InvocationHandler[] r0 = r10.getPorts()
            int r1 = r0.length
            com.amazon.aps.iva.i9.e[] r1 = new com.amazon.aps.iva.i9.e[r1]
            r2 = 0
        L10:
            int r3 = r0.length
            if (r2 >= r3) goto L1f
            com.amazon.aps.iva.j9.d0 r3 = new com.amazon.aps.iva.j9.d0
            r4 = r0[r2]
            r3.<init>(r4)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L1f:
            com.amazon.aps.iva.j9.a$d r0 = com.amazon.aps.iva.j9.f0.d
            boolean r0 = r0.c()
            if (r0 == 0) goto L53
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface.class
            java.lang.reflect.InvocationHandler r10 = r10.getMessagePayload()
            java.lang.Object r10 = com.amazon.aps.iva.hf0.a.a(r0, r10)
            org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface r10 = (org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface) r10
            int r0 = r10.getType()
            if (r0 == 0) goto L49
            r2 = 1
            if (r0 == r2) goto L3f
            r10 = 0
            r4 = r10
            goto L5d
        L3f:
            com.amazon.aps.iva.i9.d r0 = new com.amazon.aps.iva.i9.d
            byte[] r10 = r10.getAsArrayBuffer()
            r0.<init>(r10, r1)
            goto L5c
        L49:
            com.amazon.aps.iva.i9.d r0 = new com.amazon.aps.iva.i9.d
            java.lang.String r10 = r10.getAsString()
            r0.<init>(r10, r1)
            goto L5c
        L53:
            com.amazon.aps.iva.i9.d r0 = new com.amazon.aps.iva.i9.d
            java.lang.String r10 = r10.getData()
            r0.<init>(r10, r1)
        L5c:
            r4 = r0
        L5d:
            if (r4 == 0) goto L7b
            java.lang.Class<org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface> r10 = org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.class
            java.lang.Object r10 = com.amazon.aps.iva.hf0.a.a(r10, r13)
            org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r10 = (org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface) r10
            com.amazon.aps.iva.j9.x r13 = new com.amazon.aps.iva.j9.x
            r13.<init>(r10)
            java.lang.Object r10 = r10.getOrCreatePeer(r13)
            r7 = r10
            com.amazon.aps.iva.j9.y r7 = (com.amazon.aps.iva.j9.y) r7
            com.amazon.aps.iva.i9.g$b r2 = r8.a
            r3 = r9
            r5 = r11
            r6 = r12
            r2.onPostMessage(r3, r4, r5, r6, r7)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.j9.c0.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }
}
