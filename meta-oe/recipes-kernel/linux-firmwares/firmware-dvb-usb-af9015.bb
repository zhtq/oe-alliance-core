require linux-firmware.inc

SUMMARY = "Firmware for dvb-usb-af9015"

SRCREV = "13f0b6bda7b567d29c747196aa65ad82b18651ca"

do_install() {
    install -d ${D}${nonarch_base_libdir}/firmware
    install -m 0644 dvb-usb-af9015.fw ${D}${nonarch_base_libdir}/firmware
}
