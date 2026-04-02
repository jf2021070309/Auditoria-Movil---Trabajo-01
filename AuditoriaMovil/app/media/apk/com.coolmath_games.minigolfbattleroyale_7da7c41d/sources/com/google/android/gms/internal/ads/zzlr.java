package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzlr extends zzag {
    private final byte[] zza;
    private final DatagramPacket zzb;
    private Uri zzc;
    private DatagramSocket zzd;
    private MulticastSocket zze;
    private InetAddress zzf;
    private InetSocketAddress zzg;
    private boolean zzh;
    private int zzi;

    public zzlr() {
        this(2000);
    }

    @Override // com.google.android.gms.internal.ads.zzah
    public final int zzg(byte[] bArr, int i, int i2) throws zzlq {
        if (i2 == 0) {
            return 0;
        }
        if (this.zzi == 0) {
            try {
                this.zzd.receive(this.zzb);
                int length = this.zzb.getLength();
                this.zzi = length;
                zzd(length);
            } catch (SocketTimeoutException e) {
                throw new zzlq(e, 2002);
            } catch (IOException e2) {
                throw new zzlq(e2, 2001);
            }
        }
        int length2 = this.zzb.getLength();
        int i3 = this.zzi;
        int min = Math.min(i3, i2);
        System.arraycopy(this.zza, length2 - i3, bArr, i, min);
        this.zzi -= min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final long zzh(zzan zzanVar) throws zzlq {
        Uri uri = zzanVar.zza;
        this.zzc = uri;
        String host = uri.getHost();
        int port = this.zzc.getPort();
        zzb(zzanVar);
        try {
            this.zzf = InetAddress.getByName(host);
            this.zzg = new InetSocketAddress(this.zzf, port);
            if (this.zzf.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.zzg);
                this.zze = multicastSocket;
                multicastSocket.joinGroup(this.zzf);
                this.zzd = this.zze;
            } else {
                this.zzd = new DatagramSocket(this.zzg);
            }
            this.zzd.setSoTimeout(8000);
            this.zzh = true;
            zzc(zzanVar);
            return -1L;
        } catch (IOException e) {
            throw new zzlq(e, 2001);
        } catch (SecurityException e2) {
            throw new zzlq(e2, IronSourceConstants.IS_INSTANCE_CLICKED);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final Uri zzi() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaj
    public final void zzj() {
        this.zzc = null;
        MulticastSocket multicastSocket = this.zze;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.zzf);
            } catch (IOException unused) {
            }
            this.zze = null;
        }
        DatagramSocket datagramSocket = this.zzd;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.zzd = null;
        }
        this.zzf = null;
        this.zzg = null;
        this.zzi = 0;
        if (this.zzh) {
            this.zzh = false;
            zze();
        }
    }

    public zzlr(int i) {
        super(true);
        this.zza = new byte[2000];
        this.zzb = new DatagramPacket(this.zza, 0, 2000);
    }
}
