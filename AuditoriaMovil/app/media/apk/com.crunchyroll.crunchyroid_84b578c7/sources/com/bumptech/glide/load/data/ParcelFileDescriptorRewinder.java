package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.a;
import java.io.IOException;
/* loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements com.bumptech.glide.load.data.a<ParcelFileDescriptor> {
    public final InternalRewinder a;

    /* loaded from: classes.dex */
    public static final class InternalRewinder {
        public final ParcelFileDescriptor a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            ParcelFileDescriptor parcelFileDescriptor = this.a;
            try {
                Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return parcelFileDescriptor;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0945a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.a.InterfaceC0945a
        public final Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0945a
        public final com.bumptech.glide.load.data.a<ParcelFileDescriptor> b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new InternalRewinder(parcelFileDescriptor);
    }

    @Override // com.bumptech.glide.load.data.a
    /* renamed from: c */
    public final ParcelFileDescriptor a() throws IOException {
        return this.a.rewind();
    }

    @Override // com.bumptech.glide.load.data.a
    public final void b() {
    }
}
