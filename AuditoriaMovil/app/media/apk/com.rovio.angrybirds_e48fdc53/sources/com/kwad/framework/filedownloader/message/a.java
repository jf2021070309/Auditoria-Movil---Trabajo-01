package com.kwad.framework.filedownloader.message;
/* loaded from: classes.dex */
public interface a {

    /* renamed from: com.kwad.framework.filedownloader.message.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0234a extends MessageSnapshot implements a {
        private final MessageSnapshot adT;

        public C0234a(MessageSnapshot messageSnapshot) {
            super(messageSnapshot.getId());
            if (messageSnapshot.ta() != -3) {
                throw new IllegalArgumentException(com.kwad.framework.filedownloader.f.f.b("can't create the block complete message for id[%d], status[%d]", Integer.valueOf(messageSnapshot.getId()), Byte.valueOf(messageSnapshot.ta())));
            }
            this.adT = messageSnapshot;
        }

        @Override // com.kwad.framework.filedownloader.message.c
        public final byte ta() {
            return (byte) 4;
        }

        @Override // com.kwad.framework.filedownloader.message.a
        public final MessageSnapshot vb() {
            return this.adT;
        }
    }

    MessageSnapshot vb();
}
