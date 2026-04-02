package com.segment.analytics;

import com.segment.analytics.integrations.AliasPayload;
import com.segment.analytics.integrations.GroupPayload;
import com.segment.analytics.integrations.IdentifyPayload;
import com.segment.analytics.integrations.Integration;
import com.segment.analytics.integrations.ScreenPayload;
import com.segment.analytics.integrations.TrackPayload;
import java.util.concurrent.ExecutorService;
/* loaded from: classes4.dex */
public class WebhookIntegration extends Integration<Void> {
    private String key;
    private ExecutorService networkExecutor;
    private String tag;
    private String webhookUrl;

    /* loaded from: classes4.dex */
    public static class WebhookIntegrationFactory implements Integration.Factory {
        private String key;
        private String webhookUrl;

        public WebhookIntegrationFactory(String str, String str2) {
            this.key = str;
            this.webhookUrl = str2;
        }

        @Override // com.segment.analytics.integrations.Integration.Factory
        public Integration<?> create(ValueMap valueMap, Analytics analytics) {
            return new WebhookIntegration(this.webhookUrl, analytics.tag, key(), analytics.networkExecutor);
        }

        @Override // com.segment.analytics.integrations.Integration.Factory
        public String key() {
            return "webhook_" + this.key;
        }
    }

    public WebhookIntegration(String str, String str2, String str3, ExecutorService executorService) {
        this.webhookUrl = str;
        this.tag = str2;
        this.key = str3;
        this.networkExecutor = executorService;
    }

    private void sendPayloadToWebhook(final ValueMap valueMap) {
        this.networkExecutor.submit(new Runnable() { // from class: com.segment.analytics.WebhookIntegration.1
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0068, code lost:
                if (r7 != null) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
                r7.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
                if (r7 == null) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
                r0 = r9.this$0.tag;
                java.lang.String.format("Failed to send payload, statusCode=%d, body=%s", java.lang.Integer.valueOf(r4), r0);
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    r9 = this;
                    java.lang.String r0 = "Could not read response body for rejected message: "
                    com.segment.analytics.WebhookIntegration r1 = com.segment.analytics.WebhookIntegration.this     // Catch: java.lang.Exception -> Lb1
                    com.segment.analytics.WebhookIntegration.access$000(r1)     // Catch: java.lang.Exception -> Lb1
                    java.lang.String r1 = "Running %s payload through %s"
                    r2 = 2
                    java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> Lb1
                    com.segment.analytics.ValueMap r4 = r2     // Catch: java.lang.Exception -> Lb1
                    java.lang.String r5 = "type"
                    java.lang.String r4 = r4.getString(r5)     // Catch: java.lang.Exception -> Lb1
                    r5 = 0
                    r3[r5] = r4     // Catch: java.lang.Exception -> Lb1
                    com.segment.analytics.WebhookIntegration r4 = com.segment.analytics.WebhookIntegration.this     // Catch: java.lang.Exception -> Lb1
                    java.lang.String r4 = com.segment.analytics.WebhookIntegration.access$100(r4)     // Catch: java.lang.Exception -> Lb1
                    r6 = 1
                    r3[r6] = r4     // Catch: java.lang.Exception -> Lb1
                    java.lang.String.format(r1, r3)     // Catch: java.lang.Exception -> Lb1
                    java.net.URL r1 = new java.net.URL     // Catch: java.net.MalformedURLException -> La8 java.lang.Exception -> Lb1
                    com.segment.analytics.WebhookIntegration r3 = com.segment.analytics.WebhookIntegration.this     // Catch: java.net.MalformedURLException -> La8 java.lang.Exception -> Lb1
                    java.lang.String r3 = com.segment.analytics.WebhookIntegration.access$200(r3)     // Catch: java.net.MalformedURLException -> La8 java.lang.Exception -> Lb1
                    r1.<init>(r3)     // Catch: java.net.MalformedURLException -> La8 java.lang.Exception -> Lb1
                    java.net.URLConnection r1 = r1.openConnection()     // Catch: java.lang.Exception -> Lb1
                    java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch: java.lang.Exception -> Lb1
                    r1.setDoOutput(r6)     // Catch: java.lang.Exception -> Lb1
                    r1.setChunkedStreamingMode(r5)     // Catch: java.lang.Exception -> Lb1
                    java.lang.String r3 = "Content-Type"
                    java.lang.String r4 = "application/json"
                    r1.setRequestProperty(r3, r4)     // Catch: java.lang.Exception -> Lb1
                    java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch: java.lang.Exception -> Lb1
                    java.io.OutputStream r4 = r1.getOutputStream()     // Catch: java.lang.Exception -> Lb1
                    r3.<init>(r4)     // Catch: java.lang.Exception -> Lb1
                    com.segment.analytics.ValueMap r4 = r2     // Catch: java.lang.Exception -> Lb1
                    com.amazon.aps.iva.if0.c r4 = r4.toJsonObject()     // Catch: java.lang.Exception -> Lb1
                    java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lb1
                    r3.writeBytes(r4)     // Catch: java.lang.Exception -> Lb1
                    int r4 = r1.getResponseCode()     // Catch: java.lang.Throwable -> La3
                    r7 = 300(0x12c, float:4.2E-43)
                    if (r4 < r7) goto L9f
                    r7 = 0
                    java.io.InputStream r7 = com.segment.analytics.internal.Utils.getInputStream(r1)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L70
                    java.lang.String r0 = com.segment.analytics.internal.Utils.readFully(r7)     // Catch: java.lang.Throwable -> L6e java.io.IOException -> L70
                    if (r7 == 0) goto L84
                L6a:
                    r7.close()     // Catch: java.lang.Throwable -> La3
                    goto L84
                L6e:
                    r0 = move-exception
                    goto L99
                L70:
                    r1 = move-exception
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
                    r8.<init>(r0)     // Catch: java.lang.Throwable -> L6e
                    java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L6e
                    r8.append(r0)     // Catch: java.lang.Throwable -> L6e
                    java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L6e
                    if (r7 == 0) goto L84
                    goto L6a
                L84:
                    com.segment.analytics.WebhookIntegration r1 = com.segment.analytics.WebhookIntegration.this     // Catch: java.lang.Throwable -> La3
                    com.segment.analytics.WebhookIntegration.access$000(r1)     // Catch: java.lang.Throwable -> La3
                    java.lang.String r1 = "Failed to send payload, statusCode=%d, body=%s"
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> La3
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> La3
                    r2[r5] = r4     // Catch: java.lang.Throwable -> La3
                    r2[r6] = r0     // Catch: java.lang.Throwable -> La3
                    java.lang.String.format(r1, r2)     // Catch: java.lang.Throwable -> La3
                    goto L9f
                L99:
                    if (r7 == 0) goto L9e
                    r7.close()     // Catch: java.lang.Throwable -> La3
                L9e:
                    throw r0     // Catch: java.lang.Throwable -> La3
                L9f:
                    r3.close()     // Catch: java.lang.Exception -> Lb1
                    goto Lb5
                La3:
                    r0 = move-exception
                    r3.close()     // Catch: java.lang.Exception -> Lb1
                    throw r0     // Catch: java.lang.Exception -> Lb1
                La8:
                    r0 = move-exception
                    java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Exception -> Lb1
                    java.lang.String r2 = "Attempted to use malformed url: $webhookUrl"
                    r1.<init>(r2, r0)     // Catch: java.lang.Exception -> Lb1
                    throw r1     // Catch: java.lang.Exception -> Lb1
                Lb1:
                    r0 = move-exception
                    r0.printStackTrace()
                Lb5:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.WebhookIntegration.AnonymousClass1.run():void");
            }
        });
    }

    @Override // com.segment.analytics.integrations.Integration
    public void alias(AliasPayload aliasPayload) {
        sendPayloadToWebhook(aliasPayload);
    }

    @Override // com.segment.analytics.integrations.Integration
    public void group(GroupPayload groupPayload) {
        sendPayloadToWebhook(groupPayload);
    }

    @Override // com.segment.analytics.integrations.Integration
    public void identify(IdentifyPayload identifyPayload) {
        sendPayloadToWebhook(identifyPayload);
    }

    @Override // com.segment.analytics.integrations.Integration
    public void screen(ScreenPayload screenPayload) {
        sendPayloadToWebhook(screenPayload);
    }

    @Override // com.segment.analytics.integrations.Integration
    public void track(TrackPayload trackPayload) {
        sendPayloadToWebhook(trackPayload);
    }
}
