package org.steiner.com.warehouse.device.scan;

public class ScannerAdapter implements Scanner {
    private final LegacyScanner adaptee;

    public ScannerAdapter(LegacyScanner adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void operate() {
        adaptee.startScan();
     }
}
